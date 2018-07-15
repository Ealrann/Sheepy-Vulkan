package org.sheepy.vulkan.concurrent;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.system.MemoryStack;
import org.sheepy.vulkan.device.LogicalDevice;

public class SemaphoreManager
{
	private LogicalDevice logicalDevice;

	private boolean lock;
	private List<VkSemaphore> semaphores = new ArrayList<>();

	public SemaphoreManager(LogicalDevice logicalDevice)
	{
		this.logicalDevice = logicalDevice;
	}

	public VkSemaphore newSemaphore()
	{
		if (lock == true)
		{
			throw new AssertionError("Object locked, can't create a Semaphore");
		}

		VkSemaphore res = new VkSemaphore(logicalDevice);
		try (MemoryStack stack = MemoryStack.stackPush())
		{
			res.allocate(stack);
		}
		semaphores.add(res);
		return res;
	}

	public void free()
	{
		for (VkSemaphore vkSemaphore : semaphores)
		{
			vkSemaphore.free();
		}
		semaphores.clear();
	}

	/**
	 * If lock, creation of Semaphore will be forbidden
	 * 
	 * @param value
	 */
	public void lock(boolean value)
	{
		this.lock = value;
	}

	public boolean isLocked()
	{
		return lock;
	}

	public List<VkSemaphore> getSemaphores()
	{
		return semaphores;
	}
}
