package org.sheepy.lily.vulkan.process.graphic.execution;

import org.sheepy.lily.core.api.allocation.IAllocation;
import org.sheepy.lily.core.api.allocation.up.annotation.*;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.vulkan.api.graphic.IGraphicExecutionRecorders;
import org.sheepy.lily.vulkan.core.concurrent.VkSemaphore;
import org.sheepy.lily.vulkan.model.process.AbstractProcess;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicConfiguration;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess;
import org.sheepy.lily.vulkan.process.execution.ExecutionRecorders;
import org.sheepy.lily.vulkan.process.execution.Submission;
import org.sheepy.lily.vulkan.process.execution.WaitData;
import org.sheepy.lily.vulkan.process.graphic.frame.FramebufferAllocation;
import org.sheepy.lily.vulkan.process.graphic.frame.ImageViewAllocation;
import org.sheepy.lily.vulkan.process.graphic.frame.PhysicalSurfaceAllocation;
import org.sheepy.lily.vulkan.process.graphic.frame.SwapChainAllocation;
import org.sheepy.lily.vulkan.process.graphic.renderpass.RenderPassAllocation;
import org.sheepy.lily.vulkan.process.process.ProcessContext;

import java.util.ArrayList;
import java.util.List;

@ModelExtender(scope = GraphicConfiguration.class)
@Allocation(context = ProcessContext.class)
@AllocationChild(features = GraphicPackage.GRAPHIC_CONFIGURATION__SURFACE, type = PhysicalSurfaceAllocation.class)
@AllocationChild(features = GraphicPackage.GRAPHIC_CONFIGURATION__SWAPCHAIN_CONFIGURATION, type = SwapChainAllocation.class)
@AllocationChild(features = GraphicPackage.GRAPHIC_CONFIGURATION__RENDER_PASS, type = RenderPassAllocation.class)
@AllocationChild(features = GraphicPackage.GRAPHIC_CONFIGURATION__IMAGE_VIEWS, type = ImageViewAllocation.class)
@AllocationChild(features = GraphicPackage.GRAPHIC_CONFIGURATION__FRAMEBUFFER_CONFIGURATION, type = FramebufferAllocation.class)
@AllocationDependency(features = GraphicPackage.GRAPHIC_CONFIGURATION__SURFACE, type = PhysicalSurfaceAllocation.class)
@AllocationDependency(features = GraphicPackage.GRAPHIC_CONFIGURATION__SWAPCHAIN_CONFIGURATION, type = SwapChainAllocation.class)
@AllocationDependency(features = GraphicPackage.GRAPHIC_CONFIGURATION__RENDER_PASS, type = RenderPassAllocation.class)
@AllocationDependency(features = GraphicPackage.GRAPHIC_CONFIGURATION__IMAGE_VIEWS, type = ImageViewAllocation.class)
@AllocationDependency(features = GraphicPackage.GRAPHIC_CONFIGURATION__FRAMEBUFFER_CONFIGURATION, type = FramebufferAllocation.class)
public final class GraphicExecutionRecorders extends ExecutionRecorders implements IGraphicExecutionRecorders,
																				   IAllocation
{
	private final List<GraphicExecutionRecorder> recorders;
	private final VkSemaphore imageAvailableSemaphore;
	private final ImageAcquirer imageAcquirer;

	private GraphicExecutionRecorders(GraphicConfiguration configuration,
									  ProcessContext context,
									  @InjectDependency(type = PhysicalSurfaceAllocation.class) PhysicalSurfaceAllocation surfaceAllocation,
									  @InjectDependency(type = SwapChainAllocation.class) SwapChainAllocation swapChainAllocation,
									  @InjectDependency(type = RenderPassAllocation.class) RenderPassAllocation renderPassAllocation,
									  @InjectDependency(type = FramebufferAllocation.class) FramebufferAllocation framebufferAllocation)
	{
		final var process = (GraphicProcess) configuration.eContainer();
		imageAvailableSemaphore = new VkSemaphore(context.getVkDevice());

		final var recorderBuilder = new RecorderBuilder(process,
														context,
														surfaceAllocation,
														swapChainAllocation,
														renderPassAllocation,
														framebufferAllocation);

		recorders = List.copyOf(recorderBuilder.build());

		imageAcquirer = new ImageAcquirer(context.getVkDevice(),
										  imageAvailableSemaphore.getPtr(),
										  surfaceAllocation,
										  swapChainAllocation.getPtr());
	}

	@Free
	private void free(ProcessContext context)
	{
		imageAvailableSemaphore.free(context.getVkDevice());
	}

	@Override
	public Integer prepareNextExecution()
	{
		return imageAcquirer.acquireNextImage();
	}

	@Override
	protected List<WaitData> gatherWaitDatas(AbstractProcess process)
	{
		final var res = super.gatherWaitDatas(process);
		res.add(0, createAcquireSemaphoreData((GraphicProcess) process));
		return res;
	}

	private WaitData createAcquireSemaphoreData(GraphicProcess process)
	{
		final var acquireWaitStage = process.getConfiguration().getAcquireWaitStage();
		return new WaitData(imageAvailableSemaphore, acquireWaitStage);
	}

	@Override
	public List<GraphicExecutionRecorder> getRecorders()
	{
		return recorders;
	}

	@Override
	public VkSemaphore getAcquireSemaphore()
	{
		return imageAvailableSemaphore;
	}

	private final class RecorderBuilder
	{
		private final GraphicProcess process;
		private final ProcessContext context;
		private final PhysicalSurfaceAllocation surfaceAllocation;
		private final SwapChainAllocation swapChainAllocation;
		private final RenderPassAllocation renderPassAllocation;
		private final FramebufferAllocation framebufferAllocation;

		private RecorderBuilder(final GraphicProcess process,
								final ProcessContext context,
								PhysicalSurfaceAllocation surfaceAllocation,
								SwapChainAllocation swapChainAllocation,
								RenderPassAllocation renderPassAllocation,
								FramebufferAllocation framebufferAllocation)
		{
			this.process = process;
			this.context = context;
			this.surfaceAllocation = surfaceAllocation;
			this.swapChainAllocation = swapChainAllocation;
			this.renderPassAllocation = renderPassAllocation;
			this.framebufferAllocation = framebufferAllocation;
		}

		private List<GraphicExecutionRecorder> build()
		{
			final List<GraphicExecutionRecorder> res = new ArrayList<>();

			final int executionCount = swapChainAllocation.getImageCount();
			final var waitForEmitters = gatherWaitDatas(process);
			final var signals = gatherSinalSemaphores(process);

			for (int i = 0; i < executionCount; i++)
			{
				res.add(createRecorder(process, waitForEmitters, signals, i));
			}

			return res;
		}

		private GraphicExecutionRecorder createRecorder(GraphicProcess process,
														List<WaitData> waitForEmitters,
														List<VkSemaphore> signals,
														int index)
		{
			final var framebufferPtr = framebufferAllocation.getFramebufferAddresses().get(index);
			final var commandBuffer = new GraphicCommandBuffer(context,
															   surfaceAllocation,
															   renderPassAllocation,
															   framebufferPtr);
			final var presentSemaphore = new VkSemaphore(context.getVkDevice());
			final var currentSignalSemaphores = new ArrayList<VkSemaphore>(signals.size() + 1);
			currentSignalSemaphores.addAll(signals);
			currentSignalSemaphores.add(presentSemaphore);
			final var presentQueue = surfaceAllocation.getPresentQueue().vkQueue;
			final var submission = new Submission(commandBuffer.getVkCommandBuffer(),
												  context,
												  waitForEmitters,
												  currentSignalSemaphores,
												  true);
			final var presentSubmission = new PresentSubmission(swapChainAllocation.getPtr(),
																presentQueue,
																index,
																presentSemaphore);
			return new GraphicExecutionRecorder(process,
												context,
												commandBuffer,
												submission,
												presentSubmission,
												presentSemaphore,
												index);
		}
	}
}
