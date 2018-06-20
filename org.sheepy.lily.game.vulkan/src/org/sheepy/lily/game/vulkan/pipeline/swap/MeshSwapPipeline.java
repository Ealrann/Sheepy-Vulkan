package org.sheepy.lily.game.vulkan.pipeline.swap;

import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.vulkan.VK10.VK_PIPELINE_BIND_POINT_GRAPHICS;
import static org.lwjgl.vulkan.VK10.vkCmdBindPipeline;

import java.util.Collections;

import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.game.vulkan.buffer.Mesh;
import org.sheepy.lily.game.vulkan.command.AbstractCommandBuffer;
import org.sheepy.lily.game.vulkan.command.CommandPool;
import org.sheepy.lily.game.vulkan.descriptor.BasicDescriptorSetConfiguration;
import org.sheepy.lily.game.vulkan.descriptor.DescriptorPool;
import org.sheepy.lily.game.vulkan.descriptor.IDescriptor;
import org.sheepy.lily.game.vulkan.device.LogicalDevice;
import org.sheepy.lily.game.vulkan.pipeline.swap.graphic.GraphicPipeline;
import org.sheepy.lily.game.vulkan.swapchain.ColorDomain;

public class MeshSwapPipeline extends AbstractSwapPipeline
{
	protected GraphicPipeline graphicPipeline;
	protected DescriptorPool descriptorPool;

	private Mesh mesh = null;

	public MeshSwapPipeline(LogicalDevice logicalDevice, Mesh mesh, SwapConfiguration configuration,
			CommandPool commandPool, ColorDomain targetColorDomain)
	{
		super(logicalDevice, configuration, commandPool, targetColorDomain);

		this.mesh = mesh;

		if (mesh.getDescriptors().isEmpty() == false)
		{
			try (MemoryStack stack = stackPush())
			{
				BasicDescriptorSetConfiguration<IDescriptor> descriptorConfiguration = new BasicDescriptorSetConfiguration<>();
				descriptorConfiguration.addAll(mesh.getDescriptors());

				descriptorPool = DescriptorPool.alloc(stack, logicalDevice,
						Collections.singletonList(descriptorConfiguration));
			}
		}

		graphicPipeline = new GraphicPipeline(logicalDevice, configuration);
	}

	@Override
	protected IRenderPass buildRenderPass()
	{
		return new RenderPass(logicalDevice, depthResource, mesh, descriptorPool);
	}

	@Override
	public void load(long surface, int width, int height)
	{
		super.load(surface, width, height);

		graphicPipeline.load(swapChainManager, mesh.getShaders(), renderPass, descriptorPool);

		((RenderPass) renderPass).buildRenderPass(commandBuffers.getCommandBuffers(), graphicPipeline);
	}

	@Override
	public void destroy(boolean full)
	{
		if (descriptorPool != null) descriptorPool.destroy();
		if (full && mesh != null) mesh.free();
		graphicPipeline.free();

		super.destroy(full);
	}

	public GraphicPipeline getGraphicPipeline()
	{
		return graphicPipeline;
	}

	public DescriptorPool getDescriptorPool()
	{
		return descriptorPool;
	}

	@Override
	public void bind(AbstractCommandBuffer commandBuffer)
	{
		vkCmdBindPipeline(commandBuffer.getVkCommandBuffer(), VK_PIPELINE_BIND_POINT_GRAPHICS, graphicPipeline.getId());
		
		mesh.bindBufferForRender(commandBuffer);
		
	}
}
