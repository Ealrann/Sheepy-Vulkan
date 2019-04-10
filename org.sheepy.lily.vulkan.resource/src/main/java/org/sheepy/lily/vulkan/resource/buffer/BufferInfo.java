package org.sheepy.lily.vulkan.resource.buffer;

import java.util.List;

import org.sheepy.lily.vulkan.model.enumeration.EBufferUsage;
import org.sheepy.lily.vulkan.model.resource.Buffer;

public class BufferInfo
{
	public final long size;
	public final int usage;
	public final boolean keptMapped;
	public final int instanceCount;

	public BufferInfo(long size, int usage, boolean keepMapped)
	{
		this(size, usage, keepMapped, 1);
	}

	public BufferInfo(long size, int usage, boolean keepMapped, int instanceCount)
	{
		this.size = size;
		this.usage = usage;
		this.keptMapped = keepMapped;
		this.instanceCount = instanceCount;
	}

	public BufferInfo(Buffer buffer)
	{
		this.size = buffer.getSize();
		this.usage = convertUsages(buffer.getUsages());
		this.keptMapped = buffer.isOftenUpdated();
		this.instanceCount = buffer.getInstanceCount();
	}

	private static int convertUsages(List<EBufferUsage> usages)
	{
		int res = 0;
		for (final EBufferUsage usage : usages)
		{
			res |= usage.getValue();
		}
		return res;
	}
}
