package org.sheepy.lily.vulkan.demo.test.rotating;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.jupiter.api.Test;
import org.sheepy.lily.core.api.LilyLauncher;
import org.sheepy.lily.vulkan.demo.rotating.MainRotating;

public class MainRotatingTest
{
	@Test
	public void mainTest()
	{
		final var count = new AtomicInteger(0);
		final var application = MainRotating.createApplication();
		LilyLauncher.launch(application, () -> 
		{
			if(count.addAndGet(1) >= 500)
			{
				application.setRun(false);
			}
		});
	}
}
