package org.sheepy.lily.vulkan.core.process;

import org.sheepy.lily.core.api.allocation.IRootAllocator;
import org.sheepy.lily.vulkan.api.process.IProcessAdapter;
import org.sheepy.lily.vulkan.core.device.VulkanContext;
import org.sheepy.lily.vulkan.core.execution.queue.EQueueType;

public interface InternalProcessAdapter extends IProcessAdapter
{
	void start(VulkanContext context, IRootAllocator<VulkanContext> rootAllocator);
	void stop(VulkanContext context);

	EQueueType getExecutionQueueType();
	boolean needPresentQueue();
}