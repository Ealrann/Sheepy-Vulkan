package org.sheepy.lily.vulkan.demo.gameoflife.model;

import org.joml.Vector2i;
import org.sheepy.lily.core.model.application.Application;
import org.sheepy.lily.core.model.application.ApplicationFactory;
import org.sheepy.lily.core.model.cadence.Cadence;
import org.sheepy.lily.core.model.cadence.CadenceFactory;
import org.sheepy.lily.vulkan.demo.gameoflife.compute.Board;
import org.sheepy.lily.vulkan.model.DescriptorPkg;
import org.sheepy.lily.vulkan.model.IDescriptor;
import org.sheepy.lily.vulkan.model.ResourcePkg;
import org.sheepy.lily.vulkan.model.VulkanEngine;
import org.sheepy.lily.vulkan.model.VulkanFactory;
import org.sheepy.lily.vulkan.model.binding.BindingConfiguration;
import org.sheepy.lily.vulkan.model.binding.BindingFactory;
import org.sheepy.lily.vulkan.model.process.ProcessFactory;
import org.sheepy.lily.vulkan.model.process.compute.ComputeFactory;
import org.sheepy.lily.vulkan.model.process.compute.ComputePipeline;
import org.sheepy.lily.vulkan.model.process.compute.ComputeProcess;
import org.sheepy.lily.vulkan.model.process.compute.DispatchTask;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicFactory;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess;
import org.sheepy.lily.vulkan.model.process.graphic.RenderPassInfo;
import org.sheepy.lily.vulkan.model.resource.Buffer;
import org.sheepy.lily.vulkan.model.resource.Image;
import org.sheepy.lily.vulkan.model.resource.ModuleResource;
import org.sheepy.lily.vulkan.model.resource.ResourceFactory;
import org.sheepy.lily.vulkan.model.resource.Shader;
import org.sheepy.lily.vulkan.model.resource.StaticImage;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EAttachmentLoadOp;
import org.sheepy.vulkan.model.enumeration.EAttachmentStoreOp;
import org.sheepy.vulkan.model.enumeration.EBindPoint;
import org.sheepy.vulkan.model.enumeration.ECommandStage;
import org.sheepy.vulkan.model.enumeration.EDescriptorType;
import org.sheepy.vulkan.model.enumeration.EImageLayout;
import org.sheepy.vulkan.model.enumeration.EImageUsage;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.vulkan.model.enumeration.ESampleCount;
import org.sheepy.vulkan.model.enumeration.EShaderStage;

public class ModelFactory
{
	public static final int WORKGROUP_SIDE = 8;

	private static final String SHADER_LIFE = "life.comp.spv";
	private static final String SHADER_LIFE2PIXEL = "life2pixel.comp.spv";

	public final Application application = ApplicationFactory.eINSTANCE.createApplication();
	public final VulkanEngine engine = VulkanFactory.eINSTANCE.createVulkanEngine();
	public final GraphicProcess presentProcess;
	public ComputeProcess lifeProcess;
	public ComputeProcess pixelProcess;
	public ResourcePkg sharedResources = VulkanFactory.eINSTANCE.createResourcePkg();
	public DescriptorPkg sharedDescriptors = VulkanFactory.eINSTANCE.createDescriptorPkg();

	private final Vector2i size;
	private StaticImage boardImage;
	private ComputePipeline lifePipeline;
	private ComputePipeline pixelPipeline;

	public ModelFactory(int width, int height)
	{
		this(width, height, -1);
	}

	public ModelFactory(int width, int height, int frameCount)
	{
		size = new Vector2i(width, height);

		application.setTitle("Vulkan - Game of Life");
		application.setSize(size);
		application.getEngines().add(engine);

		final var swapchainConfiguration = GraphicFactory.eINSTANCE.createSwapchainConfiguration();
		swapchainConfiguration.getSwapImageUsages().add(EImageUsage.TRANSFER_DST);
		swapchainConfiguration.getSwapImageUsages().add(EImageUsage.COLOR_ATTACHMENT);
		swapchainConfiguration.setAcquireWaitForVBlank(false);
		swapchainConfiguration.setPresentWhenVBlank(false);
		swapchainConfiguration.setAllowingAccessFromCompute(true);

		final var framebufferConfiguration = GraphicFactory.eINSTANCE.createFramebufferConfiguration();
		final var configuration = GraphicFactory.eINSTANCE.createGraphicConfiguration();
		configuration.setColorDomain(GraphicFactory.eINSTANCE.createColorDomain());
		configuration.setAcquireWaitStage(EPipelineStage.TRANSFER_BIT);
		configuration.setSwapchainConfiguration(swapchainConfiguration);
		configuration.setFramebufferConfiguration(framebufferConfiguration);

		createComputeProcessPool();

		presentProcess = newImageProcess();
		presentProcess.setConfiguration(configuration);
		presentProcess.setRenderPassInfo(newInfo());

		engine.getProcesses().add(lifeProcess);
		engine.getProcesses().add(pixelProcess);
		engine.getProcesses().add(presentProcess);
		engine.setResourcePkg(sharedResources);
		engine.setDescriptorPkg(sharedDescriptors);
		engine.setCadence(buildCadence(frameCount));
	}

	private static RenderPassInfo newInfo()
	{
		final var renderPass = GraphicFactory.eINSTANCE.createRenderPassInfo();
		final var subpass = GraphicFactory.eINSTANCE.createSubpass();
		renderPass.getSubpasses().add(subpass);

		final var colorAttachment = GraphicFactory.eINSTANCE.createSwapImageAttachmentDescription();
		colorAttachment.setSamples(ESampleCount.SAMPLE_COUNT_1BIT);
		colorAttachment.setLoadOp(EAttachmentLoadOp.LOAD);
		colorAttachment.setStoreOp(EAttachmentStoreOp.STORE);
		colorAttachment.setStencilLoadOp(EAttachmentLoadOp.DONT_CARE);
		colorAttachment.setStencilStoreOp(EAttachmentStoreOp.DONT_CARE);
		colorAttachment.setInitialLayout(EImageLayout.TRANSFER_DST_OPTIMAL);
		colorAttachment.setFinalLayout(EImageLayout.PRESENT_SRC_KHR);

		renderPass.getAttachments().add(colorAttachment);

		final var colorRef = GraphicFactory.eINSTANCE.createAttachmentRef();
		colorRef.setLayout(EImageLayout.COLOR_ATTACHMENT_OPTIMAL);
		colorRef.setAttachment(colorAttachment);
		subpass.getRefs().add(colorRef);

		final var dependencyExt = GraphicFactory.eINSTANCE.createSubpassDependency();
		dependencyExt.setSrcSubpass(null);
		dependencyExt.setDstSubpass(subpass);
		dependencyExt.getSrcStageMask().add(EPipelineStage.TRANSFER_BIT);
		dependencyExt.getDstStageMask().add(EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT);
		dependencyExt.getSrcAccesses().add(EAccess.TRANSFER_WRITE_BIT);
		dependencyExt.getDstAccesses().add(EAccess.COLOR_ATTACHMENT_READ_BIT);
		dependencyExt.getDstAccesses().add(EAccess.COLOR_ATTACHMENT_WRITE_BIT);

		renderPass.getDependencies().add(dependencyExt);

		return renderPass;
	}

	private GraphicProcess newImageProcess()
	{
		final var imagePipeline = ProcessFactory.eINSTANCE.createPipeline();

		final var imageBarrier1 = ResourceFactory.eINSTANCE.createImageBarrier();
		imageBarrier1.setImage(boardImage);
		imageBarrier1.getSrcAccessMask().add(EAccess.SHADER_WRITE_BIT);
		imageBarrier1.getDstAccessMask().add(EAccess.TRANSFER_READ_BIT);
		imageBarrier1.setSrcLayout(EImageLayout.UNDEFINED);
		imageBarrier1.setDstLayout(EImageLayout.TRANSFER_SRC_OPTIMAL);

		final var swapImageBarrier = GraphicFactory.eINSTANCE.createSwapImageBarrier();
		swapImageBarrier.getSrcAccessMask().add(EAccess.SHADER_WRITE_BIT);
		swapImageBarrier.getDstAccessMask().add(EAccess.TRANSFER_WRITE_BIT);
		swapImageBarrier.setSrcLayout(EImageLayout.UNDEFINED);
		swapImageBarrier.setDstLayout(EImageLayout.TRANSFER_DST_OPTIMAL);

		final var pipelineBarrier1 = ProcessFactory.eINSTANCE.createPipelineBarrier();
		pipelineBarrier1.setSrcStage(EPipelineStage.COMPUTE_SHADER_BIT);
		pipelineBarrier1.setDstStage(EPipelineStage.TRANSFER_BIT);
		pipelineBarrier1.getBarriers().add(imageBarrier1);
		pipelineBarrier1.getBarriers().add(swapImageBarrier);

		final var blit = GraphicFactory.eINSTANCE.createBlitToSwapImage();
		blit.setImage(boardImage);

		final var imageBarrier2 = ResourceFactory.eINSTANCE.createImageBarrier();
		imageBarrier2.setImage(boardImage);
		imageBarrier2.getSrcAccessMask().add(EAccess.TRANSFER_READ_BIT);
		imageBarrier2.getDstAccessMask().add(EAccess.SHADER_WRITE_BIT);
		imageBarrier2.setSrcLayout(EImageLayout.TRANSFER_SRC_OPTIMAL);
		imageBarrier2.setDstLayout(EImageLayout.GENERAL);

		final var pipelineBarrier2 = ProcessFactory.eINSTANCE.createPipelineBarrier();
		pipelineBarrier2.setSrcStage(EPipelineStage.TRANSFER_BIT);
		pipelineBarrier2.setDstStage(EPipelineStage.COMPUTE_SHADER_BIT);
		pipelineBarrier2.getBarriers().add(imageBarrier2);

		final var taskPkg = ProcessFactory.eINSTANCE.createTaskPkg();
		taskPkg.getTasks().add(pipelineBarrier1);
		taskPkg.getTasks().add(blit);
		taskPkg.getTasks().add(pipelineBarrier2);

		imagePipeline.setStage(ECommandStage.TRANSFER);
		imagePipeline.setTaskPkg(taskPkg);

		final GraphicProcess graphicProcess = GraphicFactory.eINSTANCE.createGraphicProcess();
		graphicProcess.setPartPkg(ProcessFactory.eINSTANCE.createProcessPartPkg());
		graphicProcess.getPartPkg().getParts().add(imagePipeline);

		return graphicProcess;
	}

	private void createComputeProcessPool()
	{
		lifeProcess = ComputeFactory.eINSTANCE.createComputeProcess();
		pixelProcess = ComputeFactory.eINSTANCE.createComputeProcess();
		final Module thisModule = getClass().getModule();

		final ModuleResource lifeShaderFile = ResourceFactory.eINSTANCE.createModuleResource();
		lifeShaderFile.setModule(thisModule);
		lifeShaderFile.setPath(SHADER_LIFE);

		final ModuleResource life2pixelShaderFile = ResourceFactory.eINSTANCE.createModuleResource();
		life2pixelShaderFile.setModule(thisModule);
		life2pixelShaderFile.setPath(SHADER_LIFE2PIXEL);

		final Shader lifeShader = ResourceFactory.eINSTANCE.createShader();
		lifeShader.setFile(lifeShaderFile);
		lifeShader.setStage(EShaderStage.COMPUTE_BIT);

		final Shader life2pixelShader = ResourceFactory.eINSTANCE.createShader();
		life2pixelShader.setFile(life2pixelShaderFile);
		life2pixelShader.setStage(EShaderStage.COMPUTE_BIT);

		final Board board = Board.createTestBoard(size);
		final Buffer boardBuffer1 = BoardBufferFactory.createBoardBuffer(board);
		final Buffer boardBuffer2 = BoardBufferFactory.createBoardBuffer(board);
		boardImage = BoardImageFactory.createBoardImage(size);

		final var boardBuffer1Descriptor = newDescriptor(boardBuffer1);
		final var boardBuffer2Descriptor = newDescriptor(boardBuffer2);
		final var boardImageDescriptor = newDescriptor(boardImage);

		final var lifeDescriptorSet1 = ResourceFactory.eINSTANCE.createDescriptorSet();
		final var lifeDescriptorSet2 = ResourceFactory.eINSTANCE.createDescriptorSet();
		final var pixelDescriptorSet1 = ResourceFactory.eINSTANCE.createDescriptorSet();
		final var pixelDescriptorSet2 = ResourceFactory.eINSTANCE.createDescriptorSet();

		lifeDescriptorSet1.getDescriptors().add(boardBuffer1Descriptor);
		lifeDescriptorSet1.getDescriptors().add(boardBuffer2Descriptor);
		lifeDescriptorSet1.getDescriptors().add(boardImageDescriptor);
		lifeDescriptorSet2.getDescriptors().add(boardBuffer2Descriptor);
		lifeDescriptorSet2.getDescriptors().add(boardBuffer1Descriptor);
		lifeDescriptorSet2.getDescriptors().add(boardImageDescriptor);
		pixelDescriptorSet1.getDescriptors().add(boardBuffer2Descriptor);
		pixelDescriptorSet1.getDescriptors().add(boardImageDescriptor);
		pixelDescriptorSet2.getDescriptors().add(boardBuffer1Descriptor);
		pixelDescriptorSet2.getDescriptors().add(boardImageDescriptor);

		final var lifeBindingConfiguration = BindingFactory.eINSTANCE.createBindingConfiguration();
		lifeBindingConfiguration.getDescriptorsSets().add(lifeDescriptorSet1);
		lifeBindingConfiguration.getDescriptorsSets().add(lifeDescriptorSet2);
		lifeBindingConfiguration.setDescriptorSetStride(1);
		final var pixelBindingConfiguration = BindingFactory.eINSTANCE.createBindingConfiguration();
		pixelBindingConfiguration.getDescriptorsSets().add(pixelDescriptorSet1);
		pixelBindingConfiguration.getDescriptorsSets().add(pixelDescriptorSet2);
		lifeBindingConfiguration.setDescriptorSetStride(1);

		lifePipeline = createPipeline(lifeShader, lifeBindingConfiguration);
		pixelPipeline = createPipeline(life2pixelShader, pixelBindingConfiguration);

		final var rotateTask = BindingFactory.eINSTANCE.createRotateConfiguration();
		rotateTask.getConfigurations().add(lifeBindingConfiguration);
		rotateTask.getConfigurations().add(pixelBindingConfiguration);
		lifePipeline.getTaskPkg().getTasks().add(rotateTask);

		final var lifeProcessPkg = ProcessFactory.eINSTANCE.createProcessPartPkg();
		lifeProcessPkg.getParts().add(lifePipeline);
		lifeProcess.setPartPkg(lifeProcessPkg);

		final var pixelProcessPkg = ProcessFactory.eINSTANCE.createProcessPartPkg();
		pixelProcessPkg.getParts().add(pixelPipeline);
		pixelProcess.setPartPkg(pixelProcessPkg);

		sharedResources.getResources().add(lifeShader);
		sharedResources.getResources().add(life2pixelShader);
		sharedResources.getResources().add(boardBuffer1);
		sharedResources.getResources().add(boardBuffer2);
		sharedResources.getResources().add(boardImage);

		sharedDescriptors.getDescriptors().add(boardBuffer1Descriptor);
		sharedDescriptors.getDescriptors().add(boardBuffer2Descriptor);
		sharedDescriptors.getDescriptors().add(boardImageDescriptor);

		lifeProcess.setExtensionPkg(ProcessFactory.eINSTANCE.createProcessExtensionPkg());
		lifeProcess.getExtensionPkg().getExtensions().add(lifeBindingConfiguration);
		pixelProcess.setExtensionPkg(ProcessFactory.eINSTANCE.createProcessExtensionPkg());
		pixelProcess.getExtensionPkg().getExtensions().add(pixelBindingConfiguration);

		lifeProcess.setResetAllowed(true);
		pixelProcess.setResetAllowed(true);
	}

	private ComputePipeline createPipeline(Shader shader, BindingConfiguration bindingConfiguration)
	{
		final var bindTask = ProcessFactory.eINSTANCE.createBindDescriptorSets();
		bindTask.setBindPoint(EBindPoint.COMPUTE);
		bindTask.getDescriptorSets().add(bindingConfiguration.getDescriptorsSets().get(0));
		final var taskPkg = ProcessFactory.eINSTANCE.createTaskPkg();
		final var dispatch = createDispatchTask();

		final var configureBindTask = BindingFactory.eINSTANCE.createConfigureBind();
		configureBindTask.setBindTask(bindTask);
		bindingConfiguration.getTasks().add(configureBindTask);

		final var pipeline = ComputeFactory.eINSTANCE.createComputePipeline();
		pipeline.setTaskPkg(taskPkg);
		taskPkg.getTasks().add(bindTask);
		taskPkg.getTasks().add(dispatch);

		final var dSetPkg = ResourceFactory.eINSTANCE.createDescriptorSetPkg();
		dSetPkg.getDescriptorSets().addAll(bindingConfiguration.getDescriptorsSets());

		pipeline.setShader(shader);
		pipeline.setStage(ECommandStage.COMPUTE);
		pipeline.setDescriptorSetPkg(dSetPkg);

		return pipeline;
	}

	private DispatchTask createDispatchTask()
	{
		final var res = ComputeFactory.eINSTANCE.createDispatchTask();
		res.setWorkgroupCountX(application.getSize().x() / WORKGROUP_SIDE);
		res.setWorkgroupCountY(application.getSize().y() / WORKGROUP_SIDE);
		return res;
	}

	private final Cadence buildCadence(int frameCount)
	{
		final var runComputeLifeTask = VulkanFactory.eINSTANCE.createRunProcess();
		final var runComputePixelTask = VulkanFactory.eINSTANCE.createRunProcess();
		final var runGraphicTask = VulkanFactory.eINSTANCE.createRunProcess();
		final var executeWhile = CadenceFactory.eINSTANCE.createExecuteWhile();
		final var printUPS = CadenceFactory.eINSTANCE.createPrintUPS();
		final var cadence = CadenceFactory.eINSTANCE.createCadence();
		final var haveTime = CadenceFactory.eINSTANCE.createHaveTime();
		final var loopTasks = executeWhile.getTasks();

		runComputeLifeTask.setProcess(lifeProcess);
		runComputePixelTask.setProcess(pixelProcess);
		runGraphicTask.setProcess(presentProcess);
		printUPS.setPrintEveryMs(1200);
		cadence.setFrequency(60);
		executeWhile.getConditions().add(haveTime);
		loopTasks.add(printUPS);
		loopTasks.add(runComputeLifeTask);

		cadence.getTasks().add(runComputePixelTask);
		cadence.getTasks().add(runGraphicTask);
		cadence.getTasks().add(executeWhile);

		if (frameCount > 0)
		{
			final var executeIf = CadenceFactory.eINSTANCE.createExecuteIf();
			final var countUntil = CadenceFactory.eINSTANCE.createCountUntil();
			final var closeApp = CadenceFactory.eINSTANCE.createCloseApplication();
			countUntil.setTotalCount(frameCount);
			executeIf.getConditions().add(countUntil);
			executeIf.getTasks().add(closeApp);

			loopTasks.add(executeIf);
		}

		return cadence;
	}

	private static IDescriptor newDescriptor(Buffer buffer)
	{
		final var reference = ResourceFactory.eINSTANCE.createBufferReference();
		reference.setBuffer(buffer);

		final var descriptor = ResourceFactory.eINSTANCE.createBufferDescriptor();
		descriptor.setType(EDescriptorType.STORAGE_BUFFER);
		descriptor.getShaderStages().add(EShaderStage.COMPUTE_BIT);
		descriptor.setBufferReference(reference);
		return descriptor;
	}

	private static IDescriptor newDescriptor(Image image)
	{
		final var descriptor = ResourceFactory.eINSTANCE.createImageDescriptor();
		descriptor.setType(EDescriptorType.STORAGE_IMAGE);
		descriptor.getShaderStages().add(EShaderStage.COMPUTE_BIT);
		descriptor.setImage(image);
		return descriptor;
	}
}
