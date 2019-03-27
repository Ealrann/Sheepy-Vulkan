package org.sheepy.lily.vulkan.process.execution;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.vulkan.VK10.*;

import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.Collection;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkQueue;
import org.lwjgl.vulkan.VkSubmitInfo;
import org.sheepy.lily.vulkan.api.allocation.IAllocable;
import org.sheepy.lily.vulkan.api.allocation.IAllocationContext;
import org.sheepy.lily.vulkan.api.execution.ICommandBuffer;
import org.sheepy.lily.vulkan.api.execution.ISubmission;
import org.sheepy.lily.vulkan.api.nativehelper.concurrent.VkFence;
import org.sheepy.lily.vulkan.api.util.Logger;
import org.sheepy.lily.vulkan.common.execution.ExecutionContext;
import org.sheepy.lily.vulkan.process.process.ProcessContext;

public class Submission implements IAllocable, ISubmission
{
	private static final String FENCE_TIMEOUT = "Fence timeout";
	private static final int TIMEOUT = (int) 1e8;
	private static final String FAILED_SUBMIT = "Failed to submit command buffer";

	protected final ICommandBuffer commandBuffer;
	protected final Collection<WaitData> waitSemaphores;
	protected final Collection<Long> signalSemaphores;

	protected VkSubmitInfo submitInfo;
	protected LongBuffer bWaitSemaphores;
	protected IntBuffer waitStages;
	protected PointerBuffer pCommandBuffers;
	protected LongBuffer bSignalSemaphores;

	public final VkFence fence = new VkFence(true);
	private VkQueue queue;

	public Submission(	ICommandBuffer commandBuffer,
						Collection<WaitData> waitSemaphores,
						Collection<Long> signalSemaphores)
	{
		this.commandBuffer = commandBuffer;
		this.waitSemaphores = waitSemaphores;
		this.signalSemaphores = new ArrayList<>(signalSemaphores);
	}

	@Override
	public void allocate(MemoryStack stack, IAllocationContext context)
	{
		final var executionContext = (ExecutionContext) context;
		queue = executionContext.queue.vkQueue;
		fence.allocate(stack, context);

		if (waitSemaphores.isEmpty() == false)
		{
			bWaitSemaphores = memAllocLong(waitSemaphores.size());
			waitStages = memAllocInt(waitSemaphores.size());
			for (final WaitData waitData : waitSemaphores)
			{
				bWaitSemaphores.put(waitData.semaphore.getId());
				waitStages.put(waitData.waitStage.getValue());
			}
			bWaitSemaphores.flip();
			waitStages.flip();
		}

		pCommandBuffers = memAllocPointer(1);
		pCommandBuffers.put(commandBuffer.getVkCommandBuffer());
		pCommandBuffers.flip();

		bSignalSemaphores = memAllocLong(signalSemaphores.size());
		for (final Long signalSemaphore : signalSemaphores)
		{
			bSignalSemaphores.put(signalSemaphore);
		}
		bSignalSemaphores.flip();

		submitInfo = VkSubmitInfo.calloc();
		submitInfo.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
		submitInfo.waitSemaphoreCount(waitSemaphores.size());
		submitInfo.pWaitSemaphores(bWaitSemaphores);
		submitInfo.pWaitDstStageMask(waitStages);
		submitInfo.pCommandBuffers(pCommandBuffers);
		submitInfo.pSignalSemaphores(bSignalSemaphores);
	}

	@Override
	public void free(IAllocationContext context)
	{
		fence.free(context);

		memFree(pCommandBuffers);
		pCommandBuffers = null;

		if (waitStages != null) memFree(waitStages);

		memFree(bSignalSemaphores);
		bSignalSemaphores = null;

		if (bWaitSemaphores != null) memFree(bWaitSemaphores);

		submitInfo.free();
		submitInfo = null;
	}

	@Override
	public void submit()
	{
		final long fenceId = fence.getId();

		waitIdle();

		Logger.check(vkQueueSubmit(queue, submitInfo, fenceId), FAILED_SUBMIT, true);
		fence.setUsed(true);
	}

	@Override
	public void waitIdle()
	{
		if (fence.isUsed() && fence.isSignaled() == false)
		{
			if (fence.waitForSignal(TIMEOUT) == false)
			{
				Logger.log(FENCE_TIMEOUT, true);
			}
		}
		fence.reset();
	}

	@Override
	public VkSubmitInfo getSubmitInfo()
	{
		return submitInfo;
	}

	@Override
	public boolean isAllocationDirty(IAllocationContext context)
	{
		final var processContext = (ProcessContext) context;
		return processContext.getExecutionRecorders().isAllocationDirty(context);
	}
}
