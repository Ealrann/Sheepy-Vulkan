import org.sheepy.lily.core.api.adapter.annotation.Adapters;
import org.sheepy.lily.vulkan.nuklear.adapter.ButtonAdapter;
import org.sheepy.lily.vulkan.nuklear.adapter.DynamicRowLayoutAdapter;
import org.sheepy.lily.vulkan.nuklear.adapter.LabelAdapter;
import org.sheepy.lily.vulkan.nuklear.adapter.PanelAdapter;
import org.sheepy.lily.vulkan.nuklear.adapter.SliderAdapter;
import org.sheepy.lily.vulkan.nuklear.adapter.VariableLabelAdapter;
import org.sheepy.lily.vulkan.nuklear.pipeline.NuklearConstantsAdapter;
import org.sheepy.lily.vulkan.nuklear.pipeline.NuklearPipelineAdapter;

@Adapters(classifiers = {
		NuklearPipelineAdapter.class,
		NuklearConstantsAdapter.class,
		ButtonAdapter.class,
		PanelAdapter.class,
		LabelAdapter.class,
		DynamicRowLayoutAdapter.class,
		VariableLabelAdapter.class,
		SliderAdapter.class
})

module org.sheepy.lily.vulkan.extra.nuklear
{
	requires transitive org.sheepy.lily.vulkan.extra.api;

	requires transitive org.sheepy.lily.vulkan.process.graphic;

	requires transitive org.lwjgl.nuklear;
	requires org.lwjgl.nuklear.natives;

	exports org.sheepy.lily.vulkan.nuklear.adapter;

	opens org.sheepy.lily.vulkan.nuklear.adapter;
	opens org.sheepy.lily.vulkan.nuklear.pipeline;
}