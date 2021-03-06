/**
 */
package org.sheepy.lily.vulkan.model.process.provider;

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
import org.sheepy.lily.core.model.types.TypesPackage;
import org.sheepy.lily.vulkan.model.process.CompositeTask;
import org.sheepy.lily.vulkan.model.process.ProcessFactory;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.compute.ComputeFactory;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicFactory;

/**
 * This is the item provider adapter for a {@link org.sheepy.lily.vulkan.model.process.CompositeTask} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeTaskItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeTaskItemProvider(AdapterFactory adapterFactory)
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

			addNamePropertyDescriptor(object);
			addEnabledPropertyDescriptor(object);
			addRepeatCountPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LNamedElement_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LNamedElement_name_feature", "_UI_LNamedElement_type"),
				 TypesPackage.Literals.LNAMED_ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Enabled feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnabledPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_IPipelineTask_enabled_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_IPipelineTask_enabled_feature", "_UI_IPipelineTask_type"),
				 ProcessPackage.Literals.IPIPELINE_TASK__ENABLED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repeat Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepeatCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompositeTask_repeatCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompositeTask_repeatCount_feature", "_UI_CompositeTask_type"),
				 ProcessPackage.Literals.COMPOSITE_TASK__REPEAT_COUNT,
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
			childrenFeatures.add(ProcessPackage.Literals.COMPOSITE_TASK__TASKS);
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
	 * This returns CompositeTask.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompositeTask"));
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
		String label = ((CompositeTask)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CompositeTask_type") :
			getString("_UI_CompositeTask_type") + " " + label;
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

		switch (notification.getFeatureID(CompositeTask.class))
		{
			case ProcessPackage.COMPOSITE_TASK__NAME:
			case ProcessPackage.COMPOSITE_TASK__ENABLED:
			case ProcessPackage.COMPOSITE_TASK__REPEAT_COUNT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ProcessPackage.COMPOSITE_TASK__TASKS:
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
				 ProcessFactory.eINSTANCE.createFetchBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 ComputeFactory.eINSTANCE.createDispatchTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createBlitToSwapImage()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createBlitTask()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createDrawIndexed()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createDraw()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createBindVertexBuffer()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createSetScissor()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createSetViewport()));

		newChildDescriptors.add
			(createChildParameter
				(ProcessPackage.Literals.COMPOSITE_TASK__TASKS,
				 GraphicFactory.eINSTANCE.createBindIndexBuffer()));
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
