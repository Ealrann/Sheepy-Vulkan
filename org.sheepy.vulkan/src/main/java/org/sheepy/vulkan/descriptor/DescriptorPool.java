package org.sheepy.vulkan.descriptor;

import static org.lwjgl.vulkan.VK10.*;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkDescriptorPoolCreateInfo;
import org.lwjgl.vulkan.VkDescriptorPoolSize;
import org.sheepy.lily.core.api.allocation.IAllocable;
import org.sheepy.vulkan.execution.ExecutionContext;
import org.sheepy.vulkan.execution.IExecutionContext;
import org.sheepy.vulkan.log.Logger;

public class DescriptorPool implements IAllocable<IExecutionContext>
{
	private final List<IVkDescriptorSet> descriptorSets;

	private List<IVkDescriptor> descriptors = null;
	private long id;
	private boolean hasChanged = false;

	public DescriptorPool(List<IVkDescriptorSet> descriptorSets)
	{
		this.descriptorSets = List.copyOf(descriptorSets);
	}

	@Override
	public void allocate(IExecutionContext context)
	{
		final var vkDevice = ((ExecutionContext) context).getVkDevice();
		int poolSize = 0;
		for (final var descriptorSet : descriptorSets)
		{
			poolSize += descriptorSet.descriptorCount();
		}

		if (poolSize > 0)
		{
			final var poolSizes = VkDescriptorPoolSize.callocStack(poolSize);
			for (final var descriptorSet : descriptorSets)
			{
				descriptorSet.fillPoolSizes(poolSizes);
			}
			poolSizes.flip();

			final var poolInfo = VkDescriptorPoolCreateInfo.callocStack();
			poolInfo.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
			poolInfo.pPoolSizes(poolSizes);
			poolInfo.maxSets(descriptorSets.size());

			final long[] aDescriptor = new long[1];
			Logger.check("Failed to create descriptor pool",
					() -> vkCreateDescriptorPool(vkDevice, poolInfo, null, aDescriptor));
			id = aDescriptor[0];
		}

		for (final var descriptorSet : descriptorSets)
		{
			descriptorSet.allocate(context, id);
		}
	}

	public void prepare(MemoryStack stack)
	{
		hasChanged = false;

		if (descriptors == null)
		{
			descriptors = List.copyOf(gatherDescriptors());
		}

		for (int i = 0; i < descriptors.size(); i++)
		{
			final IVkDescriptor descriptor = descriptors.get(i);
			descriptor.update();
			hasChanged |= descriptor.hasChanged();
		}

		if (hasChanged)
		{
			for (int i = 0; i < descriptorSets.size(); i++)
			{
				final IVkDescriptorSet descriptorSet = descriptorSets.get(i);
				descriptorSet.updateDescriptorSet(stack);
			}
		}
	}

	private Collection<IVkDescriptor> gatherDescriptors()
	{
		final Set<IVkDescriptor> res = new HashSet<>();

		for (final IVkDescriptorSet descriptorSet : descriptorSets)
		{
			res.addAll(descriptorSet.getDescriptors());
		}

		return res;
	}

	public boolean hasChanged()
	{
		return hasChanged;
	}

	@Override
	public void free(IExecutionContext context)
	{
		final var vkDevice = ((ExecutionContext) context).getVkDevice();

		for (final var descriptorSet : descriptorSets)
		{
			descriptorSet.free(context);
		}

		vkDestroyDescriptorPool(vkDevice, id, null);
		id = -1;
	}

	public long getId()
	{
		return id;
	}
}
