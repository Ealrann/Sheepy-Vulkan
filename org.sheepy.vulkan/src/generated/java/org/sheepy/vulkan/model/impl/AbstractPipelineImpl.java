/**
 */
package org.sheepy.vulkan.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.sheepy.vulkan.model.AbstractPipeline;
import org.sheepy.vulkan.model.DescriptorSet;
import org.sheepy.vulkan.model.PushConstant;
import org.sheepy.vulkan.model.VulkanPackage;

import org.sheepy.vulkan.model.enumeration.ECommandStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Pipeline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.vulkan.model.impl.AbstractPipelineImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.impl.AbstractPipelineImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.impl.AbstractPipelineImpl#getDescriptorSet <em>Descriptor Set</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.impl.AbstractPipelineImpl#getPushConstant <em>Push Constant</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPipelineImpl extends MinimalEObjectImpl.Container implements AbstractPipeline
{
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The default value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected static final ECommandStage STAGE_EDEFAULT = ECommandStage.RENDER;

	/**
	 * The cached value of the '{@link #getStage() <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStage()
	 * @generated
	 * @ordered
	 */
	protected ECommandStage stage = STAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDescriptorSet() <em>Descriptor Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorSet()
	 * @generated
	 * @ordered
	 */
	protected DescriptorSet descriptorSet;

	/**
	 * The cached value of the '{@link #getPushConstant() <em>Push Constant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushConstant()
	 * @generated
	 * @ordered
	 */
	protected PushConstant pushConstant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPipelineImpl()
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
		return VulkanPackage.Literals.ABSTRACT_PIPELINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled()
	{
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled)
	{
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECommandStage getStage()
	{
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStage(ECommandStage newStage)
	{
		ECommandStage oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptorSet getDescriptorSet()
	{
		return descriptorSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptorSet(DescriptorSet newDescriptorSet, NotificationChain msgs)
	{
		DescriptorSet oldDescriptorSet = descriptorSet;
		descriptorSet = newDescriptorSet;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET, oldDescriptorSet, newDescriptorSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptorSet(DescriptorSet newDescriptorSet)
	{
		if (newDescriptorSet != descriptorSet)
		{
			NotificationChain msgs = null;
			if (descriptorSet != null)
				msgs = ((InternalEObject)descriptorSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET, null, msgs);
			if (newDescriptorSet != null)
				msgs = ((InternalEObject)newDescriptorSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET, null, msgs);
			msgs = basicSetDescriptorSet(newDescriptorSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET, newDescriptorSet, newDescriptorSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PushConstant getPushConstant()
	{
		return pushConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPushConstant(PushConstant newPushConstant, NotificationChain msgs)
	{
		PushConstant oldPushConstant = pushConstant;
		pushConstant = newPushConstant;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT, oldPushConstant, newPushConstant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPushConstant(PushConstant newPushConstant)
	{
		if (newPushConstant != pushConstant)
		{
			NotificationChain msgs = null;
			if (pushConstant != null)
				msgs = ((InternalEObject)pushConstant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT, null, msgs);
			if (newPushConstant != null)
				msgs = ((InternalEObject)newPushConstant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT, null, msgs);
			msgs = basicSetPushConstant(newPushConstant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT, newPushConstant, newPushConstant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET:
				return basicSetDescriptorSet(null, msgs);
			case VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT:
				return basicSetPushConstant(null, msgs);
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
			case VulkanPackage.ABSTRACT_PIPELINE__ENABLED:
				return isEnabled();
			case VulkanPackage.ABSTRACT_PIPELINE__STAGE:
				return getStage();
			case VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET:
				return getDescriptorSet();
			case VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT:
				return getPushConstant();
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
			case VulkanPackage.ABSTRACT_PIPELINE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__STAGE:
				setStage((ECommandStage)newValue);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET:
				setDescriptorSet((DescriptorSet)newValue);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT:
				setPushConstant((PushConstant)newValue);
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
			case VulkanPackage.ABSTRACT_PIPELINE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__STAGE:
				setStage(STAGE_EDEFAULT);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET:
				setDescriptorSet((DescriptorSet)null);
				return;
			case VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT:
				setPushConstant((PushConstant)null);
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
			case VulkanPackage.ABSTRACT_PIPELINE__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case VulkanPackage.ABSTRACT_PIPELINE__STAGE:
				return stage != STAGE_EDEFAULT;
			case VulkanPackage.ABSTRACT_PIPELINE__DESCRIPTOR_SET:
				return descriptorSet != null;
			case VulkanPackage.ABSTRACT_PIPELINE__PUSH_CONSTANT:
				return pushConstant != null;
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", stage: ");
		result.append(stage);
		result.append(')');
		return result.toString();
	}

} //AbstractPipelineImpl