package org.sheepy.lily.vulkan.nuklear.ui;

import static org.lwjgl.nuklear.Nuklear.*;

import java.nio.ByteBuffer;

import org.lwjgl.system.MemoryUtil;
import org.sheepy.lily.core.api.adapter.INotificationListener;
import org.sheepy.lily.core.api.adapter.annotation.Adapter;
import org.sheepy.lily.core.api.adapter.annotation.Dispose;
import org.sheepy.lily.core.api.adapter.annotation.Statefull;
import org.sheepy.lily.core.api.variable.IVariableResolverAdapter;
import org.sheepy.lily.core.model.presentation.IUIElement;
import org.sheepy.lily.core.model.ui.VariableLabel;
import org.sheepy.lily.core.model.variable.IVariableResolver;
import org.sheepy.lily.vulkan.nuklear.ui.IPanelAdapter.UIContext;

@Statefull
@Adapter(scope = VariableLabel.class)
public class VariableLabelAdapter implements IUIElementAdapter
{
	private final INotificationListener listener = n -> updateText(String.valueOf(n.getNewValue()));
	private final VariableLabel label;
	private final IVariableResolverAdapter<IVariableResolver> resolver;

	private String text = "";
	private ByteBuffer textBuffer = null;

	private boolean dirty = false;

	@SuppressWarnings("unchecked")
	public VariableLabelAdapter(VariableLabel label)
	{
		this.label = label;
		final var variableResolver = label.getVariableResolver();
		resolver = variableResolver.adaptNotNull(IVariableResolverAdapter.class);

		updateText(String.valueOf(resolver.getValue(variableResolver)));

		resolver.addListener(listener);
	}

	@Dispose
	public void unsetTarget()
	{
		resolver.removeListener(listener);
		MemoryUtil.memFree(textBuffer);
	}

	@Override
	public boolean layout(UIContext context, IUIElement control)
	{
		final boolean res = dirty;
		final VariableLabel label = (VariableLabel) control;

		int align = 0;
		switch (label.getHorizontalRelative())
		{
		case MIDDLE:
			align = NK_TEXT_CENTERED;
			break;
		case RIGHT:
			align = NK_TEXT_RIGHT;
			break;
		default:
			align = NK_TEXT_LEFT;
			break;
		}

		nk_label(context.nkContext, textBuffer, align);

		dirty = false;
		return res;
	}

	private void updateText(String value)
	{
		final String labelText = label.getText();
		String resultString = "";

		if (label.isShowName() == false) resultString = String.format("%s", value);
		else if (labelText.isBlank()) resultString = String.format("%s%s", labelText, value);
		else resultString = String.format("%s: %s", labelText, value);

		if (resultString.equals(text) == false)
		{
			MemoryUtil.memFree(textBuffer);
			text = resultString;
			textBuffer = MemoryUtil.memASCII(text);
		}

		dirty = true;
	}
}
