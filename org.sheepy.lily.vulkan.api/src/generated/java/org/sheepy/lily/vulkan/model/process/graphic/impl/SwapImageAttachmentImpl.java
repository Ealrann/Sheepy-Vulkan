/**
 */
package org.sheepy.lily.vulkan.model.process.graphic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.joml.Vector4fc;
import org.sheepy.lily.core.model.types.TypesFactory;
import org.sheepy.lily.core.model.types.TypesPackage;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.graphic.SwapImageAttachment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swap Image Attachment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.graphic.impl.SwapImageAttachmentImpl#getClearValue <em>Clear Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwapImageAttachmentImpl extends AttachmentImpl implements SwapImageAttachment
{
	/**
	 * The default value of the '{@link #getClearValue() <em>Clear Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearValue()
	 * @generated
	 * @ordered
	 */
	protected static final Vector4fc CLEAR_VALUE_EDEFAULT = (Vector4fc)TypesFactory.eINSTANCE.createFromString(TypesPackage.eINSTANCE.getColor4f(), "0;0;0;0");
	/**
	 * The cached value of the '{@link #getClearValue() <em>Clear Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearValue()
	 * @generated
	 * @ordered
	 */
	protected Vector4fc clearValue = CLEAR_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwapImageAttachmentImpl()
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
		return GraphicPackage.Literals.SWAP_IMAGE_ATTACHMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4fc getClearValue()
	{
		return clearValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearValue(Vector4fc newClearValue)
	{
		Vector4fc oldClearValue = clearValue;
		clearValue = newClearValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.SWAP_IMAGE_ATTACHMENT__CLEAR_VALUE, oldClearValue, clearValue));
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
			case GraphicPackage.SWAP_IMAGE_ATTACHMENT__CLEAR_VALUE:
				return getClearValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case GraphicPackage.SWAP_IMAGE_ATTACHMENT__CLEAR_VALUE:
				setClearValue((Vector4fc)newValue);
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
			case GraphicPackage.SWAP_IMAGE_ATTACHMENT__CLEAR_VALUE:
				setClearValue(CLEAR_VALUE_EDEFAULT);
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
			case GraphicPackage.SWAP_IMAGE_ATTACHMENT__CLEAR_VALUE:
				return CLEAR_VALUE_EDEFAULT == null ? clearValue != null : !CLEAR_VALUE_EDEFAULT.equals(clearValue);
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
		result.append(" (clearValue: ");
		result.append(clearValue);
		result.append(')');
		return result.toString();
	}

} //SwapImageAttachmentImpl
