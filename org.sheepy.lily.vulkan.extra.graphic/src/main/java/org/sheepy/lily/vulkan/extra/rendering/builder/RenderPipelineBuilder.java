package org.sheepy.lily.vulkan.extra.rendering.builder;

import java.util.List;

import org.lwjgl.BufferUtils;
import org.sheepy.lily.core.api.maintainer.MaintainerUtil;
import org.sheepy.lily.vulkan.extra.model.rendering.GenericRenderer;
import org.sheepy.lily.vulkan.model.VulkanFactory;
import org.sheepy.lily.vulkan.model.process.ProcessFactory;
import org.sheepy.lily.vulkan.model.resource.DescriptedResource;
import org.sheepy.lily.vulkan.model.resource.ResourceFactory;

public final class RenderPipelineBuilder
{
	private final List<DescriptedResource> commonResources;
	private final GenericRenderer<?> renderer;

	public RenderPipelineBuilder(	List<DescriptedResource> commonResources,
									GenericRenderer<?> renderer)
	{
		this.commonResources = commonResources;
		this.renderer = renderer;
	}

	public RenderPipelineContext build(int index)
	{
		final var pipeline = MaintainerUtil.instanciateMaintainer(renderer);
		final var constantBuffer = renderer.getConstantBuffer();
		final var pushBuffer = renderer.getPushBuffer();

		final var range = pipeline.getPushConstantRanges();
		final var rangeSize = range.get(0).getSize();
		range.get(0).setSize(rangeSize + 4);

		pipeline.setTaskPkg(ProcessFactory.eINSTANCE.createTaskPkg());
		pipeline.setResourcePkg(VulkanFactory.eINSTANCE.createResourcePkg());
		pipeline.setDescriptorSetPkg(ResourceFactory.eINSTANCE.createDescriptorSetPkg());

		final var constantsData = BufferUtils.createByteBuffer(4);
		constantsData.putInt(0, index);
		pipeline.setSpecializationData(constantsData);

		if (commonResources.isEmpty() == false)
		{
			final var descriptorSet = ResourceFactory.eINSTANCE.createDescriptorSet();
			descriptorSet.getDescriptors().addAll(commonResources);
			pipeline.getDescriptorSetPkg().getDescriptorSets().add(descriptorSet);
		}

		return new RenderPipelineContext(pipeline, constantBuffer, pushBuffer);
	}
}