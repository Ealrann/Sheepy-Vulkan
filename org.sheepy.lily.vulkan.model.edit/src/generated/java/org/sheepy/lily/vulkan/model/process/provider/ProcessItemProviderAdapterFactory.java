/**
 */
package org.sheepy.lily.vulkan.model.process.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.sheepy.lily.core.model.cadence.CadencePackage;
import org.sheepy.lily.core.model.cadence.CadenceTaskPkg;
import org.sheepy.lily.core.model.cadence.util.CadenceSwitch;
import org.sheepy.lily.vulkan.model.binding.provider.LilyVulkanEditPlugin;
import org.sheepy.lily.vulkan.model.process.AbstractProcess;
import org.sheepy.lily.vulkan.model.process.CompositeTask;
import org.sheepy.lily.vulkan.model.process.IPipeline;
import org.sheepy.lily.vulkan.model.process.ProcessFactory;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.ProcessPartPkg;
import org.sheepy.lily.vulkan.model.process.TaskPkg;
import org.sheepy.lily.vulkan.model.process.util.ProcessAdapterFactory;
import org.sheepy.lily.vulkan.model.process.util.ProcessSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcessItemProviderAdapterFactory extends ProcessAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(LilyVulkanEditPlugin.INSTANCE, ProcessPackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.ProcessPartPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessPartPkgItemProvider processPartPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.ProcessPartPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessPartPkgAdapter()
	{
		if (processPartPkgItemProvider == null)
		{
			processPartPkgItemProvider = new ProcessPartPkgItemProvider(this);
		}

		return processPartPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.TaskPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskPkgItemProvider taskPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.TaskPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskPkgAdapter()
	{
		if (taskPkgItemProvider == null)
		{
			taskPkgItemProvider = new TaskPkgItemProvider(this);
		}

		return taskPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.Pipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineItemProvider pipelineItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.Pipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineAdapter()
	{
		if (pipelineItemProvider == null)
		{
			pipelineItemProvider = new PipelineItemProvider(this);
		}

		return pipelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.PipelineBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PipelineBarrierItemProvider pipelineBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.PipelineBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPipelineBarrierAdapter()
	{
		if (pipelineBarrierItemProvider == null)
		{
			pipelineBarrierItemProvider = new PipelineBarrierItemProvider(this);
		}

		return pipelineBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.CompositeTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeTaskItemProvider compositeTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.CompositeTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeTaskAdapter()
	{
		if (compositeTaskItemProvider == null)
		{
			compositeTaskItemProvider = new CompositeTaskItemProvider(this);
		}

		return compositeTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.BindDescriptorSets} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindDescriptorSetsItemProvider bindDescriptorSetsItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.BindDescriptorSets}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBindDescriptorSetsAdapter()
	{
		if (bindDescriptorSetsItemProvider == null)
		{
			bindDescriptorSetsItemProvider = new BindDescriptorSetsItemProvider(this);
		}

		return bindDescriptorSetsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.PushConstantBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PushConstantBufferItemProvider pushConstantBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.PushConstantBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPushConstantBufferAdapter()
	{
		if (pushConstantBufferItemProvider == null)
		{
			pushConstantBufferItemProvider = new PushConstantBufferItemProvider(this);
		}

		return pushConstantBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.FlushTransferBufferTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlushTransferBufferTaskItemProvider flushTransferBufferTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.FlushTransferBufferTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFlushTransferBufferTaskAdapter()
	{
		if (flushTransferBufferTaskItemProvider == null)
		{
			flushTransferBufferTaskItemProvider = new FlushTransferBufferTaskItemProvider(this);
		}

		return flushTransferBufferTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.CopyBufferTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyBufferTaskItemProvider copyBufferTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.CopyBufferTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCopyBufferTaskAdapter()
	{
		if (copyBufferTaskItemProvider == null)
		{
			copyBufferTaskItemProvider = new CopyBufferTaskItemProvider(this);
		}

		return copyBufferTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.ProcessExtensionPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessExtensionPkgItemProvider processExtensionPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.ProcessExtensionPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProcessExtensionPkgAdapter()
	{
		if (processExtensionPkgItemProvider == null)
		{
			processExtensionPkgItemProvider = new ProcessExtensionPkgItemProvider(this);
		}

		return processExtensionPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.PrepareCompositeTransfer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrepareCompositeTransferItemProvider prepareCompositeTransferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.PrepareCompositeTransfer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPrepareCompositeTransferAdapter()
	{
		if (prepareCompositeTransferItemProvider == null)
		{
			prepareCompositeTransferItemProvider = new PrepareCompositeTransferItemProvider(this);
		}

		return prepareCompositeTransferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.SwapBindingsTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwapBindingsTaskItemProvider swapBindingsTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.SwapBindingsTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSwapBindingsTaskAdapter()
	{
		if (swapBindingsTaskItemProvider == null)
		{
			swapBindingsTaskItemProvider = new SwapBindingsTaskItemProvider(this);
		}

		return swapBindingsTaskItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type))
		{
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter)))
			{
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders()
	{
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
	{
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null)
		{
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose()
	{
		if (processPartPkgItemProvider != null) processPartPkgItemProvider.dispose();
		if (taskPkgItemProvider != null) taskPkgItemProvider.dispose();
		if (pipelineItemProvider != null) pipelineItemProvider.dispose();
		if (pipelineBarrierItemProvider != null) pipelineBarrierItemProvider.dispose();
		if (compositeTaskItemProvider != null) compositeTaskItemProvider.dispose();
		if (bindDescriptorSetsItemProvider != null) bindDescriptorSetsItemProvider.dispose();
		if (pushConstantBufferItemProvider != null) pushConstantBufferItemProvider.dispose();
		if (flushTransferBufferTaskItemProvider != null) flushTransferBufferTaskItemProvider.dispose();
		if (copyBufferTaskItemProvider != null) copyBufferTaskItemProvider.dispose();
		if (processExtensionPkgItemProvider != null) processExtensionPkgItemProvider.dispose();
		if (prepareCompositeTransferItemProvider != null) prepareCompositeTransferItemProvider.dispose();
		if (swapBindingsTaskItemProvider != null) swapBindingsTaskItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link CadencePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class CadenceChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends CadenceSwitch<Object>
		{
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
			{
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseCadenceTaskPkg(CadenceTaskPkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(CadencePackage.Literals.CADENCE_TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createSwapBindingsTask()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child)
			{
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
		{
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public ResourceLocator getResourceLocator()
		{
			return LilyVulkanEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ProcessPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ProcessChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ProcessSwitch<Object>
		{
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
			{
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAbstractProcess(AbstractProcess object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.ABSTRACT_PROCESS__PART_PKG,
						 ProcessFactory.eINSTANCE.createProcessPartPkg()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.ABSTRACT_PROCESS__EXTENSION_PKG,
						 ProcessFactory.eINSTANCE.createProcessExtensionPkg()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseProcessPartPkg(ProcessPartPkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.PROCESS_PART_PKG__PARTS,
						 ProcessFactory.eINSTANCE.createPipeline()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseIPipeline(IPipeline object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.IPIPELINE__TASK_PKG,
						 ProcessFactory.eINSTANCE.createTaskPkg()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseTaskPkg(TaskPkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createPipelineBarrier()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createCompositeTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createBindDescriptorSets()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createPushConstantBuffer()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createFlushTransferBufferTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createCopyBufferTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 ProcessFactory.eINSTANCE.createPrepareCompositeTransfer()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseCompositeTask(CompositeTask object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createPipelineBarrier()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createCompositeTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createBindDescriptorSets()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createPushConstantBuffer()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createFlushTransferBufferTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createCopyBufferTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 ProcessFactory.eINSTANCE.createPrepareCompositeTransfer()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child)
			{
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
		{
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public ResourceLocator getResourceLocator()
		{
			return LilyVulkanEditPlugin.INSTANCE;
		}
	}

}
