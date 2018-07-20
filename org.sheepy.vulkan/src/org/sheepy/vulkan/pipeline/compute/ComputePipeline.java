package org.sheepy.vulkan.pipeline.compute;

import static org.lwjgl.vulkan.VK10.*;

import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.lwjgl.system.MemoryStack;
import org.lwjgl.vulkan.VkComputePipelineCreateInfo;
import org.lwjgl.vulkan.VkPipelineLayoutCreateInfo;
import org.lwjgl.vulkan.VkPipelineShaderStageCreateInfo;
import org.sheepy.vulkan.common.AllocationNode;
import org.sheepy.vulkan.common.IAllocable;
import org.sheepy.vulkan.common.IAllocationObject;
import org.sheepy.vulkan.descriptor.DescriptorPool;
import org.sheepy.vulkan.descriptor.DescriptorSet;
import org.sheepy.vulkan.descriptor.IDescriptor;
import org.sheepy.vulkan.descriptor.IDescriptorSetConfiguration;
import org.sheepy.vulkan.device.LogicalDevice;
import org.sheepy.vulkan.shader.Shader;

public class ComputePipeline extends AllocationNode
		implements IDescriptorSetConfiguration, IAllocable, IComputeProcessUnit
{
	private static final float DEFAULT_WORKGROUP_SIZE = 32;

	protected LogicalDevice logicalDevice;
	protected DescriptorPool descriptorPool;

	protected List<IDescriptor> descriptors;
	protected List<IComputePipelineUnit> units;
	protected List<Shader> shaders = new ArrayList<>();
	protected List<IComputePipelineExecutableUnit> executables = new ArrayList<>();

	protected float workgroupSize = DEFAULT_WORKGROUP_SIZE;

	int dataWidth = -1;
	int dataHeight = -1;
	int dataDepth = -1;

	private boolean enabled = true;
	protected boolean dirty = false;

	protected long pipelineLayout;

	public ComputePipeline(LogicalDevice logicalDevice, DescriptorPool descriptorPool, int width,
			int height, int depth, List<IDescriptor> descriptors, String shaderLocation)
	{
		this(logicalDevice, descriptorPool, width, height, depth, descriptors,
				Collections.singletonList(
						new Shader(logicalDevice, shaderLocation, VK_SHADER_STAGE_COMPUTE_BIT)));
	}

	public ComputePipeline(LogicalDevice logicalDevice, DescriptorPool descriptorPool, int width,
			int height, int depth, List<IDescriptor> descriptors, Shader shader)
	{
		this(logicalDevice, descriptorPool, width, height, depth, descriptors,
				Collections.singletonList(shader));
	}

	public ComputePipeline(LogicalDevice logicalDevice, DescriptorPool descriptorPool, int width,
			int height, int depth, List<IDescriptor> descriptors)
	{
		this(logicalDevice, descriptorPool, width, height, depth, descriptors,
				Collections.emptyList());
	}

	public ComputePipeline(LogicalDevice logicalDevice, DescriptorPool descriptorPool, int width,
			int height, int depth, List<IDescriptor> descriptors, List<Shader> shaders)
	{
		this.logicalDevice = logicalDevice;
		this.descriptorPool = descriptorPool;
		this.units = new ArrayList<>(shaders);

		this.dataWidth = width;
		this.dataHeight = height;
		this.dataDepth = depth;

		this.units = new ArrayList<>(shaders);
		this.shaders.addAll(shaders);
		this.descriptors = new ArrayList<>(descriptors);
	}

	public void addShader(Shader shader)
	{
		units.add(shader);
		shaders.add(shader);
	}

	public void addShader(String shaderLocation)
	{
		Shader shader = new Shader(logicalDevice, shaderLocation, VK_SHADER_STAGE_COMPUTE_BIT);
		units.add(shader);
		shaders.add(shader);
	}

	public void addPipelineBarrier(PipelineBarrier barrier)
	{
		units.add(barrier);
	}

	@Override
	public void allocate(MemoryStack stack)
	{
		DescriptorSet descriptorSet = descriptorPool.getDescriptorSet(this);
		LongBuffer bDescriptorSet = stack.mallocLong(1);
		bDescriptorSet.put(descriptorSet.getLayoutId());
		bDescriptorSet.flip();

		// Create compute pipeline
		long[] aLayout = new long[1];
		VkPipelineLayoutCreateInfo pipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo
				.callocStack(stack);
		pipelineLayoutCreateInfo.sType(VK_STRUCTURE_TYPE_PIPELINE_LAYOUT_CREATE_INFO);
		pipelineLayoutCreateInfo.pSetLayouts(bDescriptorSet);
		if (vkCreatePipelineLayout(logicalDevice.getVkDevice(), pipelineLayoutCreateInfo, null,
				aLayout) != VK_SUCCESS)
		{
			throw new AssertionError("Failed to create compute pipeline layout!");
		}
		pipelineLayout = aLayout[0];

		int countShader = 0;

		for (IComputePipelineUnit unit : units)
		{
			if (unit instanceof Shader)
			{
				countShader++;
			}
		}

		VkComputePipelineCreateInfo.Buffer pipelineCreateInfos = VkComputePipelineCreateInfo
				.callocStack(countShader, stack);

		for (IComputePipelineUnit unit : units)
		{
			if (unit instanceof Shader)
			{
				VkPipelineShaderStageCreateInfo shaderInfo = ((Shader) unit).allocInfo();

				VkComputePipelineCreateInfo pipelineCreateInfo = pipelineCreateInfos.get();
				pipelineCreateInfo.sType(VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO);
				pipelineCreateInfo.stage(shaderInfo);
				pipelineCreateInfo.layout(pipelineLayout);
				shaderInfo.free();
			}
		}
		pipelineCreateInfos.flip();

		long[] pipelines = new long[countShader];
		if (vkCreateComputePipelines(logicalDevice.getVkDevice(), VK_NULL_HANDLE,
				pipelineCreateInfos, null, pipelines) != VK_SUCCESS)
		{
			throw new AssertionError("Failed to create compute pipeline!");
		}

		int indexPipeline = 0;
		for (IComputePipelineUnit unit : units)
		{
			if (unit instanceof Shader)
			{
				executables.add(new ComputePipelineId(pipelines[indexPipeline++]));
			}
			else if (unit instanceof PipelineBarrier)
			{
				executables.add((PipelineBarrier) unit);
			}
		}
	}

	public List<IComputePipelineExecutableUnit> getExecutablesUnit()
	{
		return executables;
	}

	@Override
	public void free()
	{
		for (IComputePipelineExecutableUnit executable : executables)
		{
			if (executable instanceof ComputePipelineId)
			{
				vkDestroyPipeline(logicalDevice.getVkDevice(), ((ComputePipelineId) executable).id,
						null);
			}
		}
		vkDestroyPipelineLayout(logicalDevice.getVkDevice(), pipelineLayout, null);
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
		return dataDepth;
	}

	@Override
	public List<IDescriptor> getDescriptors()
	{
		return descriptors;
	}

	public long getPipelineLayout()
	{
		return pipelineLayout;
	}

	@Override
	protected Collection<? extends IAllocationObject> getSubAllocables()
	{
		return shaders;
	}

	public void setWorkgroupSize(float workgroupSize)
	{
		this.workgroupSize = workgroupSize;
	}

	public float getWorkgroupSize()
	{
		return workgroupSize;
	}

	public void setEnabled(boolean enabled)
	{
		if (this.enabled != enabled)
		{
			this.enabled = enabled;
			dirty = true;
		}
	}
	
	public boolean isDirty()
	{
		return dirty;
	}

	public void setDirty(boolean dirty)
	{
		this.dirty = dirty;
	}

	public boolean isEnabled()
	{
		return enabled;
	}

	public interface IComputePipelineExecutableUnit
	{}

	public class ComputePipelineId implements IComputePipelineExecutableUnit
	{
		public final long id;

		ComputePipelineId(long id)
		{
			this.id = id;
		}
	}
}