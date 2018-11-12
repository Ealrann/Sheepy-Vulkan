/**
 */
package org.sheepy.vulkan.model.resource.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.sheepy.vulkan.model.resource.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.sheepy.vulkan.model.resource.ResourcePackage
 * @generated
 */
public class ResourceSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ResourcePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ResourcePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ResourcePackage.RESOURCE:
			{
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.VULKAN_BUFFER:
			{
				VulkanBuffer vulkanBuffer = (VulkanBuffer)theEObject;
				T result = caseVulkanBuffer(vulkanBuffer);
				if (result == null) result = caseResource(vulkanBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.BUFFER:
			{
				Buffer buffer = (Buffer)theEObject;
				T result = caseBuffer(buffer);
				if (result == null) result = caseVulkanBuffer(buffer);
				if (result == null) result = caseResource(buffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.SIZED_BUFFER:
			{
				SizedBuffer sizedBuffer = (SizedBuffer)theEObject;
				T result = caseSizedBuffer(sizedBuffer);
				if (result == null) result = caseVulkanBuffer(sizedBuffer);
				if (result == null) result = caseResource(sizedBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.IMAGE:
			{
				Image image = (Image)theEObject;
				T result = caseImage(image);
				if (result == null) result = caseSizedBuffer(image);
				if (result == null) result = caseVulkanBuffer(image);
				if (result == null) result = caseResource(image);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.TEXTURE:
			{
				Texture texture = (Texture)theEObject;
				T result = caseTexture(texture);
				if (result == null) result = caseVulkanBuffer(texture);
				if (result == null) result = caseIDescriptor(texture);
				if (result == null) result = caseResource(texture);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.DEPTH_IMAGE:
			{
				DepthImage depthImage = (DepthImage)theEObject;
				T result = caseDepthImage(depthImage);
				if (result == null) result = caseVulkanBuffer(depthImage);
				if (result == null) result = caseResource(depthImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.PATH_RESOURCE:
			{
				PathResource pathResource = (PathResource)theEObject;
				T result = casePathResource(pathResource);
				if (result == null) result = caseResource(pathResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.FILE_RESOURCE:
			{
				FileResource fileResource = (FileResource)theEObject;
				T result = caseFileResource(fileResource);
				if (result == null) result = casePathResource(fileResource);
				if (result == null) result = caseResource(fileResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.MODULE_RESOURCE:
			{
				ModuleResource moduleResource = (ModuleResource)theEObject;
				T result = caseModuleResource(moduleResource);
				if (result == null) result = casePathResource(moduleResource);
				if (result == null) result = caseResource(moduleResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.SHADER:
			{
				Shader shader = (Shader)theEObject;
				T result = caseShader(shader);
				if (result == null) result = caseResource(shader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.PUSH_CONSTANT:
			{
				PushConstant pushConstant = (PushConstant)theEObject;
				T result = casePushConstant(pushConstant);
				if (result == null) result = caseVulkanBuffer(pushConstant);
				if (result == null) result = caseResource(pushConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.IDESCRIPTOR:
			{
				IDescriptor iDescriptor = (IDescriptor)theEObject;
				T result = caseIDescriptor(iDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.DESCRIPTOR_SET:
			{
				DescriptorSet descriptorSet = (DescriptorSet)theEObject;
				T result = caseDescriptorSet(descriptorSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.INDEXED_BUFFER:
			{
				IndexedBuffer indexedBuffer = (IndexedBuffer)theEObject;
				T result = caseIndexedBuffer(indexedBuffer);
				if (result == null) result = caseVulkanBuffer(indexedBuffer);
				if (result == null) result = caseIDescriptor(indexedBuffer);
				if (result == null) result = caseResource(indexedBuffer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.BARRIER:
			{
				Barrier barrier = (Barrier)theEObject;
				T result = caseBarrier(barrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.BUFFER_BARRIER:
			{
				BufferBarrier bufferBarrier = (BufferBarrier)theEObject;
				T result = caseBufferBarrier(bufferBarrier);
				if (result == null) result = caseBarrier(bufferBarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.ABSTRACT_IMAGE_BARRIER:
			{
				AbstractImageBarrier abstractImageBarrier = (AbstractImageBarrier)theEObject;
				T result = caseAbstractImageBarrier(abstractImageBarrier);
				if (result == null) result = caseBarrier(abstractImageBarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.IMAGE_BARRIER:
			{
				ImageBarrier imageBarrier = (ImageBarrier)theEObject;
				T result = caseImageBarrier(imageBarrier);
				if (result == null) result = caseAbstractImageBarrier(imageBarrier);
				if (result == null) result = caseBarrier(imageBarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.REFERENCE_IMAGE_BARRIER:
			{
				ReferenceImageBarrier referenceImageBarrier = (ReferenceImageBarrier)theEObject;
				T result = caseReferenceImageBarrier(referenceImageBarrier);
				if (result == null) result = caseAbstractImageBarrier(referenceImageBarrier);
				if (result == null) result = caseBarrier(referenceImageBarrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ResourcePackage.IMAGE_TRANSITION:
			{
				ImageTransition imageTransition = (ImageTransition)theEObject;
				T result = caseImageTransition(imageTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vulkan Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vulkan Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVulkanBuffer(VulkanBuffer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sized Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sized Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSizedBuffer(SizedBuffer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImage(Image object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Texture</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Texture</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTexture(Texture object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Depth Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Depth Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDepthImage(DepthImage object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathResource(PathResource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileResource(FileResource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Module Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Module Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModuleResource(ModuleResource object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shader</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shader</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShader(Shader object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePushConstant(PushConstant object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IDescriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IDescriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIDescriptor(IDescriptor object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptorSet(DescriptorSet object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indexed Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indexed Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndexedBuffer(IndexedBuffer object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarrier(Barrier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBufferBarrier(BufferBarrier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Image Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Image Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractImageBarrier(AbstractImageBarrier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageBarrier(ImageBarrier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Image Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Image Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceImageBarrier(ReferenceImageBarrier object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageTransition(ImageTransition object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ResourceSwitch