package org.sheepy.vulkan.resource.staging;

import java.util.EventListener;

import org.sheepy.vulkan.execution.IRecordable.RecordContext;
import org.sheepy.vulkan.resource.staging.memory.MemorySpaceManager.MemorySpace;

public interface ITransferBuffer
{
	MemoryTicket reserveMemory(long size);
	void releaseTicket(MemoryTicket ticket);

	void addTransferCommand(IDataFlowCommand command);
	boolean isEmpty();

	void prepare();
	void flushCommands(RecordContext context);

	void addListener(FlushListener listener);
	void removeListener(FlushListener listener);

	@FunctionalInterface
	static interface FlushListener extends EventListener
	{
		void preFlush();
	}

	static final class MemoryTicket
	{
		final MemorySpace memorySpace;

		private final long bufferPtr;
		private final long memoryPtr;
		private final long bufferOffset;
		private final long size;

		private EReservationStatus reservationStatus;

		MemoryTicket(	EReservationStatus reservationStatus,
						MemorySpace memorySpace,
						long bufferPtr,
						long memoryPtr,
						long bufferOffset,
						long size)
		{
			this.reservationStatus = reservationStatus;
			this.memorySpace = memorySpace;
			this.bufferPtr = bufferPtr;
			this.memoryPtr = memoryPtr;
			this.bufferOffset = bufferOffset;
			this.size = size;
		}

		public void invalidate()
		{
			reservationStatus = EReservationStatus.FLUSHED;
		}

		public EReservationStatus getReservationStatus()
		{
			return reservationStatus;
		}

		public long getBufferPtr()
		{
			return bufferPtr;
		}

		public long getMemoryPtr()
		{
			return memoryPtr;
		}

		public long getSize()
		{
			return size;
		}

		public long getBufferOffset()
		{
			return bufferOffset;
		}

		public static enum EReservationStatus
		{
			SUCCESS,
			FLUSHED,
			FAIL__NO_SPACE_LEFT,
			ERROR__REQUEST_TOO_BIG;
		}
	}
}
