/**
 */
package org.sheepy.lily.vulkan.model.process.graphic;

import org.eclipse.emf.ecore.EObject;
import org.sheepy.lily.core.api.types.SVector2i;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scissor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.graphic.Scissor#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.graphic.Scissor#getExtent <em>Extent</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage#getScissor()
 * @model
 * @generated
 */
public interface Scissor extends EObject
{
	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0, 0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(SVector2i)
	 * @see org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage#getScissor_Offset()
	 * @model default="0, 0" unique="false" dataType="org.sheepy.lily.core.model.types.SVector2i"
	 * @generated
	 */
	SVector2i getOffset();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.graphic.Scissor#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(SVector2i value);

	/**
	 * Returns the value of the '<em><b>Extent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extent</em>' attribute.
	 * @see #setExtent(SVector2i)
	 * @see org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage#getScissor_Extent()
	 * @model unique="false" dataType="org.sheepy.lily.core.model.types.SVector2i"
	 * @generated
	 */
	SVector2i getExtent();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.graphic.Scissor#getExtent <em>Extent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extent</em>' attribute.
	 * @see #getExtent()
	 * @generated
	 */
	void setExtent(SVector2i value);

} // Scissor