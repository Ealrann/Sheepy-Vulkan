package org.sheepy.vulkan.common.window;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.sheepy.common.api.cadence.ICadencer;
import org.sheepy.common.api.types.SVector2i;
import org.sheepy.common.model.application.Application;
import org.sheepy.vulkan.api.window.IWindowListener;
import org.sheepy.vulkan.api.window.Surface;
import org.sheepy.vulkan.common.application.VulkanApplicationUtil;
import org.sheepy.vulkan.common.test.BasicModelFactory;
import org.sheepy.vulkan.common.test.TestUtils;

public class WindowTest
{
	ICadencer cadencer = ICadencer.INSTANCE;
	private Application application;

	@BeforeEach
	public void init()
	{
		application = TestUtils.newBasicApplication();
		cadencer.start(application);
	}

	@AfterEach
	public void clean()
	{
		cadencer.stop();
		application = null;
	}

	@Test
	public void testNewWindow()
	{
		int expectedWidth = BasicModelFactory.WIDTH;
		int expectedHeight = BasicModelFactory.HEIGHT;

		WindowTestUtil.checkWindowSize(application, expectedWidth, expectedHeight);
	}

	@Test
	public void testResizeWindow()
	{
		Random random = new Random(System.currentTimeMillis());
		int newWidth = random.nextInt(500) + 1;
		int newHeight = random.nextInt(500) + 1;

		var lock = new ReentrantLock();
		lock.lock();
		var window = VulkanApplicationUtil.getWindow(application);
		window.addListener(new IWindowListener()
		{
			@Override
			public void onWindowResize(Surface surface)
			{
				assertEquals(newWidth, surface.width);
				assertEquals(newHeight, surface.height);
				lock.unlock();
			}
		});

		application.setSize(new SVector2i(newWidth, newHeight));

		try
		{
			var locked = lock.tryLock(1, TimeUnit.SECONDS);
			if (!locked)
			{
				fail("Window resize too long (or something wrong with the listener?)");
			}
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
