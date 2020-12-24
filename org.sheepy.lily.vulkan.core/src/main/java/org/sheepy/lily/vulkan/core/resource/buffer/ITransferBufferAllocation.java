package org.sheepy.lily.vulkan.core.resource.buffer;

import org.sheepy.lily.core.api.extender.IExtender;
import org.logoce.notification.api.Feature;
import org.logoce.notification.api.IFeatures;
import org.logoce.notification.api.INotifier;
import org.sheepy.lily.vulkan.core.execution.RecordContext;

public interface ITransferBufferAllocation extends IExtender, INotifier<ITransferBufferAllocation.Features>
{
	interface Features extends IFeatures<Features>
	{
		Feature<Runnable, Features> TransferQueueChange = Feature.newFeature();
	}

	boolean isEmpty();

	void flush(RecordContext context);
}
