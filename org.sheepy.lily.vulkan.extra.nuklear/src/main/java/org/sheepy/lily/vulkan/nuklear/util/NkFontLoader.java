package org.sheepy.lily.vulkan.nuklear.util;

import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.stb.STBTruetype.*;
import static org.lwjgl.system.MemoryUtil.memAddress;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Map;

import org.lwjgl.nuklear.NkTextWidthCallback;
import org.lwjgl.nuklear.NkUserFont;
import org.lwjgl.nuklear.NkUserFontGlyph;
import org.lwjgl.stb.STBTTAlignedQuad;
import org.lwjgl.stb.STBTTFontinfo;
import org.lwjgl.stb.STBTTPackedchar;
import org.lwjgl.system.MemoryUtil;
import org.sheepy.lily.vulkan.api.resource.IFontImageAdapter;
import org.sheepy.lily.vulkan.model.resource.FontImage;

public class NkFontLoader
{
	private IntBuffer unicode;
	private IntBuffer advanceQuery;
	private IntBuffer advanceWidth;
	private long unicodeAddress;

	private FloatBuffer X;
	private FloatBuffer Y;

	private STBTTAlignedQuad quad;

	private final FontImage font;
	private int fontHeight;
	private float descent;
	private float scale;
	private int width;
	private int height;

	private final Map<Integer, QueryData> queryDatas = new HashMap<>();
	private STBTTPackedchar.Buffer cdata;
	private IFontImageAdapter adapter;
	private STBTTFontinfo fontInfo;

	public NkFontLoader(FontImage font)
	{
		this.font = font;
	}

	public void allocate()
	{
		unicode = MemoryUtil.memAllocInt(1);
		advanceQuery = MemoryUtil.memAllocInt(1);
		advanceWidth = MemoryUtil.memAllocInt(1);
		unicodeAddress = memAddress(unicode);

		X = MemoryUtil.memAllocFloat(1).put(0.0f).flip();
		Y = MemoryUtil.memAllocFloat(1).put(0.0f).flip();

		quad = STBTTAlignedQuad.calloc();
	}

	public void free()
	{
		MemoryUtil.memFree(unicode);
		MemoryUtil.memFree(advanceQuery);
		MemoryUtil.memFree(advanceWidth);
		MemoryUtil.memFree(X);
		MemoryUtil.memFree(Y);
		quad.free();
	}

	public NkUserFont createNkFont(long id)
	{
		adapter = font.adaptNotNull(IFontImageAdapter.class);
		width = adapter.getBufferWidth();
		height = adapter.getBufferHeight();

		fontHeight = font.getHeight();
		descent = adapter.getDescent();
		scale = adapter.getScale();

		fontInfo = adapter.getFontInfo();
		cdata = adapter.getCdata();

		final NkUserFont default_font = NkUserFont.create();
		default_font.width(new TextWidthCallback(fontInfo, scale));
		default_font.height(fontHeight);
		default_font.query((handle, font_height, glyph, codepoint, next_codepoint) ->
		{

			QueryData queryData = queryDatas.get(codepoint);
			if (queryData == null)
			{
				queryData = createQueryData(codepoint);
				queryDatas.put(codepoint, queryData);
			}

			final NkUserFontGlyph ufg = NkUserFontGlyph.create(glyph);
			queryData.fill(ufg);
		});
		default_font.texture(it -> it.ptr(id));

		return default_font;
	}

	private QueryData createQueryData(int codepoint)
	{
		X.put(0f).flip();
		Y.put(0f).flip();

		stbtt_GetPackedQuad(cdata, width, height, codepoint - 32, X, Y, quad, false);
		stbtt_GetCodepointHMetrics(fontInfo, codepoint, advanceQuery, null);

		return new QueryData(quad, advanceQuery.get(0));
	}

	private final class QueryData
	{
		private final NkUserFontGlyph patternGlyph = NkUserFontGlyph.create();

		QueryData(STBTTAlignedQuad quad, int advance)
		{
			final float width = quad.x1() - quad.x0();
			final float height = quad.y1() - quad.y0();
			final float offsetX = quad.x0();
			final float offsetY = quad.y0() + (fontHeight + descent);
			final float xAdvance = advance * scale;
			final float uvx0 = quad.s0();
			final float uvy0 = quad.t0();
			final float uvx1 = quad.s1();
			final float uvy1 = quad.t1();

			patternGlyph.width(width);
			patternGlyph.height(height);
			patternGlyph.offset().set(offsetX, offsetY);
			patternGlyph.xadvance(xAdvance);
			patternGlyph.uv(0).set(uvx0, uvy0);
			patternGlyph.uv(1).set(uvx1, uvy1);
		}

		public void fill(NkUserFontGlyph ufg)
		{
			ufg.set(patternGlyph);
		}
	}

	private final class TextWidthCallback extends NkTextWidthCallback
	{
		private final STBTTFontinfo fontInfo;
		private final float scale;

		public TextWidthCallback(STBTTFontinfo fontInfo, float scale)
		{
			this.fontInfo = fontInfo;
			this.scale = scale;
		}

		@Override
		public float invoke(long handle, float height, long text, int length)
		{
			if (length == 0)
			{
				return 0;
			}

			float textWidth = 0;
			int position = 0;

			while (position < length)
			{
				final int currentGlyphLength = nnk_utf_decode(text + position, unicodeAddress, 1);
				final int unicodeCodepoint = unicode.get(0);

				if (unicodeCodepoint == NK_UTF_INVALID || currentGlyphLength == 0)
				{
					break;
				}

				stbtt_GetCodepointHMetrics(fontInfo, unicodeCodepoint, advanceWidth, null);
				textWidth += advanceWidth.get(0) * scale;
				position += currentGlyphLength;
			}

			return textWidth;
		}
	}
}
