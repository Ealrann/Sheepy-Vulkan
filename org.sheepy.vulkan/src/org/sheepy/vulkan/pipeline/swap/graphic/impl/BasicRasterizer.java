package org.sheepy.vulkan.pipeline.swap.graphic.impl;

import static org.lwjgl.vulkan.VK10.VK_POLYGON_MODE_FILL;
import static org.lwjgl.vulkan.VK10.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO;

import org.lwjgl.vulkan.VkPipelineRasterizationStateCreateInfo;
import org.sheepy.vulkan.pipeline.swap.graphic.GraphicSwapConfiguration;
import org.sheepy.vulkan.pipeline.swap.graphic.IRasterizer;

public class BasicRasterizer implements IRasterizer
{
	private GraphicSwapConfiguration configuration;

	private VkPipelineRasterizationStateCreateInfo rasterizer;

	public BasicRasterizer(GraphicSwapConfiguration configuration)
	{
		this.configuration = configuration;
	}

	@Override
	public VkPipelineRasterizationStateCreateInfo allocRasterizationStateCreateInfo()
	{
		rasterizer = VkPipelineRasterizationStateCreateInfo.calloc();
		rasterizer.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
		rasterizer.depthClampEnable(false);
		rasterizer.rasterizerDiscardEnable(false);
		rasterizer.polygonMode(VK_POLYGON_MODE_FILL);
		rasterizer.lineWidth(1f);
		rasterizer.cullMode(configuration.rasterizerCullMode);
		rasterizer.frontFace(configuration.rasterizerFrontFace);
		rasterizer.depthBiasEnable(false);
		rasterizer.depthBiasConstantFactor(0.0f); // Optional
		rasterizer.depthBiasClamp(0.0f); // Optional
		rasterizer.depthBiasSlopeFactor(0.0f); // Optional

		return rasterizer;
	}

	@Override
	public void freeRasterizationStateCreateInfo()
	{
		rasterizer.free();
	}

	@Override
	public void free()
	{}
}
