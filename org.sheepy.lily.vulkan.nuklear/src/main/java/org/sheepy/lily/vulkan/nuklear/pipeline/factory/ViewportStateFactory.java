package org.sheepy.lily.vulkan.nuklear.pipeline.factory;

import org.sheepy.lily.vulkan.model.process.graphic.DynamicViewportState;
import org.sheepy.lily.vulkan.model.process.graphic.ViewportState;
import org.sheepy.lily.vulkan.model.process.graphic.impl.DynamicViewportStateImpl;

public class ViewportStateFactory
{
	public static final ViewportState create()
	{
		DynamicViewportState res = new DynamicViewportStateImpl();
		res.setScissorCount(1);
		res.setViewportCount(1);
		return res;
	}
}
