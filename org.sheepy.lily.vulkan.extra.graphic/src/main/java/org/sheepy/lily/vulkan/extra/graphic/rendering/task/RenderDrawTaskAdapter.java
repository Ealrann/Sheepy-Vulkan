package org.sheepy.lily.vulkan.extra.graphic.rendering.task;

import static org.lwjgl.vulkan.VK10.vkCmdDraw;

import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.vulkan.api.pipeline.IPipelineTaskAdapter;
import org.sheepy.lily.vulkan.common.execution.IRecordable.RecordContext;
import org.sheepy.lily.vulkan.extra.api.mesh.data.IVertexProviderAdapter;
import org.sheepy.lily.vulkan.extra.model.rendering.RenderDrawTask;

@Adapter(scope = RenderDrawTask.class)
public class RenderDrawTaskAdapter implements IPipelineTaskAdapter<RenderDrawTask>
{
	private int vertexCount;
	private boolean hasChanged = true;

	@Override
	public void update(RenderDrawTask task, int index)
	{
		int newVertexCount = 0;
		for (final var vertexProvider : task.getVertexProviders())
		{
			final var vertexProviderAdapter = vertexProvider.adaptNotNull(IVertexProviderAdapter.class);
			newVertexCount += vertexProviderAdapter.getVertexCount();
		}

		if (newVertexCount != vertexCount)
		{
			vertexCount = newVertexCount;
			hasChanged = true;
		}
	}

	@Override
	public void record(RenderDrawTask task, IRecordContext context)
	{
		final int instanceCount = 1;
		final int firstVertex = 0;
		final int firstInstance = 0;
		final var commandBuffer = ((RecordContext) context).commandBuffer;

		vkCmdDraw(commandBuffer, vertexCount, instanceCount, firstVertex, firstInstance);

		hasChanged = true;
	}

	@Override
	public boolean needRecord(RenderDrawTask task, int index)
	{
		return hasChanged;
	}
}