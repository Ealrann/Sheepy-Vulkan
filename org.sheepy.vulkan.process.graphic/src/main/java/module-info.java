import org.sheepy.common.api.adapter.IAdapter;
import org.sheepy.vulkan.process.graphic.pipeline.image.ImagePipelineAdapter;
import org.sheepy.vulkan.process.graphic.process.GraphicContextAdapter;
import org.sheepy.vulkan.process.graphic.process.GraphicProcessAdapter;

/**
 * 
 */
module org.sheepy.vulkan.process.graphic
{
	requires transitive org.sheepy.vulkan.process;
	requires transitive org.sheepy.vulkan.resource;
	requires transitive org.sheepy.vulkan.api;

	exports org.sheepy.vulkan.process.graphic.execution;
	exports org.sheepy.vulkan.process.graphic.pipeline;
	exports org.sheepy.vulkan.process.graphic.process;
	exports org.sheepy.vulkan.process.graphic.swapchain;
	exports org.sheepy.vulkan.process.graphic.view;

	opens org.sheepy.vulkan.process.graphic.pipeline.image;

	provides IAdapter
			with GraphicProcessAdapter, ImagePipelineAdapter, GraphicContextAdapter;
}
