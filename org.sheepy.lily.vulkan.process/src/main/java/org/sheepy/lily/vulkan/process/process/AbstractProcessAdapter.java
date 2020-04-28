package org.sheepy.lily.vulkan.process.process;

import org.eclipse.emf.ecore.EReference;
import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.core.api.adapter.annotation.Dispose;
import org.sheepy.lily.core.api.adapter.annotation.Load;
import org.sheepy.lily.core.api.allocation.IAllocable;
import org.sheepy.lily.core.api.allocation.IAllocationConfigurator;
import org.sheepy.lily.core.api.allocation.IAllocationService;
import org.sheepy.lily.core.api.allocation.IRootAllocator;
import org.sheepy.lily.core.api.cadence.IStatistics;
import org.sheepy.lily.core.api.util.CompositeModelExplorer;
import org.sheepy.lily.core.api.util.DebugUtil;
import org.sheepy.lily.game.core.allocation.GenericAllocator;
import org.sheepy.lily.game.core.allocation.ModelAllocator;
import org.sheepy.lily.vulkan.api.concurrent.IFenceView;
import org.sheepy.lily.vulkan.core.descriptor.DescriptorPoolAllocation;
import org.sheepy.lily.vulkan.core.device.IVulkanContext;
import org.sheepy.lily.vulkan.core.pipeline.IPipelineAdapter;
import org.sheepy.lily.vulkan.core.process.InternalProcessAdapter;
import org.sheepy.lily.vulkan.model.process.AbstractProcess;
import org.sheepy.lily.vulkan.model.resource.DescriptorPool;
import org.sheepy.vulkan.model.enumeration.ECommandStage;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractProcessAdapter<T extends ProcessContext<T>> implements InternalProcessAdapter,
																					 IAllocable<IVulkanContext>
{
	protected final AbstractProcess process;
	protected T context;

	private final GenericAllocator<T> resourceAllocator;
	private final ModelAllocator resourceAllocator2;
	private final ModelAllocator descriptorPoolAllocator;
	private final GenericAllocator<T> pipelineAllocator;
	private final CompositeModelExplorer pipelineExplorer;

	protected IAllocationConfigurator config;
	protected List<IPipelineAdapter> pipelineAdapters;
	private IRootAllocator<IVulkanContext> allocator;
	private long startPrepareNs = 0;

	public AbstractProcessAdapter(AbstractProcess process)
	{
		this.process = process;

		final var resourceFeatures = getResourceFeatureLists();
		resourceAllocator = new GenericAllocator<>(resourceFeatures);
		resourceAllocator2 = new ModelAllocator(process, resourceFeatures);
		descriptorPoolAllocator = new ModelAllocator(process, getDescriptorPoolFeatureLists());
		pipelineAllocator = new GenericAllocator<>(getPipelineFeatureLists());
		pipelineExplorer = new CompositeModelExplorer(getPipelineFeatureLists());
	}

	@Load
	private void load()
	{
		resourceAllocator.start(process);
		pipelineAllocator.start(process);
	}

	@Dispose
	private void dispose()
	{
		pipelineAllocator.stop(process);
		resourceAllocator.stop(process);
	}

	@Override
	public void configureAllocation(IAllocationConfigurator config, IVulkanContext context)
	{
		this.config = config;
		config.setChildrenContext(this.context);

		final List<IAllocable<?>> allocationChildren = new ArrayList<>();

		allocationChildren.addAll(this.context.getAllocationChildren());
		allocationChildren.add(resourceAllocator.getAllocable());
		allocationChildren.add(resourceAllocator2);
		allocationChildren.add(descriptorPoolAllocator);
		allocationChildren.add(pipelineAllocator.getAllocable());
		allocationChildren.addAll(getExtraAllocables());

		config.addChildren(allocationChildren);
	}

	@Override
	public void allocate(IVulkanContext context)
	{
	}

	@Override
	public void free(IVulkanContext context)
	{
	}

	@Override
	public void start(final IVulkanContext vulkanContext, final IRootAllocator<IVulkanContext> rootAllocator)
	{
		context = createContext(vulkanContext);
//		resourceAllocator2.start(process, context);

		refreshStructure();

		allocator = IAllocationService.INSTANCE.createAllocator(rootAllocator, this, context);
		allocator.allocate();

		if (DebugUtil.DEBUG_VERBOSE_ENABLED)
		{
			printAllocationTree();
		}
	}

	private void refresh()
	{
		if (pipelineAllocator.isDirty() || resourceAllocator.isDirty())
		{
			waitIdle();

			refreshStructure();
		}
	}

	private void refreshStructure()
	{
		pipelineAdapters = pipelineExplorer.exploreAdapt(process, IPipelineAdapter.class);
	}

	@Override
	public void stop(IVulkanContext vulkanContext)
	{
		waitIdle();
		allocator.free();
		allocator = null;
		context.free(vulkanContext);
		context = null;
	}

	@Override
	public void checkFence()
	{
		if (context != null)
		{
			final var recorders = context.getRecorders();
			for (int i = 0; i < recorders.size(); i++)
			{
				final var recorder = recorders.get(i);
				recorder.checkFence();
			}
		}
	}

	@Override
	public IFenceView run()
	{
		final Integer next = prepareNext();

		if (next != null)
		{
			return execute(next);
		}
		else
		{
			return null;
		}
	}

	private Integer prepareNext()
	{
		if (DebugUtil.DEBUG_ENABLED)
		{
			startPrepareNs = System.nanoTime();
		}

		prepareProcess();

		final var nextIndex = acquireNextPlayer();

		if (DebugUtil.DEBUG_ENABLED)
		{
			IStatistics.INSTANCE.addTime(getClass().getSimpleName(), System.nanoTime() - startPrepareNs);
		}

		return nextIndex;
	}

	private Integer acquireNextPlayer()
	{
		final Integer next = prepareNextExecution();

		if (next != null && next != -1)
		{
			prepareRecord(next);
		}

		if (process.isWaitingFenceDuringAcquire())
		{
			final var recorders = context.getRecorders();
			final var recorder = recorders.get(next);

			recorder.waitIdle();
		}

		return next;
	}

	private IFenceView execute(int next)
	{
		final var recorders = context.getRecorders();
		final var recorder = recorders.get(next);

		if (recorder.isDirty())
		{
			recorder.record(getStages());
		}

		for (int i = 0; i < pipelineAdapters.size(); i++)
		{
			final var pipelineAdapter = pipelineAdapters.get(i);
			if (pipelineAdapter.isActive())
			{
				pipelineAdapter.prepareExecution(context);
			}
		}

		return recorder.play();
	}

	@Override
	public void waitIdle()
	{
		final var recorders = context.getRecorders();
		for (int i = 0; i < recorders.size(); i++)
		{
			final var recorder = recorders.get(i);
			recorder.waitIdle();
		}
	}

	private void prepareProcess()
	{
		final boolean allocationDirty = prepareAllocation();
		final boolean descriptorsDirty = prepareDescriptors();

		if (allocationDirty || descriptorsDirty)
		{
			invalidateRecords();
		}
	}

	protected boolean prepareDescriptors()
	{
		boolean dirty = false;
		final var pools = new CompositeModelExplorer(getDescriptorPoolFeatureLists()).explore(process,
																							  DescriptorPool.class);
		for (var descriptorPool : pools)
		{
			final var descriptorPoolAllocation = descriptorPool.allocationHandle(DescriptorPoolAllocation.class).get();
			descriptorPoolAllocation.prepare();
			if (descriptorPoolAllocation.hasChanged())
			{
				waitIdle();
				try (final var stack = MemoryStack.stackPush())
				{
					descriptorPoolAllocation.update(stack);
				}
				dirty = true;
			}

		}
		return dirty;
	}

	private void prepareRecord(int index)
	{
		updatePipelines(index);

		if (isRecordNeeded(index))
		{
			invalidateRecords();
		}
	}

	private void invalidateRecords()
	{
		final var records = context.getRecorders();
		for (int i = 0; i < records.size(); i++)
		{
			records.get(i).setDirty(true);
		}
	}

	private boolean prepareAllocation()
	{
		refresh();
		context.beforeChildrenAllocation();
		resourceAllocator2.update(context);
		descriptorPoolAllocator.update(context);
		context.afterChildrenAllocation();
		if (allocator.isAllocationDirty())
		{
			waitIdle();
			allocator.reloadDirtyElements();
			return true;
		}
		else
		{
			return false;
		}
	}

	private void updatePipelines(int index)
	{
		for (int i = 0; i < pipelineAdapters.size(); i++)
		{
			final var pipelineAdapter = pipelineAdapters.get(i);
			if (pipelineAdapter.isActive())
			{
				pipelineAdapter.update(index);
			}
		}
	}

	private boolean isRecordNeeded(int index)
	{
		boolean res = false;
		for (int i = 0; i < pipelineAdapters.size(); i++)
		{
			final var pipelineAdapter = pipelineAdapters.get(i);
			if (pipelineAdapter.isActive())
			{
				res |= pipelineAdapter.isRecordNeeded(index);
			}
		}
		return res;
	}

	protected boolean isResetAllowed()
	{
		return process.isResetAllowed();
	}

	private void printAllocationTree()
	{
		System.out.println(process.eClass().getName() + " " + process.getName() + " Allocation tree:");
		System.out.println(allocator.toString());
	}

	@Override
	public boolean isMultithreadAllowed()
	{
		return context.getQueue().isShared() == false;
	}

	protected abstract List<List<EReference>> getPipelineFeatureLists();
	protected abstract List<List<EReference>> getResourceFeatureLists();
	protected abstract List<List<EReference>> getDescriptorPoolFeatureLists();
	protected abstract List<IAllocable<? super T>> getExtraAllocables();
	protected abstract Integer prepareNextExecution();
	protected abstract List<ECommandStage> getStages();
	protected abstract T createContext(final IVulkanContext vulkanContext);
}
