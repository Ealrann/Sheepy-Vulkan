/**
 */
package org.sheepy.lily.vulkan.model.resource.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;
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
import org.sheepy.lily.vulkan.model.resource.BufferDataProvider;
import org.sheepy.lily.vulkan.model.resource.ResourcePackage;

/**
 * This is the item provider adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferDataProvider} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BufferDataProviderItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BufferDataProviderItemProvider(AdapterFactory adapterFactory)
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
			addUsagePropertyDescriptor(object);
			addInstanceCountPropertyDescriptor(object);
			addDataSourcePropertyDescriptor(object);
			addInstancePropertyDescriptor(object);
			addFirstDescriptorPropertyDescriptor(object);
			addUsedToPushPropertyDescriptor(object);
			addUsedToFetchPropertyDescriptor(object);
			addStageBeforePushPropertyDescriptor(object);
			addAccessBeforePushPropertyDescriptor(object);
			addStageBeforeFetchPropertyDescriptor(object);
			addAccessBeforeFetchPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Usage feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsagePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_usage_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_usage_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__USAGE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance Count feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstanceCountPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_instanceCount_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_instanceCount_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__INSTANCE_COUNT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSourcePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_dataSource_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_dataSource_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__DATA_SOURCE,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Instance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInstancePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_instance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_instance_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__INSTANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the First Descriptor feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFirstDescriptorPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_firstDescriptor_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_firstDescriptor_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__FIRST_DESCRIPTOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used To Push feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedToPushPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_usedToPush_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_usedToPush_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__USED_TO_PUSH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Used To Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsedToFetchPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_usedToFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_usedToFetch_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__USED_TO_FETCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stage Before Push feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStageBeforePushPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_stageBeforePush_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_stageBeforePush_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__STAGE_BEFORE_PUSH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Before Push feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessBeforePushPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_accessBeforePush_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_accessBeforePush_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__ACCESS_BEFORE_PUSH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stage Before Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStageBeforeFetchPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_stageBeforeFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_stageBeforeFetch_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__STAGE_BEFORE_FETCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Access Before Fetch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccessBeforeFetchPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BufferDataProvider_accessBeforeFetch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BufferDataProvider_accessBeforeFetch_feature", "_UI_BufferDataProvider_type"),
				 ResourcePackage.Literals.BUFFER_DATA_PROVIDER__ACCESS_BEFORE_FETCH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns BufferDataProvider.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BufferDataProvider"));
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
		String label = ((BufferDataProvider<?>)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BufferDataProvider_type") :
			getString("_UI_BufferDataProvider_type") + " " + label;
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

		switch (notification.getFeatureID(BufferDataProvider.class))
		{
			case ResourcePackage.BUFFER_DATA_PROVIDER__NAME:
			case ResourcePackage.BUFFER_DATA_PROVIDER__USAGE:
			case ResourcePackage.BUFFER_DATA_PROVIDER__INSTANCE_COUNT:
			case ResourcePackage.BUFFER_DATA_PROVIDER__DATA_SOURCE:
			case ResourcePackage.BUFFER_DATA_PROVIDER__INSTANCE:
			case ResourcePackage.BUFFER_DATA_PROVIDER__FIRST_DESCRIPTOR:
			case ResourcePackage.BUFFER_DATA_PROVIDER__USED_TO_PUSH:
			case ResourcePackage.BUFFER_DATA_PROVIDER__USED_TO_FETCH:
			case ResourcePackage.BUFFER_DATA_PROVIDER__STAGE_BEFORE_PUSH:
			case ResourcePackage.BUFFER_DATA_PROVIDER__ACCESS_BEFORE_PUSH:
			case ResourcePackage.BUFFER_DATA_PROVIDER__STAGE_BEFORE_FETCH:
			case ResourcePackage.BUFFER_DATA_PROVIDER__ACCESS_BEFORE_FETCH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
