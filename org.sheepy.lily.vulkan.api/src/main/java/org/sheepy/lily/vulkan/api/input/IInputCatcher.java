package org.sheepy.lily.vulkan.api.input;

import org.sheepy.lily.core.api.input.IInputManager.IInputListener;

public interface IInputCatcher extends IInputListener
{
	void startCatch();
	void stopCatch();
	void update();

	boolean hasCaughtInputs();
	boolean isCursorThere();
}
