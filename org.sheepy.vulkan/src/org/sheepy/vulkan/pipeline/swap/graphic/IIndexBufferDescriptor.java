package org.sheepy.vulkan.pipeline.swap.graphic;

import java.nio.ByteBuffer;

import org.sheepy.vulkan.buffer.IVertex;

public interface IIndexBufferDescriptor<T extends IVertex> extends IVertexBufferDescriptor<T>
{
	int sizeOfIndex();
	ByteBuffer toIndexBuffer(int[] indices);
}