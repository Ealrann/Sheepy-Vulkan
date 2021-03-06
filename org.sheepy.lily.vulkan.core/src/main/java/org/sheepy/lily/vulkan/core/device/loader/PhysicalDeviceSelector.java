package org.sheepy.lily.vulkan.core.device.loader;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.sheepy.lily.core.api.util.DebugUtil;
import org.sheepy.lily.vulkan.core.device.PhysicalDevice;
import org.sheepy.lily.vulkan.core.engine.extension.EDeviceExtension;
import org.sheepy.lily.vulkan.core.instance.VulkanInstance;
import org.sheepy.lily.vulkan.core.util.Logger;
import org.sheepy.lily.vulkan.core.window.VkSurface;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import static org.lwjgl.vulkan.VK10.vkEnumeratePhysicalDevices;

public class PhysicalDeviceSelector
{
	private final VulkanInstance vulkanInstance;
	private final List<DeviceScore> devices = new ArrayList<>();
	private final Set<EDeviceExtension> requiredDeviceExtensions;
	private final VkSurface surface;

	private IntBuffer pPhysicalDeviceCount;

	private PointerBuffer pPhysicalDevices;

	public PhysicalDeviceSelector(VulkanInstance vulkanInstance,
								  Set<EDeviceExtension> requiredDeviceExtensions,
								  VkSurface surface)
	{
		this.vulkanInstance = vulkanInstance;
		this.requiredDeviceExtensions = requiredDeviceExtensions;
		this.surface = surface;
	}

	public PhysicalDevice findBestPhysicalDevice(MemoryStack stack)
	{
		load(stack);
		gatherDevices(stack);
		devices.sort(Comparator.comparingInt(o -> o.score));
		final var winner = devices.get(0).deviceBuilder;
		if (DebugUtil.DEBUG_ENABLED) winner.printInfo(DebugUtil.DEBUG_VERBOSE_ENABLED);
		return winner.build(surface);
	}

	private void load(MemoryStack stack) throws AssertionError
	{
		final var vkInstance = vulkanInstance.getVkInstance();
		pPhysicalDeviceCount = stack.mallocInt(1);
		int err = vkEnumeratePhysicalDevices(vkInstance, pPhysicalDeviceCount, null);
		Logger.check(err, "Failed to get count of physical devices");

		pPhysicalDevices = stack.mallocPointer(pPhysicalDeviceCount.get(0));
		err = vkEnumeratePhysicalDevices(vkInstance, pPhysicalDeviceCount, pPhysicalDevices);
		Logger.check(err, "Failed to get physical devices");
	}

	private void gatherDevices(MemoryStack stack)
	{
		final var vkInstance = vulkanInstance.getVkInstance();
		final var judge = new PhysicalDeviceJudge(surface);

		for (int i = 0; i < pPhysicalDeviceCount.get(0); i++)
		{
			final var vkPhysicalDevice = new VkPhysicalDevice(pPhysicalDevices.get(i), vkInstance);
			final var deviceBuilder = new PhysicalDevice.Builder(vkPhysicalDevice, requiredDeviceExtensions, stack);
			final int deviceScore = judge.rateDeviceSuitability(deviceBuilder);
			if (DebugUtil.DEBUG_VERBOSE_ENABLED)
			{
				System.out.printf("[%s (%d)]: %d points", deviceBuilder.name, deviceBuilder.driverVersion, deviceScore);
			}

			devices.add(new DeviceScore(deviceBuilder, deviceScore));
		}
	}

	public static final class DeviceScore
	{
		public final PhysicalDevice.Builder deviceBuilder;
		public final int score;

		DeviceScore(PhysicalDevice.Builder deviceBuilder, int score)
		{
			this.deviceBuilder = deviceBuilder;
			this.score = score;
		}
	}
}
