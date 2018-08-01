package org.sheepy.vulkan;

import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.memUTF8;
import static org.lwjgl.vulkan.EXTDebugReport.vkDestroyDebugReportCallbackEXT;
import static org.lwjgl.vulkan.KHRSwapchain.VK_KHR_SWAPCHAIN_EXTENSION_NAME;
import static org.lwjgl.vulkan.VK10.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkApplicationInfo;
import org.lwjgl.vulkan.VkInstance;
import org.lwjgl.vulkan.VkInstanceCreateInfo;
import org.sheepy.vulkan.device.LogicalDevice;
import org.sheepy.vulkan.device.PhysicalDeviceSelector;
import org.sheepy.vulkan.device.PhysicalDeviceWrapper;
import org.sheepy.vulkan.pipeline.AbstractProcessPool;
import org.sheepy.vulkan.pipeline.SurfaceProcessPool;
import org.sheepy.vulkan.util.VulkanUtils;
import org.sheepy.vulkan.window.IWindowListener;
import org.sheepy.vulkan.window.Surface;
import org.sheepy.vulkan.window.Window;

public abstract class VulkanApplication
{
	public static final boolean DEBUG;
	static {
		String debug = System.getProperty("debug");

		if (debug == null || "false".equals(debug.toLowerCase()))
		{
			DEBUG = false;
		}
		else
		{
			DEBUG = true;
		}
	}

	private static final ByteBuffer[] LAYERS_TO_ENABLE = {
			memUTF8("VK_LAYER_LUNARG_standard_validation")
	};

	private static final String[] REQUIRED_EXTENSIONS = {
			VK_KHR_SWAPCHAIN_EXTENSION_NAME
	};

	protected VkInstance vkInstance;
	protected PhysicalDeviceWrapper physicalDevice;
	protected LogicalDevice logicalDevice = null;

	private long debugCallbackHandle = -1;
	private PointerBuffer ppEnabledLayerNames;

	public List<AbstractProcessPool<?>> pipelinePools = new ArrayList<>();

	private String windowTitle;
	private int width;
	private int height;
	protected Window window;

	public VulkanApplication(String windowTitle, int width, int height)
	{
		this.windowTitle = windowTitle;
		this.width = width;
		this.height = height;
	}

	public void run()
	{
		loadPipelinePool();
		mainLoop();
		cleanup();
	}

	private void loadPipelinePool()
	{
		try (MemoryStack stack = stackPush())
		{
			for (AbstractProcessPool<?> pipelinePool : pipelinePools)
			{
				if (pipelinePool instanceof SurfaceProcessPool)
				{
					((SurfaceProcessPool<?>) pipelinePool).configure(window.getSurface());
				}
				pipelinePool.allocateNode(stack);
			}
		}
	}

	public LogicalDevice initLogicalDevice()
	{
		return initLogicalDevice(false);
	}

	public LogicalDevice initLogicalDevice(boolean needComputeCapability)
	{
		try (MemoryStack stack = stackPush())
		{
			window = new Window(windowTitle, width, height);
			createInstance(stack);
			window.open(vkInstance);
			pickPhysicalDevice(stack);
			createLogicalDevice(stack);

			window.addListener(new IWindowListener()
			{
				@Override
				public void onWindowResize(Surface surface)
				{
					VulkanApplication.this.width = surface.width;
					VulkanApplication.this.height = surface.height;

					logicalDevice.createQueues(surface);
					resizePipelinePools(surface);
				}
			});
		}

		return logicalDevice;
	}

	public void stop()
	{
		cleanup();
	}

	public void mainLoop()
	{
		while (window.shouldClose() == false)
		{
			window.pollEvents();
			updateAppState();
			drawFrame();
		}

		logicalDevice.waitIdle();
	}

	private void resizePipelinePools(Surface surface)
	{
		try (MemoryStack stack = MemoryStack.stackPush())
		{
			for (AbstractProcessPool<?> pipelinePool : pipelinePools)
			{
				if (pipelinePool instanceof SurfaceProcessPool)
				{
					((SurfaceProcessPool<?>) pipelinePool).resize(stack, surface);
				}
			}
		}
	}

	protected void updateAppState()
	{}

	private void createInstance(MemoryStack stack)
	{
		VkApplicationInfo appInfo = VkApplicationInfo.calloc();
		appInfo.sType(VK_STRUCTURE_TYPE_APPLICATION_INFO);
		appInfo.pApplicationName(stack.UTF8(windowTitle));
		appInfo.applicationVersion(VK_MAKE_VERSION(1, 0, 0));
		appInfo.pEngineName(stack.UTF8("No Engine"));
		appInfo.engineVersion(VK_MAKE_VERSION(1, 0, 0));
		appInfo.apiVersion(VK_MAKE_VERSION(1, 0, 0));
		VkInstanceCreateInfo createInfo = VkInstanceCreateInfo.calloc();
		createInfo.sType(VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
		createInfo.pApplicationInfo(appInfo);
		createInfo.ppEnabledExtensionNames(VulkanUtils.getRequiredExtensions(stack, window, DEBUG));
		if (DEBUG)
		{
			VulkanUtils.printAvailableExtensions(stack);
			VulkanUtils.printAvailableLayers(stack);
			ppEnabledLayerNames = stack.mallocPointer(LAYERS_TO_ENABLE.length);
			for (int i = 0; i < LAYERS_TO_ENABLE.length; i++)
				ppEnabledLayerNames.put(LAYERS_TO_ENABLE[i]);
			ppEnabledLayerNames.flip();
			createInfo.ppEnabledLayerNames(ppEnabledLayerNames);
		}

		PointerBuffer pInstance = stack.mallocPointer(1);
		int err = vkCreateInstance(createInfo, null, pInstance);
		long instance = pInstance.get(0);
		if (err != VK_SUCCESS)
		{
			throw new AssertionError(
					"Failed to create VkInstance: " + VulkanUtils.translateVulkanResult(err));
		}

		vkInstance = new VkInstance(instance, createInfo);
		createInfo.free();
		appInfo.free();
		if (DEBUG)
		{
			debugCallbackHandle = VulkanUtils.setupDebugCallback(stack, vkInstance);
		}
	}

	private void pickPhysicalDevice(MemoryStack stack)
	{
		PhysicalDeviceSelector pds = new PhysicalDeviceSelector(vkInstance, REQUIRED_EXTENSIONS,
				window.getSurface());
		physicalDevice = pds.getBestPhysicalDevice();
		System.out.println("\nGraphic Device : " + physicalDevice.getName());
		
		if(DEBUG)
			physicalDevice.printDeviceProperties();
	}

	private void createLogicalDevice(MemoryStack stack)
	{
		logicalDevice = LogicalDevice.alloc(stack, physicalDevice, window, REQUIRED_EXTENSIONS,
				ppEnabledLayerNames, true);
	}

	public void cleanup()
	{
		for (AbstractProcessPool<?> pipelinePool : pipelinePools)
		{
			pipelinePool.freeNode();
		}

		logicalDevice.free();

		if (DEBUG)
		{
			vkDestroyDebugReportCallbackEXT(vkInstance, debugCallbackHandle, null);
		}
		vkDestroyInstance(vkInstance, null);
		window.close();
	}

	public LogicalDevice getLogicalDevice()
	{
		return logicalDevice;
	}

	public Window getWindow()
	{
		return window;
	}

	public void attachPipelinePool(AbstractProcessPool<?> pipelinePool)
	{
		pipelinePools.add(pipelinePool);
	}

	public int getWidth()
	{
		return width;
	}

	public int getHeight()
	{
		return height;
	}

	public abstract void drawFrame();
}
