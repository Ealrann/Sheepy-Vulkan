/**
 */
package org.sheepy.lily.vulkan.extra.model.rendering;

import org.eclipse.emf.common.util.EList;

import org.sheepy.lily.core.api.model.ILilyEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Descriptor Provider Pkg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.extra.model.rendering.ResourceDescriptorProviderPkg#getResourceDescriptorProviders <em>Resource Descriptor Providers</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.extra.model.rendering.RenderingPackage#getResourceDescriptorProviderPkg()
 * @model
 * @extends ILilyEObject
 * @generated
 */
public interface ResourceDescriptorProviderPkg extends ILilyEObject
{
	/**
	 * Returns the value of the '<em><b>Resource Descriptor Providers</b></em>' containment reference list.
	 * The list contents are of type {@link org.sheepy.lily.vulkan.extra.model.rendering.ResourceDescriptorProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Descriptor Providers</em>' containment reference list.
	 * @see org.sheepy.lily.vulkan.extra.model.rendering.RenderingPackage#getResourceDescriptorProviderPkg_ResourceDescriptorProviders()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceDescriptorProvider> getResourceDescriptorProviders();

} // ResourceDescriptorProviderPkg
