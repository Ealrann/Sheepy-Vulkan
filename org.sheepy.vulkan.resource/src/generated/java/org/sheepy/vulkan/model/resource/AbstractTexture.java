/**
 */
package org.sheepy.vulkan.model.resource;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Texture</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.vulkan.model.resource.AbstractTexture#isMipmapEnabled <em>Mipmap Enabled</em>}</li>
 * </ul>
 *
 * @see org.sheepy.vulkan.model.resource.ResourcePackage#getAbstractTexture()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTexture extends SampledResource
{
	/**
	 * Returns the value of the '<em><b>Mipmap Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mipmap Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mipmap Enabled</em>' attribute.
	 * @see #setMipmapEnabled(boolean)
	 * @see org.sheepy.vulkan.model.resource.ResourcePackage#getAbstractTexture_MipmapEnabled()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isMipmapEnabled();

	/**
	 * Sets the value of the '{@link org.sheepy.vulkan.model.resource.AbstractTexture#isMipmapEnabled <em>Mipmap Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mipmap Enabled</em>' attribute.
	 * @see #isMipmapEnabled()
	 * @generated
	 */
	void setMipmapEnabled(boolean value);

} // AbstractTexture
