package org.sheepy.lily.vulkan.api.graphic;

import org.sheepy.lily.vulkan.api.concurrent.ISemaphore;

public interface IGraphicExecutionRecorders
{
	ISemaphore getAcquireSemaphore();
}
