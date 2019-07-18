package org.sheepy.vulkan.resource.staging;

import java.util.function.Consumer;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkCommandBuffer;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.vulkan.resource.staging.IStagingBuffer.MemoryTicket;
import org.sheepy.vulkan.resource.staging.command.ImmediatePushCommand;
import org.sheepy.vulkan.resource.staging.command.PipelinePushCommand;

public interface IDataFlowCommand
{
	boolean isPipelined();
	MemoryTicket getMemoryTicket();

	EFlowType getFlowType();
	void execute(MemoryStack stack, VkCommandBuffer commandBuffer);

	Consumer<MemoryTicket> getPostAction();

	static IDataFlowCommand newImmediatePushCommand(MemoryTicket ticket,
													long trgBuffer,
													long trgOffset)
	{
		return new ImmediatePushCommand(ticket, trgBuffer, trgOffset);
	}

	static IDataFlowCommand newPipelinePushCommand(	MemoryTicket ticket,
													long trgBuffer,
													long trgOffset,
													EPipelineStage dstStage,
													EAccess dstAccess)
	{
		return new PipelinePushCommand(ticket, trgBuffer, trgOffset, dstStage, dstAccess);
	}

	static enum EFlowType
	{
		PUSH,
		GET
	}
}