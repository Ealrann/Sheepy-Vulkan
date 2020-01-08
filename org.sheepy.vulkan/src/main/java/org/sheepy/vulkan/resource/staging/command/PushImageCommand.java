package org.sheepy.vulkan.resource.staging.command;

import static org.lwjgl.vulkan.VK10.*;

import java.util.List;
import java.util.function.Consumer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkBufferImageCopy;
import org.lwjgl.vulkan.VkBufferMemoryBarrier;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EImageLayout;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.vulkan.resource.image.VkImage;
import org.sheepy.vulkan.resource.staging.IDataFlowCommand;
import org.sheepy.vulkan.resource.staging.ITransferBuffer.MemoryTicket;

public final class PushImageCommand implements IDataFlowCommand
{
	private final MemoryTicket ticket;
	private final VkImage trgImage;
	private final EPipelineStage srcStage;
	private final List<EAccess> srcAccess;
	private final EPipelineStage trgStage;
	private final List<EAccess> trgAccess;
	private final EImageLayout trgLayout;

	public PushImageCommand(MemoryTicket ticket,
							VkImage trgImage,
							EPipelineStage srcStage,
							List<EAccess> srcAccess,
							EPipelineStage trgStage,
							List<EAccess> trgAccess,
							EImageLayout trgLayout)
	{
		assert srcStage != null;
		assert ticket != null;
		assert trgImage != null;

		this.ticket = ticket;
		this.trgImage = trgImage;
		this.srcStage = srcStage;
		this.srcAccess = srcAccess;
		this.trgStage = trgStage;
		this.trgAccess = trgAccess;
		this.trgLayout = trgLayout;
	}

	@Override
	public void execute(MemoryStack stack, VkCommandBuffer commandBuffer)
	{
		final var srcBuffer = ticket.getBufferPtr();
		final var srcoffset = ticket.getBufferOffset();
		final var size = ticket.getSize();

		// Submission guarantees the host write being complete, as per
		// https://www.khronos.org/registry/vulkan/specs/1.0/html/vkspec.html#synchronization-submission-host-writes
		// So no need for a barrier before the transfer

		final var blitStage = EPipelineStage.TRANSFER_BIT;
		final var blitAccess = List.of(EAccess.TRANSFER_WRITE_BIT);

		trgImage.transitionImageLayout(	stack,
										commandBuffer,
										srcStage,
										blitStage,
										EImageLayout.UNDEFINED,
										EImageLayout.TRANSFER_DST_OPTIMAL,
										srcAccess,
										blitAccess);

		final var barriers = VkBufferMemoryBarrier.callocStack(1, stack);
		final var hostBarrier = barriers.get(0);
		hostBarrier.sType(VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER);
		hostBarrier.buffer(srcBuffer);
		hostBarrier.offset(srcoffset);
		hostBarrier.size(size);
		hostBarrier.srcAccessMask(0);
		hostBarrier.dstAccessMask(EAccess.TRANSFER_READ_BIT_VALUE);

		vkCmdPipelineBarrier(	commandBuffer,
								srcStage.getValue(),
								blitStage.getValue(),
								0,
								null,
								barriers,
								null);

		final VkBufferImageCopy.Buffer region = VkBufferImageCopy.calloc(1);
		region.bufferOffset(ticket.getBufferOffset());
		region.bufferRowLength(0);
		region.bufferImageHeight(0);

		region.imageSubresource().aspectMask(VK_IMAGE_ASPECT_COLOR_BIT);
		region.imageSubresource().mipLevel(0);
		region.imageSubresource().baseArrayLayer(0);
		region.imageSubresource().layerCount(1);

		region.imageOffset().set(0, 0, 0);
		region.imageExtent().set(trgImage.width, trgImage.height, 1);

		final var dstImageLayout = VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL;
		vkCmdCopyBufferToImage(	commandBuffer,
								ticket.getBufferPtr(),
								trgImage.getPtr(),
								dstImageLayout,
								region);

		region.free();

		trgImage.transitionImageLayout(	stack,
										commandBuffer,
										blitStage,
										trgStage,
										EImageLayout.TRANSFER_DST_OPTIMAL,
										trgLayout,
										blitAccess,
										trgAccess);
	}

	@Override
	public MemoryTicket getMemoryTicket()
	{
		return ticket;
	}

	@Override
	public EFlowType getFlowType()
	{
		return EFlowType.PUSH;
	}

	@Override
	public Consumer<MemoryTicket> getPostAction()
	{
		return null;
	}

	@Override
	public String toString()
	{
		return "PipelinePushCommand  [trgImage=" + trgImage + "]";
	}
}