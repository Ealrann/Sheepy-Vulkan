package org.sheepy.lily.vulkan.api.allocation.adapter;

import org.eclipse.emf.ecore.EObject;
import org.sheepy.lily.core.api.adapter.IAdapterFactoryService;
import org.sheepy.lily.vulkan.api.adapter.IVulkanAdapter;
import org.sheepy.lily.vulkan.api.allocation.IAllocationObject;

public interface IAllocationAdapter extends IVulkanAdapter, IAllocationObject
{
	static IAllocationAdapter adapt(EObject object)
	{
		return IAdapterFactoryService.INSTANCE.adapt(object, IAllocationAdapter.class);
	}
}