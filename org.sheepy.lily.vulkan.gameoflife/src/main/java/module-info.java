import org.sheepy.lily.core.api.cadence.IMainLoop;
import org.sheepy.lily.vulkan.gameoflife.MainLoop;

module org.sheepy.lily.vulkan.gameoflife
{
	requires org.sheepy.lily.vulkan.api;
	requires org.sheepy.lily.vulkan.resource;
	requires org.sheepy.lily.vulkan.process.compute;
	requires org.sheepy.lily.vulkan.process.graphic;

	requires org.joml;
	
	provides IMainLoop with MainLoop;
}