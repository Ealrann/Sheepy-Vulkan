/**
 */
package org.sheepy.lily.vulkan.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sheepy.lily.core.api.model.LilyEObject;
import org.sheepy.lily.vulkan.model.DescriptorPkg;
import org.sheepy.lily.vulkan.model.IProcess;
import org.sheepy.lily.vulkan.model.IResourceContainer;
import org.sheepy.lily.vulkan.model.VulkanEngine;
import org.sheepy.lily.vulkan.model.VulkanPackage;

import org.sheepy.lily.vulkan.model.VulkanResourcePkg;
import org.sheepy.vulkan.model.enumeration.EPhysicalDeviceFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Engine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl#getResourcePkg <em>Resource Pkg</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl#getDescriptorPkg <em>Descriptor Pkg</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl#getProcesses <em>Processes</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.impl.VulkanEngineImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VulkanEngineImpl extends LilyEObject implements VulkanEngine
{
	/**
	 * The cached value of the '{@link #getResourcePkg() <em>Resource Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePkg()
	 * @generated
	 * @ordered
	 */
	protected VulkanResourcePkg resourcePkg;

	/**
	 * The cached value of the '{@link #getDescriptorPkg() <em>Descriptor Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptorPkg()
	 * @generated
	 * @ordered
	 */
	protected DescriptorPkg descriptorPkg;

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
	 * The cached value of the '{@link #getProcesses() <em>Processes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcesses()
	 * @generated
	 * @ordered
	 */
	protected EList<IProcess> processes;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<EPhysicalDeviceFeature> features;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VulkanEngineImpl()
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
		return VulkanPackage.Literals.VULKAN_ENGINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulkanResourcePkg getResourcePkg()
	{
		return resourcePkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourcePkg(VulkanResourcePkg newResourcePkg, NotificationChain msgs)
	{
		VulkanResourcePkg oldResourcePkg = resourcePkg;
		resourcePkg = newResourcePkg;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG, oldResourcePkg, newResourcePkg);
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
	public void setResourcePkg(VulkanResourcePkg newResourcePkg)
	{
		if (newResourcePkg != resourcePkg)
		{
			NotificationChain msgs = null;
			if (resourcePkg != null)
				msgs = ((InternalEObject)resourcePkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG, null, msgs);
			if (newResourcePkg != null)
				msgs = ((InternalEObject)newResourcePkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG, null, msgs);
			msgs = basicSetResourcePkg(newResourcePkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG, newResourcePkg, newResourcePkg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DescriptorPkg getDescriptorPkg()
	{
		return descriptorPkg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescriptorPkg(DescriptorPkg newDescriptorPkg, NotificationChain msgs)
	{
		DescriptorPkg oldDescriptorPkg = descriptorPkg;
		descriptorPkg = newDescriptorPkg;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG, oldDescriptorPkg, newDescriptorPkg);
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
	public void setDescriptorPkg(DescriptorPkg newDescriptorPkg)
	{
		if (newDescriptorPkg != descriptorPkg)
		{
			NotificationChain msgs = null;
			if (descriptorPkg != null)
				msgs = ((InternalEObject)descriptorPkg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG, null, msgs);
			if (newDescriptorPkg != null)
				msgs = ((InternalEObject)newDescriptorPkg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG, null, msgs);
			msgs = basicSetDescriptorPkg(newDescriptorPkg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG, newDescriptorPkg, newDescriptorPkg));
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
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanPackage.VULKAN_ENGINE__ENABLED, oldEnabled, enabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IProcess> getProcesses()
	{
		if (processes == null)
		{
			processes = new EObjectContainmentEList<IProcess>(IProcess.class, this, VulkanPackage.VULKAN_ENGINE__PROCESSES);
		}
		return processes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EPhysicalDeviceFeature> getFeatures()
	{
		if (features == null)
		{
			features = new EDataTypeUniqueEList<EPhysicalDeviceFeature>(EPhysicalDeviceFeature.class, this, VulkanPackage.VULKAN_ENGINE__FEATURES);
		}
		return features;
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
			case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG:
				return basicSetResourcePkg(null, msgs);
			case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG:
				return basicSetDescriptorPkg(null, msgs);
			case VulkanPackage.VULKAN_ENGINE__PROCESSES:
				return ((InternalEList<?>)getProcesses()).basicRemove(otherEnd, msgs);
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
			case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG:
				return getResourcePkg();
			case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG:
				return getDescriptorPkg();
			case VulkanPackage.VULKAN_ENGINE__ENABLED:
				return isEnabled();
			case VulkanPackage.VULKAN_ENGINE__PROCESSES:
				return getProcesses();
			case VulkanPackage.VULKAN_ENGINE__FEATURES:
				return getFeatures();
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
			case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG:
				setResourcePkg((VulkanResourcePkg)newValue);
				return;
			case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG:
				setDescriptorPkg((DescriptorPkg)newValue);
				return;
			case VulkanPackage.VULKAN_ENGINE__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case VulkanPackage.VULKAN_ENGINE__PROCESSES:
				getProcesses().clear();
				getProcesses().addAll((Collection<? extends IProcess>)newValue);
				return;
			case VulkanPackage.VULKAN_ENGINE__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends EPhysicalDeviceFeature>)newValue);
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
			case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG:
				setResourcePkg((VulkanResourcePkg)null);
				return;
			case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG:
				setDescriptorPkg((DescriptorPkg)null);
				return;
			case VulkanPackage.VULKAN_ENGINE__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case VulkanPackage.VULKAN_ENGINE__PROCESSES:
				getProcesses().clear();
				return;
			case VulkanPackage.VULKAN_ENGINE__FEATURES:
				getFeatures().clear();
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
			case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG:
				return resourcePkg != null;
			case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG:
				return descriptorPkg != null;
			case VulkanPackage.VULKAN_ENGINE__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case VulkanPackage.VULKAN_ENGINE__PROCESSES:
				return processes != null && !processes.isEmpty();
			case VulkanPackage.VULKAN_ENGINE__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == IResourceContainer.class)
		{
			switch (derivedFeatureID)
			{
				case VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG: return VulkanPackage.IRESOURCE_CONTAINER__RESOURCE_PKG;
				case VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG: return VulkanPackage.IRESOURCE_CONTAINER__DESCRIPTOR_PKG;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == IResourceContainer.class)
		{
			switch (baseFeatureID)
			{
				case VulkanPackage.IRESOURCE_CONTAINER__RESOURCE_PKG: return VulkanPackage.VULKAN_ENGINE__RESOURCE_PKG;
				case VulkanPackage.IRESOURCE_CONTAINER__DESCRIPTOR_PKG: return VulkanPackage.VULKAN_ENGINE__DESCRIPTOR_PKG;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", features: ");
		result.append(features);
		result.append(')');
		return result.toString();
	}

} //VulkanEngineImpl
