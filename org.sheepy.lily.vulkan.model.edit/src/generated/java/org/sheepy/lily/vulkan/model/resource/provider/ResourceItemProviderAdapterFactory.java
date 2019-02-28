/**
 */
package org.sheepy.lily.vulkan.model.resource.provider;

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
import org.sheepy.lily.vulkan.model.ResourcePkg;
import org.sheepy.lily.vulkan.model.VulkanPackage;
import org.sheepy.lily.vulkan.model.resource.ResourceFactory;
import org.sheepy.lily.vulkan.model.resource.ResourcePackage;

import org.sheepy.lily.vulkan.model.resource.util.ResourceAdapterFactory;

import org.sheepy.lily.vulkan.model.util.VulkanSwitch;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResourceItemProviderAdapterFactory extends ResourceAdapterFactory
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
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(
			ResourceEditPlugin.INSTANCE, ResourcePackage.eNS_URI);

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
	public ResourceItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Buffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferItemProvider bufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Buffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferAdapter()
	{
		if (bufferItemProvider == null)
		{
			bufferItemProvider = new BufferItemProvider(this);
		}

		return bufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Image} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageItemProvider imageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageAdapter()
	{
		if (imageItemProvider == null)
		{
			imageItemProvider = new ImageItemProvider(this);
		}

		return imageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageLayout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageLayoutItemProvider imageLayoutItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageLayoutAdapter()
	{
		if (imageLayoutItemProvider == null)
		{
			imageLayoutItemProvider = new ImageLayoutItemProvider(this);
		}

		return imageLayoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Semaphore} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemaphoreItemProvider semaphoreItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSemaphoreAdapter()
	{
		if (semaphoreItemProvider == null)
		{
			semaphoreItemProvider = new SemaphoreItemProvider(this);
		}

		return semaphoreItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Font} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontItemProvider fontItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Font}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFontAdapter()
	{
		if (fontItemProvider == null)
		{
			fontItemProvider = new FontItemProvider(this);
		}

		return fontItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Texture} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextureItemProvider textureItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Texture}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextureAdapter()
	{
		if (textureItemProvider == null)
		{
			textureItemProvider = new TextureItemProvider(this);
		}

		return textureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Sampler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplerItemProvider samplerItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Sampler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSamplerAdapter()
	{
		if (samplerItemProvider == null)
		{
			samplerItemProvider = new SamplerItemProvider(this);
		}

		return samplerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Constants} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantsItemProvider constantsItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Constants}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantsAdapter()
	{
		if (constantsItemProvider == null)
		{
			constantsItemProvider = new ConstantsItemProvider(this);
		}

		return constantsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.DescriptorSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorSetItemProvider descriptorSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.DescriptorSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptorSetAdapter()
	{
		if (descriptorSetItemProvider == null)
		{
			descriptorSetItemProvider = new DescriptorSetItemProvider(this);
		}

		return descriptorSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferBarrierItemProvider bufferBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferBarrierAdapter()
	{
		if (bufferBarrierItemProvider == null)
		{
			bufferBarrierItemProvider = new BufferBarrierItemProvider(this);
		}

		return bufferBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageBarrierItemProvider imageBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageBarrierAdapter()
	{
		if (imageBarrierItemProvider == null)
		{
			imageBarrierItemProvider = new ImageBarrierItemProvider(this);
		}

		return imageBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ReferenceImageBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferenceImageBarrierItemProvider referenceImageBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ReferenceImageBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReferenceImageBarrierAdapter()
	{
		if (referenceImageBarrierItemProvider == null)
		{
			referenceImageBarrierItemProvider = new ReferenceImageBarrierItemProvider(this);
		}

		return referenceImageBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageTransition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageTransitionItemProvider imageTransitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageTransition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageTransitionAdapter()
	{
		if (imageTransitionItemProvider == null)
		{
			imageTransitionItemProvider = new ImageTransitionItemProvider(this);
		}

		return imageTransitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Shader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShaderItemProvider shaderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Shader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShaderAdapter()
	{
		if (shaderItemProvider == null)
		{
			shaderItemProvider = new ShaderItemProvider(this);
		}

		return shaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.DepthImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepthImageItemProvider depthImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.DepthImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepthImageAdapter()
	{
		if (depthImageItemProvider == null)
		{
			depthImageItemProvider = new DepthImageItemProvider(this);
		}

		return depthImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.FileResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileResourceItemProvider fileResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.FileResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileResourceAdapter()
	{
		if (fileResourceItemProvider == null)
		{
			fileResourceItemProvider = new FileResourceItemProvider(this);
		}

		return fileResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ModuleResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleResourceItemProvider moduleResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ModuleResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModuleResourceAdapter()
	{
		if (moduleResourceItemProvider == null)
		{
			moduleResourceItemProvider = new ModuleResourceItemProvider(this);
		}

		return moduleResourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.StringModuleResource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringModuleResourceItemProvider stringModuleResourceItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.StringModuleResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStringModuleResourceAdapter()
	{
		if (stringModuleResourceItemProvider == null)
		{
			stringModuleResourceItemProvider = new StringModuleResourceItemProvider(this);
		}

		return stringModuleResourceItemProvider;
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
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter)))
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
		if (bufferItemProvider != null) bufferItemProvider.dispose();
		if (imageItemProvider != null) imageItemProvider.dispose();
		if (imageLayoutItemProvider != null) imageLayoutItemProvider.dispose();
		if (semaphoreItemProvider != null) semaphoreItemProvider.dispose();
		if (fontItemProvider != null) fontItemProvider.dispose();
		if (textureItemProvider != null) textureItemProvider.dispose();
		if (samplerItemProvider != null) samplerItemProvider.dispose();
		if (constantsItemProvider != null) constantsItemProvider.dispose();
		if (descriptorSetItemProvider != null) descriptorSetItemProvider.dispose();
		if (bufferBarrierItemProvider != null) bufferBarrierItemProvider.dispose();
		if (imageBarrierItemProvider != null) imageBarrierItemProvider.dispose();
		if (referenceImageBarrierItemProvider != null) referenceImageBarrierItemProvider.dispose();
		if (imageTransitionItemProvider != null) imageTransitionItemProvider.dispose();
		if (shaderItemProvider != null) shaderItemProvider.dispose();
		if (depthImageItemProvider != null) depthImageItemProvider.dispose();
		if (fileResourceItemProvider != null) fileResourceItemProvider.dispose();
		if (moduleResourceItemProvider != null) moduleResourceItemProvider.dispose();
		if (stringModuleResourceItemProvider != null) stringModuleResourceItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link VulkanPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class VulkanChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends VulkanSwitch<Object>
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
				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createBuffer()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createImage()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createSemaphore()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createFont()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createTexture()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createConstants()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createShader()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createFileResource()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createModuleResource()));

				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.RESOURCE_PKG__RESOURCES,
								ResourceFactory.eINSTANCE.createStringModuleResource()));

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
			new CreationSwitch(result, editingDomain).doSwitch((EObject) object);
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
			return ResourceEditPlugin.INSTANCE;
		}
	}

}
