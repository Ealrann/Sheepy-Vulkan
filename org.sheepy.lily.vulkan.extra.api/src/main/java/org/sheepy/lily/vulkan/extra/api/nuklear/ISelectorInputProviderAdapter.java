package org.sheepy.lily.vulkan.extra.api.nuklear;

import org.joml.Vector3fc;
import org.sheepy.lily.core.api.adapter.IAdapter;
import org.sheepy.lily.core.model.resource.IImage;
import org.sheepy.lily.vulkan.extra.model.nuklear.IInputProvider;

import java.util.Collection;
import java.util.List;

public interface ISelectorInputProviderAdapter extends IAdapter
{
	List<?> getElements(IInputProvider inputProvider);

	String getName(Object element);

	IImage getImage(Object element);

	Vector3fc getColor(Object element);

	Collection<? extends IImage> getUsedImages();
}
