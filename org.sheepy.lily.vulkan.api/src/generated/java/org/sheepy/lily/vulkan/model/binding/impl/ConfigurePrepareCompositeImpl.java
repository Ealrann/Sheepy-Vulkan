/**
 */
package org.sheepy.lily.vulkan.model.binding.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.sheepy.lily.core.api.adapter.LilyEObject;

import org.sheepy.lily.vulkan.model.binding.BindingPackage;
import org.sheepy.lily.vulkan.model.binding.ConfigurePrepareComposite;
import org.sheepy.lily.vulkan.model.binding.EInstance;
import org.sheepy.lily.vulkan.model.resource.CompositePartReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configure Prepare Composite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.binding.impl.ConfigurePrepareCompositeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.binding.impl.ConfigurePrepareCompositeImpl#getReferences <em>References</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.binding.impl.ConfigurePrepareCompositeImpl#getTargetInstance <em>Target Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurePrepareCompositeImpl extends LilyEObject implements ConfigurePrepareComposite
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<CompositePartReference> references;

	/**
	 * The default value of the '{@link #getTargetInstance() <em>Target Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInstance()
	 * @generated
	 * @ordered
	 */
	protected static final EInstance TARGET_INSTANCE_EDEFAULT = EInstance.CONTEXT_INSTANCE;

	/**
	 * The cached value of the '{@link #getTargetInstance() <em>Target Instance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetInstance()
	 * @generated
	 * @ordered
	 */
	protected EInstance targetInstance = TARGET_INSTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurePrepareCompositeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return BindingPackage.Literals.CONFIGURE_PREPARE_COMPOSITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.CONFIGURE_PREPARE_COMPOSITE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CompositePartReference> getReferences()
	{
		if (references == null)
		{
			references = new EObjectResolvingEList<CompositePartReference>(CompositePartReference.class, this, BindingPackage.CONFIGURE_PREPARE_COMPOSITE__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EInstance getTargetInstance()
	{
		return targetInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetInstance(EInstance newTargetInstance)
	{
		EInstance oldTargetInstance = targetInstance;
		targetInstance = newTargetInstance == null ? TARGET_INSTANCE_EDEFAULT : newTargetInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BindingPackage.CONFIGURE_PREPARE_COMPOSITE__TARGET_INSTANCE, oldTargetInstance, targetInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__NAME:
				return getName();
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__REFERENCES:
				return getReferences();
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__TARGET_INSTANCE:
				return getTargetInstance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__NAME:
				setName((String)newValue);
				return;
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends CompositePartReference>)newValue);
				return;
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__TARGET_INSTANCE:
				setTargetInstance((EInstance)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__REFERENCES:
				getReferences().clear();
				return;
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__TARGET_INSTANCE:
				setTargetInstance(TARGET_INSTANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__REFERENCES:
				return references != null && !references.isEmpty();
			case BindingPackage.CONFIGURE_PREPARE_COMPOSITE__TARGET_INSTANCE:
				return targetInstance != TARGET_INSTANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", targetInstance: ");
		result.append(targetInstance);
		result.append(')');
		return result.toString();
	}

} //ConfigurePrepareCompositeImpl