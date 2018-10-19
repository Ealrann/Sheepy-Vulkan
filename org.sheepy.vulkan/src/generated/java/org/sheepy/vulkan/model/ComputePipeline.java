/**
 */
package org.sheepy.vulkan.model;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compute Pipeline</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getComputers <em>Computers</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeX <em>Workgroup Size X</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeY <em>Workgroup Size Y</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeZ <em>Workgroup Size Z</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getWidth <em>Width</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getHeight <em>Height</em>}</li>
 *   <li>{@link org.sheepy.vulkan.model.ComputePipeline#getDepth <em>Depth</em>}</li>
 * </ul>
 *
 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline()
 * @model
 * @generated
 */
public interface ComputePipeline extends AbstractPipeline
{

	/**
	 * Returns the value of the '<em><b>Computers</b></em>' containment reference list.
	 * The list contents are of type {@link org.sheepy.vulkan.model.Computer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Computers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Computers</em>' containment reference list.
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_Computers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Computer> getComputers();

	/**
	 * Returns the value of the '<em><b>Workgroup Size X</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workgroup Size X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workgroup Size X</em>' attribute.
	 * @see #setWorkgroupSizeX(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_WorkgroupSizeX()
	 * @model default="32" unique="false"
	 * @generated
	 */
	int getWorkgroupSizeX();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeX <em>Workgroup Size X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workgroup Size X</em>' attribute.
	 * @see #getWorkgroupSizeX()
	 * @generated
	 */
	void setWorkgroupSizeX(int value);

	/**
	 * Returns the value of the '<em><b>Workgroup Size Y</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workgroup Size Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workgroup Size Y</em>' attribute.
	 * @see #setWorkgroupSizeY(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_WorkgroupSizeY()
	 * @model default="32" unique="false"
	 * @generated
	 */
	int getWorkgroupSizeY();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeY <em>Workgroup Size Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workgroup Size Y</em>' attribute.
	 * @see #getWorkgroupSizeY()
	 * @generated
	 */
	void setWorkgroupSizeY(int value);

	/**
	 * Returns the value of the '<em><b>Workgroup Size Z</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workgroup Size Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workgroup Size Z</em>' attribute.
	 * @see #setWorkgroupSizeZ(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_WorkgroupSizeZ()
	 * @model default="32" unique="false"
	 * @generated
	 */
	int getWorkgroupSizeZ();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getWorkgroupSizeZ <em>Workgroup Size Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workgroup Size Z</em>' attribute.
	 * @see #getWorkgroupSizeZ()
	 * @generated
	 */
	void setWorkgroupSizeZ(int value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_Width()
	 * @model unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_Height()
	 * @model unique="false"
	 * @generated
	 */
	int getHeight();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(int value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see org.sheepy.vulkan.model.VulkanPackage#getComputePipeline_Depth()
	 * @model unique="false"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.ComputePipeline#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);
} // ComputePipeline