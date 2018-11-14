package org.sheepy.vulkan.common.allocation.adapter.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.sheepy.common.api.adapter.IStatefullAdapter;
import org.sheepy.common.api.adapter.impl.AbstractAdapter;
import org.sheepy.vulkan.common.allocation.IBasicAllocable;
import org.sheepy.vulkan.common.allocation.adapter.IAllocableAdapter;

public abstract class AbstractAllocableAdapter extends AbstractAdapter
		implements IAllocableAdapter, IStatefullAdapter
{
	protected List<IBasicAllocable> childAllocables = new ArrayList<>();
	
	protected EObject target = null;
	
	@Override
	public void setTarget(Notifier target)
	{
		this.target = (EObject) target;
	}
	
	@Override
	public List<IBasicAllocable> getChildAllocables()
	{
		return childAllocables;
	}
}
