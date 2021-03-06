package org.sheepy.lily.vulkan.process.graphic.pipeline.task;

import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.AllocationDependency;
import org.sheepy.lily.core.api.allocation.annotation.InjectDependency;
import org.logoce.extender.api.ModelExtender;
import org.sheepy.lily.vulkan.core.execution.RecordContext;
import org.sheepy.lily.vulkan.core.pipeline.IRecordableAdapter;
import org.sheepy.lily.vulkan.core.resource.buffer.IVulkanBufferAllocation;
import org.sheepy.lily.vulkan.model.process.graphic.BindVertexBuffer;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;

import java.util.List;

import static org.lwjgl.vulkan.VK10.vkCmdBindVertexBuffers;

@ModelExtender(scope = BindVertexBuffer.class)
@Allocation
@AllocationDependency(features = {GraphicPackage.BIND_VERTEX_BUFFER__VERTEX_BINDINGS, GraphicPackage.VERTEX_BINDING__BUFFER}, type = IVulkanBufferAllocation.class)
public final class BindVertexBuferRecorder implements IRecordableAdapter
{
	private final BindVertexBuffer task;
	private final List<IVulkanBufferAllocation> buffers;
	private final long[] vertexBuffers;
	private final long[] offsets;

	private BindVertexBuferRecorder(BindVertexBuffer task,
									@InjectDependency(index = 0) List<IVulkanBufferAllocation> buffers)
	{
		this.task = task;
		this.buffers = buffers;

		final int size = buffers.size();
		vertexBuffers = new long[size];
		offsets = new long[size];

		for (int i = 0; i < buffers.size(); i++)
		{
			final var buffer = buffers.get(i);

			vertexBuffers[i] = buffer.getPtr();
			offsets[i] = buffer.getBindOffset();
		}
	}

	@Override
	public void record(RecordContext context)
	{
		final var commandBuffer = context.commandBuffer;
		final int firstBinding = task.getFirstBinding();

		for (final var buffer : buffers)
		{
			buffer.attach(context);
		}

		vkCmdBindVertexBuffers(commandBuffer, firstBinding, vertexBuffers, offsets);
	}
}
