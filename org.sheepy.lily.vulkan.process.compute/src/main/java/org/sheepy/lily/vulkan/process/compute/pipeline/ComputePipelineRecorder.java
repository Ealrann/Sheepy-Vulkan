package org.sheepy.lily.vulkan.process.compute.pipeline;

import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.AllocationDependency;
import org.sheepy.lily.core.api.allocation.annotation.InjectDependency;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.vulkan.core.execution.IRecordable;
import org.sheepy.lily.vulkan.core.pipeline.IPipelineAllocation;
import org.sheepy.lily.vulkan.core.pipeline.IRecordableExtender;
import org.sheepy.lily.vulkan.core.pipeline.VkPipeline;
import org.sheepy.lily.vulkan.model.process.compute.ComputePackage;
import org.sheepy.lily.vulkan.model.process.compute.ComputePipeline;
import org.sheepy.lily.vulkan.process.process.ProcessContext;
import org.sheepy.vulkan.model.enumeration.ECommandStage;

import java.util.List;

@ModelExtender(scope = ComputePipeline.class)
@Allocation(context = ProcessContext.class)
@AllocationDependency(type = IPipelineAllocation.class)
@AllocationDependency(features = ComputePackage.COMPUTE_PIPELINE__TASK_PKGS, type = IRecordableExtender.class)
public final class ComputePipelineRecorder implements IRecordableExtender
{
	private final ComputePipeline pipeline;
	private final VkPipeline vkPipeline;
	private final List<IRecordableExtender> recorders;

	private ComputePipelineRecorder(ComputePipeline pipeline,
									@InjectDependency(index = 0) IPipelineAllocation pipelineAllocation,
									@InjectDependency(index = 1) List<IRecordableExtender> recorders)
	{
		this.pipeline = pipeline;
		this.vkPipeline = pipelineAllocation.getVkPipeline();
		this.recorders = recorders;
	}

	@Override
	public void record(IRecordable.RecordContext context)
	{
		if (isActive())
		{
			final var currentStage = context.stage;
			if (vkPipeline != null && currentStage == ECommandStage.MAIN)
			{
				vkPipeline.bindPipeline(context.commandBuffer);
			}
			for (final var recorder : recorders)
			{
				recorder.record(context);
			}
		}
	}

	private boolean isActive()
	{
		return pipeline.isEnabled();
	}
}