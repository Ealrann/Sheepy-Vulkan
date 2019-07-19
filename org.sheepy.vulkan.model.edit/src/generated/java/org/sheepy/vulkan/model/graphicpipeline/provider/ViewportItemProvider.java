/**
 */
package org.sheepy.vulkan.model.graphicpipeline.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.sheepy.vulkan.model.graphicpipeline.GraphicpipelineFactory;
import org.sheepy.vulkan.model.graphicpipeline.GraphicpipelinePackage;
import org.sheepy.vulkan.model.graphicpipeline.Viewport;

/**
 * This is the item provider adapter for a {@link org.sheepy.vulkan.model.graphicpipeline.Viewport} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ViewportItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewportItemProvider(AdapterFactory adapterFactory)
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

			addOffsetXPropertyDescriptor(object);
			addOffsetYPropertyDescriptor(object);
			addMinDepthPropertyDescriptor(object);
			addMaxDepthPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Offset X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetXPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewport_offsetX_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewport_offsetX_feature", "_UI_Viewport_type"),
				 GraphicpipelinePackage.Literals.VIEWPORT__OFFSET_X,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Offset Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOffsetYPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewport_offsetY_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewport_offsetY_feature", "_UI_Viewport_type"),
				 GraphicpipelinePackage.Literals.VIEWPORT__OFFSET_Y,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinDepthPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewport_minDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewport_minDepth_feature", "_UI_Viewport_type"),
				 GraphicpipelinePackage.Literals.VIEWPORT__MIN_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxDepthPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Viewport_maxDepth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Viewport_maxDepth_feature", "_UI_Viewport_type"),
				 GraphicpipelinePackage.Literals.VIEWPORT__MAX_DEPTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
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
			childrenFeatures.add(GraphicpipelinePackage.Literals.VIEWPORT__EXTENT);
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
	 * This returns Viewport.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Viewport"));
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
		Viewport viewport = (Viewport)object;
		return getString("_UI_Viewport_type") + " " + viewport.getOffsetX();
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

		switch (notification.getFeatureID(Viewport.class))
		{
			case GraphicpipelinePackage.VIEWPORT__OFFSET_X:
			case GraphicpipelinePackage.VIEWPORT__OFFSET_Y:
			case GraphicpipelinePackage.VIEWPORT__MIN_DEPTH:
			case GraphicpipelinePackage.VIEWPORT__MAX_DEPTH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GraphicpipelinePackage.VIEWPORT__EXTENT:
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
				(GraphicpipelinePackage.Literals.VIEWPORT__EXTENT,
				 GraphicpipelineFactory.eINSTANCE.createVec2I()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return ((IChildCreationExtender)adapterFactory).getResourceLocator();
	}

}
