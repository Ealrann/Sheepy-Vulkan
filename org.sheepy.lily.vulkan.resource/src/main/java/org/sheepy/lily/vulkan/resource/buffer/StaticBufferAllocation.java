package org.sheepy.lily.vulkan.resource.buffer;

import org.lwjgl.system.MemoryUtil;
import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.AllocationDependency;
import org.sheepy.lily.core.api.allocation.annotation.InjectDependency;
import org.logoce.extender.api.ModelExtender;
import org.sheepy.lily.vulkan.core.execution.IRecordContext;
import org.sheepy.lily.vulkan.core.execution.ExecutionContext;
import org.sheepy.lily.vulkan.model.vulkanresource.BufferMemory;
import org.sheepy.lily.vulkan.model.vulkanresource.StaticBuffer;
import org.sheepy.lily.vulkan.resource.memorychunk.IBufferAllocation;
import org.sheepy.lily.vulkan.resource.memorychunk.util.AlignmentData;

import java.nio.ByteBuffer;

@ModelExtender(scope = StaticBuffer.class)
@Allocation(context = ExecutionContext.class)
@AllocationDependency(parent = BufferMemory.class, type = BufferMemoryAllocation.class)
public final class StaticBufferAllocation implements IBufferAllocation
{
	private final StaticBuffer buffer;
	private final long bufferPtr;
	private final BufferMemoryAllocation bufferMemoryAllocation;
	private final AlignmentData alignmentData;

	public StaticBufferAllocation(StaticBuffer buffer,
								  @InjectDependency(index = 0) BufferMemoryAllocation bufferMemoryAllocation)
	{
		this.buffer = buffer;
		bufferPtr = bufferMemoryAllocation.getBufferPtr();
		this.bufferMemoryAllocation = bufferMemoryAllocation;
		alignmentData = bufferMemoryAllocation.getAlignmentData(buffer);
	}

	@Override
	public void fillData(ByteBuffer trgBuffer)
	{
		if (buffer.isInitWithZero())
		{
			MemoryUtil.memSet(trgBuffer, 0);
		}
	}

	@Override
	public void attach(final IRecordContext recordContext)
	{
		bufferMemoryAllocation.attach(recordContext);
	}

	@Override
	public boolean needPush()
	{
		return false;
	}

	@Override
	public long getPtr()
	{
		return bufferPtr;
	}

	@Override
	public long getBindOffset()
	{
		return alignmentData.offset();
	}

	@Override
	public long getBindSize()
	{
		return alignmentData.size();
	}
}
