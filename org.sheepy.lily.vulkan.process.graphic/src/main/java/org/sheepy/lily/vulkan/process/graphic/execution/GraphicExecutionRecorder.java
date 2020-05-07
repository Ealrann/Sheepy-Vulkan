package org.sheepy.lily.vulkan.process.graphic.execution;

import org.sheepy.lily.vulkan.api.concurrent.IFenceView;
import org.sheepy.lily.vulkan.core.concurrent.VkSemaphore;
import org.sheepy.lily.vulkan.core.execution.ExecutionContext;
import org.sheepy.lily.vulkan.core.execution.IRecordable.RecordContext;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess;
import org.sheepy.lily.vulkan.model.process.graphic.Subpass;
import org.sheepy.lily.vulkan.process.execution.AbstractExecutionRecorder;
import org.sheepy.lily.vulkan.process.execution.Submission;
import org.sheepy.lily.vulkan.process.process.ProcessContext;
import org.sheepy.vulkan.model.enumeration.ECommandStage;

import static org.lwjgl.vulkan.VK10.VK_SUBPASS_CONTENTS_INLINE;
import static org.lwjgl.vulkan.VK10.vkCmdNextSubpass;

public final class GraphicExecutionRecorder extends AbstractExecutionRecorder
{
	private final GraphicProcess process;
	private final PresentSubmission presentSubmission;
	private final VkSemaphore presentSemaphore;
	private final Runnable subpassListener = this::countSubpasses;

	private int subpassCount;

	public GraphicExecutionRecorder(GraphicProcess process,
									ProcessContext context,
									GraphicCommandBuffer commandBuffer,
									Submission submission,
									PresentSubmission presentSubmission,
									VkSemaphore presentSemaphore,
									int index)
	{
		super(commandBuffer, context, submission, index);
		this.process = process;
		this.presentSubmission = presentSubmission;
		this.presentSemaphore = presentSemaphore;
		countSubpasses();

		process.listenNoParam(subpassListener, GraphicPackage.GRAPHIC_PROCESS__SUBPASSES);
	}

	@Override
	public void free(ExecutionContext context)
	{
		process.sulkNoParam(subpassListener, GraphicPackage.GRAPHIC_PROCESS__SUBPASSES);
		super.free(context);
		presentSemaphore.free(context.getVkDevice());
		presentSubmission.free();
	}

	@Override
	protected void recordCommand(ProcessContext graphicContext, RecordContext recordContext)
	{
		final var graphicProcess = (GraphicProcess) graphicContext.getProcess();
		final var subpasses = graphicProcess.getSubpasses();
		final var vkCommandBuffer = commandBuffer.getVkCommandBuffer();
		final var stage = recordContext.stage;
		int current = 0;

		while (current < subpassCount)
		{
			if (stage == ECommandStage.RENDER && current != 0)
			{
				vkCmdNextSubpass(vkCommandBuffer, VK_SUBPASS_CONTENTS_INLINE);
			}

			for (int i = 0; i < subpasses.size(); i++)
			{
				final var subpass = subpasses.get(i);
				final int subpassIndex = subpass.getSubpassIndex();

				if (subpassIndex == current)
				{
					record(subpass, recordContext);
				}
			}

			current++;
		}
	}

	@Override
	public IFenceView play()
	{
		final var res = super.play();
		presentSubmission.submit();
		return res;
	}

	private void countSubpasses()
	{
		int res = 0;
		for (final var subpass : process.getSubpasses())
		{
			final int subpassIndex = subpass.getSubpassIndex() + 1;
			if (subpassIndex > res)
			{
				res = subpassIndex;
			}
		}
		subpassCount = res;
	}

	private static void record(Subpass subpass, RecordContext recordContext)
	{
		final var pipelinePkg = subpass.getPipelinePkg();
		if (pipelinePkg != null)
		{
			final var pipelines = pipelinePkg.getPipelines();
			for (int i = 0; i < pipelines.size(); i++)
			{
				final var pipeline = pipelines.get(i);
				record(recordContext, pipeline);
			}
		}
	}
}
