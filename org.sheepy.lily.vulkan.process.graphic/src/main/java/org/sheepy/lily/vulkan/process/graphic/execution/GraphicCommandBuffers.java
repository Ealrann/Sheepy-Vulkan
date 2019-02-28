package org.sheepy.lily.vulkan.process.graphic.execution;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.vulkan.common.allocation.common.IAllocationContext;
import org.sheepy.lily.vulkan.model.enumeration.ECommandStage;
import org.sheepy.lily.vulkan.process.execution.AbstractCommandBuffers;
import org.sheepy.lily.vulkan.process.graphic.process.GraphicContext;
import org.sheepy.lily.vulkan.process.graphic.process.GraphicProcessAdapter;
import org.sheepy.lily.vulkan.process.process.ProcessContext;

public class GraphicCommandBuffers extends AbstractCommandBuffers<RenderCommandBuffer>
{
	@Override
	protected List<RenderCommandBuffer> allocCommandBuffers(MemoryStack stack,
															ProcessContext context)
	{
		var graphicContext = (GraphicContext) context;
		final var framebuffers = graphicContext.framebuffers;

		final long commandPoolId = commandPool.getId();

		// Command Pool Buffers
		// ------------------
		final long[] commandBufferIds = allocCommandBuffers(graphicContext.getVkDevice(),
				commandPoolId, framebuffers.size());

		final List<RenderCommandBuffer> commandBuffers = new ArrayList<>();
		for (int i = 0; i < framebuffers.getIDs().size(); i++)
		{
			final Long framebufferId = framebuffers.getIDs().get(i);
			final long id = commandBufferIds[i];

			var commandBuffer = new RenderCommandBuffer(graphicContext, i, id, framebufferId);
			commandBuffers.add(commandBuffer);
		}

		return List.copyOf(commandBuffers);
	}

	public void recordCommands(GraphicContext context)
	{
		for (int i = 0; i < commandBuffers.size(); i++)
		{
			final RenderCommandBuffer commandBuffer = commandBuffers.get(i);

			commandBuffer.startCommand();

			var adapter = GraphicProcessAdapter.adapt(context.graphicProcess);
			adapter.recordCommand(commandBuffer, ECommandStage.PRE_RENDER);

			commandBuffer.startRenderPass();

			adapter.recordCommand(commandBuffer, ECommandStage.RENDER);

			commandBuffer.endRenderPass();

			adapter.recordCommand(commandBuffer, ECommandStage.POST_RENDER);

			commandBuffer.endCommand();
		}
	}

	@Override
	public boolean isAllocationDirty(IAllocationContext context)
	{
		var graphicContext = (GraphicContext) context;
		return graphicContext.framebuffers.isAllocationDirty(context);
	}
}
