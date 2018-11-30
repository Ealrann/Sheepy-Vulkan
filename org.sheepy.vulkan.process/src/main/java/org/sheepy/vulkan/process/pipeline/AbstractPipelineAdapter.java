package org.sheepy.vulkan.process.pipeline;

import static org.lwjgl.vulkan.VK10.*;

import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkPipelineLayoutCreateInfo;
import org.sheepy.common.api.adapter.impl.ServiceAdapterFactory;
import org.sheepy.vulkan.common.allocation.IAllocable;
import org.sheepy.vulkan.common.allocation.adapter.impl.AbstractDeepAllocableAdapter;
import org.sheepy.vulkan.common.device.ILogicalDeviceAdapter;
import org.sheepy.vulkan.common.execution.AbstractCommandBuffer;
import org.sheepy.vulkan.common.util.Logger;
import org.sheepy.vulkan.model.process.IPipeline;
import org.sheepy.vulkan.model.process.ProcessPackage;
import org.sheepy.vulkan.model.resource.DescriptorSet;
import org.sheepy.vulkan.model.resource.PushConstant;
import org.sheepy.vulkan.resource.buffer.AbstractPushConstantAdapter;
import org.sheepy.vulkan.resource.descriptor.IDescriptorSetAdapter;

public abstract class AbstractPipelineAdapter<T extends AbstractCommandBuffer>
		extends AbstractDeepAllocableAdapter implements IProcessUnitAdapter<T>
{
	protected long pipelineLayout = -1;

	protected IPipeline pipeline = null;

	protected boolean dirty = false;

	protected List<IAllocable> dependencies = new ArrayList<>();

	@Override
	public void notifyChanged(Notification notification)
	{
		if (notification.getFeature() == ProcessPackage.Literals.IPROCESS_UNIT__ENABLED)
		{
			dirty = true;
		}
	}

	@Override
	public void setTarget(Notifier target)
	{
		pipeline = (IPipeline) target;
		super.setTarget(target);
	}

	@Override
	public final boolean isDirty()
	{
		for (IAllocable dependency : dependencies)
		{
			if (dependency.isDirty())
			{
				return true;
			}
		}
		return dirty;
	}

	@Override
	public void record(T commandBuffer, int bindPoint)
	{
		final DescriptorSet descriptorSet = getDescriptorSet();
		if (descriptorSet != null)
		{
			final var adapter = IDescriptorSetAdapter.adapt(descriptorSet);
			adapter.bindDescriptorSet(commandBuffer, bindPoint, pipelineLayout);
		}

		final var pushConstant = getPushConstant();
		if (pushConstant != null)
		{
			final var pushConstantAdapter = AbstractPushConstantAdapter.adapt(pushConstant);
			final var vkCommandBuffer = commandBuffer.getVkCommandBuffer();
			pushConstantAdapter.pushConstants(vkCommandBuffer, pipelineLayout);
		}

		dirty = false;
	}

	@Override
	public void deepAllocate(MemoryStack stack)
	{
		pipelineLayout = allocatePipelineLayout(stack);
	}

	protected long allocatePipelineLayout(MemoryStack stack)
	{
		final var vkDevice = ILogicalDeviceAdapter.adapt(pipeline).getVkDevice(pipeline);
		final DescriptorSet descriptorSet = getDescriptorSet();

		LongBuffer bDescriptorSet = null;
		if (descriptorSet != null)
		{
			final var descriptorSetAdapter = IDescriptorSetAdapter.adapt(descriptorSet);
			if (descriptorSetAdapter.getDescriptors().isEmpty() == false)
			{
				// Create Pipeline Layout
				// -----------------------
				bDescriptorSet = stack.mallocLong(1);
				bDescriptorSet.put(descriptorSetAdapter.getLayoutId());
				bDescriptorSet.flip();
			}
		}

		// Create compute pipeline
		final long[] aLayout = new long[1];
		final VkPipelineLayoutCreateInfo info = VkPipelineLayoutCreateInfo.callocStack(stack);
		info.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
		info.pSetLayouts(bDescriptorSet);

		allocPushConstant(stack, info);

		Logger.check("Failed to create compute pipeline layout",
				() -> vkCreatePipelineLayout(vkDevice, info, null, aLayout));
		return aLayout[0];
	}

	private void allocPushConstant(MemoryStack stack, VkPipelineLayoutCreateInfo info)
	{
		var pushConstant = getPushConstant();
		if (pushConstant != null)
		{
			final var adapter = AbstractPushConstantAdapter.adapt(pushConstant);
			info.pPushConstantRanges(adapter.allocRange(stack));
		}
	}

	@Override
	public void free()
	{
		final var vkDevice = ILogicalDeviceAdapter.adapt(pipeline).getVkDevice(pipeline);
		vkDestroyPipelineLayout(vkDevice, pipelineLayout, null);

		dependencies.clear();
		pipelineLayout = -1;
	}

	public long getLayoutId()
	{
		return pipelineLayout;
	}

	protected abstract PushConstant getPushConstant();

	protected abstract DescriptorSet getDescriptorSet();

	@SuppressWarnings("unchecked")
	public static <T extends AbstractCommandBuffer> AbstractPipelineAdapter<T> adapt(IPipeline object)
	{
		return ServiceAdapterFactory.INSTANCE.adapt(object, AbstractPipelineAdapter.class);
	}
}
