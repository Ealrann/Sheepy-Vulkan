package org.sheepy.lily.vulkan.nuklear.pipeline;

import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.vulkan.VK10.*;

import org.lwjgl.nuklear.NkBuffer;
import org.lwjgl.nuklear.NkContext;
import org.lwjgl.nuklear.NkConvertConfig;
import org.lwjgl.nuklear.NkDrawNullTexture;
import org.lwjgl.nuklear.NkDrawVertexLayoutElement;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.lwjgl.vulkan.VkMappedMemoryRange;
import org.sheepy.lily.core.api.adapter.IServiceAdapterFactory;
import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.adapter.annotation.Statefull;
import org.sheepy.lily.vulkan.common.allocation.common.IAllocationContext;
import org.sheepy.lily.vulkan.common.resource.IResourceAdapter;
import org.sheepy.lily.vulkan.nuklear.model.NuklearIndexBuffer;
import org.sheepy.lily.vulkan.nuklear.pipeline.NuklearVertexDescriptor.GuiVertex;
import org.sheepy.lily.vulkan.resource.indexed.IndexedBuffer;

@Statefull
@Adapter(scope = NuklearIndexBuffer.class)
public class NuklearVertexBufferAdapter implements IResourceAdapter
{
	public static final NuklearVertexDescriptor VERTEX_DESCRIPTOR = new NuklearVertexDescriptor();

	private static final int VERTEX_BUFFER_SIZE = 512 * 1024;
	private static final int INDEX_BUFFER_SIZE = 128 * 1024;

	private static final NkDrawVertexLayoutElement.Buffer VERTEX_LAYOUT;

	static
	{
		VERTEX_LAYOUT = NkDrawVertexLayoutElement.create(4);
		VERTEX_LAYOUT.position(0).attribute(NK_VERTEX_POSITION).format(NK_FORMAT_FLOAT).offset(0);
		VERTEX_LAYOUT.position(1).attribute(NK_VERTEX_TEXCOORD).format(NK_FORMAT_FLOAT).offset(8);
		VERTEX_LAYOUT.position(2).attribute(NK_VERTEX_COLOR).format(NK_FORMAT_R8G8B8A8).offset(16);
		VERTEX_LAYOUT.position(3).attribute(NK_VERTEX_ATTRIBUTE_COUNT).format(NK_FORMAT_COUNT)
				.offset(0);
		VERTEX_LAYOUT.position(4).flip();
	}

	private final NkDrawNullTexture nkNullTexture = NkDrawNullTexture.create();
	private final NkConvertConfig config = NkConvertConfig.create();

	private IndexedBuffer<?> indexBuffer;

	private NullTexture nullTexture = null;
	private NkBuffer vbuf;
	private NkBuffer ebuf;
	private long vertexMemoryMap;
	private long indexMemoryMap;

	private VkMappedMemoryRange rangeVertex;
	private VkMappedMemoryRange rangeIndex;

	@Override
	public void allocate(MemoryStack stack, IAllocationContext context)
	{
		nkNullTexture.texture().ptr(nullTexture.getSamplerId());
		nkNullTexture.uv().set(0.5f, 0.5f);

		vbuf = NkBuffer.calloc();
		ebuf = NkBuffer.calloc();

		indexBuffer = new IndexedBuffer<GuiVertex>(VERTEX_DESCRIPTOR, VERTEX_BUFFER_SIZE,
				INDEX_BUFFER_SIZE, true);
		indexBuffer.allocate(stack, context);

		vertexMemoryMap = indexBuffer.mapVertexMemory();
		indexMemoryMap = indexBuffer.mapIndexMemory();

		config.null_texture(nkNullTexture);
		config.vertex_layout(VERTEX_LAYOUT);
		config.vertex_size(20);
		config.vertex_alignment(4);
		config.circle_segment_count(22);
		config.curve_segment_count(22);
		config.arc_segment_count(22);
		config.global_alpha(1.0f);
		config.shape_AA(NK_ANTI_ALIASING_ON);
		config.line_AA(NK_ANTI_ALIASING_ON);

		rangeVertex = VkMappedMemoryRange.calloc();
		rangeVertex.set(VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE, VK_NULL_HANDLE,
				indexBuffer.getVertexBufferMemoryId(), 0, VERTEX_BUFFER_SIZE);
		rangeIndex = VkMappedMemoryRange.calloc();
		rangeIndex.set(VK_STRUCTURE_TYPE_MAPPED_MEMORY_RANGE, VK_NULL_HANDLE,
				indexBuffer.getIndexBufferMemoryId(), 0, INDEX_BUFFER_SIZE);
	}

	@Override
	public void free(IAllocationContext context)
	{
		rangeIndex.free();
		rangeVertex.free();
		rangeIndex = null;
		rangeVertex = null;

		indexBuffer.unmapVertexMemory();
		indexBuffer.unmapIndexMemory();

		indexBuffer.free(context);
		indexBuffer = null;

		vbuf.free();
		ebuf.free();
		vbuf = null;
		ebuf = null;
	}

	public void update(NkContext ctx, NkBuffer cmds)
	{
		nnk_buffer_init_fixed(vbuf.address(), vertexMemoryMap, VERTEX_BUFFER_SIZE);
		nnk_buffer_init_fixed(ebuf.address(), indexMemoryMap, INDEX_BUFFER_SIZE);

		// load draw vertices & elements directly into vertex + element buffer
		nk_convert(ctx, cmds, vbuf, ebuf, config);

		indexBuffer.pushFromMemoryMap();
	}

	public void bind(VkCommandBuffer commandBuffer)
	{
		// Bind vertex and index buffer
		long[] pBuffer = {
				indexBuffer.getVertexBufferAddress()
		};
		long[] offsets = {
				0
		};
		vkCmdBindVertexBuffers(commandBuffer, 0, pBuffer, offsets);

		vkCmdBindIndexBuffer(commandBuffer, indexBuffer.getIndexBufferAddress(), 0,
				VK_INDEX_TYPE_UINT16);
	}

	@Override
	public boolean isAllocationDirty(IAllocationContext context)
	{
		return false;
	}

	public void setNullTexture(NullTexture nullTexture)
	{
		this.nullTexture = nullTexture;
	}

	public static NuklearVertexBufferAdapter adapt(NuklearIndexBuffer buffer)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(buffer, NuklearVertexBufferAdapter.class);
	}
}
