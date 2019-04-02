package org.sheepy.lily.vulkan.process.execution;

import org.sheepy.lily.vulkan.api.nativehelper.concurrent.VkSemaphore;
import org.sheepy.lily.vulkan.model.enumeration.EPipelineStage;

public class WaitData
{
	public final VkSemaphore semaphore;
	public final EPipelineStage waitStage;

	public WaitData(VkSemaphore semaphore, EPipelineStage waitStage)
	{
		this.semaphore = semaphore;
		this.waitStage = waitStage;
	}
}