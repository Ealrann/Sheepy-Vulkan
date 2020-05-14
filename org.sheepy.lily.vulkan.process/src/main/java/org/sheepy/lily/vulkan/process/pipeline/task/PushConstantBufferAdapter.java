package org.sheepy.lily.vulkan.process.pipeline.task;

import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.core.api.notification.observatory.IObservatoryBuilder;
import org.sheepy.lily.core.api.util.ModelUtil;
import org.sheepy.lily.vulkan.api.execution.IRecordContext;
import org.sheepy.lily.vulkan.api.pipeline.IPipelineTaskAdapter;
import org.sheepy.lily.vulkan.api.resource.buffer.IConstantBufferUpdater;
import org.sheepy.lily.vulkan.api.util.VulkanModelUtil;
import org.sheepy.lily.vulkan.core.execution.IRecordable.RecordContext;
import org.sheepy.lily.vulkan.core.pipeline.IVkPipelineAllocation;
import org.sheepy.lily.vulkan.model.process.AbstractPipeline;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.PushConstantBuffer;
import org.sheepy.lily.vulkan.model.resource.ConstantBuffer;
import org.sheepy.lily.vulkan.model.resource.VulkanResourcePackage;

import static org.lwjgl.vulkan.VK10.vkCmdPushConstants;

@ModelExtender(scope = PushConstantBuffer.class)
@Adapter
public class PushConstantBufferAdapter implements IPipelineTaskAdapter<PushConstantBuffer>
{
	private final ConstantBuffer buffer;
	private final IConstantBufferUpdater updater;

	private boolean dirty = true;

	public PushConstantBufferAdapter(PushConstantBuffer task, IObservatoryBuilder observatory)
	{
		buffer = task.getBuffer();
		updater = buffer.adapt(IConstantBufferUpdater.class);

		observatory.explore(ProcessPackage.Literals.PUSH_CONSTANT_BUFFER__BUFFER)
				   .listenNoParam(() -> dirty = true, VulkanResourcePackage.CONSTANT_BUFFER__DATA);
	}

	@Override
	public void record(PushConstantBuffer pushConstant, IRecordContext context)
	{
		final var pipeline = ModelUtil.findParent(pushConstant, AbstractPipeline.class);
		final var vkPipelineAdapter = pipeline.allocationHandle(IVkPipelineAllocation.class).get();

		if (updater != null)
		{
			updater.beforePush(buffer);
		}

		final var data = buffer.getData();
		if (data != null)
		{
			final var commandBuffer = ((RecordContext) context).commandBuffer;
			final long layoutId = vkPipelineAdapter.getVkPipelineLayout().getId();
			final int stageFlags = VulkanModelUtil.getEnumeratedFlag(pushConstant.getStages());

			vkCmdPushConstants(commandBuffer, layoutId, stageFlags, 0, data);
		}

		dirty = false;
	}

	@Override
	public boolean needRecord(PushConstantBuffer task, int index)
	{
		return dirty;
	}
}
