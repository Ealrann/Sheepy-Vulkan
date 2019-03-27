package org.sheepy.lily.vulkan.demo.mesh;

import org.joml.Vector2i;
import org.sheepy.lily.core.model.application.Application;
import org.sheepy.lily.core.model.application.impl.ApplicationImpl;
import org.sheepy.lily.vulkan.demo.model.MeshBuffer;
import org.sheepy.lily.vulkan.demo.model.MeshPipeline;
import org.sheepy.lily.vulkan.demo.model.impl.MeshBufferImpl;
import org.sheepy.lily.vulkan.demo.model.impl.MeshPipelineImpl;
import org.sheepy.lily.vulkan.model.ResourcePkg;
import org.sheepy.lily.vulkan.model.VulkanEngine;
import org.sheepy.lily.vulkan.model.enumeration.EAccess;
import org.sheepy.lily.vulkan.model.enumeration.EAttachmentLoadOp;
import org.sheepy.lily.vulkan.model.enumeration.EAttachmentStoreOp;
import org.sheepy.lily.vulkan.model.enumeration.EImageLayout;
import org.sheepy.lily.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.lily.vulkan.model.enumeration.ESampleCount;
import org.sheepy.lily.vulkan.model.enumeration.EShaderStage;
import org.sheepy.lily.vulkan.model.impl.ColorDomainImpl;
import org.sheepy.lily.vulkan.model.impl.ResourcePkgImpl;
import org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl;
import org.sheepy.lily.vulkan.model.process.graphic.AttachementRef;
import org.sheepy.lily.vulkan.model.process.graphic.DepthAttachment;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicConfiguration;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess;
import org.sheepy.lily.vulkan.model.process.graphic.RenderPassInfo;
import org.sheepy.lily.vulkan.model.process.graphic.SubpassDependency;
import org.sheepy.lily.vulkan.model.process.graphic.SwapchainConfiguration;
import org.sheepy.lily.vulkan.model.process.graphic.impl.AttachementRefImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.ColorBlendAttachmentImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.ColorBlendImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.DepthAttachmentImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.ExtraAttachmentDescriptionImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.FramebufferConfigurationImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.GraphicConfigurationImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.GraphicProcessImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.RasterizerImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.RenderPassInfoImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.ScissorImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.StaticViewportStateImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.SubpassDependencyImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.SubpassImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.SwapImageAttachmentDescriptionImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.SwapchainConfigurationImpl;
import org.sheepy.lily.vulkan.model.process.graphic.impl.ViewportImpl;
import org.sheepy.lily.vulkan.model.process.impl.PipelinePkgImpl;
import org.sheepy.lily.vulkan.model.resource.ModuleResource;
import org.sheepy.lily.vulkan.model.resource.Shader;
import org.sheepy.lily.vulkan.model.resource.impl.BufferImpl;
import org.sheepy.lily.vulkan.model.resource.impl.DescriptorSetImpl;
import org.sheepy.lily.vulkan.model.resource.impl.ModuleResourceImpl;
import org.sheepy.lily.vulkan.model.resource.impl.ShaderImpl;
import org.sheepy.lily.vulkan.model.resource.impl.TextureImpl;

public class MeshModelFactory
{
	public static final String MESH_UNIFORM_BUFFER_NAME = "Mesh Uniform Buffer";

	private final MeshConfiguration meshConfiguration;

	public final Application application = new ApplicationImpl();
	public final VulkanEngine engine = new VulkanEngineImpl();
	public final MeshBuffer meshBuffer = new MeshBufferImpl();
	public final GraphicProcess graphicProcess;

	private DepthAttachment depthAttachment;

	public MeshModelFactory(MeshConfiguration meshConfiguration)
	{
		this.meshConfiguration = meshConfiguration;
		final var size = new Vector2i(meshConfiguration.width, meshConfiguration.height);

		application.setTitle("Vulkan Triangle");
		application.setSize(size);

		application.getEngines().add(engine);

		final var framebufferConfiguration = new FramebufferConfigurationImpl();

		final GraphicConfiguration configuration = new GraphicConfigurationImpl();
		final SwapchainConfiguration swapchainConfiguration = new SwapchainConfigurationImpl();

		if (meshConfiguration.depth)
		{
			depthAttachment = new DepthAttachmentImpl();
			swapchainConfiguration.getAtachments().add(depthAttachment);
		}

		configuration.setSwapchainConfiguration(swapchainConfiguration);
		configuration.setFramebufferConfiguration(framebufferConfiguration);
		configuration.setColorDomain(new ColorDomainImpl());

		graphicProcess = newMeshProcess();
		graphicProcess.setConfiguration(configuration);
		graphicProcess.setRenderPassInfo(newInfo());

		engine.getProcesses().add(graphicProcess);
	}

	private RenderPassInfo newInfo()
	{
		final RenderPassInfo renderPass = new RenderPassInfoImpl();
		final var subpass = new SubpassImpl();
		renderPass.getSubpasses().add(subpass);

		final var colorAttachmentDescriptor = new SwapImageAttachmentDescriptionImpl();
		colorAttachmentDescriptor.setSamples(ESampleCount.SAMPLE_COUNT_1BIT);
		colorAttachmentDescriptor.setLoadOp(EAttachmentLoadOp.CLEAR);
		colorAttachmentDescriptor.setStoreOp(EAttachmentStoreOp.STORE);
		colorAttachmentDescriptor.setStencilLoadOp(EAttachmentLoadOp.DONT_CARE);
		colorAttachmentDescriptor.setStencilStoreOp(EAttachmentStoreOp.DONT_CARE);
		colorAttachmentDescriptor.setInitialLayout(EImageLayout.UNDEFINED);
		colorAttachmentDescriptor.setFinalLayout(EImageLayout.PRESENT_SRC_KHR);

		renderPass.getAttachments().add(colorAttachmentDescriptor);

		final AttachementRef colorRef = new AttachementRefImpl();
		colorRef.setLayout(EImageLayout.COLOR_ATTACHMENT_OPTIMAL);
		colorRef.setAttachement(colorAttachmentDescriptor);
		subpass.getRefs().add(colorRef);

		if (meshConfiguration.depth)
		{
			final var depthAttachmentDescriptor = new ExtraAttachmentDescriptionImpl();

			depthAttachmentDescriptor.setSamples(ESampleCount.SAMPLE_COUNT_1BIT);
			depthAttachmentDescriptor.setLoadOp(EAttachmentLoadOp.CLEAR);
			depthAttachmentDescriptor.setStoreOp(EAttachmentStoreOp.DONT_CARE);
			depthAttachmentDescriptor.setStencilLoadOp(EAttachmentLoadOp.DONT_CARE);
			depthAttachmentDescriptor.setStencilStoreOp(EAttachmentStoreOp.DONT_CARE);
			depthAttachmentDescriptor.setInitialLayout(EImageLayout.UNDEFINED);
			depthAttachmentDescriptor.setFinalLayout(EImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);
			depthAttachmentDescriptor.setAttachment(depthAttachment);

			final AttachementRef depthRef = new AttachementRefImpl();
			depthRef.setLayout(EImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);
			depthRef.setAttachement(depthAttachmentDescriptor);

			subpass.getRefs().add(depthRef);
			renderPass.getAttachments().add(depthAttachmentDescriptor);
		}

		final SubpassDependency dependency = new SubpassDependencyImpl();
		dependency.setSrcSubpass(null);
		dependency.setDstSubpass(subpass);
		dependency.getSrcStageMask().add(EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT);
		dependency.getDstStageMask().add(EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT);
		dependency.getDstAccesses().add(EAccess.COLOR_ATTACHMENT_READ_BIT);
		dependency.getDstAccesses().add(EAccess.COLOR_ATTACHMENT_WRITE_BIT);

		renderPass.getDependencies().add(dependency);

		return renderPass;
	}

	private GraphicProcess newMeshProcess()
	{
		final var module = meshConfiguration.module;

		final ModuleResource vertexShaderFile = new ModuleResourceImpl();
		vertexShaderFile.setModule(module);
		vertexShaderFile.setPath(meshConfiguration.vertexShaderPath);

		final ModuleResource fragmentShaderFile = new ModuleResourceImpl();
		fragmentShaderFile.setModule(module);
		fragmentShaderFile.setPath(meshConfiguration.fragmentShaderPath);

		final Shader vertexShader = new ShaderImpl();
		vertexShader.setFile(vertexShaderFile);
		vertexShader.setStage(EShaderStage.VERTEX_BIT);

		final Shader fragmentShader = new ShaderImpl();
		fragmentShader.setFile(fragmentShaderFile);
		fragmentShader.setStage(EShaderStage.FRAGMENT_BIT);

		final var descriptorSet = new DescriptorSetImpl();

		final var rasterizer = new RasterizerImpl();
		rasterizer.setFrontFace(meshConfiguration.rasterizerFrontFace);

		final var viewportState = new StaticViewportStateImpl();
		viewportState.getViewports().add(new ViewportImpl());
		viewportState.getScissors().add(new ScissorImpl());

		final var colorBlend = new ColorBlendImpl();
		colorBlend.getAttachments().add(new ColorBlendAttachmentImpl());

		final MeshPipeline graphicPipeline = new MeshPipelineImpl();
		graphicPipeline.getShaders().add(vertexShader);
		graphicPipeline.getShaders().add(fragmentShader);
		graphicPipeline.setMesh(meshBuffer);
		graphicPipeline.setRasterizer(rasterizer);
		graphicPipeline.setViewportState(viewportState);
		graphicPipeline.setColorBlend(colorBlend);

		final GraphicProcess graphicProcess = new GraphicProcessImpl();

		final ResourcePkg resourceContainer = new ResourcePkgImpl();
		graphicProcess.setResourcePkg(resourceContainer);

		resourceContainer.getResources().add(meshBuffer);
		resourceContainer.getResources().add(vertexShader);
		resourceContainer.getResources().add(fragmentShader);
		graphicProcess.setPipelinePkg(new PipelinePkgImpl());
		graphicProcess.getPipelinePkg().getPipelines().add(graphicPipeline);

		if (meshConfiguration.buildUniformBuffer == true)
		{
			final var uniformBuffer = new BufferImpl();
			uniformBuffer.setName(MESH_UNIFORM_BUFFER_NAME);
			descriptorSet.getDescriptors().add(uniformBuffer);
			resourceContainer.getResources().add(uniformBuffer);
		}

		if (meshConfiguration.texturePath != null)
		{
			final ModuleResource textureFile = new ModuleResourceImpl();
			textureFile.setModule(module);
			textureFile.setPath(meshConfiguration.texturePath);

			final var texture = new TextureImpl();
			texture.setFile(textureFile);
			texture.setMipmapEnabled(meshConfiguration.mipmap);

			descriptorSet.getDescriptors().add(texture);
			resourceContainer.getResources().add(texture);
		}

		if (descriptorSet.getDescriptors().isEmpty() == false)
		{
			graphicPipeline.setDescriptorSet(descriptorSet);
			graphicProcess.getDescriptorSets().add(descriptorSet);
		}

		return graphicProcess;
	}
}
