/**
 */
package org.sheepy.vulkan.model.process.graphic.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;

import org.sheepy.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.vulkan.model.process.graphic.SubpassDependency;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subpass Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getSrcSubpass <em>Src Subpass</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getDstSubpass <em>Dst Subpass</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getSrcStageMask <em>Src Stage Mask</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getDstStageMask <em>Dst Stage Mask</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getSrcAccesses <em>Src Accesses</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.process.graphic.impl.SubpassDependencyImpl#getDstAccesses <em>Dst Accesses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubpassDependencyImpl extends MinimalEObjectImpl.Container implements SubpassDependency
{
	/**
	 * The default value of the '{@link #getSrcSubpass() <em>Src Subpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcSubpass()
	 * @generated
	 * @ordered
	 */
	protected static final int SRC_SUBPASS_EDEFAULT = -1;

	/**
	 * The cached value of the '{@link #getSrcSubpass() <em>Src Subpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcSubpass()
	 * @generated
	 * @ordered
	 */
	protected int srcSubpass = SRC_SUBPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDstSubpass() <em>Dst Subpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstSubpass()
	 * @generated
	 * @ordered
	 */
	protected static final int DST_SUBPASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDstSubpass() <em>Dst Subpass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstSubpass()
	 * @generated
	 * @ordered
	 */
	protected int dstSubpass = DST_SUBPASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcStageMask() <em>Src Stage Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcStageMask()
	 * @generated
	 * @ordered
	 */
	protected static final EPipelineStage SRC_STAGE_MASK_EDEFAULT = EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT;

	/**
	 * The cached value of the '{@link #getSrcStageMask() <em>Src Stage Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcStageMask()
	 * @generated
	 * @ordered
	 */
	protected EPipelineStage srcStageMask = SRC_STAGE_MASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDstStageMask() <em>Dst Stage Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstStageMask()
	 * @generated
	 * @ordered
	 */
	protected static final EPipelineStage DST_STAGE_MASK_EDEFAULT = EPipelineStage.COLOR_ATTACHMENT_OUTPUT_BIT;

	/**
	 * The cached value of the '{@link #getDstStageMask() <em>Dst Stage Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstStageMask()
	 * @generated
	 * @ordered
	 */
	protected EPipelineStage dstStageMask = DST_STAGE_MASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSrcAccesses() <em>Src Accesses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<EAccess> srcAccesses;

	/**
	 * The cached value of the '{@link #getDstAccesses() <em>Dst Accesses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDstAccesses()
	 * @generated
	 * @ordered
	 */
	protected EList<EAccess> dstAccesses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubpassDependencyImpl()
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
		return GraphicPackage.Literals.SUBPASS_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getSrcSubpass()
	{
		return srcSubpass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcSubpass(int newSrcSubpass)
	{
		int oldSrcSubpass = srcSubpass;
		srcSubpass = newSrcSubpass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.SUBPASS_DEPENDENCY__SRC_SUBPASS, oldSrcSubpass, srcSubpass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDstSubpass()
	{
		return dstSubpass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDstSubpass(int newDstSubpass)
	{
		int oldDstSubpass = dstSubpass;
		dstSubpass = newDstSubpass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.SUBPASS_DEPENDENCY__DST_SUBPASS, oldDstSubpass, dstSubpass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPipelineStage getSrcStageMask()
	{
		return srcStageMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSrcStageMask(EPipelineStage newSrcStageMask)
	{
		EPipelineStage oldSrcStageMask = srcStageMask;
		srcStageMask = newSrcStageMask == null ? SRC_STAGE_MASK_EDEFAULT : newSrcStageMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.SUBPASS_DEPENDENCY__SRC_STAGE_MASK, oldSrcStageMask, srcStageMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EPipelineStage getDstStageMask()
	{
		return dstStageMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDstStageMask(EPipelineStage newDstStageMask)
	{
		EPipelineStage oldDstStageMask = dstStageMask;
		dstStageMask = newDstStageMask == null ? DST_STAGE_MASK_EDEFAULT : newDstStageMask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GraphicPackage.SUBPASS_DEPENDENCY__DST_STAGE_MASK, oldDstStageMask, dstStageMask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAccess> getSrcAccesses()
	{
		if (srcAccesses == null)
		{
			srcAccesses = new EDataTypeEList<EAccess>(EAccess.class, this, GraphicPackage.SUBPASS_DEPENDENCY__SRC_ACCESSES);
		}
		return srcAccesses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EAccess> getDstAccesses()
	{
		if (dstAccesses == null)
		{
			dstAccesses = new EDataTypeEList<EAccess>(EAccess.class, this, GraphicPackage.SUBPASS_DEPENDENCY__DST_ACCESSES);
		}
		return dstAccesses;
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
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_SUBPASS:
				return getSrcSubpass();
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_SUBPASS:
				return getDstSubpass();
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_STAGE_MASK:
				return getSrcStageMask();
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_STAGE_MASK:
				return getDstStageMask();
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_ACCESSES:
				return getSrcAccesses();
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_ACCESSES:
				return getDstAccesses();
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
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_SUBPASS:
				setSrcSubpass((Integer)newValue);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_SUBPASS:
				setDstSubpass((Integer)newValue);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_STAGE_MASK:
				setSrcStageMask((EPipelineStage)newValue);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_STAGE_MASK:
				setDstStageMask((EPipelineStage)newValue);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_ACCESSES:
				getSrcAccesses().clear();
				getSrcAccesses().addAll((Collection<? extends EAccess>)newValue);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_ACCESSES:
				getDstAccesses().clear();
				getDstAccesses().addAll((Collection<? extends EAccess>)newValue);
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
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_SUBPASS:
				setSrcSubpass(SRC_SUBPASS_EDEFAULT);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_SUBPASS:
				setDstSubpass(DST_SUBPASS_EDEFAULT);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_STAGE_MASK:
				setSrcStageMask(SRC_STAGE_MASK_EDEFAULT);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_STAGE_MASK:
				setDstStageMask(DST_STAGE_MASK_EDEFAULT);
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_ACCESSES:
				getSrcAccesses().clear();
				return;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_ACCESSES:
				getDstAccesses().clear();
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
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_SUBPASS:
				return srcSubpass != SRC_SUBPASS_EDEFAULT;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_SUBPASS:
				return dstSubpass != DST_SUBPASS_EDEFAULT;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_STAGE_MASK:
				return srcStageMask != SRC_STAGE_MASK_EDEFAULT;
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_STAGE_MASK:
				return dstStageMask != DST_STAGE_MASK_EDEFAULT;
			case GraphicPackage.SUBPASS_DEPENDENCY__SRC_ACCESSES:
				return srcAccesses != null && !srcAccesses.isEmpty();
			case GraphicPackage.SUBPASS_DEPENDENCY__DST_ACCESSES:
				return dstAccesses != null && !dstAccesses.isEmpty();
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
		result.append(" (srcSubpass: ");
		result.append(srcSubpass);
		result.append(", dstSubpass: ");
		result.append(dstSubpass);
		result.append(", srcStageMask: ");
		result.append(srcStageMask);
		result.append(", dstStageMask: ");
		result.append(dstStageMask);
		result.append(", srcAccesses: ");
		result.append(srcAccesses);
		result.append(", dstAccesses: ");
		result.append(dstAccesses);
		result.append(')');
		return result.toString();
	}

} //SubpassDependencyImpl
