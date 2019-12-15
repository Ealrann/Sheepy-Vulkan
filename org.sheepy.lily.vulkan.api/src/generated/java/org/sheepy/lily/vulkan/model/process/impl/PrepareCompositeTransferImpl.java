/**
 */
package org.sheepy.lily.vulkan.model.process.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.sheepy.lily.core.api.adapter.LilyEObject;
import org.sheepy.lily.vulkan.model.process.PrepareCompositeTransfer;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;

import org.sheepy.lily.vulkan.model.resource.CompositeBuffer;
import org.sheepy.lily.vulkan.model.resource.EFlushMode;
import org.sheepy.vulkan.model.enumeration.ECommandStage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prepare Composite Transfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#getCompositeBuffer <em>Composite Buffer</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#isPrepareDuringUpdate <em>Prepare During Update</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#getStage <em>Stage</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.impl.PrepareCompositeTransferImpl#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrepareCompositeTransferImpl extends LilyEObject implements PrepareCompositeTransfer
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
	 * The cached value of the '{@link #getCompositeBuffer() <em>Composite Buffer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeBuffer()
	 * @generated
	 * @ordered
	 */
	protected CompositeBuffer compositeBuffer;

	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final EFlushMode MODE_EDEFAULT = EFlushMode.PUSH;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected EFlushMode mode = MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #isPrepareDuringUpdate() <em>Prepare During Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrepareDuringUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PREPARE_DURING_UPDATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrepareDuringUpdate() <em>Prepare During Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrepareDuringUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean prepareDuringUpdate = PREPARE_DURING_UPDATE_EDEFAULT;

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
	 * The cached value of the '{@link #getParts() <em>Parts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParts()
	 * @generated
	 * @ordered
	 */
	protected EList<org.sheepy.lily.vulkan.model.resource.CompositePartReference> parts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrepareCompositeTransferImpl()
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
		return ProcessPackage.Literals.PREPARE_COMPOSITE_TRANSFER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeBuffer getCompositeBuffer()
	{
		if (compositeBuffer != null && ((EObject)compositeBuffer).eIsProxy())
		{
			InternalEObject oldCompositeBuffer = (InternalEObject)compositeBuffer;
			compositeBuffer = (CompositeBuffer)eResolveProxy(oldCompositeBuffer);
			if (compositeBuffer != oldCompositeBuffer)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER, oldCompositeBuffer, compositeBuffer));
			}
		}
		return compositeBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeBuffer basicGetCompositeBuffer()
	{
		return compositeBuffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCompositeBuffer(CompositeBuffer newCompositeBuffer)
	{
		CompositeBuffer oldCompositeBuffer = compositeBuffer;
		compositeBuffer = newCompositeBuffer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER, oldCompositeBuffer, compositeBuffer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFlushMode getMode()
	{
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMode(EFlushMode newMode)
	{
		EFlushMode oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPrepareDuringUpdate()
	{
		return prepareDuringUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrepareDuringUpdate(boolean newPrepareDuringUpdate)
	{
		boolean oldPrepareDuringUpdate = prepareDuringUpdate;
		prepareDuringUpdate = newPrepareDuringUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PREPARE_DURING_UPDATE, oldPrepareDuringUpdate, prepareDuringUpdate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__STAGE, oldStage, stage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<org.sheepy.lily.vulkan.model.resource.CompositePartReference> getParts()
	{
		if (parts == null)
		{
			parts = new EObjectContainmentEList<org.sheepy.lily.vulkan.model.resource.CompositePartReference>(org.sheepy.lily.vulkan.model.resource.CompositePartReference.class, this, ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS);
		}
		return parts;
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
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS:
				return ((InternalEList<?>)getParts()).basicRemove(otherEnd, msgs);
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
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__NAME:
				return getName();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__ENABLED:
				return isEnabled();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER:
				if (resolve) return getCompositeBuffer();
				return basicGetCompositeBuffer();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__MODE:
				return getMode();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PREPARE_DURING_UPDATE:
				return isPrepareDuringUpdate();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__STAGE:
				return getStage();
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS:
				return getParts();
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
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__NAME:
				setName((String)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER:
				setCompositeBuffer((CompositeBuffer)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__MODE:
				setMode((EFlushMode)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PREPARE_DURING_UPDATE:
				setPrepareDuringUpdate((Boolean)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__STAGE:
				setStage((ECommandStage)newValue);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS:
				getParts().clear();
				getParts().addAll((Collection<? extends org.sheepy.lily.vulkan.model.resource.CompositePartReference>)newValue);
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
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER:
				setCompositeBuffer((CompositeBuffer)null);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PREPARE_DURING_UPDATE:
				setPrepareDuringUpdate(PREPARE_DURING_UPDATE_EDEFAULT);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__STAGE:
				setStage(STAGE_EDEFAULT);
				return;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS:
				getParts().clear();
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
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__COMPOSITE_BUFFER:
				return compositeBuffer != null;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__MODE:
				return mode != MODE_EDEFAULT;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PREPARE_DURING_UPDATE:
				return prepareDuringUpdate != PREPARE_DURING_UPDATE_EDEFAULT;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__STAGE:
				return stage != STAGE_EDEFAULT;
			case ProcessPackage.PREPARE_COMPOSITE_TRANSFER__PARTS:
				return parts != null && !parts.isEmpty();
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
		result.append(", mode: ");
		result.append(mode);
		result.append(", prepareDuringUpdate: ");
		result.append(prepareDuringUpdate);
		result.append(", stage: ");
		result.append(stage);
		result.append(')');
		return result.toString();
	}

} //PrepareCompositeTransferImpl
