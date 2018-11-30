package org.sheepy.vulkan.resource;

import org.sheepy.common.api.adapter.impl.ServiceAdapterFactory;
import org.sheepy.vulkan.model.resource.PipelineResource;
import org.sheepy.vulkan.resource.descriptor.IDescriptorAdapter;

public abstract class PipelineResourceAdapter extends ResourceAdapter
		implements IDescriptorAdapter
{
	public static PipelineResourceAdapter adapt(PipelineResource resource)
	{
		return ServiceAdapterFactory.INSTANCE.adapt(resource, PipelineResourceAdapter.class);
	}
}
