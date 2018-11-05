package org.sheepy.vulkan.demo.mesh;

import static org.lwjgl.vulkan.VK10.*;

import org.sheepy.common.api.types.SVector2i;
import org.sheepy.vulkan.demo.model.MeshBuffer;
import org.sheepy.vulkan.demo.model.MeshPipeline;
import org.sheepy.vulkan.demo.model.UniformBuffer;
import org.sheepy.vulkan.demo.model.impl.MeshBufferImpl;
import org.sheepy.vulkan.demo.model.impl.MeshPipelineImpl;
import org.sheepy.vulkan.demo.model.impl.UniformBufferImpl;
import org.sheepy.vulkan.model.VulkanApplication;
import org.sheepy.vulkan.model.enumeration.EAttachmentLoadOp;
import org.sheepy.vulkan.model.enumeration.EAttachmentStoreOp;
import org.sheepy.vulkan.model.enumeration.EImageLayout;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;
import org.sheepy.vulkan.model.enumeration.ESampleCount;
import org.sheepy.vulkan.model.enumeration.EShaderStage;
import org.sheepy.vulkan.model.impl.VulkanApplicationImpl;
import org.sheepy.vulkan.model.process.AttachmentDescription;
import org.sheepy.vulkan.model.process.GraphicConfiguration;
import org.sheepy.vulkan.model.process.GraphicProcess;
import org.sheepy.vulkan.model.process.GraphicProcessPool;
import org.sheepy.vulkan.model.process.RenderPassInfo;
import org.sheepy.vulkan.model.process.SubpassDependency;
import org.sheepy.vulkan.model.process.impl.AttachmentDescriptionImpl;
import org.sheepy.vulkan.model.process.impl.ColorDomainImpl;
import org.sheepy.vulkan.model.process.impl.GraphicConfigurationImpl;
import org.sheepy.vulkan.model.process.impl.GraphicProcessImpl;
import org.sheepy.vulkan.model.process.impl.GraphicProcessPoolImpl;
import org.sheepy.vulkan.model.process.impl.RenderPassInfoImpl;
import org.sheepy.vulkan.model.process.impl.SubpassDependencyImpl;
import org.sheepy.vulkan.model.resource.DepthImage;
import org.sheepy.vulkan.model.resource.DescriptorSet;
import org.sheepy.vulkan.model.resource.ModuleResource;
import org.sheepy.vulkan.model.resource.Shader;
import org.sheepy.vulkan.model.resource.impl.DepthImageImpl;
import org.sheepy.vulkan.model.resource.impl.DescriptorSetImpl;
import org.sheepy.vulkan.model.resource.impl.ModuleResourceImpl;
import org.sheepy.vulkan.model.resource.impl.ShaderImpl;
import org.sheepy.vulkan.model.resource.impl.TextureImpl;

public class MeshModelFactory
{
	private final MeshConfiguration meshConfiguration;

	public final VulkanApplication application = new VulkanApplicationImpl();
	public final MeshBuffer meshBuffer = new MeshBufferImpl();

	public final UniformBuffer uniformBuffer;

	public MeshModelFactory(MeshConfiguration meshConfiguration)
	{
		this.meshConfiguration = meshConfiguration;
		final SVector2i size = new SVector2i(meshConfiguration.width, meshConfiguration.height);

		application.setTitle("Vulkan Triangle");
		application.setSize(size);
		application.setDebug(true);

		if (meshConfiguration.buildUniformBuffer == true)
		{
			uniformBuffer = new UniformBufferImpl();
		}
		else
		{
			uniformBuffer = null;
		}

		final GraphicConfiguration configuration = new GraphicConfigurationImpl();
		configuration.setColorDomain(new ColorDomainImpl());
		configuration.setRasterizerFrontFace(meshConfiguration.rasterizerFrontFace);

		final GraphicProcessPool meshProcessPool = newMeshProcessPool();
		meshProcessPool.setConfiguration(configuration);
		meshProcessPool.setRenderPassInfo(newInfo());

		application.setGraphicPool(meshProcessPool);
	}

	private RenderPassInfo newInfo()
	{
		final RenderPassInfo renderPass = new RenderPassInfoImpl();

		final AttachmentDescription colorAttachment = new AttachmentDescriptionImpl();
		colorAttachment.setSamples(ESampleCount.SAMPLE_COUNT_1BIT);
		colorAttachment.setLoadOp(EAttachmentLoadOp.CLEAR);
		colorAttachment.setStoreOp(EAttachmentStoreOp.STORE);
		colorAttachment.setStencilLoadOp(EAttachmentLoadOp.DONT_CARE);
		colorAttachment.setStencilStoreOp(EAttachmentStoreOp.DONT_CARE);
		colorAttachment.setInitialLayout(EImageLayout.UNDEFINED);
		colorAttachment.setFinalLayout(EImageLayout.PRESENT_SRC_KHR);

		colorAttachment.setRefLayout(EImageLayout.COLOR_ATTACHMENT_OPTIMAL);

		renderPass.getAttachments().add(colorAttachment);

		if (meshConfiguration.depth)
		{
			final AttachmentDescription depthAttachment = new AttachmentDescriptionImpl();
			depthAttachment.setStencil(true);

			depthAttachment.setSamples(ESampleCount.SAMPLE_COUNT_1BIT);
			depthAttachment.setLoadOp(EAttachmentLoadOp.CLEAR);
			depthAttachment.setStoreOp(EAttachmentStoreOp.DONT_CARE);
			depthAttachment.setStencilLoadOp(EAttachmentLoadOp.DONT_CARE);
			depthAttachment.setStencilStoreOp(EAttachmentStoreOp.DONT_CARE);
			depthAttachment.setInitialLayout(EImageLayout.UNDEFINED);
			depthAttachment.setFinalLayout(EImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

			depthAttachment.setRefLayout(EImageLayout.DEPTH_STENCIL_ATTACHMENT_OPTIMAL);

			renderPass.getAttachments().add(depthAttachment);
		}

		final SubpassDependency dependency = new SubpassDependencyImpl();
		dependency.setSrcSubpass(VK_SUBPASS_EXTERNAL);
		dependency.setDstSubpass(0);
		dependency.setSrcStageMask(EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT);
		dependency.setDstStageMask(EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT);
		dependency.setSrcAccessMask(0);
		dependency.setDstAccessMask(
				VK_ACCESS_COLOR_ATTACHMENT_READ_BIT | VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT);

		renderPass.getDependencies().add(dependency);

		return renderPass;
	}

	private GraphicProcessPool newMeshProcessPool()
	{
		final Module thisModule = getClass().getModule();

		final ModuleResource vertexShaderFile = new ModuleResourceImpl();
		vertexShaderFile.setModule(thisModule);
		vertexShaderFile.setPath(meshConfiguration.vertexShaderPath);

		final ModuleResource fragmentShaderFile = new ModuleResourceImpl();
		fragmentShaderFile.setModule(thisModule);
		fragmentShaderFile.setPath(meshConfiguration.fragmentShaderPath);

		final Shader vertexShader = new ShaderImpl();
		vertexShader.setFile(vertexShaderFile);
		vertexShader.setStage(EShaderStage.VERTEX_BIT);

		final Shader fragmentShader = new ShaderImpl();
		fragmentShader.setFile(fragmentShaderFile);
		fragmentShader.setStage(EShaderStage.FRAGMENT_BIT);

		final DescriptorSet descriptorSet = new DescriptorSetImpl();

		final MeshPipeline graphicPipeline = new MeshPipelineImpl();
		graphicPipeline.getShaders().add(vertexShader);
		graphicPipeline.getShaders().add(fragmentShader);
		graphicPipeline.setMesh(meshBuffer);

		final GraphicProcess graphicProcess = new GraphicProcessImpl();
		graphicProcess.getUnits().add(graphicPipeline);

		final GraphicProcessPool processPool = new GraphicProcessPoolImpl();
		processPool.getResources().add(meshBuffer);
		processPool.getResources().add(vertexShader);
		processPool.getResources().add(fragmentShader);
		processPool.getProcesses().add(graphicProcess);
		
		if(meshConfiguration.depth)
		{
			final DepthImage depthImage = new DepthImageImpl();
			processPool.getResources().add(depthImage);
			processPool.setDepthImage(depthImage);
		}
		
		if(uniformBuffer != null)
		{
			descriptorSet.getDescriptors().add(uniformBuffer);
			processPool.getResources().add(uniformBuffer);
		}

		if(meshConfiguration.texturePath != null)
		{
			final ModuleResource textureFile = new ModuleResourceImpl();
			textureFile.setModule(thisModule);
			textureFile.setPath(meshConfiguration.texturePath);
			
			final var texture = new TextureImpl();
			texture.setFile(textureFile);
			texture.setMipmapEnabled(meshConfiguration.mipmap);
			
			descriptorSet.getDescriptors().add(texture);
			processPool.getResources().add(texture);
		}

		if (descriptorSet.getDescriptors().isEmpty() == false)
			graphicPipeline.setDescriptorSet(descriptorSet);

		return processPool;
	}
}