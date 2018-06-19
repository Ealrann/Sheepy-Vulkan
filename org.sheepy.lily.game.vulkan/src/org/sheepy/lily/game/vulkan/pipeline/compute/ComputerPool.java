package org.sheepy.lily.game.vulkan.pipeline.compute;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.sheepy.lily.game.vulkan.descriptor.IDescriptorSetConfiguration;

public class ComputerPool implements IDescriptorSetConfiguration<IComputer>
{
	private static final int NO_VALUE = -1;

	private List<IComputer> computers;

	private int dataWidth = NO_VALUE;
	private int dataHeight = NO_VALUE;
	private int dataDepth = NO_VALUE;

	public ComputerPool(List<IComputer> computers)
	{
		for (IComputer computer : computers)
		{
			if (dataWidth == NO_VALUE)
			{
				dataWidth = computer.getDataWidth();
				dataHeight = computer.getDataHeight();
				dataDepth = computer.getDataDepth();
			}
			else
			{
				if (dataWidth != computer.getDataWidth()
						|| dataHeight != computer.getDataHeight()
						|| dataDepth != computer.getDataDepth())
				{
					throw new AssertionError(
							"All computers in a ComputerPool should have the same dataSize");
				}
			}
		}

		this.computers = Collections.unmodifiableList(computers);
	}

	@Override
	public Iterator<IComputer> iterator()
	{
		return computers.iterator();
	}

	@Override
	public int size()
	{
		return computers.size();
	}

	public int getDataWidth()
	{
		return dataWidth;
	}

	public int getDataHeight()
	{
		return dataHeight;
	}

	public int getDataDepth()
	{
		return dataHeight;
	}
}
