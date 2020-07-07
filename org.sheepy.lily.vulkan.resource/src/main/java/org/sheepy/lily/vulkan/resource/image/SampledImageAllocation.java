package org.sheepy.lily.vulkan.resource.image;

import org.joml.Vector2i;
import org.joml.Vector2ic;
import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.AllocationDependency;
import org.sheepy.lily.core.api.allocation.annotation.Free;
import org.sheepy.lily.core.api.allocation.annotation.InjectDependency;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.vulkan.core.device.IVulkanContext;
import org.sheepy.lily.vulkan.core.resource.ISampledImageAllocation;
import org.sheepy.lily.vulkan.core.resource.IVkImageAllocation;
import org.sheepy.lily.vulkan.core.resource.image.VkImage;
import org.sheepy.lily.vulkan.model.resource.SampledImage;
import org.sheepy.lily.vulkan.model.resource.VulkanResourcePackage;
import org.sheepy.lily.vulkan.resource.image.backend.VkSampler;

@ModelExtender(scope = SampledImage.class)
@Allocation(context = IVulkanContext.class)
@AllocationDependency(features = VulkanResourcePackage.SAMPLED_IMAGE__IMAGE, type = IVkImageAllocation.class)
public class SampledImageAllocation implements ISampledImageAllocation
{
	private final IVkImageAllocation imageAdapter;
	private final VkSampler vkSampler;

	public SampledImageAllocation(SampledImage sampledImage,
								  IVulkanContext context,
								  @InjectDependency(index = 0) IVkImageAllocation imageAdapter)
	{
		this.imageAdapter = imageAdapter;

		final var samplerInfo = sampledImage.getSampler();

		if (imageAdapter != null)
		{
			final int mipLevels = imageAdapter.getVkImage().mipLevels;
			samplerInfo.setMaxLod(Math.max(mipLevels, samplerInfo.getMaxLod()));
		}

		vkSampler = new VkSampler(samplerInfo);
		vkSampler.allocate(context);
	}

	@Free
	public void free(IVulkanContext context)
	{
		vkSampler.free(context);
	}

	@Override
	public Vector2ic getSize()
	{
		final var vkImage = getVkImage();
		return new Vector2i(vkImage.width, vkImage.height);
	}

	@Override
	public long getImagePtr()
	{
		return imageAdapter.getImagePtr();
	}

	@Override
	public long getViewPtr()
	{
		return imageAdapter.getViewPtr();
	}

	@Override
	public long getSamplerPtr()
	{
		return vkSampler.getPtr();
	}

	@Override
	public VkImage getVkImage()
	{
		return imageAdapter.getVkImage();
	}

	@Override
	public long getMemoryPtr()
	{
		return imageAdapter.getMemoryPtr();
	}
}