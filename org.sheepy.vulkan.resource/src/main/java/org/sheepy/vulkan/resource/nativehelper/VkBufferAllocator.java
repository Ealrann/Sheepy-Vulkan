package org.sheepy.vulkan.resource.nativehelper;

import static org.lwjgl.vulkan.VK10.*;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkBufferCreateInfo;
import org.lwjgl.vulkan.VkDevice;
import org.sheepy.vulkan.resource.buffer.BufferInfo;

public class VkBufferAllocator
{
	public static long allocate(MemoryStack stack, VkDevice device, BufferInfo bufferInfo)
	{
		return create(stack, device, bufferInfo);
	}

	private static long create(MemoryStack stack, VkDevice device, BufferInfo bufferInfo)
			throws AssertionError
	{
		VkBufferCreateInfo bufferCreateInfo = allocateInfo(stack, bufferInfo);
		long[] aVertexBuffer = new long[1];
		if (vkCreateBuffer(device, bufferCreateInfo, null, aVertexBuffer) != VK_SUCCESS)
		{
			throw new AssertionError("failed to create vertex buffer!");
		}
		return aVertexBuffer[0];
	}

	private static VkBufferCreateInfo allocateInfo(MemoryStack stack, BufferInfo bufferInfo)
	{
		VkBufferCreateInfo bufferCreateInfo = VkBufferCreateInfo.callocStack(stack);
		bufferCreateInfo.sType(VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO);
		bufferCreateInfo.size(bufferInfo.size);
		bufferCreateInfo.usage(bufferInfo.usage);
		bufferCreateInfo.sharingMode(VK_SHARING_MODE_EXCLUSIVE);

		return bufferCreateInfo;
	}
}
