package org.sheepy.lily.vulkan.common.window;

import static org.junit.jupiter.api.Assertions.*;
import static org.lwjgl.glfw.GLFW.glfwGetWindowSize;

import org.sheepy.lily.core.model.application.Application;
import org.sheepy.lily.vulkan.common.application.VulkanApplicationUtil;

public class WindowTestUtil
{
	public static boolean checkWindowSize(	Application application,
											int expectedWidth,
											int expectedHeight)
	{
		var window = VulkanApplicationUtil.getWindow(application);

		if (window == null)
		{
			fail("No window");
		}

		int[] width = new int[1];
		int[] height = new int[1];

		glfwGetWindowSize(window.getId(), width, height);

		return expectedWidth == width[0] && expectedHeight == height[0];
	}
}
