package org.sheepy.lily.vulkan.extra.api.rendering;

import java.util.List;

import org.sheepy.lily.core.api.adapter.IAdapter;
import org.sheepy.lily.vulkan.extra.model.rendering.ResourceProvider;
import org.sheepy.lily.vulkan.model.resource.DescriptedResource;

public interface IResourceProviderAdapter extends IAdapter
{
	List<DescriptedResource> getResources(ResourceProvider provider);
}
