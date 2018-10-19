package org.sheepy.vulkan.pipeline.graphic.render.impl;

import static org.lwjgl.vulkan.VK10.*;

import org.lwjgl.vulkan.VkPipelineInputAssemblyStateCreateInfo;
import org.sheepy.vulkan.pipeline.graphic.render.IInputAssembly;

public class BasicInputAssembly implements IInputAssembly
{
	private VkPipelineInputAssemblyStateCreateInfo inputAssembly;

	@Override
	public VkPipelineInputAssemblyStateCreateInfo allocCreateInfo()
	{
		inputAssembly = VkPipelineInputAssemblyStateCreateInfo.calloc();
		inputAssembly.sType(VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
		inputAssembly.topology(VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
		inputAssembly.primitiveRestartEnable(false);

		return inputAssembly;
	}

	@Override
	public void freeInputAssemblyStateCreateInfo()
	{
		inputAssembly.free();
	}

	@Override
	public void free()
	{
	}
}
