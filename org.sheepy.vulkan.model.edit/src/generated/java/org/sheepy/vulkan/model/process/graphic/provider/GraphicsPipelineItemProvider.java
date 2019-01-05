/**
 */
package org.sheepy.vulkan.model.process.graphic.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.sheepy.vulkan.model.process.ProcessPackage;

import org.sheepy.vulkan.model.process.graphic.GraphicFactory;
import org.sheepy.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.vulkan.model.process.graphic.GraphicsPipeline;

import org.sheepy.vulkan.model.process.provider.AbstractPipelineItemProvider;

/**
 * This is the item provider adapter for a {@link org.sheepy.vulkan.model.process.graphic.GraphicsPipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphicsPipelineItemProvider extends AbstractPipelineItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicsPipelineItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addShadersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Shaders feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShadersPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GraphicsPipeline_shaders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GraphicsPipeline_shaders_feature", "_UI_GraphicsPipeline_type"),
				 GraphicPackage.Literals.GRAPHICS_PIPELINE__SHADERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(GraphicPackage.Literals.GRAPHICS_PIPELINE__VIEWPORT_STATE);
			childrenFeatures.add(GraphicPackage.Literals.GRAPHICS_PIPELINE__RASTERIZER);
			childrenFeatures.add(GraphicPackage.Literals.GRAPHICS_PIPELINE__COLOR_BLEND);
			childrenFeatures.add(GraphicPackage.Literals.GRAPHICS_PIPELINE__DYNAMIC_STATE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		String label = ((GraphicsPipeline)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GraphicsPipeline_type") :
			getString("_UI_GraphicsPipeline_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(GraphicsPipeline.class))
		{
			case GraphicPackage.GRAPHICS_PIPELINE__VIEWPORT_STATE:
			case GraphicPackage.GRAPHICS_PIPELINE__RASTERIZER:
			case GraphicPackage.GRAPHICS_PIPELINE__COLOR_BLEND:
			case GraphicPackage.GRAPHICS_PIPELINE__DYNAMIC_STATE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.ABSTRACT_PIPELINE__UNITS,
				 GraphicFactory.eINSTANCE.createPipelineImageBarrier()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHICS_PIPELINE__VIEWPORT_STATE,
				 GraphicFactory.eINSTANCE.createStaticViewportState()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHICS_PIPELINE__VIEWPORT_STATE,
				 GraphicFactory.eINSTANCE.createDynamicViewportState()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHICS_PIPELINE__RASTERIZER,
				 GraphicFactory.eINSTANCE.createRasterizer()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHICS_PIPELINE__COLOR_BLEND,
				 GraphicFactory.eINSTANCE.createColorBlend()));

		newChildDescriptors.add
			(createChildParameter
				(GraphicPackage.Literals.GRAPHICS_PIPELINE__DYNAMIC_STATE,
				 GraphicFactory.eINSTANCE.createDynamicState()));
	}

}