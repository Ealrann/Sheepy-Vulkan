package org.sheepy.vulkan.pipeline.swap.graphic;

import java.util.List;

import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;
import org.sheepy.vulkan.shader.Shader;

public interface IShaderStage
{
	VkPipelineShaderStageCreateInfo.Buffer allocShaderStageInfo(List<Shader> shaders);
	void freeShaderStageInfo();
	void free();
}