package org.sheepy.vulkan.demo.texture;

import org.sheepy.vulkan.VulkanApplicationLauncher;
import org.sheepy.vulkan.demo.mesh.MeshAdapter;
import org.sheepy.vulkan.demo.mesh.MeshConfiguration;
import org.sheepy.vulkan.demo.mesh.MeshModelFactory;
import org.sheepy.vulkan.demo.mesh.UniformBufferAdapter;
import org.sheepy.vulkan.demo.model.UniformBuffer;
import org.sheepy.vulkan.model.VulkanApplication;
import org.sheepy.vulkan.model.enumeration.EFrontFace;

public class MainTexture
{
	private static final String IMAGE_PATH = "image_77MJJZ.png";
	private static final String VERTEX_SHADER_PATH = "texture.vert.spv";
	private static final String FRAGMENT_SHADER_PATH = "texture.frag.spv";

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private VulkanApplication application;
	private UniformBuffer ubo;
	private long start;

	public static void main(String[] args)
	{
		final MainTexture mainTexture = new MainTexture();
		mainTexture.launch();
	}

	public MainTexture()
	{
		MeshAdapter.meshBuilder = new TextureMeshBuilder();
	}

	public void launch()
	{
		final var modelFactory = buildModelFactory();

		application = modelFactory.application;
		ubo = modelFactory.uniformBuffer;

		var graphicPool = application.getGraphicPool();
		var applicationAdapter = VulkanApplicationLauncher.launch(application);

		start = System.currentTimeMillis();
		while (!applicationAdapter.shouldClose())
		{
			updateUniformBuffer();
			applicationAdapter.prepare();
			applicationAdapter.execute(graphicPool);
		}
	}

	private void updateUniformBuffer()
	{
		final long current = System.currentTimeMillis();
		final float progress = (current - start) / 1000f;

		UniformBufferAdapter.adapt(ubo).update(progress);
	}

	private static MeshModelFactory buildModelFactory()
	{
		final var meshConfiguration = new MeshConfiguration(WIDTH, HEIGHT, true);

		meshConfiguration.buildUniformBuffer = true;
		meshConfiguration.vertexShaderPath = VERTEX_SHADER_PATH;
		meshConfiguration.fragmentShaderPath = FRAGMENT_SHADER_PATH;
		meshConfiguration.rasterizerFrontFace = EFrontFace.COUNTER_CLOCKWISE;
		meshConfiguration.texturePath = IMAGE_PATH;

		final var modelFactory = new MeshModelFactory(meshConfiguration);
		return modelFactory;
	}
}