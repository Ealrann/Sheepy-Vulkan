/**
 */
package org.sheepy.vulkan.model.resource;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.vulkan.model.resource.ResourceContainer#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.sheepy.vulkan.model.resource.ResourcePackage#getResourceContainer()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ResourceContainer extends EObject
{
	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.sheepy.vulkan.model.resource.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.sheepy.vulkan.model.resource.ResourcePackage#getResourceContainer_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // ResourceContainer
