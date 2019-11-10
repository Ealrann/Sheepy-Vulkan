package org.sheepy.vulkan.resource.staging;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.core.api.allocation.IAllocable;
import org.sheepy.vulkan.execution.IExecutionContext;
import org.sheepy.vulkan.execution.IRecordable.RecordContext;
import org.sheepy.vulkan.model.enumeration.EBufferUsage;
import org.sheepy.vulkan.resource.buffer.BufferInfo;
import org.sheepy.vulkan.resource.buffer.CPUBufferBackend;
import org.sheepy.vulkan.resource.staging.ITransferBuffer.MemoryTicket.EReservationStatus;
import org.sheepy.vulkan.resource.staging.memory.MemorySpaceManager;
import org.sheepy.vulkan.resource.staging.memory.MemorySpaceManager.MemorySpace;

public class TransferBufferBackend implements IAllocable<IExecutionContext>, ITransferBuffer
{
	private static final String MEMORY_RESERVATION_REJECTED = "MemoryTicket reservation was rejected";

	public final CPUBufferBackend bufferBackend;

	private final List<MemoryTicket> tickets = new ArrayList<>();
	private final Deque<IDataFlowCommand> synchronizedCommands = new ArrayDeque<>();
	private final Deque<IDataFlowCommand> unsynchronizedCommands = new ArrayDeque<>();
	private final long capacity;
	private final MemorySpaceManager spaceManager;
	private final List<FlushListener> flushListeners = new ArrayList<>();

	private boolean containingPushCommand = false;
	private boolean containingFetchCommand = false;
	private IExecutionContext executionContext;

	public TransferBufferBackend(	long capacity,
									int instanceCount,
									boolean usedToPush,
									boolean usedToFetch)
	{
		this.capacity = capacity;
		spaceManager = new MemorySpaceManager(capacity);

		final int pushUsage = usedToPush ? EBufferUsage.TRANSFER_SRC_BIT_VALUE : 0;
		final int fetchUsage = usedToFetch ? EBufferUsage.TRANSFER_DST_BIT_VALUE : 0;
		final int usage = pushUsage | fetchUsage;

		final var info = new BufferInfo(capacity, usage, true, instanceCount);
		bufferBackend = new CPUBufferBackend(info, false);
	}

	@Override
	public void allocate(IExecutionContext context)
	{
		this.executionContext = context;
		bufferBackend.allocate(context);
	}

	@Override
	public void free(IExecutionContext context)
	{
		bufferBackend.free(context);
	}

	@Override
	public MemoryTicket reserveMemory(long size)
	{
		MemoryTicket res = null;

		if (size > capacity)
		{
			res = newFailTicket(EReservationStatus.ERROR__REQUEST_TOO_BIG);
		}
		else
		{
			final var space = spaceManager.reserveMemory(size);

			if (space == null)
			{
				res = newFailTicket(EReservationStatus.FAIL__NO_SPACE_LEFT);
			}
			else
			{
				final long position = space.getOffset();
				final long memoryPtr = bufferBackend.getMemoryMap() + position;
				final long bufferOffset = bufferBackend.getOffset() + position;

				res = newSuccessTicket(space, memoryPtr, bufferOffset, size);

				tickets.add(res);
			}
		}

		return res;
	}

	@Override
	public void releaseTicket(MemoryTicket ticket)
	{
		spaceManager.releaseMemory(ticket.memorySpace);
	}

	@Override
	public void addTransferCommand(IDataFlowCommand command)
	{
		if (command.getMemoryTicket().getReservationStatus() == EReservationStatus.FLUSHED)
		{
			throw new IllegalStateException(MEMORY_RESERVATION_REJECTED);
		}
		else if (command.getMemoryTicket().getReservationStatus() != EReservationStatus.SUCCESS)
		{
			throw new IllegalStateException(MEMORY_RESERVATION_REJECTED);
		}

		switch (command.getFlowType())
		{
		case FETCH:
			containingFetchCommand = true;
			break;
		case PUSH:
			containingPushCommand = true;
			break;
		}

		if (command.isPipelined())
		{
			synchronizedCommands.add(command);
		}
		else
		{
			unsynchronizedCommands.add(command);
		}
	}

	@Override
	public boolean isEmpty()
	{
		return synchronizedCommands.isEmpty() && unsynchronizedCommands.isEmpty();
	}

	@Override
	public void prepare()
	{
		firePreFlush();
	}

	@Override
	public void flushCommands(RecordContext context)
	{
		final var logicalDevice = executionContext.getLogicalDevice();
		final var commandBuffer = context.commandBuffer;

		try (final MemoryStack stack = MemoryStack.stackPush())
		{
			if (containingPushCommand)
			{
				bufferBackend.flush(stack, logicalDevice);
			}
			bufferBackend.nextInstance();

			while (synchronizedCommands.isEmpty() == false)
			{
				synchronizedCommands.pop().execute(stack, commandBuffer);
			}

			if (unsynchronizedCommands.isEmpty() == false)
			{
				executionContext.execute((ctx, subCommandBuffer) ->
				{
					for (final var command : unsynchronizedCommands)
					{
						command.execute(stack, subCommandBuffer);
					}
				});
			}

			if (containingFetchCommand)
			{
				bufferBackend.invalidate(stack, logicalDevice);
			}

			if (unsynchronizedCommands.isEmpty() == false)
			{
				context.addListener(() -> bufferBackend.invalidate(logicalDevice));
				while (unsynchronizedCommands.isEmpty() == false)
				{
					final var command = unsynchronizedCommands.pop();
					context.addListener(() -> command	.getPostAction()
														.accept(command.getMemoryTicket()));
				}
			}
		}

		clear();
	}

	private void clear()
	{
		for (int i = 0; i < tickets.size(); i++)
		{
			final var ticket = tickets.get(i);
			ticket.invalidate();
		}

		containingFetchCommand = false;
		containingPushCommand = false;
		spaceManager.clear();

		tickets.clear();
	}

	@Override
	public void addListener(FlushListener l)
	{
		flushListeners.add(l);
	}

	@Override
	public void removeListener(FlushListener l)
	{
		flushListeners.remove(l);
	}

	private void firePreFlush()
	{
		for (int i = 0; i < flushListeners.size(); i++)
		{
			final var flushListener = flushListeners.get(i);
			flushListener.preFlush();
		}
	}

	private static MemoryTicket newFailTicket(EReservationStatus failure)
	{
		return new MemoryTicket(failure, null, -1, -1, -1, -1);
	}

	private MemoryTicket newSuccessTicket(	MemorySpace space,
											long memoryPtr,
											long bufferOffset,
											long size)
	{
		return new MemoryTicket(EReservationStatus.SUCCESS,
								space,
								bufferBackend.getAddress(),
								memoryPtr,
								bufferOffset,
								size);
	}
}
