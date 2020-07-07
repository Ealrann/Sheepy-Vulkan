package org.sheepy.lily.vulkan.process.graphic.pipeline.task;

import org.joml.Vector2i;
import org.joml.Vector2ic;
import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.InjectDependency;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.vulkan.core.resource.IVkImageAllocation;
import org.sheepy.lily.vulkan.core.resource.image.VkImage;
import org.sheepy.lily.vulkan.model.process.graphic.BlitTask;
import org.sheepy.lily.vulkan.process.process.ProcessContext;

@ModelExtender(scope = BlitTask.class)
@Allocation(context = ProcessContext.class)
public final class BlitTaskRecorder extends AbstractBlitTaskRecorder
{
	private final IVkImageAllocation dstImage;

	public BlitTaskRecorder(BlitTask blitTask,
							ProcessContext context,
							@InjectDependency(index = 0) IVkImageAllocation srcImage,
							@InjectDependency(index = 1) IVkImageAllocation dstImage)
	{
		super(blitTask, context, srcImage, getDstImageSize(dstImage.getVkImage()));
		this.dstImage = dstImage;
	}

	@Override
	protected long getDstImagePtr(int index)
	{
		return dstImage.getImagePtr();
	}

	private static Vector2ic getDstImageSize(VkImage dstVkImage)
	{
		return new Vector2i(dstVkImage.width, dstVkImage.height);
	}
}