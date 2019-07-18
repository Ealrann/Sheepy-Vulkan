/**
 */
package org.sheepy.lily.vulkan.model.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.sheepy.lily.core.model.action.ActionPackage;

import org.sheepy.lily.core.model.application.ApplicationPackage;

import org.sheepy.lily.core.model.inference.InferencePackage;
import org.sheepy.lily.core.model.maintainer.MaintainerPackage;
import org.sheepy.lily.core.model.root.RootPackage;

import org.sheepy.lily.core.model.types.TypesPackage;

import org.sheepy.lily.vulkan.model.IExecutionManager;
import org.sheepy.lily.vulkan.model.IProcess;
import org.sheepy.lily.vulkan.model.IResource;
import org.sheepy.lily.vulkan.model.IResourceContainer;
import org.sheepy.lily.vulkan.model.ResourcePkg;
import org.sheepy.lily.vulkan.model.VulkanEngine;
import org.sheepy.lily.vulkan.model.VulkanFactory;
import org.sheepy.lily.vulkan.model.VulkanPackage;
import org.sheepy.lily.vulkan.model.process.ProcessPackage;
import org.sheepy.lily.vulkan.model.process.compute.ComputePackage;
import org.sheepy.lily.vulkan.model.process.compute.impl.ComputePackageImpl;
import org.sheepy.lily.vulkan.model.process.graphic.GraphicPackage;
import org.sheepy.lily.vulkan.model.process.graphic.impl.GraphicPackageImpl;
import org.sheepy.lily.vulkan.model.process.impl.ProcessPackageImpl;
import org.sheepy.lily.vulkan.model.resource.ResourcePackage;
import org.sheepy.lily.vulkan.model.resource.impl.ResourcePackageImpl;
import org.sheepy.vulkan.model.barrier.BarrierPackage;
import org.sheepy.vulkan.model.enumeration.EnumerationPackage;
import org.sheepy.vulkan.model.graphicpipeline.GraphicpipelinePackage;
import org.sheepy.vulkan.model.pipeline.PipelinePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VulkanPackageImpl extends EPackageImpl implements VulkanPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vulkanEngineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iResourceContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourcePkgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iResourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iExecutionManagerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.sheepy.lily.vulkan.model.VulkanPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VulkanPackageImpl()
	{
		super(eNS_URI, VulkanFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link VulkanPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VulkanPackage init()
	{
		if (isInited) return (VulkanPackage) EPackage.Registry.INSTANCE.getEPackage(VulkanPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredVulkanPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		VulkanPackageImpl theVulkanPackage = registeredVulkanPackage instanceof VulkanPackageImpl
				? (VulkanPackageImpl) registeredVulkanPackage
				: new VulkanPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();
		ActionPackage.eINSTANCE.eClass();
		ApplicationPackage.eINSTANCE.eClass();
		RootPackage.eINSTANCE.eClass();
		InferencePackage.eINSTANCE.eClass();
		MaintainerPackage.eINSTANCE.eClass();
		BarrierPackage.eINSTANCE.eClass();
		EnumerationPackage.eINSTANCE.eClass();
		GraphicpipelinePackage.eINSTANCE.eClass();
		PipelinePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ComputePackage.eNS_URI);
		ComputePackageImpl theComputePackage = (ComputePackageImpl) (registeredPackage instanceof ComputePackageImpl
				? registeredPackage
				: ComputePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ProcessPackage.eNS_URI);
		ProcessPackageImpl theProcessPackage = (ProcessPackageImpl) (registeredPackage instanceof ProcessPackageImpl
				? registeredPackage
				: ProcessPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ResourcePackage.eNS_URI);
		ResourcePackageImpl theResourcePackage = (ResourcePackageImpl) (registeredPackage instanceof ResourcePackageImpl
				? registeredPackage
				: ResourcePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GraphicPackage.eNS_URI);
		GraphicPackageImpl theGraphicPackage = (GraphicPackageImpl) (registeredPackage instanceof GraphicPackageImpl
				? registeredPackage
				: GraphicPackage.eINSTANCE);

		// Create package meta-data objects
		theVulkanPackage.createPackageContents();
		theComputePackage.createPackageContents();
		theProcessPackage.createPackageContents();
		theResourcePackage.createPackageContents();
		theGraphicPackage.createPackageContents();

		// Initialize created meta-data
		theVulkanPackage.initializePackageContents();
		theComputePackage.initializePackageContents();
		theProcessPackage.initializePackageContents();
		theResourcePackage.initializePackageContents();
		theGraphicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVulkanPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VulkanPackage.eNS_URI, theVulkanPackage);
		return theVulkanPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVulkanEngine()
	{
		return vulkanEngineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulkanEngine_Enabled()
	{
		return (EAttribute) vulkanEngineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVulkanEngine_Processes()
	{
		return (EReference) vulkanEngineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVulkanEngine_Features()
	{
		return (EAttribute) vulkanEngineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIResourceContainer()
	{
		return iResourceContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIResourceContainer_ResourcePkg()
	{
		return (EReference) iResourceContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResourcePkg()
	{
		return resourcePkgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResourcePkg_Resources()
	{
		return (EReference) resourcePkgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIResource()
	{
		return iResourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIProcess()
	{
		return iProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIProcess_Enabled()
	{
		return (EAttribute) iProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIExecutionManager()
	{
		return iExecutionManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VulkanFactory getVulkanFactory()
	{
		return (VulkanFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		vulkanEngineEClass = createEClass(VULKAN_ENGINE);
		createEAttribute(vulkanEngineEClass, VULKAN_ENGINE__ENABLED);
		createEReference(vulkanEngineEClass, VULKAN_ENGINE__PROCESSES);
		createEAttribute(vulkanEngineEClass, VULKAN_ENGINE__FEATURES);

		iResourceContainerEClass = createEClass(IRESOURCE_CONTAINER);
		createEReference(iResourceContainerEClass, IRESOURCE_CONTAINER__RESOURCE_PKG);

		resourcePkgEClass = createEClass(RESOURCE_PKG);
		createEReference(resourcePkgEClass, RESOURCE_PKG__RESOURCES);

		iResourceEClass = createEClass(IRESOURCE);

		iProcessEClass = createEClass(IPROCESS);
		createEAttribute(iProcessEClass, IPROCESS__ENABLED);

		iExecutionManagerEClass = createEClass(IEXECUTION_MANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ApplicationPackage theApplicationPackage = (ApplicationPackage) EPackage.Registry.INSTANCE
				.getEPackage(ApplicationPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage) EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EnumerationPackage theEnumerationPackage = (EnumerationPackage) EPackage.Registry.INSTANCE
				.getEPackage(EnumerationPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage) EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		vulkanEngineEClass.getESuperTypes().add(theApplicationPackage.getIEngine());
		vulkanEngineEClass.getESuperTypes().add(this.getIResourceContainer());
		vulkanEngineEClass.getESuperTypes().add(this.getIExecutionManager());
		iResourceEClass.getESuperTypes().add(theTypesPackage.getLNamedElement());
		iProcessEClass.getESuperTypes().add(this.getIResourceContainer());
		iProcessEClass.getESuperTypes().add(theTypesPackage.getLNamedElement());
		iProcessEClass.getESuperTypes().add(this.getIExecutionManager());

		// Initialize classes and features; add operations and parameters
		initEClass(vulkanEngineEClass, VulkanEngine.class, "VulkanEngine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVulkanEngine_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1,
				VulkanEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getVulkanEngine_Processes(), this.getIProcess(), null, "processes", null, 0, -1,
				VulkanEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVulkanEngine_Features(), theEnumerationPackage.getEPhysicalDeviceFeature(), "features", null,
				0, -1, VulkanEngine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iResourceContainerEClass, IResourceContainer.class, "IResourceContainer", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIResourceContainer_ResourcePkg(), this.getResourcePkg(), null, "resourcePkg", null, 0, 1,
				IResourceContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourcePkgEClass, ResourcePkg.class, "ResourcePkg", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourcePkg_Resources(), this.getIResource(), null, "resources", null, 0, -1,
				ResourcePkg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iResourceEClass, IResource.class, "IResource", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(iProcessEClass, IProcess.class, "IProcess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIProcess_Enabled(), theEcorePackage.getEBoolean(), "enabled", "true", 0, 1, IProcess.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(iExecutionManagerEClass, IExecutionManager.class, "IExecutionManager", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //VulkanPackageImpl
