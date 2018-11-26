package org.sheepy.vulkan.demo.triangle;

import org.sheepy.vulkan.common.execution.ExecutionManager;
import org.sheepy.vulkan.demo.mesh.IIndexedBufferBuilder;
import org.sheepy.vulkan.resource.indexed.IndexBuffer;
import org.sheepy.vulkan.resource.indexed.IndexBufferData;
import org.sheepy.vulkan.resource.indexed.IndexBufferDescriptor;
import org.sheepy.vulkan.resource.indexed.IndexBufferDescriptor.Vertex;

public class TriangleMeshBuilder implements IIndexedBufferBuilder<Vertex>
{
	// {{-0.5f, -0.5f}, {1.0f, 0.0f, 0.0f}},
	// {{0.5f, -0.5f}, {0.0f, 1.0f, 0.0f}},
	// {{0.5f, 0.5f}, {0.0f, 0.0f, 1.0f}},
	// {{-0.5f, 0.5f}, {1.0f, 1.0f, 1.0f}}
	private static IndexBufferData<Vertex> getDatas()
	{
		Vertex[] vertices = new Vertex[4];
		vertices[0] = new Vertex(-0.5f, -0.5f, 1.0f, 1.0f, 1.0f);
		vertices[1] = new Vertex(0.5f, -0.5f, 0.0f, 1.0f, 0.0f);
		vertices[2] = new Vertex(0.5f, 0.5f, 0.0f, 0.0f, 0.0f);
		vertices[3] = new Vertex(-0.5f, 0.5f, 0.0f, 0.0f, 1.0f);

		int[] indices = {
				0, 1, 2, 2, 3, 0
		};

		IndexBufferData<Vertex> res = new IndexBufferData<>(vertices, indices,
				new IndexBufferDescriptor());

		return res;
	}
	
	@Override
	public IndexBuffer<Vertex> build(ExecutionManager executionManager)
	{
		return IndexBuffer.alloc(executionManager, getDatas());
	}
}
