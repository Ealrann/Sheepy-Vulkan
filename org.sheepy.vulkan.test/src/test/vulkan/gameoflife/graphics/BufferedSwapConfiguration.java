package test.vulkan.gameoflife.graphics;

import static org.lwjgl.vulkan.KHRSurface.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
import static org.lwjgl.vulkan.VK10.VK_FORMAT_B8G8R8A8_UNORM;
import static org.lwjgl.vulkan.VK10.VK_PIPELINE_STAGE_TRANSFER_BIT;

import org.sheepy.vulkan.buffer.Image;
import org.sheepy.vulkan.command.CommandPool;
import org.sheepy.vulkan.device.LogicalDevice;
import org.sheepy.vulkan.pipeline.graphic.GraphicConfiguration;

public class BufferedSwapConfiguration extends GraphicConfiguration
{
	public Image pixelImage;

	public BufferedSwapConfiguration(LogicalDevice logicalDevice, CommandPool commandPool, Image pixelImage)
	{
		super(logicalDevice, commandPool, VK_FORMAT_B8G8R8A8_UNORM,
				VK_COLOR_SPACE_SRGB_NONLINEAR_KHR);
		
		this.pixelImage = pixelImage;
		
		this.frameWaitStage = VK_PIPELINE_STAGE_TRANSFER_BIT;
	}
}
