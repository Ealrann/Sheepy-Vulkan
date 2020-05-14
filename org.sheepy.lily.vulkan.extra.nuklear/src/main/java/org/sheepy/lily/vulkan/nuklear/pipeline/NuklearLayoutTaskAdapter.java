package org.sheepy.lily.vulkan.nuklear.pipeline;

import org.joml.Vector2ic;
import org.lwjgl.system.MemoryStack;
import org.sheepy.lily.core.api.adapter.IAllocableAdapter;
import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.core.api.notification.observatory.IObservatoryBuilder;
import org.sheepy.lily.core.api.util.ModelUtil;
import org.sheepy.lily.core.model.ui.IPanel;
import org.sheepy.lily.core.model.ui.UI;
import org.sheepy.lily.core.model.ui.UiPackage;
import org.sheepy.lily.game.api.window.IWindow;
import org.sheepy.lily.vulkan.api.graphic.IPhysicalSurfaceAllocation;
import org.sheepy.lily.vulkan.api.pipeline.IPipelineTaskAllocation;
import org.sheepy.lily.vulkan.api.process.IProcessContext;
import org.sheepy.lily.vulkan.extra.model.nuklear.NuklearLayoutTask;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess;
import org.sheepy.lily.vulkan.model.process.graphic.Subpass;
import org.sheepy.lily.vulkan.nuklear.pipeline.layout.LayoutManager;
import org.sheepy.lily.vulkan.nuklear.resource.NuklearContextAllocation;
import org.sheepy.lily.vulkan.nuklear.resource.NuklearFontAdapter;
import org.sheepy.lily.vulkan.nuklear.resource.NuklearFontAllocation;
import org.sheepy.lily.vulkan.nuklear.ui.IPanelAdapter;
import org.sheepy.lily.vulkan.nuklear.ui.IPanelAdapter.UIContext;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@ModelExtender(scope = NuklearLayoutTask.class)
@Adapter(lazy = false)
public final class NuklearLayoutTaskAdapter implements IPipelineTaskAllocation<NuklearLayoutTask>,
													   IAllocableAdapter<IProcessContext>
{
	private final NuklearLayoutTask task;
	private final Consumer<Vector2ic> resizeListener = this::onResize;
	private final LayoutManager layoutManager;
	private final List<IPanelAdapter> panelAdapters = new ArrayList<>();

	private IProcessContext context;
	private ELayoutRequest layoutRequested = ELayoutRequest.None;
	private IWindow window;

	enum ELayoutRequest
	{
		None,
		Force,
		IfNecessary
	}

	public NuklearLayoutTaskAdapter(NuklearLayoutTask task, IObservatoryBuilder observatory)
	{
		this.task = task;
		final var subpass = ModelUtil.findParent(task, Subpass.class);
		final var ui = (UI) subpass.getCompositor();
		layoutManager = new LayoutManager();

		observatory.focus(ui)
				   .explore(UiPackage.Literals.UI__CURRENT_UI_PAGE)
				   .explore(UiPackage.Literals.UI_PAGE__PANELS)
				   .adapt(IPanelAdapter.class)
				   .gather(this::addPanelAdapter, this::removePanelAdapter);
	}

	private void addPanelAdapter(IPanelAdapter adapter)
	{
		panelAdapters.add(adapter);
		layoutRequested = ELayoutRequest.Force;
	}

	private void removePanelAdapter(IPanelAdapter adapter)
	{
		layoutRequested = ELayoutRequest.Force;
		panelAdapters.remove(adapter);
	}

	private void onResize(Vector2ic size)
	{
		layoutRequested = ELayoutRequest.Force;
	}

	@Override
	public void allocate(IProcessContext context)
	{
		this.context = context;
		window = context.getWindow();
		window.listen(resizeListener, IWindow.Features.Size);
		requestLayout(true);
	}

	@Override
	public void free(IProcessContext context)
	{
		window.sulk(resizeListener, IWindow.Features.Size);
		this.context = null;
	}

	public void requestLayout(boolean full)
	{
		if (layoutRequested != ELayoutRequest.Force)
		{
			layoutRequested = (full ? ELayoutRequest.Force : ELayoutRequest.IfNecessary);
		}
	}

	@Override
	public void update(NuklearLayoutTask task, int index)
	{
		if (isLayoutNecessary())
		{
			layout();
			layoutRequested = ELayoutRequest.None;
		}
	}

	private void layout()
	{
		final var nuklearContextAdapter = task.getContext().allocationHandle(NuklearContextAllocation.class).get();
		final var nkContext = nuklearContextAdapter.getNkContext();
		final var font = task.getContext().getFont();
		final var fontAdapter = font.adapt(NuklearFontAdapter.class);
		final var fontAllocation = font.allocationHandle(NuklearFontAllocation.class).get();
		final var defaultFont = fontAdapter.defaultFont;
		final var fontMap = fontAllocation.fontMap;
		final var surface = ((GraphicProcess) context.getProcess()).getConfiguration().getSurface();
		final var surfaceAllocation = surface.allocationHandle(IPhysicalSurfaceAllocation.class).get();
		final var extent = surfaceAllocation.getExtent();

		try (final var stack = MemoryStack.stackPush())
		{
			final var uiContext = new UIContext(window, nkContext, fontMap, defaultFont, stack);
			layoutManager.layout(panelAdapters, uiContext, extent);
		}
	}

	private boolean isLayoutNecessary()
	{
		return switch (layoutRequested)
				{
					case Force -> true;
					case IfNecessary -> doesPanelNeedLayout();
					case None -> false;
				};
	}

	public boolean doesPanelNeedLayout()
	{
		for (int i = 0; i < panelAdapters.size(); i++)
		{
			final var panelAdapter = panelAdapters.get(i);
			if (panelAdapter.needLayout())
			{
				return true;
			}
		}
		return false;
	}

	public IPanel getHoveredPanel()
	{
		for (int i = 0; i < panelAdapters.size(); i++)
		{
			final var panelAdapter = panelAdapters.get(i);
			if (panelAdapter.isHovered())
			{
				return panelAdapter.getPanel();
			}
		}
		return null;
	}

	@Override
	public void record(NuklearLayoutTask task, IRecordContext context)
	{
		layoutManager.setDirty(false);
	}

	@Override
	public boolean needRecord(NuklearLayoutTask task, int index)
	{
		return layoutManager.isDirty();
	}

	public boolean isDirty()
	{
		return layoutManager.isDirty();
	}

	public boolean isFrameStarted()
	{
		return layoutManager.hasStartedFrame();
	}

	public void clearFrame()
	{
		final var nuklearContextAdapter = task.getContext().allocationHandle(NuklearContextAllocation.class).get();
		assert layoutManager.hasStartedFrame();
		nuklearContextAdapter.clearFrame();
		layoutManager.setStartedFrame(false);
	}

	public Vector2ic getExtent()
	{
		return layoutManager.getCurrentExtent();
	}
}

