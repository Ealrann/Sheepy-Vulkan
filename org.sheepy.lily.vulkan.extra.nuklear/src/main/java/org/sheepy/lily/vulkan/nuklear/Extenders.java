package org.sheepy.lily.vulkan.nuklear;

import org.sheepy.lily.core.api.extender.IExtender;
import org.sheepy.lily.core.api.extender.IExtenderProvider;
import org.sheepy.lily.vulkan.nuklear.dataprovider.NuklearIndexSupplier;
import org.sheepy.lily.vulkan.nuklear.dataprovider.NuklearVertexSupplier;
import org.sheepy.lily.vulkan.nuklear.pipeline.NuklearPushConstantsAdapter;
import org.sheepy.lily.vulkan.nuklear.resource.*;
import org.sheepy.lily.vulkan.nuklear.scene.NuklearSubpassProvider;
import org.sheepy.lily.vulkan.nuklear.ui.*;

import java.lang.invoke.MethodHandles;
import java.util.List;

public class Extenders implements IExtenderProvider
{
	@Override
	public List<Class<? extends IExtender>> classifiers()
	{
		return List.of(ButtonAdapter.class,
					   PanelAdapter.class,
					   LabelAdapter.class,
					   DynamicRowLayoutAdapter.class,
					   VariableLabelAdapter.class,
					   SliderAdapter.class,
					   NullTextureLoader.class,
					   NuklearContextAllocation.class,
					   NuklearFontAllocation.class,
					   NuklearPushConstantsAdapter.class,
					   SelectorPanelAdapter.class,
					   PanelViewerAdapter.class,
					   NuklearVertexSupplier.class,
					   NuklearIndexSupplier.class,
					   NuklearSubpassProvider.class,
					   NuklearFontAdapter.class,
					   FontImageProviderAdapter.class);
	}

	@Override
	public MethodHandles.Lookup lookup()
	{
		return MethodHandles.lookup();
	}
}
