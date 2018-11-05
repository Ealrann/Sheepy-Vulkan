import org.sheepy.common.api.adapter.IServiceAdapter;
import org.sheepy.vulkan.gameoflife.compute.BoardBufferAdapter;
import org.sheepy.vulkan.gameoflife.compute.BoardImageAdapter;

/**
 *
 */
module org.sheepy.vulkan.gameoflife {
	
	requires org.sheepy.vulkan;
	
	requires org.joml;
	
	provides IServiceAdapter with BoardBufferAdapter, BoardImageAdapter;
}