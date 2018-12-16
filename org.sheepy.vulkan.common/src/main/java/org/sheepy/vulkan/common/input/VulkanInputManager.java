package org.sheepy.vulkan.common.input;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.system.MemoryStack.stackPush;

import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.system.MemoryStack;
import org.sheepy.common.api.input.IInputManager;
import org.sheepy.common.api.input.event.CharEvent;
import org.sheepy.common.api.input.event.IInputEvent;
import org.sheepy.common.api.input.event.KeyEvent;
import org.sheepy.common.api.input.event.MouseButtonEvent;
import org.sheepy.common.api.input.event.MouseLocationEvent;
import org.sheepy.common.api.input.event.ScrollEvent;
import org.sheepy.common.api.types.SVector2f;
import org.sheepy.common.model.types.EKeyState;
import org.sheepy.common.model.types.EMouseButton;

public class VulkanInputManager implements IInputManager
{
	private final SVector2f cursorPosition = new SVector2f();
	private final double[] cursorPositionX = new double[1];
	private final double[] cursorPositionY = new double[1];

	private final List<IInputEvent> events = new ArrayList<>();

	private final List<IInputListener> listeners = new ArrayList<>();

	private IInputCatcher catcher;

	private long windowId;

	public VulkanInputManager(long windowId)
	{
		this.windowId = windowId;
		setupInputCallbacks();
	}
	
	@Override
	public SVector2f getMouseLocation()
	{
		return cursorPosition;
	}

	public void configure(long windowId)
	{
		this.windowId = windowId;
	}

	public void setupInputCallbacks()
	{
		glfwSetScrollCallback(windowId, (window, xoffset, yoffset) -> {
			events.add(new ScrollEvent((float) xoffset, (float) yoffset));
		});
		glfwSetCharCallback(windowId, (window, codepoint) -> events.add(new CharEvent(codepoint)));
		glfwSetKeyCallback(windowId, (window, key, scancode, action, mods) -> {
			var state = action == GLFW_PRESS ? EKeyState.PRESSED : EKeyState.RELEASED;
			var event = new KeyEvent(key, state, mods);
			events.add(event);
		});
		glfwSetCursorPosCallback(windowId, (window, xpos, ypos) -> events
				.add(new MouseLocationEvent((float) xpos, (float) ypos)));
		glfwSetMouseButtonCallback(windowId, (window, button, action, mods) -> {
			try (MemoryStack stack = stackPush())
			{
				DoubleBuffer cx = stack.mallocDouble(1);
				DoubleBuffer cy = stack.mallocDouble(1);

				glfwGetCursorPos(window, cx, cy);

				EMouseButton mouseButton = null;
				switch (button)
				{
				case GLFW_MOUSE_BUTTON_RIGHT:
					mouseButton = EMouseButton.RIGHT;
					break;
				case GLFW_MOUSE_BUTTON_MIDDLE:
					mouseButton = EMouseButton.MIDDLE;
					break;
				case GLFW_MOUSE_BUTTON_LEFT:
					mouseButton = EMouseButton.LEFT;
				}
				events.add(new MouseButtonEvent(mouseButton, action == GLFW_PRESS));
			}
		});
	}

	@Override
	public void pollInputs()
	{
		if (catcher != null)
		{
			catcher.startCatch();
		}

		glfwPollEvents();

		// The elegance itself
		glfwGetCursorPos(windowId, cursorPositionX, cursorPositionY);
		cursorPosition.x = (float) cursorPositionX[0];
		cursorPosition.y = (float) cursorPositionY[0];

		if (catcher != null)
		{
			for (IInputEvent event : events)
			{
				fireEvent(event, catcher);
			}

			if (catcher.hasCaughtInputs())
			{
				dropInputEvents();
			}
		}

		fireEvents();
	}

	public void fireEvents()
	{
		for (IInputEvent event : events)
		{
			fireEvent(event);
		}
		events.clear();
	}

	public void dropInputEvents()
	{
		events.clear();
	}

	public void setInputCatcher(IInputCatcher catcher)
	{
		this.catcher = catcher;
	}

	private void fireEvent(IInputEvent event)
	{
		for (IInputListener listener : listeners)
		{
			fireEvent(event, listener);
		}
	}

	private void fireEvent(IInputEvent event, IInputListener listener)
	{
		if (event instanceof CharEvent)
		{
			listener.onCharEvent((CharEvent) event);
		}
		else if (event instanceof KeyEvent)
		{
			listener.onKeyEvent((KeyEvent) event);
		}
		else if (event instanceof MouseButtonEvent)
		{
			listener.onMouseClickEvent(getMouseLocation(), (MouseButtonEvent) event);
		}
		else if (event instanceof MouseLocationEvent)
		{
			listener.onMouseLocationEvent((MouseLocationEvent) event);
		}
		else if (event instanceof ScrollEvent)
		{
			listener.onScrollEvent((ScrollEvent) event);
		}
	}

	@Override
	public void addListener(IInputListener listener)
	{
		listeners.add(listener);
	}

	@Override
	public void removeListener(IInputListener listener)
	{
		listeners.remove(listener);
	}
}