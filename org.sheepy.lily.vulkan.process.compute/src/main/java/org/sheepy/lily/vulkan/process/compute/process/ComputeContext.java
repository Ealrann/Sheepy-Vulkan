package org.sheepy.lily.vulkan.process.compute.process;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.sheepy.lily.vulkan.api.queue.EQueueType;
import org.sheepy.lily.vulkan.common.allocation.common.IAllocable;
import org.sheepy.lily.vulkan.common.concurrent.VkSemaphore;
import org.sheepy.lily.vulkan.model.process.ProcessSemaphore;
import org.sheepy.lily.vulkan.model.process.compute.ComputeProcess;
import org.sheepy.lily.vulkan.process.compute.execution.ComputeCommandBuffers;
import org.sheepy.lily.vulkan.process.process.AbstractProcessAdapter;
import org.sheepy.lily.vulkan.process.process.ProcessContext;
import org.sheepy.lily.vulkan.process.process.ProcessSubmission;
import org.sheepy.lily.vulkan.process.process.WaitData;
import org.sheepy.lily.vulkan.resource.descriptor.DescriptorPool;

public class ComputeContext extends ProcessContext
{
	public final ComputeProcess computeProcess;
	public final ProcessSubmission submission;

	private List<IAllocable> allocationList;

	public ComputeContext(	EQueueType queueType,
							boolean resetAllowed,
							DescriptorPool descriptorPool,
							ComputeProcess computeProcess)
	{
		super(queueType, resetAllowed, descriptorPool, new ComputeCommandBuffers(), computeProcess);
		this.computeProcess = computeProcess;

		submission = createSubmission(computeProcess);

		buildAllocationList();
	}

	private static ProcessSubmission createSubmission(ComputeProcess computeProcess)
	{
		var processAdapter = AbstractProcessAdapter.adapt(computeProcess);

		List<WaitData> waitSemaphores = new ArrayList<>();
		for (ProcessSemaphore waitFor : computeProcess.getSemaphores())
		{
			var semaphoreData = convertToData(waitFor);
			waitSemaphores.add(semaphoreData);
		}

		List<VkSemaphore> signals = null;
		var executionSemaphore = processAdapter.getExecutionSemaphore();
		if (executionSemaphore != null)
		{
			signals = List.of(executionSemaphore);
		}
		else
		{
			signals = Collections.emptyList();
		}

		return new ProcessSubmission(waitSemaphores, signals);
	}

	private static WaitData convertToData(ProcessSemaphore processSemaphore)
	{
		var signalEmitter = AbstractProcessAdapter.adapt(processSemaphore.getProcess());
		var waitStage = processSemaphore.getWaitStage();
		return new WaitData(signalEmitter.getExecutionSemaphore(), waitStage);
	}

	private void buildAllocationList()
	{
		var tmpList = new ArrayList<IAllocable>();

		tmpList.add(commandBuffers);
		tmpList.add(submission);

		allocationList = List.copyOf(tmpList);
	}

	@Override
	public Collection<? extends Object> getAllocationChildren()
	{
		return allocationList;
	}
}
