/**
 */
package org.sheepy.lily.vulkan.extra.model.rendering.provider;

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

import org.sheepy.lily.core.model.resource.ResourcePackage;
import org.sheepy.lily.core.model.resource.ResourcePkg;

import org.sheepy.lily.core.model.resource.util.ResourceSwitch;

import org.sheepy.lily.vulkan.extra.model.mesh.provider.ExtraEditPlugin;

import org.sheepy.lily.vulkan.extra.model.rendering.RenderingFactory;
import org.sheepy.lily.vulkan.extra.model.rendering.RenderingPackage;

import org.sheepy.lily.vulkan.extra.model.rendering.util.RenderingAdapterFactory;

import org.sheepy.lily.vulkan.model.process.CompositeTask;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.TaskPkg;

import org.sheepy.lily.vulkan.model.process.util.ProcessSwitch;
import org.sheepy.lily.vulkan.model.resource.BufferPart;
import org.sheepy.lily.vulkan.model.resource.VulkanResourcePackage;

import org.sheepy.lily.vulkan.model.resource.util.VulkanResourceSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RenderingItemProviderAdapterFactory extends RenderingAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(ExtraEditPlugin.INSTANCE, RenderingPackage.eNS_URI);

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
	public RenderingItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.Axis} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AxisItemProvider axisItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.Axis}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAxisAdapter()
	{
		if (axisItemProvider == null)
		{
			axisItemProvider = new AxisItemProvider(this);
		}

		return axisItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.PresentationPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentationPkgItemProvider presentationPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.PresentationPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentationPkgAdapter()
	{
		if (presentationPkgItemProvider == null)
		{
			presentationPkgItemProvider = new PresentationPkgItemProvider(this);
		}

		return presentationPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.PresentableEntity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PresentableEntityItemProvider presentableEntityItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.PresentableEntity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPresentableEntityAdapter()
	{
		if (presentableEntityItemProvider == null)
		{
			presentableEntityItemProvider = new PresentableEntityItemProvider(this);
		}

		return presentableEntityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.DataProviderPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataProviderPkgItemProvider dataProviderPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.DataProviderPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataProviderPkgAdapter()
	{
		if (dataProviderPkgItemProvider == null)
		{
			dataProviderPkgItemProvider = new DataProviderPkgItemProvider(this);
		}

		return dataProviderPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderableDataSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderableDataSourceItemProvider renderableDataSourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderableDataSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenderableDataSourceAdapter()
	{
		if (renderableDataSourceItemProvider == null)
		{
			renderableDataSourceItemProvider = new RenderableDataSourceItemProvider(this);
		}

		return renderableDataSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.VertexProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexProviderItemProvider vertexProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.VertexProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createVertexProviderAdapter()
	{
		if (vertexProviderItemProvider == null)
		{
			vertexProviderItemProvider = new VertexProviderItemProvider(this);
		}

		return vertexProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.IndexProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndexProviderItemProvider indexProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.IndexProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIndexProviderAdapter()
	{
		if (indexProviderItemProvider == null)
		{
			indexProviderItemProvider = new IndexProviderItemProvider(this);
		}

		return indexProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.DescriptorsProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorsProviderItemProvider descriptorsProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.DescriptorsProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptorsProviderAdapter()
	{
		if (descriptorsProviderItemProvider == null)
		{
			descriptorsProviderItemProvider = new DescriptorsProviderItemProvider(this);
		}

		return descriptorsProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.DataDescriptorsProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDescriptorsProviderItemProvider dataDescriptorsProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.DataDescriptorsProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataDescriptorsProviderAdapter()
	{
		if (dataDescriptorsProviderItemProvider == null)
		{
			dataDescriptorsProviderItemProvider = new DataDescriptorsProviderItemProvider(this);
		}

		return dataDescriptorsProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.DataDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataDescriptorItemProvider dataDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.DataDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataDescriptorAdapter()
	{
		if (dataDescriptorItemProvider == null)
		{
			dataDescriptorItemProvider = new DataDescriptorItemProvider(this);
		}

		return dataDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.ResourceDescriptorProviderPkg} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceDescriptorProviderPkgItemProvider resourceDescriptorProviderPkgItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.ResourceDescriptorProviderPkg}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceDescriptorProviderPkgAdapter()
	{
		if (resourceDescriptorProviderPkgItemProvider == null)
		{
			resourceDescriptorProviderPkgItemProvider = new ResourceDescriptorProviderPkgItemProvider(this);
		}

		return resourceDescriptorProviderPkgItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderProxyConstantBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderProxyConstantBufferItemProvider renderProxyConstantBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderProxyConstantBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenderProxyConstantBufferAdapter()
	{
		if (renderProxyConstantBufferItemProvider == null)
		{
			renderProxyConstantBufferItemProvider = new RenderProxyConstantBufferItemProvider(this);
		}

		return renderProxyConstantBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.ISpecialization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISpecializationItemProvider iSpecializationItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.ISpecialization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createISpecializationAdapter()
	{
		if (iSpecializationItemProvider == null)
		{
			iSpecializationItemProvider = new ISpecializationItemProvider(this);
		}

		return iSpecializationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderDrawTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderDrawTaskItemProvider renderDrawTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderDrawTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenderDrawTaskAdapter()
	{
		if (renderDrawTaskItemProvider == null)
		{
			renderDrawTaskItemProvider = new RenderDrawTaskItemProvider(this);
		}

		return renderDrawTaskItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderIndexedDrawTask} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderIndexedDrawTaskItemProvider renderIndexedDrawTaskItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.extra.model.rendering.RenderIndexedDrawTask}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenderIndexedDrawTaskAdapter()
	{
		if (renderIndexedDrawTaskItemProvider == null)
		{
			renderIndexedDrawTaskItemProvider = new RenderIndexedDrawTaskItemProvider(this);
		}

		return renderIndexedDrawTaskItemProvider;
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
		if (axisItemProvider != null) axisItemProvider.dispose();
		if (presentationPkgItemProvider != null) presentationPkgItemProvider.dispose();
		if (presentableEntityItemProvider != null) presentableEntityItemProvider.dispose();
		if (dataProviderPkgItemProvider != null) dataProviderPkgItemProvider.dispose();
		if (renderableDataSourceItemProvider != null) renderableDataSourceItemProvider.dispose();
		if (vertexProviderItemProvider != null) vertexProviderItemProvider.dispose();
		if (indexProviderItemProvider != null) indexProviderItemProvider.dispose();
		if (descriptorsProviderItemProvider != null) descriptorsProviderItemProvider.dispose();
		if (dataDescriptorsProviderItemProvider != null) dataDescriptorsProviderItemProvider.dispose();
		if (dataDescriptorItemProvider != null) dataDescriptorItemProvider.dispose();
		if (resourceDescriptorProviderPkgItemProvider != null) resourceDescriptorProviderPkgItemProvider.dispose();
		if (renderProxyConstantBufferItemProvider != null) renderProxyConstantBufferItemProvider.dispose();
		if (iSpecializationItemProvider != null) iSpecializationItemProvider.dispose();
		if (renderDrawTaskItemProvider != null) renderDrawTaskItemProvider.dispose();
		if (renderIndexedDrawTaskItemProvider != null) renderIndexedDrawTaskItemProvider.dispose();
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
			public Object caseTaskPkg(TaskPkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 RenderingFactory.eINSTANCE.createRenderDrawTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.TASK_PKG__TASKS,
						 RenderingFactory.eINSTANCE.createRenderIndexedDrawTask()));

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
						 RenderingFactory.eINSTANCE.createRenderDrawTask()));

				newChildDescriptors.add
					(createChildParameter
						(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
						 RenderingFactory.eINSTANCE.createRenderIndexedDrawTask()));

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
			return ExtraEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link VulkanResourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class VulkanResourceChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends VulkanResourceSwitch<Object>
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
			public Object caseBufferPart(BufferPart object)
			{
				newChildDescriptors.add
					(createChildParameter
						(VulkanResourcePackage.Literals.BUFFER_PART__DATA_PROVIDER,
						 RenderingFactory.eINSTANCE.createVertexProvider()));

				newChildDescriptors.add
					(createChildParameter
						(VulkanResourcePackage.Literals.BUFFER_PART__DATA_PROVIDER,
						 RenderingFactory.eINSTANCE.createIndexProvider()));

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
			return ExtraEditPlugin.INSTANCE;
		}
	}

	/**
	 * A child creation extender for the {@link ResourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ResourceChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ResourceSwitch<Object>
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
			public Object caseResourcePkg(ResourcePkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 RenderingFactory.eINSTANCE.createRenderProxyConstantBuffer()));

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
			return ExtraEditPlugin.INSTANCE;
		}
	}

}
