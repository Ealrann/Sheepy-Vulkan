package org.sheepy.vulkan.processpool;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.sheepy.common.api.adapter.impl.AbstractServiceAdapter;
import org.sheepy.vulkan.model.process.AbstractProcessPool;
import org.sheepy.vulkan.model.process.ProcessPackage;
import org.sheepy.vulkan.resource.IResourceManagerAdapter;
import org.sheepy.vulkan.resource.ResourceManager;

public class ResourceManagerAdapter extends AbstractServiceAdapter implements IResourceManagerAdapter
{
	@Override
	public ResourceManager getResourceManager(EObject target)
	{
		var current = target;
		while (!ProcessPackage.Literals.ABSTRACT_PROCESS_POOL.isSuperTypeOf(current.eClass()))
		{
			current = current.eContainer();
		}

		return AbstractProcessPoolAdapter.adapt((AbstractProcessPool<?>) current).resourceManager;
	}
	
	@Override
	public boolean isApplicable(EClass eClass)
	{
		return true;
	}
}
