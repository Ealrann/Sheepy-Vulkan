/**
 */
package org.sheepy.lily.vulkan.model.vulkanresource.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sheepy.lily.core.api.model.LilyEObject;

import org.sheepy.lily.vulkan.model.vulkanresource.CompositeImage;
import org.sheepy.lily.vulkan.model.vulkanresource.IVulkanImage;
import org.sheepy.lily.vulkan.model.vulkanresource.ImageInlay;
import org.sheepy.lily.vulkan.model.vulkanresource.VulkanResourcePackage;

import org.sheepy.vulkan.model.enumeration.EFormat;
import org.sheepy.vulkan.model.enumeration.EImageLayout;
import org.sheepy.vulkan.model.enumeration.EImageUsage;

import org.sheepy.vulkan.model.image.ImageInfo;
import org.sheepy.vulkan.model.image.ImagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getUsages <em>Usages</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getTiling <em>Tiling</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getMipLevels <em>Mip Levels</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getInitialLayout <em>Initial Layout</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getInlays <em>Inlays</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.impl.CompositeImageImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeImageImpl extends LilyEObject implements CompositeImage
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
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final EFormat FORMAT_EDEFAULT = EFormat.R8G8B8A8_UNORM;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected EFormat format = FORMAT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsages() <em>Usages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsages()
	 * @generated
	 * @ordered
	 */
	protected EList<EImageUsage> usages;

	/**
	 * The default value of the '{@link #getTiling() <em>Tiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiling()
	 * @generated
	 * @ordered
	 */
	protected static final int TILING_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTiling() <em>Tiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiling()
	 * @generated
	 * @ordered
	 */
	protected int tiling = TILING_EDEFAULT;

	/**
	 * The default value of the '{@link #getMipLevels() <em>Mip Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipLevels()
	 * @generated
	 * @ordered
	 */
	protected static final int MIP_LEVELS_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getMipLevels() <em>Mip Levels</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMipLevels()
	 * @generated
	 * @ordered
	 */
	protected int mipLevels = MIP_LEVELS_EDEFAULT;

	/**
	 * The default value of the '{@link #getInitialLayout() <em>Initial Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLayout()
	 * @generated
	 * @ordered
	 */
	protected static final EImageLayout INITIAL_LAYOUT_EDEFAULT = EImageLayout.SHADER_READ_ONLY_OPTIMAL;

	/**
	 * The cached value of the '{@link #getInitialLayout() <em>Initial Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialLayout()
	 * @generated
	 * @ordered
	 */
	protected EImageLayout initialLayout = INITIAL_LAYOUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInlays() <em>Inlays</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInlays()
	 * @generated
	 * @ordered
	 */
	protected EList<ImageInlay> inlays;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected IVulkanImage background;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImageImpl()
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
		return VulkanResourcePackage.Literals.COMPOSITE_IMAGE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EFormat getFormat()
	{
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(EFormat newFormat)
	{
		EFormat oldFormat = format;
		format = newFormat == null ? FORMAT_EDEFAULT : newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EImageUsage> getUsages()
	{
		if (usages == null)
		{
			usages = new EDataTypeUniqueEList<EImageUsage>(EImageUsage.class, this, VulkanResourcePackage.COMPOSITE_IMAGE__USAGES);
		}
		return usages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTiling()
	{
		return tiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTiling(int newTiling)
	{
		int oldTiling = tiling;
		tiling = newTiling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__TILING, oldTiling, tiling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMipLevels()
	{
		return mipLevels;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMipLevels(int newMipLevels)
	{
		int oldMipLevels = mipLevels;
		mipLevels = newMipLevels;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS, oldMipLevels, mipLevels));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EImageLayout getInitialLayout()
	{
		return initialLayout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialLayout(EImageLayout newInitialLayout)
	{
		EImageLayout oldInitialLayout = initialLayout;
		initialLayout = newInitialLayout == null ? INITIAL_LAYOUT_EDEFAULT : newInitialLayout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT, oldInitialLayout, initialLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ImageInlay> getInlays()
	{
		if (inlays == null)
		{
			inlays = new EObjectContainmentEList<ImageInlay>(ImageInlay.class, this, VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS);
		}
		return inlays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IVulkanImage getBackground()
	{
		if (background != null && ((EObject)background).eIsProxy())
		{
			InternalEObject oldBackground = (InternalEObject)background;
			background = (IVulkanImage)eResolveProxy(oldBackground);
			if (background != oldBackground)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND, oldBackground, background));
			}
		}
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVulkanImage basicGetBackground()
	{
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackground(IVulkanImage newBackground)
	{
		IVulkanImage oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND, oldBackground, background));
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
			case VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS:
				return ((InternalEList<?>)getInlays()).basicRemove(otherEnd, msgs);
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
			case VulkanResourcePackage.COMPOSITE_IMAGE__NAME:
				return getName();
			case VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT:
				return getFormat();
			case VulkanResourcePackage.COMPOSITE_IMAGE__USAGES:
				return getUsages();
			case VulkanResourcePackage.COMPOSITE_IMAGE__TILING:
				return getTiling();
			case VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS:
				return getMipLevels();
			case VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT:
				return getInitialLayout();
			case VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS:
				return getInlays();
			case VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND:
				if (resolve) return getBackground();
				return basicGetBackground();
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
			case VulkanResourcePackage.COMPOSITE_IMAGE__NAME:
				setName((String)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT:
				setFormat((EFormat)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__USAGES:
				getUsages().clear();
				getUsages().addAll((Collection<? extends EImageUsage>)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__TILING:
				setTiling((Integer)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS:
				setMipLevels((Integer)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT:
				setInitialLayout((EImageLayout)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS:
				getInlays().clear();
				getInlays().addAll((Collection<? extends ImageInlay>)newValue);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND:
				setBackground((IVulkanImage)newValue);
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
			case VulkanResourcePackage.COMPOSITE_IMAGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__USAGES:
				getUsages().clear();
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__TILING:
				setTiling(TILING_EDEFAULT);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS:
				setMipLevels(MIP_LEVELS_EDEFAULT);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT:
				setInitialLayout(INITIAL_LAYOUT_EDEFAULT);
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS:
				getInlays().clear();
				return;
			case VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND:
				setBackground((IVulkanImage)null);
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
			case VulkanResourcePackage.COMPOSITE_IMAGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT:
				return format != FORMAT_EDEFAULT;
			case VulkanResourcePackage.COMPOSITE_IMAGE__USAGES:
				return usages != null && !usages.isEmpty();
			case VulkanResourcePackage.COMPOSITE_IMAGE__TILING:
				return tiling != TILING_EDEFAULT;
			case VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS:
				return mipLevels != MIP_LEVELS_EDEFAULT;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT:
				return initialLayout != INITIAL_LAYOUT_EDEFAULT;
			case VulkanResourcePackage.COMPOSITE_IMAGE__INLAYS:
				return inlays != null && !inlays.isEmpty();
			case VulkanResourcePackage.COMPOSITE_IMAGE__BACKGROUND:
				return background != null;
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
		if (baseClass == ImageInfo.class)
		{
			switch (derivedFeatureID)
			{
				case VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT: return ImagePackage.IMAGE_INFO__FORMAT;
				case VulkanResourcePackage.COMPOSITE_IMAGE__USAGES: return ImagePackage.IMAGE_INFO__USAGES;
				case VulkanResourcePackage.COMPOSITE_IMAGE__TILING: return ImagePackage.IMAGE_INFO__TILING;
				case VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS: return ImagePackage.IMAGE_INFO__MIP_LEVELS;
				case VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT: return ImagePackage.IMAGE_INFO__INITIAL_LAYOUT;
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
		if (baseClass == ImageInfo.class)
		{
			switch (baseFeatureID)
			{
				case ImagePackage.IMAGE_INFO__FORMAT: return VulkanResourcePackage.COMPOSITE_IMAGE__FORMAT;
				case ImagePackage.IMAGE_INFO__USAGES: return VulkanResourcePackage.COMPOSITE_IMAGE__USAGES;
				case ImagePackage.IMAGE_INFO__TILING: return VulkanResourcePackage.COMPOSITE_IMAGE__TILING;
				case ImagePackage.IMAGE_INFO__MIP_LEVELS: return VulkanResourcePackage.COMPOSITE_IMAGE__MIP_LEVELS;
				case ImagePackage.IMAGE_INFO__INITIAL_LAYOUT: return VulkanResourcePackage.COMPOSITE_IMAGE__INITIAL_LAYOUT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", format: ");
		result.append(format);
		result.append(", usages: ");
		result.append(usages);
		result.append(", tiling: ");
		result.append(tiling);
		result.append(", mipLevels: ");
		result.append(mipLevels);
		result.append(", initialLayout: ");
		result.append(initialLayout);
		result.append(')');
		return result.toString();
	}

} //CompositeImageImpl
