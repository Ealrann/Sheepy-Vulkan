package org.sheepy.lily.vulkan.common.resource;

import org.sheepy.lily.core.api.adapter.IServiceAdapterFactory;
import org.sheepy.lily.vulkan.api.adapter.IVulkanAdapter;
import org.sheepy.lily.vulkan.common.execution.IResourceAllocable;
import org.sheepy.lily.vulkan.model.IResource;

public interface IResourceAdapter extends IResourceAllocable, IVulkanAdapter
{
	public static IResourceAdapter adapt(IResource resource)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(resource, IResourceAdapter.class);
	}
}