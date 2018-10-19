package org.sheepy.vulkan.pipeline.graphic.render;

import org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo;
import org.sheepy.vulkan.model.process.GraphicConfiguration;

public interface IRasterizer
{
	VkPipelineRasterizationStateCreateInfo allocCreateInfo(GraphicConfiguration context);

	void freeRasterizationStateCreateInfo();

	void free();
}
