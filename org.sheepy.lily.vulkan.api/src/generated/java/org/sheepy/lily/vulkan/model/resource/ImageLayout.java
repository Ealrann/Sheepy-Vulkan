/**
 */
package org.sheepy.lily.vulkan.model.resource;

import org.eclipse.emf.common.util.EList;
import org.sheepy.lily.core.api.adapter.ILilyEObject;
import org.sheepy.vulkan.model.enumeration.EAccess;
import org.sheepy.vulkan.model.enumeration.EImageLayout;
import org.sheepy.vulkan.model.enumeration.EPipelineStage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Image Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.resource.ImageLayout#getStage <em>Stage</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.resource.ImageLayout#getLayout <em>Layout</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.resource.ImageLayout#getAccessMask <em>Access Mask</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.model.resource.ResourcePackage#getImageLayout()
 * @model
 * @extends ILilyEObject
 * @generated
 */
public interface ImageLayout extends ILilyEObject
{
	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.sheepy.vulkan.model.enumeration.EPipelineStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.EPipelineStage
	 * @see #setStage(EPipelineStage)
	 * @see org.sheepy.lily.vulkan.model.resource.ResourcePackage#getImageLayout_Stage()
	 * @model unique="false"
	 * @generated
	 */
	EPipelineStage getStage();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.resource.ImageLayout#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.EPipelineStage
	 * @see #getStage()
	 * @generated
	 */
	void setStage(EPipelineStage value);

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The default value is <code>"SHADER_READ_ONLY_OPTIMAL"</code>.
	 * The literals are from the enumeration {@link org.sheepy.vulkan.model.enumeration.EImageLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.EImageLayout
	 * @see #setLayout(EImageLayout)
	 * @see org.sheepy.lily.vulkan.model.resource.ResourcePackage#getImageLayout_Layout()
	 * @model default="SHADER_READ_ONLY_OPTIMAL" unique="false"
	 * @generated
	 */
	EImageLayout getLayout();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.resource.ImageLayout#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.EImageLayout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(EImageLayout value);

	/**
	 * Returns the value of the '<em><b>Access Mask</b></em>' attribute list.
	 * The list contents are of type {@link org.sheepy.vulkan.model.enumeration.EAccess}.
	 * The literals are from the enumeration {@link org.sheepy.vulkan.model.enumeration.EAccess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Access Mask</em>' attribute list.
	 * @see org.sheepy.vulkan.model.enumeration.EAccess
	 * @see org.sheepy.lily.vulkan.model.resource.ResourcePackage#getImageLayout_AccessMask()
	 * @model
	 * @generated
	 */
	EList<EAccess> getAccessMask();

} // ImageLayout
