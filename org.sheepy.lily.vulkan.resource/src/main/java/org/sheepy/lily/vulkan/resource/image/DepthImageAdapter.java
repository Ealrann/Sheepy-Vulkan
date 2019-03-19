package org.sheepy.lily.vulkan.resource.image;

import static org.lwjgl.vulkan.VK10.*;

import org.joml.Vector2i;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.sheepy.lily.core.api.adapter.IServiceAdapterFactory;
import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.adapter.annotation.Statefull;
import org.sheepy.lily.core.model.application.Application;
import org.sheepy.lily.vulkan.common.allocation.common.IAllocationContext;
import org.sheepy.lily.vulkan.common.device.LogicalDevice;
import org.sheepy.lily.vulkan.common.device.PhysicalDevice;
import org.sheepy.lily.vulkan.common.execution.ExecutionContext;
import org.sheepy.lily.vulkan.common.execution.ISingleTimeCommand;
import org.sheepy.lily.vulkan.common.resource.image.IDepthImageAdapter;
import org.sheepy.lily.vulkan.common.util.ModelUtil;
import org.sheepy.lily.vulkan.model.enumeration.EAccess;
import org.sheepy.lily.vulkan.model.enumeration.EImageLayout;
import org.sheepy.lily.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.lily.vulkan.model.resource.DepthImage;
import org.sheepy.lily.vulkan.model.resource.impl.ImageTransitionImpl;
import org.sheepy.lily.vulkan.model.resource.impl.ReferenceImageBarrierImpl;
import org.sheepy.lily.vulkan.resource.barrier.BarrierExecutorFactory;
import org.sheepy.lily.vulkan.resource.nativehelper.VkImage;
import org.sheepy.lily.vulkan.resource.nativehelper.VkImageView;

@Statefull
@Adapter(scope = DepthImage.class)
public class DepthImageAdapter implements IDepthImageAdapter
{
	private final DepthImage depthImage;
	private final Application application;

	private VkImage depthImageBackend;
	private VkImageView depthImageView;
	private int depthFormat;
	private Vector2i size;

	public DepthImageAdapter(DepthImage depthImage)
	{
		this.depthImage = depthImage;
		application = ModelUtil.getApplication(depthImage);
	}

	@Override
	public void allocate(MemoryStack stack, IAllocationContext context)
	{
		var executionContext = (ExecutionContext) context;
		depthFormat = findDepthFormat(executionContext.getPhysicalDevice());

		createDepthImage(executionContext.getLogicalDevice());
		allocateDepthImage(stack);

		createAndAllocateImageView(executionContext.getLogicalDevice());

		layoutTransitionOfDepthImage(stack, executionContext);
	}

	private void createAndAllocateImageView(LogicalDevice logicalDevice)
	{
		depthImageView = new VkImageView(logicalDevice.getVkDevice());
		depthImageView.allocate(depthImageBackend.getAddress(), 1, depthFormat,
				VK_IMAGE_ASPECT_DEPTH_BIT);
	}

	private void allocateDepthImage(MemoryStack stack)
	{
		depthImageBackend.allocate(stack);
	}

	private void createDepthImage(LogicalDevice logicalDevice)
	{
		var vulkanApp = ModelUtil.getApplication(depthImage);
		size = new Vector2i(vulkanApp.getSize());
		int width = size.x;
		int height = size.y;
		int usage = VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT;
		var depthImageInfo = new ImageInfo(width, height, depthFormat, usage,
				VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT);

		depthImageBackend = new VkImage(logicalDevice, depthImageInfo);
	}

	private void layoutTransitionOfDepthImage(MemoryStack stack, ExecutionContext context)
	{
		final var barrier = new ReferenceImageBarrierImpl();
		barrier.setImageId(depthImageBackend.getAddress());
		barrier.setMipLevels(1);
		barrier.setImageFormat(depthFormat);
		barrier.setSrcStage(EPipelineStage.TOP_OF_PIPE_BIT);
		barrier.setDstStage(EPipelineStage.EARLY_FRAGMENT_TESTS_BIT);

		final var transition = new ImageTransitionImpl();
		transition.setSrcLayout(EImageLayout.UNDEFINED);
		transition.setDstLayout(EImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);
		transition.getDstAccessMask().add(EAccess.DEPTH_STENCIL_ATTACHMENT_READ_BIT);
		transition.getDstAccessMask().add(EAccess.DEPTH_STENCIL_ATTACHMENT_WRITE_BIT);

		barrier.getTransitions().add(transition);

		var barrierExecutor = BarrierExecutorFactory.create(barrier);
		barrierExecutor.allocate();

		context.execute(stack, new ISingleTimeCommand()
		{
			@Override
			public void execute(MemoryStack stack, VkCommandBuffer commandBuffer)
			{
				barrierExecutor.execute(commandBuffer);
			}
		});
		barrierExecutor.free();
	}

	private static int findDepthFormat(PhysicalDevice physicalDevice)
	{
		return physicalDevice.findSupportedFormat(new int[] {
				VK_FORMAT_D32_SFLOAT, VK_FORMAT_D32_SFLOAT_S8_UINT, VK_FORMAT_D24_UNORM_S8_UINT
		}, VK_IMAGE_TILING_OPTIMAL, VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT);
	}

	@Override
	public void free(IAllocationContext context)
	{
		depthImageView.free();
		depthImageBackend.free();
	}

	@Override
	public boolean isAllocationDirty(IAllocationContext context)
	{
		return size.equals(application.getSize()) == false;
	}

	public long getDepthImageId()
	{
		return depthImageBackend.getAddress();
	}

	public long getDepthImageViewId()
	{
		return depthImageView.getAddress();
	}

	@Override
	public int getDepthImageFormat()
	{
		return depthFormat;
	}

	public static DepthImageAdapter adapt(DepthImage resource)
	{
		return IServiceAdapterFactory.INSTANCE.adapt(resource, DepthImageAdapter.class);
	}
}
