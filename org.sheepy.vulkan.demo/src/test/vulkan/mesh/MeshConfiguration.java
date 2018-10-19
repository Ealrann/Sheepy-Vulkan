package test.vulkan.mesh;

import org.sheepy.vulkan.model.enumeration.EFrontFace;

public class MeshConfiguration
{

	public String texturePath = null;
	public String vertexShaderPath = "test/vulkan/triangle/triangle.vert.spv";
	public String fragmentShaderPath = "test/vulkan/triangle/triangle.frag.spv";

	public boolean buildUniformBuffer = false;
	
	public EFrontFace rasterizerFrontFace = EFrontFace.CLOCKWISE;
	
	public final int width;
	public final int height;
	public final boolean depth;
	public boolean mipmap = false;

	public MeshConfiguration(int width, int height, boolean depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
}