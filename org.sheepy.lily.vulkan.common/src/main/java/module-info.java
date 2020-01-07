import org.sheepy.lily.core.api.adapter.annotation.Adapters;
import org.sheepy.lily.vulkan.common.cadence.RunProcessAdapter;
import org.sheepy.lily.vulkan.common.cadence.WaitProcessIdleAdapter;
import org.sheepy.lily.vulkan.common.engine.VulkanEngineAdapter;

@Adapters(classifiers = {
		VulkanEngineAdapter.class, WaitProcessIdleAdapter.class, RunProcessAdapter.class
})

module org.sheepy.lily.vulkan.common
{
	requires transitive org.sheepy.lily.vulkan.api;

	exports org.sheepy.lily.vulkan.common.allocation;
	exports org.sheepy.lily.vulkan.common.process;
	exports org.sheepy.lily.vulkan.common.util;

	opens org.sheepy.lily.vulkan.common.cadence;
	opens org.sheepy.lily.vulkan.common.engine;
}
