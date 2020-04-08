/**
 */
package org.sheepy.lily.vulkan.model.process;

import org.sheepy.lily.core.model.types.LNamedElement;

import org.sheepy.vulkan.model.enumeration.ECommandStage;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractPipeline#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractPipeline#getStage <em>Stage</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractPipeline()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPipeline extends LNamedElement
{
	/**
	 * Returns the value of the '<em><b>Enabled</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enabled</em>' attribute.
	 * @see #setEnabled(boolean)
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractPipeline_Enabled()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isEnabled();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.AbstractPipeline#isEnabled <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enabled</em>' attribute.
	 * @see #isEnabled()
	 * @generated
	 */
	void setEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Stage</b></em>' attribute.
	 * The default value is <code>"Render"</code>.
	 * The literals are from the enumeration {@link org.sheepy.vulkan.model.enumeration.ECommandStage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stage</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.ECommandStage
	 * @see #setStage(ECommandStage)
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractPipeline_Stage()
	 * @model default="Render" unique="false"
	 * @generated
	 */
	ECommandStage getStage();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.AbstractPipeline#getStage <em>Stage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stage</em>' attribute.
	 * @see org.sheepy.vulkan.model.enumeration.ECommandStage
	 * @see #getStage()
	 * @generated
	 */
	void setStage(ECommandStage value);

} // AbstractPipeline