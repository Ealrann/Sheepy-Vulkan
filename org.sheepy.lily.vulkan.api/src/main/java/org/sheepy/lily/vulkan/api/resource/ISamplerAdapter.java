package org.sheepy.lily.vulkan.api.resource;

import org.sheepy.vulkan.resource.image.VkSampler;

public interface ISamplerAdapter extends IDescriptedResourceAdapter
{
	VkSampler getVkSampler();

	long getSamplerPtr();
}
