package org.sheepy.lily.vulkan.demo.rotating;

import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.model.application.GenericScenePart;
import org.sheepy.lily.core.model.application.Scene;
import org.sheepy.lily.vulkan.api.view.IScenePart_SubpassProvider;
import org.sheepy.lily.vulkan.demo.mesh.MeshConfiguration;
import org.sheepy.lily.vulkan.demo.mesh.MeshGraphicBuilder;
import org.sheepy.lily.vulkan.demo.triangle.TriangleMeshBuilder;
import org.sheepy.lily.vulkan.model.process.graphic.SwapImageAttachment;
import org.sheepy.vulkan.model.enumeration.EFrontFace;

@Adapter(scope = GenericScenePart.class, name = MainRotating.NAME)
public class RotatingSubpassProvider implements IScenePart_SubpassProvider<GenericScenePart>
{
	static final String VERTEX_SHADER_PATH = "rotating.vert.spv";
	static final String FRAGMENT_SHADER_PATH = "rotating.frag.spv";

	@Override
	public SubpassData build(GenericScenePart part, SwapImageAttachment colorAttachment)
	{
		final var scene = (Scene) part.eContainer();
		final var size = scene.getSize();
		final var meshBuilder = new TriangleMeshBuilder();
		final var meshConfiguration = new MeshConfiguration(meshBuilder, size);
		meshConfiguration.useCamera = true;
		meshConfiguration.vertexShaderPath = VERTEX_SHADER_PATH;
		meshConfiguration.fragmentShaderPath = FRAGMENT_SHADER_PATH;
		meshConfiguration.rasterizerFrontFace = EFrontFace.COUNTER_CLOCKWISE;

		final var builder = new MeshGraphicBuilder(meshConfiguration);
		return builder.build(colorAttachment);
	}
}