/**
 */
package org.sheepy.lily.vulkan.model.vulkanresource;

import org.eclipse.emf.common.util.EList;

import org.sheepy.lily.core.model.types.LNamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Buffer Memory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.vulkanresource.BufferMemory#getBuffers <em>Buffers</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.model.vulkanresource.VulkanResourcePackage#getBufferMemory()
 * @model
 * @generated
 */
public interface BufferMemory extends IMemoryChunkPart, LNamedElement
{
	/**
	 * Returns the value of the '<em><b>Buffers</b></em>' containment reference list.
	 * The list contents are of type {@link org.sheepy.lily.vulkan.model.vulkanresource.IBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Buffers</em>' containment reference list.
	 * @see org.sheepy.lily.vulkan.model.vulkanresource.VulkanResourcePackage#getBufferMemory_Buffers()
	 * @model containment="true"
	 * @generated
	 */
	EList<IBuffer> getBuffers();

} // BufferMemory
