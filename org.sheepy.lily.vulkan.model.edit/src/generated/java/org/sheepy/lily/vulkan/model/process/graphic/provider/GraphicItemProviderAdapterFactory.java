/**
 */
package org.sheepy.lily.vulkan.model.process.graphic.provider;

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
import org.sheepy.lily.vulkan.model.VulkanEngine;
import org.sheepy.lily.vulkan.model.VulkanPackage;
import org.sheepy.lily.vulkan.model.process.AbstractCompositePipeline;
import org.sheepy.lily.vulkan.model.process.PipelinePkg;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;

import org.sheepy.lily.vulkan.model.process.graphic.GraphicFactory;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;

import org.sheepy.lily.vulkan.model.process.graphic.util.GraphicAdapterFactory;

import org.sheepy.lily.vulkan.model.process.util.ProcessSwitch;
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
public class GraphicItemProviderAdapterFactory extends GraphicAdapterFactory
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
			GraphicEditPlugin.INSTANCE, GraphicPackage.eNS_URI);

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
	public GraphicItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicConfiguration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicConfigurationItemProvider graphicConfigurationItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicConfiguration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicConfigurationAdapter()
	{
		if (graphicConfigurationItemProvider == null)
		{
			graphicConfigurationItemProvider = new GraphicConfigurationItemProvider(this);
		}

		return graphicConfigurationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.RenderPassInfo} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderPassInfoItemProvider renderPassInfoItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.RenderPassInfo}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRenderPassInfoAdapter()
	{
		if (renderPassInfoItemProvider == null)
		{
			renderPassInfoItemProvider = new RenderPassInfoItemProvider(this);
		}

		return renderPassInfoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.Subpass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubpassItemProvider subpassItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.Subpass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubpassAdapter()
	{
		if (subpassItemProvider == null)
		{
			subpassItemProvider = new SubpassItemProvider(this);
		}

		return subpassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.AttachementRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachementRefItemProvider attachementRefItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.AttachementRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachementRefAdapter()
	{
		if (attachementRefItemProvider == null)
		{
			attachementRefItemProvider = new AttachementRefItemProvider(this);
		}

		return attachementRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.SubpassDependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubpassDependencyItemProvider subpassDependencyItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.SubpassDependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubpassDependencyAdapter()
	{
		if (subpassDependencyItemProvider == null)
		{
			subpassDependencyItemProvider = new SubpassDependencyItemProvider(this);
		}

		return subpassDependencyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.AttachmentDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttachmentDescriptionItemProvider attachmentDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.AttachmentDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttachmentDescriptionAdapter()
	{
		if (attachmentDescriptionItemProvider == null)
		{
			attachmentDescriptionItemProvider = new AttachmentDescriptionItemProvider(this);
		}

		return attachmentDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.DepthAttachmentDescription} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DepthAttachmentDescriptionItemProvider depthAttachmentDescriptionItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.DepthAttachmentDescription}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDepthAttachmentDescriptionAdapter()
	{
		if (depthAttachmentDescriptionItemProvider == null)
		{
			depthAttachmentDescriptionItemProvider = new DepthAttachmentDescriptionItemProvider(
					this);
		}

		return depthAttachmentDescriptionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicProcessItemProvider graphicProcessItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicProcessAdapter()
	{
		if (graphicProcessItemProvider == null)
		{
			graphicProcessItemProvider = new GraphicProcessItemProvider(this);
		}

		return graphicProcessItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicsPipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicsPipelineItemProvider graphicsPipelineItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.GraphicsPipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGraphicsPipelineAdapter()
	{
		if (graphicsPipelineItemProvider == null)
		{
			graphicsPipelineItemProvider = new GraphicsPipelineItemProvider(this);
		}

		return graphicsPipelineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.DynamicState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicStateItemProvider dynamicStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.DynamicState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicStateAdapter()
	{
		if (dynamicStateItemProvider == null)
		{
			dynamicStateItemProvider = new DynamicStateItemProvider(this);
		}

		return dynamicStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.ColorBlend} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorBlendItemProvider colorBlendItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.ColorBlend}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorBlendAdapter()
	{
		if (colorBlendItemProvider == null)
		{
			colorBlendItemProvider = new ColorBlendItemProvider(this);
		}

		return colorBlendItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.ColorBlendAttachment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ColorBlendAttachmentItemProvider colorBlendAttachmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.ColorBlendAttachment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createColorBlendAttachmentAdapter()
	{
		if (colorBlendAttachmentItemProvider == null)
		{
			colorBlendAttachmentItemProvider = new ColorBlendAttachmentItemProvider(this);
		}

		return colorBlendAttachmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.StaticViewportState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticViewportStateItemProvider staticViewportStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.StaticViewportState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticViewportStateAdapter()
	{
		if (staticViewportStateItemProvider == null)
		{
			staticViewportStateItemProvider = new StaticViewportStateItemProvider(this);
		}

		return staticViewportStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.DynamicViewportState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DynamicViewportStateItemProvider dynamicViewportStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.DynamicViewportState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDynamicViewportStateAdapter()
	{
		if (dynamicViewportStateItemProvider == null)
		{
			dynamicViewportStateItemProvider = new DynamicViewportStateItemProvider(this);
		}

		return dynamicViewportStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.Viewport} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewportItemProvider viewportItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.Viewport}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createViewportAdapter()
	{
		if (viewportItemProvider == null)
		{
			viewportItemProvider = new ViewportItemProvider(this);
		}

		return viewportItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.Scissor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScissorItemProvider scissorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.Scissor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScissorAdapter()
	{
		if (scissorItemProvider == null)
		{
			scissorItemProvider = new ScissorItemProvider(this);
		}

		return scissorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.Rasterizer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RasterizerItemProvider rasterizerItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.Rasterizer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRasterizerAdapter()
	{
		if (rasterizerItemProvider == null)
		{
			rasterizerItemProvider = new RasterizerItemProvider(this);
		}

		return rasterizerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.process.graphic.ImagePipeline} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImagePipelineItemProvider imagePipelineItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.ImagePipeline}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImagePipelineAdapter()
	{
		if (imagePipelineItemProvider == null)
		{
			imagePipelineItemProvider = new ImagePipelineItemProvider(this);
		}

		return imagePipelineItemProvider;
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
		if (graphicConfigurationItemProvider != null) graphicConfigurationItemProvider.dispose();
		if (renderPassInfoItemProvider != null) renderPassInfoItemProvider.dispose();
		if (subpassItemProvider != null) subpassItemProvider.dispose();
		if (attachementRefItemProvider != null) attachementRefItemProvider.dispose();
		if (subpassDependencyItemProvider != null) subpassDependencyItemProvider.dispose();
		if (attachmentDescriptionItemProvider != null) attachmentDescriptionItemProvider.dispose();
		if (depthAttachmentDescriptionItemProvider != null)
			depthAttachmentDescriptionItemProvider.dispose();
		if (graphicProcessItemProvider != null) graphicProcessItemProvider.dispose();
		if (graphicsPipelineItemProvider != null) graphicsPipelineItemProvider.dispose();
		if (dynamicStateItemProvider != null) dynamicStateItemProvider.dispose();
		if (colorBlendItemProvider != null) colorBlendItemProvider.dispose();
		if (colorBlendAttachmentItemProvider != null) colorBlendAttachmentItemProvider.dispose();
		if (staticViewportStateItemProvider != null) staticViewportStateItemProvider.dispose();
		if (dynamicViewportStateItemProvider != null) dynamicViewportStateItemProvider.dispose();
		if (viewportItemProvider != null) viewportItemProvider.dispose();
		if (scissorItemProvider != null) scissorItemProvider.dispose();
		if (rasterizerItemProvider != null) rasterizerItemProvider.dispose();
		if (imagePipelineItemProvider != null) imagePipelineItemProvider.dispose();
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
			public Object casePipelinePkg(PipelinePkg object)
			{
				newChildDescriptors
						.add(createChildParameter(ProcessPackage.Literals.PIPELINE_PKG__PIPELINES,
								GraphicFactory.eINSTANCE.createGraphicsPipeline()));

				newChildDescriptors
						.add(createChildParameter(ProcessPackage.Literals.PIPELINE_PKG__PIPELINES,
								GraphicFactory.eINSTANCE.createImagePipeline()));

				return null;
			}

			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseAbstractCompositePipeline(AbstractCompositePipeline object)
			{
				newChildDescriptors.add(createChildParameter(
						ProcessPackage.Literals.ABSTRACT_COMPOSITE_PIPELINE__PIPELINES,
						GraphicFactory.eINSTANCE.createGraphicsPipeline()));

				newChildDescriptors.add(createChildParameter(
						ProcessPackage.Literals.ABSTRACT_COMPOSITE_PIPELINE__PIPELINES,
						GraphicFactory.eINSTANCE.createImagePipeline()));

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
			return GraphicEditPlugin.INSTANCE;
		}
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
			public Object caseVulkanEngine(VulkanEngine object)
			{
				newChildDescriptors
						.add(createChildParameter(VulkanPackage.Literals.VULKAN_ENGINE__PROCESSES,
								GraphicFactory.eINSTANCE.createGraphicProcess()));

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
			return GraphicEditPlugin.INSTANCE;
		}
	}

}
