package org.sheepy.lily.vulkan.core.resource.buffer;

import org.sheepy.lily.core.api.notification.Feature;
import org.sheepy.lily.core.api.notification.IFeatures;
import org.sheepy.lily.core.api.notification.INotifier;
import org.sheepy.lily.vulkan.api.resource.buffer.ITransferBufferAllocation;
import org.sheepy.lily.vulkan.core.execution.RecordContext;

public interface InternalTransferBufferAllocation extends ITransferBufferAllocation,
														  INotifier<InternalTransferBufferAllocation.Features>
{
	interface Features extends IFeatures<Features>
	{
		Feature<Runnable, Features> TransferQueueChange = Feature.newFeature();
	}

	boolean isEmpty();

	void flush(RecordContext context);
}
