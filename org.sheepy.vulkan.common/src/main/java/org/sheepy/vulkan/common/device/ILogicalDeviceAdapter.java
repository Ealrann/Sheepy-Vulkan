package org.sheepy.vulkan.common.device;

import org.eclipse.emf.ecore.EObject;
import org.lwjgl.vulkan.VkDevice;
import org.lwjgl.vulkan.VkPhysicalDevice;
import org.sheepy.common.api.adapter.IServiceAdapterFactory;
import org.sheepy.vulkan.api.adapter.IVulkanAdapter;

public interface ILogicalDeviceAdapter extends IVulkanAdapter
{
	PhysicalDevice getPhysicalDevice(EObject target);

	VkPhysicalDevice getVkPhysicalDevice(EObject target);

	LogicalDevice getLogicalDevice(EObject target);

	VkDevice getVkDevice(EObject target);

	static ILogicalDeviceAdapter adapt(EObject object)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(object, ILogicalDeviceAdapter.class);
	}
}
