package org.sheepy.lily.vulkan.api.window;

public interface IWindow
{
	boolean shouldClose();

	void addListener(IWindowListener listener);

	void removeListener(IWindowListener listener);

	Surface getSurface();

	long getId();
}