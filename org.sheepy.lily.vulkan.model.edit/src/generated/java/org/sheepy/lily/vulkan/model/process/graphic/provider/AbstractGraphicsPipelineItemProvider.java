/**
 */
package org.sheepy.lily.vulkan.model.process.graphic.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sheepy.lily.vulkan.model.process.graphic.AbstractGraphicsPipeline;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicFactory;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.provider.AbstractPipelineItemProvider;

/**
 * This is the item provider adapter for a {@link org.sheepy.lily.vulkan.model.process.graphic.AbstractGraphicsPipeline} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractGraphicsPipelineItemProvider extends AbstractPipelineItemProvider
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGraphicsPipelineItemProvider(AdapterFactory adapterFactory)
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
			addSubpassPropertyDescriptor(object);
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
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_AbstractGraphicsPipeline_shaders_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractGraphicsPipeline_shaders_feature",
						"_UI_AbstractGraphicsPipeline_type"),
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__SHADERS, true, false, true,
				null, null, null));
	}

	/**
	 * This adds a property descriptor for the Subpass feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubpassPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
				getResourceLocator(), getString("_UI_AbstractGraphicsPipeline_subpass_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_AbstractGraphicsPipeline_subpass_feature",
						"_UI_AbstractGraphicsPipeline_type"),
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__SUBPASS, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures
					.add(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__VIEWPORT_STATE);
			childrenFeatures
					.add(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__INPUT_ASSEMBLY);
			childrenFeatures.add(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__RASTERIZER);
			childrenFeatures.add(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__COLOR_BLEND);
			childrenFeatures.add(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__DYNAMIC_STATE);
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
		String label = ((AbstractGraphicsPipeline) object).getName();
		return label == null || label.length() == 0
				? getString("_UI_AbstractGraphicsPipeline_type")
				: getString("_UI_AbstractGraphicsPipeline_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractGraphicsPipeline.class))
		{
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__SUBPASS:
			fireNotifyChanged(
					new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__VIEWPORT_STATE:
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__INPUT_ASSEMBLY:
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__RASTERIZER:
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__COLOR_BLEND:
		case GraphicPackage.ABSTRACT_GRAPHICS_PIPELINE__DYNAMIC_STATE:
			fireNotifyChanged(
					new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add(createChildParameter(
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__VIEWPORT_STATE,
				GraphicFactory.eINSTANCE.createStaticViewportState()));

		newChildDescriptors.add(createChildParameter(
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__VIEWPORT_STATE,
				GraphicFactory.eINSTANCE.createDynamicViewportState()));

		newChildDescriptors.add(createChildParameter(
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__INPUT_ASSEMBLY,
				GraphicFactory.eINSTANCE.createInputAssembly()));

		newChildDescriptors.add(
				createChildParameter(GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__RASTERIZER,
						GraphicFactory.eINSTANCE.createRasterizer()));

		newChildDescriptors.add(createChildParameter(
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__COLOR_BLEND,
				GraphicFactory.eINSTANCE.createColorBlend()));

		newChildDescriptors.add(createChildParameter(
				GraphicPackage.Literals.ABSTRACT_GRAPHICS_PIPELINE__DYNAMIC_STATE,
				GraphicFactory.eINSTANCE.createDynamicState()));
	}

}
