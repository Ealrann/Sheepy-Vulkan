package org.sheepy.lily.vulkan.process.pipeline;

import org.sheepy.lily.core.api.allocation.annotation.Allocation;
import org.sheepy.lily.core.api.allocation.annotation.AllocationChild;
import org.sheepy.lily.core.api.extender.IExtender;
import org.sheepy.lily.core.api.extender.ModelExtender;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.TaskPkg;

@ModelExtender(scope = TaskPkg.class)
@Allocation
@AllocationChild(features = ProcessPackage.TASK_PKG__TASKS)
public final class TaskPkgAllocation implements IExtender
{
}
