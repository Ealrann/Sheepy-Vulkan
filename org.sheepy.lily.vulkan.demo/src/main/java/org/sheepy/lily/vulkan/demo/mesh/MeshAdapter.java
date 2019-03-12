package org.sheepy.lily.vulkan.demo.mesh;

import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.core.api.adapter.IServiceAdapterFactory;
import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.adapter.annotation.Statefull;
import org.sheepy.lily.vulkan.common.allocation.common.IAllocationContext;
import org.sheepy.lily.vulkan.common.resource.IResourceAdapter;
import org.sheepy.lily.vulkan.demo.model.MeshBuffer;
import org.sheepy.lily.vulkan.process.graphic.process.GraphicContext;
import org.sheepy.lily.vulkan.resource.indexed.IndexedBuffer;

@Statefull
@Adapter(scope = MeshBuffer.class)
public class MeshAdapter implements IResourceAdapter
{
	public static IIndexedBufferBuilder<?> meshBuilder = null;

	private IndexedBuffer<?> indexBuffer;

	@Override
	public void allocate(MemoryStack stack, IAllocationContext context)
	{
		var graphicContext = (GraphicContext) context;
		indexBuffer = meshBuilder.build(graphicContext);
	}

	@Override
	public void free(IAllocationContext context)
	{
		indexBuffer.free(context);
		indexBuffer = null;
	}

	public IndexedBuffer<?> getIndexBuffer()
	{
		return indexBuffer;
	}

	@Override
	public boolean isAllocationDirty(IAllocationContext context)
	{
		return false;
	}

	public static MeshAdapter adapt(MeshBuffer mesh)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(mesh, MeshAdapter.class);
	}
}
