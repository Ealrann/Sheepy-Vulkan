/**
 */
package org.sheepy.lily.vulkan.model.process.graphic.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.joml.Vector4f;
import org.sheepy.lily.core.model.types.TypesFactory;
import org.sheepy.lily.core.model.types.TypesPackage;
import org.sheepy.lily.vulkan.model.process.graphic.FramebufferConfiguration;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.graphic.IFramebufferAttachment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Framebuffer Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.graphic.impl.FramebufferConfigurationImpl#getClearValue <em>Clear Value</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.graphic.impl.FramebufferConfigurationImpl#getAtachments <em>Atachments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FramebufferConfigurationImpl extends MinimalEObjectImpl.Container
		implements FramebufferConfiguration
{
	/**
	 * The default value of the '{@link #getClearValue() <em>Clear Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearValue()
	 * @generated
	 * @ordered
	 */
	protected static final Vector4f CLEAR_VALUE_EDEFAULT = (Vector4f) TypesFactory.eINSTANCE
			.createFromString(TypesPackage.eINSTANCE.getColor4f(), "0;0;0;0");
	/**
	 * The cached value of the '{@link #getClearValue() <em>Clear Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClearValue()
	 * @generated
	 * @ordered
	 */
	protected Vector4f clearValue = CLEAR_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAtachments() <em>Atachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAtachments()
	 * @generated
	 * @ordered
	 */
	protected EList<IFramebufferAttachment> atachments;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramebufferConfigurationImpl()
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
		return GraphicPackage.Literals.FRAMEBUFFER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vector4f getClearValue()
	{
		return clearValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClearValue(Vector4f newClearValue)
	{
		Vector4f oldClearValue = clearValue;
		clearValue = newClearValue;
		if (eNotificationRequired()) eNotify(new ENotificationImpl(this, Notification.SET,
				GraphicPackage.FRAMEBUFFER_CONFIGURATION__CLEAR_VALUE, oldClearValue, clearValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IFramebufferAttachment> getAtachments()
	{
		if (atachments == null)
		{
			atachments = new EObjectContainmentEList<IFramebufferAttachment>(
					IFramebufferAttachment.class, this,
					GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS);
		}
		return atachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
											int featureID,
											NotificationChain msgs)
	{
		switch (featureID)
		{
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS:
			return ((InternalEList<?>) getAtachments()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__CLEAR_VALUE:
			return getClearValue();
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS:
			return getAtachments();
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
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__CLEAR_VALUE:
			setClearValue((Vector4f) newValue);
			return;
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS:
			getAtachments().clear();
			getAtachments().addAll((Collection<? extends IFramebufferAttachment>) newValue);
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
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__CLEAR_VALUE:
			setClearValue(CLEAR_VALUE_EDEFAULT);
			return;
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS:
			getAtachments().clear();
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
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__CLEAR_VALUE:
			return CLEAR_VALUE_EDEFAULT == null
					? clearValue != null
					: !CLEAR_VALUE_EDEFAULT.equals(clearValue);
		case GraphicPackage.FRAMEBUFFER_CONFIGURATION__ATACHMENTS:
			return atachments != null && !atachments.isEmpty();
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

} //FramebufferConfigurationImpl