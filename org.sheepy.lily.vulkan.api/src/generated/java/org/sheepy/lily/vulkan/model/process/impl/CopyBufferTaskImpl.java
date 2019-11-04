/**
 */
package org.sheepy.lily.vulkan.model.process.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sheepy.lily.core.api.adapter.LilyEObject;

import org.sheepy.lily.vulkan.model.process.CopyBufferTask;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.resource.IBufferReference;
import org.sheepy.vulkan.model.enumeration.ECommandStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Buffer Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#getSrcBuffer <em>Src Buffer</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.CopyBufferTaskImpl#getDstBuffer <em>Dst Buffer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyBufferTaskImpl extends LilyEObject implements CopyBufferTask
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
	protected static final ECommandStage STAGE_EDEFAULT = ECommandStage.TRANSFER;

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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final long SIZE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected long size = SIZE_EDEFAULT;

	/**
	 * This is true if the Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeESet;

	/**
	 * The cached value of the '{@link #getSrcBuffer() <em>Src Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcBuffer()
	 * @generated
	 * @ordered
	 */
	protected IBufferReference srcBuffer;

	/**
	 * The cached value of the '{@link #getDstBuffer() <em>Dst Buffer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstBuffer()
	 * @generated
	 * @ordered
	 */
	protected IBufferReference dstBuffer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyBufferTaskImpl()
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
		return ProcessPackage.Literals.COPY_BUFFER_TASK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEnabled()
	{
		return enabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnabled(boolean newEnabled)
	{
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBufferReference getSrcBuffer()
	{
		return srcBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSrcBuffer(IBufferReference newSrcBuffer, NotificationChain msgs)
	{
		IBufferReference oldSrcBuffer = srcBuffer;
		srcBuffer = newSrcBuffer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER, oldSrcBuffer, newSrcBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcBuffer(IBufferReference newSrcBuffer)
	{
		if (newSrcBuffer != srcBuffer)
		{
			NotificationChain msgs = null;
			if (srcBuffer != null)
				msgs = ((InternalEObject)srcBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER, null, msgs);
			if (newSrcBuffer != null)
				msgs = ((InternalEObject)newSrcBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER, null, msgs);
			msgs = basicSetSrcBuffer(newSrcBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER, newSrcBuffer, newSrcBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IBufferReference getDstBuffer()
	{
		return dstBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDstBuffer(IBufferReference newDstBuffer, NotificationChain msgs)
	{
		IBufferReference oldDstBuffer = dstBuffer;
		dstBuffer = newDstBuffer;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER, oldDstBuffer, newDstBuffer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDstBuffer(IBufferReference newDstBuffer)
	{
		if (newDstBuffer != dstBuffer)
		{
			NotificationChain msgs = null;
			if (dstBuffer != null)
				msgs = ((InternalEObject)dstBuffer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER, null, msgs);
			if (newDstBuffer != null)
				msgs = ((InternalEObject)newDstBuffer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER, null, msgs);
			msgs = basicSetDstBuffer(newDstBuffer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER, newDstBuffer, newDstBuffer));
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
			case ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER:
				return basicSetSrcBuffer(null, msgs);
			case ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER:
				return basicSetDstBuffer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ECommandStage getStage()
	{
		return stage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStage(ECommandStage newStage)
	{
		ECommandStage oldStage = stage;
		stage = newStage == null ? STAGE_EDEFAULT : newStage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getSize()
	{
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSize(long newSize)
	{
		long oldSize = size;
		size = newSize;
		boolean oldSizeESet = sizeESet;
		sizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.COPY_BUFFER_TASK__SIZE, oldSize, size, !oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetSize()
	{
		long oldSize = size;
		boolean oldSizeESet = sizeESet;
		size = SIZE_EDEFAULT;
		sizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ProcessPackage.COPY_BUFFER_TASK__SIZE, oldSize, SIZE_EDEFAULT, oldSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetSize()
	{
		return sizeESet;
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
			case ProcessPackage.COPY_BUFFER_TASK__NAME:
				return getName();
			case ProcessPackage.COPY_BUFFER_TASK__ENABLED:
				return isEnabled();
			case ProcessPackage.COPY_BUFFER_TASK__STAGE:
				return getStage();
			case ProcessPackage.COPY_BUFFER_TASK__SIZE:
				return getSize();
			case ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER:
				return getSrcBuffer();
			case ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER:
				return getDstBuffer();
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
			case ProcessPackage.COPY_BUFFER_TASK__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__STAGE:
				setStage((ECommandStage)newValue);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__SIZE:
				setSize((Long)newValue);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER:
				setSrcBuffer((IBufferReference)newValue);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER:
				setDstBuffer((IBufferReference)newValue);
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
			case ProcessPackage.COPY_BUFFER_TASK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__STAGE:
				setStage(STAGE_EDEFAULT);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__SIZE:
				unsetSize();
				return;
			case ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER:
				setSrcBuffer((IBufferReference)null);
				return;
			case ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER:
				setDstBuffer((IBufferReference)null);
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
			case ProcessPackage.COPY_BUFFER_TASK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.COPY_BUFFER_TASK__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ProcessPackage.COPY_BUFFER_TASK__STAGE:
				return stage != STAGE_EDEFAULT;
			case ProcessPackage.COPY_BUFFER_TASK__SIZE:
				return isSetSize();
			case ProcessPackage.COPY_BUFFER_TASK__SRC_BUFFER:
				return srcBuffer != null;
			case ProcessPackage.COPY_BUFFER_TASK__DST_BUFFER:
				return dstBuffer != null;
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
		result.append(", enabled: ");
		result.append(enabled);
		result.append(", stage: ");
		result.append(stage);
		result.append(", size: ");
		if (sizeESet) result.append(size); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CopyBufferTaskImpl
