package org.sheepy.vulkan.allocation;

import org.lwjgl.system.MemoryStack;

public interface IAllocable extends IAllocationObject
{
	void allocate(MemoryStack stack, IAllocationContext context);
	void free(IAllocationContext context);
	boolean isAllocationDirty(IAllocationContext context);
}