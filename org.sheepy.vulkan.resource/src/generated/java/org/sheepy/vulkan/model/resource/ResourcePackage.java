/**
 */
package org.sheepy.vulkan.model.resource;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.sheepy.vulkan.model.resource.ResourceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/org.sheepy.vulkan.model/src/generated/resource' publicConstructors='true' updateClasspath='false' basePackage='org.sheepy.vulkan.model'"
 * @generated
 */
public interface ResourcePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "resource";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.sheepy.vulkan.model.resource";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "resource";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ResourcePackage eINSTANCE = org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.Resource <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.Resource
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.VulkanBuffer <em>Vulkan Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.VulkanBuffer
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getVulkanBuffer()
	 * @generated
	 */
	int VULKAN_BUFFER = 1;

	/**
	 * The number of structural features of the '<em>Vulkan Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULKAN_BUFFER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Vulkan Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VULKAN_BUFFER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.BufferImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 2;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SIZE = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__USAGE = VULKAN_BUFFER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__PROPERTIES = VULKAN_BUFFER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.SizedBuffer <em>Sized Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.SizedBuffer
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getSizedBuffer()
	 * @generated
	 */
	int SIZED_BUFFER = 3;

	/**
	 * The number of structural features of the '<em>Sized Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_BUFFER_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sized Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIZED_BUFFER_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ImageImpl <em>Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ImageImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImage()
	 * @generated
	 */
	int IMAGE = 4;

	/**
	 * The number of structural features of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_FEATURE_COUNT = SIZED_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_OPERATION_COUNT = SIZED_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.TextureImpl <em>Texture</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.TextureImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getTexture()
	 * @generated
	 */
	int TEXTURE = 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__FILE = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mipmap Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE__MIPMAP_ENABLED = VULKAN_BUFFER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Texture</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTURE_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.DepthImageImpl <em>Depth Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.DepthImageImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getDepthImage()
	 * @generated
	 */
	int DEPTH_IMAGE = 6;

	/**
	 * The number of structural features of the '<em>Depth Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_IMAGE_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Depth Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPTH_IMAGE_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.PathResourceImpl <em>Path Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.PathResourceImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getPathResource()
	 * @generated
	 */
	int PATH_RESOURCE = 7;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE__PATH = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Path Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATH_RESOURCE_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.FileResourceImpl <em>File Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.FileResourceImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getFileResource()
	 * @generated
	 */
	int FILE_RESOURCE = 8;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE__PATH = PATH_RESOURCE__PATH;

	/**
	 * The number of structural features of the '<em>File Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE_FEATURE_COUNT = PATH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>File Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_RESOURCE_OPERATION_COUNT = PATH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ModuleResourceImpl <em>Module Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ModuleResourceImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getModuleResource()
	 * @generated
	 */
	int MODULE_RESOURCE = 9;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RESOURCE__PATH = PATH_RESOURCE__PATH;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RESOURCE__MODULE = PATH_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Module Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RESOURCE_FEATURE_COUNT = PATH_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Module Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODULE_RESOURCE_OPERATION_COUNT = PATH_RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ShaderImpl <em>Shader</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ShaderImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getShader()
	 * @generated
	 */
	int SHADER = 10;

	/**
	 * The feature id for the '<em><b>File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER__FILE = RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER__STAGE = RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Shader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_FEATURE_COUNT = RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Shader</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHADER_OPERATION_COUNT = RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.PushConstantImpl <em>Push Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.PushConstantImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getPushConstant()
	 * @generated
	 */
	int PUSH_CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_CONSTANT__SIZE = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_CONSTANT__STAGE = VULKAN_BUFFER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Push Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_CONSTANT_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Push Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUSH_CONSTANT_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.IDescriptor <em>IDescriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.IDescriptor
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getIDescriptor()
	 * @generated
	 */
	int IDESCRIPTOR = 12;

	/**
	 * The number of structural features of the '<em>IDescriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IDescriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.DescriptorSetImpl <em>Descriptor Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.DescriptorSetImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getDescriptorSet()
	 * @generated
	 */
	int DESCRIPTOR_SET = 13;

	/**
	 * The feature id for the '<em><b>Descriptors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET__DESCRIPTORS = 0;

	/**
	 * The number of structural features of the '<em>Descriptor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Descriptor Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIPTOR_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.IndexedBufferImpl <em>Indexed Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.IndexedBufferImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getIndexedBuffer()
	 * @generated
	 */
	int INDEXED_BUFFER = 14;

	/**
	 * The number of structural features of the '<em>Indexed Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_BUFFER_FEATURE_COUNT = VULKAN_BUFFER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Indexed Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXED_BUFFER_OPERATION_COUNT = VULKAN_BUFFER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.BarrierImpl <em>Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.BarrierImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBarrier()
	 * @generated
	 */
	int BARRIER = 15;

	/**
	 * The feature id for the '<em><b>Src Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__SRC_STAGE = 0;

	/**
	 * The feature id for the '<em><b>Dst Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__DST_STAGE = 1;

	/**
	 * The number of structural features of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.BufferBarrierImpl <em>Buffer Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.BufferBarrierImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBufferBarrier()
	 * @generated
	 */
	int BUFFER_BARRIER = 16;

	/**
	 * The feature id for the '<em><b>Src Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER__SRC_STAGE = BARRIER__SRC_STAGE;

	/**
	 * The feature id for the '<em><b>Dst Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER__DST_STAGE = BARRIER__DST_STAGE;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER__BUFFER = BARRIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Src Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER__SRC_ACCESS = BARRIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dst Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER__DST_ACCESS = BARRIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Buffer Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER_FEATURE_COUNT = BARRIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Buffer Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_BARRIER_OPERATION_COUNT = BARRIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.AbstractImageBarrierImpl <em>Abstract Image Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.AbstractImageBarrierImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getAbstractImageBarrier()
	 * @generated
	 */
	int ABSTRACT_IMAGE_BARRIER = 17;

	/**
	 * The feature id for the '<em><b>Src Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IMAGE_BARRIER__SRC_STAGE = BARRIER__SRC_STAGE;

	/**
	 * The feature id for the '<em><b>Dst Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IMAGE_BARRIER__DST_STAGE = BARRIER__DST_STAGE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IMAGE_BARRIER__TRANSITIONS = BARRIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Abstract Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT = BARRIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Abstract Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_IMAGE_BARRIER_OPERATION_COUNT = BARRIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ImageBarrierImpl <em>Image Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ImageBarrierImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImageBarrier()
	 * @generated
	 */
	int IMAGE_BARRIER = 18;

	/**
	 * The feature id for the '<em><b>Src Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER__SRC_STAGE = ABSTRACT_IMAGE_BARRIER__SRC_STAGE;

	/**
	 * The feature id for the '<em><b>Dst Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER__DST_STAGE = ABSTRACT_IMAGE_BARRIER__DST_STAGE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER__TRANSITIONS = ABSTRACT_IMAGE_BARRIER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Image</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER__IMAGE = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER_FEATURE_COUNT = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_BARRIER_OPERATION_COUNT = ABSTRACT_IMAGE_BARRIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ReferenceImageBarrierImpl <em>Reference Image Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ReferenceImageBarrierImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getReferenceImageBarrier()
	 * @generated
	 */
	int REFERENCE_IMAGE_BARRIER = 19;

	/**
	 * The feature id for the '<em><b>Src Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__SRC_STAGE = ABSTRACT_IMAGE_BARRIER__SRC_STAGE;

	/**
	 * The feature id for the '<em><b>Dst Stage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__DST_STAGE = ABSTRACT_IMAGE_BARRIER__DST_STAGE;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__TRANSITIONS = ABSTRACT_IMAGE_BARRIER__TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__IMAGE_ID = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Mip Levels</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__MIP_LEVELS = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Image Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER__IMAGE_FORMAT = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Reference Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER_FEATURE_COUNT = ABSTRACT_IMAGE_BARRIER_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Reference Image Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_IMAGE_BARRIER_OPERATION_COUNT = ABSTRACT_IMAGE_BARRIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.sheepy.vulkan.model.resource.impl.ImageTransitionImpl <em>Image Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.sheepy.vulkan.model.resource.impl.ImageTransitionImpl
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImageTransition()
	 * @generated
	 */
	int IMAGE_TRANSITION = 20;

	/**
	 * The feature id for the '<em><b>Src Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION__SRC_LAYOUT = 0;

	/**
	 * The feature id for the '<em><b>Dst Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION__DST_LAYOUT = 1;

	/**
	 * The feature id for the '<em><b>Src Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION__SRC_ACCESS = 2;

	/**
	 * The feature id for the '<em><b>Dst Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION__DST_ACCESS = 3;

	/**
	 * The number of structural features of the '<em>Image Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Image Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGE_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Java Module</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Module
	 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getJavaModule()
	 * @generated
	 */
	int JAVA_MODULE = 21;


	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see org.sheepy.vulkan.model.resource.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.VulkanBuffer <em>Vulkan Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vulkan Buffer</em>'.
	 * @see org.sheepy.vulkan.model.resource.VulkanBuffer
	 * @generated
	 */
	EClass getVulkanBuffer();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see org.sheepy.vulkan.model.resource.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Buffer#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.sheepy.vulkan.model.resource.Buffer#getSize()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Buffer#getUsage <em>Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usage</em>'.
	 * @see org.sheepy.vulkan.model.resource.Buffer#getUsage()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Usage();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Buffer#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Properties</em>'.
	 * @see org.sheepy.vulkan.model.resource.Buffer#getProperties()
	 * @see #getBuffer()
	 * @generated
	 */
	EAttribute getBuffer_Properties();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.SizedBuffer <em>Sized Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sized Buffer</em>'.
	 * @see org.sheepy.vulkan.model.resource.SizedBuffer
	 * @generated
	 */
	EClass getSizedBuffer();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Image <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image</em>'.
	 * @see org.sheepy.vulkan.model.resource.Image
	 * @generated
	 */
	EClass getImage();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Texture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Texture</em>'.
	 * @see org.sheepy.vulkan.model.resource.Texture
	 * @generated
	 */
	EClass getTexture();

	/**
	 * Returns the meta object for the containment reference '{@link org.sheepy.vulkan.model.resource.Texture#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.sheepy.vulkan.model.resource.Texture#getFile()
	 * @see #getTexture()
	 * @generated
	 */
	EReference getTexture_File();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Texture#isMipmapEnabled <em>Mipmap Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mipmap Enabled</em>'.
	 * @see org.sheepy.vulkan.model.resource.Texture#isMipmapEnabled()
	 * @see #getTexture()
	 * @generated
	 */
	EAttribute getTexture_MipmapEnabled();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.DepthImage <em>Depth Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Depth Image</em>'.
	 * @see org.sheepy.vulkan.model.resource.DepthImage
	 * @generated
	 */
	EClass getDepthImage();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.PathResource <em>Path Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Path Resource</em>'.
	 * @see org.sheepy.vulkan.model.resource.PathResource
	 * @generated
	 */
	EClass getPathResource();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.PathResource#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.sheepy.vulkan.model.resource.PathResource#getPath()
	 * @see #getPathResource()
	 * @generated
	 */
	EAttribute getPathResource_Path();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.FileResource <em>File Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Resource</em>'.
	 * @see org.sheepy.vulkan.model.resource.FileResource
	 * @generated
	 */
	EClass getFileResource();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.ModuleResource <em>Module Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Module Resource</em>'.
	 * @see org.sheepy.vulkan.model.resource.ModuleResource
	 * @generated
	 */
	EClass getModuleResource();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ModuleResource#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see org.sheepy.vulkan.model.resource.ModuleResource#getModule()
	 * @see #getModuleResource()
	 * @generated
	 */
	EAttribute getModuleResource_Module();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Shader <em>Shader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shader</em>'.
	 * @see org.sheepy.vulkan.model.resource.Shader
	 * @generated
	 */
	EClass getShader();

	/**
	 * Returns the meta object for the containment reference '{@link org.sheepy.vulkan.model.resource.Shader#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>File</em>'.
	 * @see org.sheepy.vulkan.model.resource.Shader#getFile()
	 * @see #getShader()
	 * @generated
	 */
	EReference getShader_File();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Shader#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.sheepy.vulkan.model.resource.Shader#getStage()
	 * @see #getShader()
	 * @generated
	 */
	EAttribute getShader_Stage();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.PushConstant <em>Push Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Constant</em>'.
	 * @see org.sheepy.vulkan.model.resource.PushConstant
	 * @generated
	 */
	EClass getPushConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.PushConstant#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.sheepy.vulkan.model.resource.PushConstant#getSize()
	 * @see #getPushConstant()
	 * @generated
	 */
	EAttribute getPushConstant_Size();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.PushConstant#getStage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage</em>'.
	 * @see org.sheepy.vulkan.model.resource.PushConstant#getStage()
	 * @see #getPushConstant()
	 * @generated
	 */
	EAttribute getPushConstant_Stage();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.IDescriptor <em>IDescriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IDescriptor</em>'.
	 * @see org.sheepy.vulkan.model.resource.IDescriptor
	 * @generated
	 */
	EClass getIDescriptor();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.DescriptorSet <em>Descriptor Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Descriptor Set</em>'.
	 * @see org.sheepy.vulkan.model.resource.DescriptorSet
	 * @generated
	 */
	EClass getDescriptorSet();

	/**
	 * Returns the meta object for the reference list '{@link org.sheepy.vulkan.model.resource.DescriptorSet#getDescriptors <em>Descriptors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Descriptors</em>'.
	 * @see org.sheepy.vulkan.model.resource.DescriptorSet#getDescriptors()
	 * @see #getDescriptorSet()
	 * @generated
	 */
	EReference getDescriptorSet_Descriptors();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.IndexedBuffer <em>Indexed Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexed Buffer</em>'.
	 * @see org.sheepy.vulkan.model.resource.IndexedBuffer
	 * @generated
	 */
	EClass getIndexedBuffer();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barrier</em>'.
	 * @see org.sheepy.vulkan.model.resource.Barrier
	 * @generated
	 */
	EClass getBarrier();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Barrier#getSrcStage <em>Src Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Stage</em>'.
	 * @see org.sheepy.vulkan.model.resource.Barrier#getSrcStage()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_SrcStage();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.Barrier#getDstStage <em>Dst Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst Stage</em>'.
	 * @see org.sheepy.vulkan.model.resource.Barrier#getDstStage()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_DstStage();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.BufferBarrier <em>Buffer Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer Barrier</em>'.
	 * @see org.sheepy.vulkan.model.resource.BufferBarrier
	 * @generated
	 */
	EClass getBufferBarrier();

	/**
	 * Returns the meta object for the reference '{@link org.sheepy.vulkan.model.resource.BufferBarrier#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Buffer</em>'.
	 * @see org.sheepy.vulkan.model.resource.BufferBarrier#getBuffer()
	 * @see #getBufferBarrier()
	 * @generated
	 */
	EReference getBufferBarrier_Buffer();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.BufferBarrier#getSrcAccess <em>Src Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Access</em>'.
	 * @see org.sheepy.vulkan.model.resource.BufferBarrier#getSrcAccess()
	 * @see #getBufferBarrier()
	 * @generated
	 */
	EAttribute getBufferBarrier_SrcAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.BufferBarrier#getDstAccess <em>Dst Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst Access</em>'.
	 * @see org.sheepy.vulkan.model.resource.BufferBarrier#getDstAccess()
	 * @see #getBufferBarrier()
	 * @generated
	 */
	EAttribute getBufferBarrier_DstAccess();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.AbstractImageBarrier <em>Abstract Image Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Image Barrier</em>'.
	 * @see org.sheepy.vulkan.model.resource.AbstractImageBarrier
	 * @generated
	 */
	EClass getAbstractImageBarrier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.sheepy.vulkan.model.resource.AbstractImageBarrier#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see org.sheepy.vulkan.model.resource.AbstractImageBarrier#getTransitions()
	 * @see #getAbstractImageBarrier()
	 * @generated
	 */
	EReference getAbstractImageBarrier_Transitions();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.ImageBarrier <em>Image Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Barrier</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageBarrier
	 * @generated
	 */
	EClass getImageBarrier();

	/**
	 * Returns the meta object for the reference '{@link org.sheepy.vulkan.model.resource.ImageBarrier#getImage <em>Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Image</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageBarrier#getImage()
	 * @see #getImageBarrier()
	 * @generated
	 */
	EReference getImageBarrier_Image();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.ReferenceImageBarrier <em>Reference Image Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Image Barrier</em>'.
	 * @see org.sheepy.vulkan.model.resource.ReferenceImageBarrier
	 * @generated
	 */
	EClass getReferenceImageBarrier();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getImageId <em>Image Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Id</em>'.
	 * @see org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getImageId()
	 * @see #getReferenceImageBarrier()
	 * @generated
	 */
	EAttribute getReferenceImageBarrier_ImageId();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getMipLevels <em>Mip Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mip Levels</em>'.
	 * @see org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getMipLevels()
	 * @see #getReferenceImageBarrier()
	 * @generated
	 */
	EAttribute getReferenceImageBarrier_MipLevels();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getImageFormat <em>Image Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Format</em>'.
	 * @see org.sheepy.vulkan.model.resource.ReferenceImageBarrier#getImageFormat()
	 * @see #getReferenceImageBarrier()
	 * @generated
	 */
	EAttribute getReferenceImageBarrier_ImageFormat();

	/**
	 * Returns the meta object for class '{@link org.sheepy.vulkan.model.resource.ImageTransition <em>Image Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Image Transition</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageTransition
	 * @generated
	 */
	EClass getImageTransition();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ImageTransition#getSrcLayout <em>Src Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Layout</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageTransition#getSrcLayout()
	 * @see #getImageTransition()
	 * @generated
	 */
	EAttribute getImageTransition_SrcLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ImageTransition#getDstLayout <em>Dst Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst Layout</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageTransition#getDstLayout()
	 * @see #getImageTransition()
	 * @generated
	 */
	EAttribute getImageTransition_DstLayout();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ImageTransition#getSrcAccess <em>Src Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src Access</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageTransition#getSrcAccess()
	 * @see #getImageTransition()
	 * @generated
	 */
	EAttribute getImageTransition_SrcAccess();

	/**
	 * Returns the meta object for the attribute '{@link org.sheepy.vulkan.model.resource.ImageTransition#getDstAccess <em>Dst Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dst Access</em>'.
	 * @see org.sheepy.vulkan.model.resource.ImageTransition#getDstAccess()
	 * @see #getImageTransition()
	 * @generated
	 */
	EAttribute getImageTransition_DstAccess();

	/**
	 * Returns the meta object for data type '{@link java.lang.Module <em>Java Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Java Module</em>'.
	 * @see java.lang.Module
	 * @model instanceClass="java.lang.Module"
	 * @generated
	 */
	EDataType getJavaModule();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ResourceFactory getResourceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.Resource <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.Resource
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.VulkanBuffer <em>Vulkan Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.VulkanBuffer
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getVulkanBuffer()
		 * @generated
		 */
		EClass VULKAN_BUFFER = eINSTANCE.getVulkanBuffer();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.BufferImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__SIZE = eINSTANCE.getBuffer_Size();

		/**
		 * The meta object literal for the '<em><b>Usage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__USAGE = eINSTANCE.getBuffer_Usage();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER__PROPERTIES = eINSTANCE.getBuffer_Properties();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.SizedBuffer <em>Sized Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.SizedBuffer
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getSizedBuffer()
		 * @generated
		 */
		EClass SIZED_BUFFER = eINSTANCE.getSizedBuffer();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ImageImpl <em>Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ImageImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImage()
		 * @generated
		 */
		EClass IMAGE = eINSTANCE.getImage();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.TextureImpl <em>Texture</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.TextureImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getTexture()
		 * @generated
		 */
		EClass TEXTURE = eINSTANCE.getTexture();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXTURE__FILE = eINSTANCE.getTexture_File();

		/**
		 * The meta object literal for the '<em><b>Mipmap Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTURE__MIPMAP_ENABLED = eINSTANCE.getTexture_MipmapEnabled();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.DepthImageImpl <em>Depth Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.DepthImageImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getDepthImage()
		 * @generated
		 */
		EClass DEPTH_IMAGE = eINSTANCE.getDepthImage();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.PathResourceImpl <em>Path Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.PathResourceImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getPathResource()
		 * @generated
		 */
		EClass PATH_RESOURCE = eINSTANCE.getPathResource();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATH_RESOURCE__PATH = eINSTANCE.getPathResource_Path();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.FileResourceImpl <em>File Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.FileResourceImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getFileResource()
		 * @generated
		 */
		EClass FILE_RESOURCE = eINSTANCE.getFileResource();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ModuleResourceImpl <em>Module Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ModuleResourceImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getModuleResource()
		 * @generated
		 */
		EClass MODULE_RESOURCE = eINSTANCE.getModuleResource();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODULE_RESOURCE__MODULE = eINSTANCE.getModuleResource_Module();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ShaderImpl <em>Shader</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ShaderImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getShader()
		 * @generated
		 */
		EClass SHADER = eINSTANCE.getShader();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHADER__FILE = eINSTANCE.getShader_File();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHADER__STAGE = eINSTANCE.getShader_Stage();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.PushConstantImpl <em>Push Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.PushConstantImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getPushConstant()
		 * @generated
		 */
		EClass PUSH_CONSTANT = eINSTANCE.getPushConstant();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_CONSTANT__SIZE = eINSTANCE.getPushConstant_Size();

		/**
		 * The meta object literal for the '<em><b>Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUSH_CONSTANT__STAGE = eINSTANCE.getPushConstant_Stage();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.IDescriptor <em>IDescriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.IDescriptor
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getIDescriptor()
		 * @generated
		 */
		EClass IDESCRIPTOR = eINSTANCE.getIDescriptor();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.DescriptorSetImpl <em>Descriptor Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.DescriptorSetImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getDescriptorSet()
		 * @generated
		 */
		EClass DESCRIPTOR_SET = eINSTANCE.getDescriptorSet();

		/**
		 * The meta object literal for the '<em><b>Descriptors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DESCRIPTOR_SET__DESCRIPTORS = eINSTANCE.getDescriptorSet_Descriptors();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.IndexedBufferImpl <em>Indexed Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.IndexedBufferImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getIndexedBuffer()
		 * @generated
		 */
		EClass INDEXED_BUFFER = eINSTANCE.getIndexedBuffer();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.BarrierImpl <em>Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.BarrierImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBarrier()
		 * @generated
		 */
		EClass BARRIER = eINSTANCE.getBarrier();

		/**
		 * The meta object literal for the '<em><b>Src Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__SRC_STAGE = eINSTANCE.getBarrier_SrcStage();

		/**
		 * The meta object literal for the '<em><b>Dst Stage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__DST_STAGE = eINSTANCE.getBarrier_DstStage();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.BufferBarrierImpl <em>Buffer Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.BufferBarrierImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getBufferBarrier()
		 * @generated
		 */
		EClass BUFFER_BARRIER = eINSTANCE.getBufferBarrier();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER_BARRIER__BUFFER = eINSTANCE.getBufferBarrier_Buffer();

		/**
		 * The meta object literal for the '<em><b>Src Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_BARRIER__SRC_ACCESS = eINSTANCE.getBufferBarrier_SrcAccess();

		/**
		 * The meta object literal for the '<em><b>Dst Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BUFFER_BARRIER__DST_ACCESS = eINSTANCE.getBufferBarrier_DstAccess();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.AbstractImageBarrierImpl <em>Abstract Image Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.AbstractImageBarrierImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getAbstractImageBarrier()
		 * @generated
		 */
		EClass ABSTRACT_IMAGE_BARRIER = eINSTANCE.getAbstractImageBarrier();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_IMAGE_BARRIER__TRANSITIONS = eINSTANCE.getAbstractImageBarrier_Transitions();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ImageBarrierImpl <em>Image Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ImageBarrierImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImageBarrier()
		 * @generated
		 */
		EClass IMAGE_BARRIER = eINSTANCE.getImageBarrier();

		/**
		 * The meta object literal for the '<em><b>Image</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGE_BARRIER__IMAGE = eINSTANCE.getImageBarrier_Image();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ReferenceImageBarrierImpl <em>Reference Image Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ReferenceImageBarrierImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getReferenceImageBarrier()
		 * @generated
		 */
		EClass REFERENCE_IMAGE_BARRIER = eINSTANCE.getReferenceImageBarrier();

		/**
		 * The meta object literal for the '<em><b>Image Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_IMAGE_BARRIER__IMAGE_ID = eINSTANCE.getReferenceImageBarrier_ImageId();

		/**
		 * The meta object literal for the '<em><b>Mip Levels</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_IMAGE_BARRIER__MIP_LEVELS = eINSTANCE.getReferenceImageBarrier_MipLevels();

		/**
		 * The meta object literal for the '<em><b>Image Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_IMAGE_BARRIER__IMAGE_FORMAT = eINSTANCE.getReferenceImageBarrier_ImageFormat();

		/**
		 * The meta object literal for the '{@link org.sheepy.vulkan.model.resource.impl.ImageTransitionImpl <em>Image Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.sheepy.vulkan.model.resource.impl.ImageTransitionImpl
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getImageTransition()
		 * @generated
		 */
		EClass IMAGE_TRANSITION = eINSTANCE.getImageTransition();

		/**
		 * The meta object literal for the '<em><b>Src Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_TRANSITION__SRC_LAYOUT = eINSTANCE.getImageTransition_SrcLayout();

		/**
		 * The meta object literal for the '<em><b>Dst Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_TRANSITION__DST_LAYOUT = eINSTANCE.getImageTransition_DstLayout();

		/**
		 * The meta object literal for the '<em><b>Src Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_TRANSITION__SRC_ACCESS = eINSTANCE.getImageTransition_SrcAccess();

		/**
		 * The meta object literal for the '<em><b>Dst Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGE_TRANSITION__DST_ACCESS = eINSTANCE.getImageTransition_DstAccess();

		/**
		 * The meta object literal for the '<em>Java Module</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Module
		 * @see org.sheepy.vulkan.model.resource.impl.ResourcePackageImpl#getJavaModule()
		 * @generated
		 */
		EDataType JAVA_MODULE = eINSTANCE.getJavaModule();

	}

} //ResourcePackage