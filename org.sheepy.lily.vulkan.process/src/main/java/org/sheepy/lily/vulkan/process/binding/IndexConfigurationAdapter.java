package org.sheepy.lily.vulkan.process.binding;

import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.adapter.annotation.Statefull;
import org.sheepy.lily.vulkan.model.binding.IndexConfiguration;

@Statefull
@Adapter(scope = IndexConfiguration.class, lazy = false)
public final class IndexConfigurationAdapter extends AbstractContextConfigurationAdapter
{
	private IndexConfigurationAdapter(IndexConfiguration config)
	{
		super(config);
	}

	@Override
	protected BindConfiguration newConfiguration(int instance)
	{
		final var indexConfig = (IndexConfiguration) config;
		return new BindConfiguration(instance, indexConfig.getIndexCount());
	}

	@Override
	protected int getStride()
	{
		return 1;
	}

	@Override
	protected int getIndexCount()
	{
		final var indexConfig = (IndexConfiguration) config;
		return indexConfig.getIndexCount();
	}
}