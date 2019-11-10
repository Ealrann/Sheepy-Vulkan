package org.sheepy.vulkan.resource.staging.command;

import static org.lwjgl.vulkan.VK10.*;

import java.util.function.Consumer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkBufferMemoryBarrier;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.vulkan.resource.buffer.BufferUtils;
import org.sheepy.vulkan.resource.staging.IDataFlowCommand;
import org.sheepy.vulkan.resource.staging.ITransferBuffer.MemoryTicket;

public final class PipelinePushCommand implements IDataFlowCommand
{
	private final MemoryTicket ticket;
	private final long trgBuffer;
	private final long trgOffset;
	private final Consumer<MemoryTicket> transferDone;
	private final EPipelineStage srcStage;
	private final int srcAccess;

	public PipelinePushCommand(	MemoryTicket ticket,
								long trgBuffer,
								long trgOffset,
								EPipelineStage srcStage,
								int srcAccess,
								Consumer<MemoryTicket> transferDone)
	{
		assert srcStage != null;
		assert trgBuffer > 0;
		assert trgOffset >= 0;
		assert ticket != null;

		this.ticket = ticket;
		this.trgBuffer = trgBuffer;
		this.trgOffset = trgOffset;
		this.srcStage = srcStage;
		this.srcAccess = srcAccess;
		this.transferDone = transferDone;
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

		final var srcStageVal = srcStage.getValue();
		final var dstStageVal = EPipelineStage.TRANSFER_BIT_VALUE;

		final var barrierInfo = VkBufferMemoryBarrier.callocStack(1, stack);
		barrierInfo.sType(VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER);
		barrierInfo.buffer(trgBuffer);
		barrierInfo.offset(trgOffset);
		barrierInfo.size(size);
		barrierInfo.srcAccessMask(srcAccess);
		barrierInfo.dstAccessMask(EAccess.TRANSFER_WRITE_BIT_VALUE);

		vkCmdPipelineBarrier(commandBuffer, srcStageVal, dstStageVal, 0, null, barrierInfo, null);

		BufferUtils.copyBuffer(stack, commandBuffer, srcBuffer, srcoffset, trgBuffer, trgOffset, size);
	}

	@Override
	public boolean isPipelined()
	{
		return true;
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
		return transferDone;
	}
}
