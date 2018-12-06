package org.sheepy.vulkan.common.execution;

import org.eclipse.emf.ecore.EObject;
import org.sheepy.common.api.adapter.IServiceAdapterFactory;
import org.sheepy.vulkan.api.adapter.IVulkanAdapter;

public interface IExecutionManagerAdapter extends IVulkanAdapter
{
	ExecutionManager getExecutionManager(EObject target);

	static IExecutionManagerAdapter adapt(EObject object)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(object, IExecutionManagerAdapter.class);
	}
}
