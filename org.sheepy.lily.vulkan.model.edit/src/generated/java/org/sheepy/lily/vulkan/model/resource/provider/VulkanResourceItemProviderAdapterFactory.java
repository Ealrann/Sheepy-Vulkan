/**
 */
package org.sheepy.lily.vulkan.model.resource.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.command.CommandParameter;

import org.eclipse.emf.edit.domain.EditingDomain;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.sheepy.lily.core.model.resource.ResourcePackage;
import org.sheepy.lily.core.model.resource.ResourcePkg;

import org.sheepy.lily.core.model.resource.util.ResourceSwitch;
import org.sheepy.lily.vulkan.model.process.compute.provider.LilyVulkanEditPlugin;
import org.sheepy.lily.vulkan.model.resource.VulkanResourceFactory;
import org.sheepy.lily.vulkan.model.resource.VulkanResourcePackage;

import org.sheepy.lily.vulkan.model.resource.util.VulkanResourceAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VulkanResourceItemProviderAdapterFactory extends VulkanResourceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IChildCreationExtender
{
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(LilyVulkanEditPlugin.INSTANCE, VulkanResourcePackage.eNS_URI);

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VulkanResourceItemProviderAdapterFactory()
	{
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.TransferBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferBufferItemProvider transferBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.TransferBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransferBufferAdapter()
	{
		if (transferBufferItemProvider == null) {
			transferBufferItemProvider = new TransferBufferItemProvider(this);
		}

		return transferBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.DescriptorPool} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorPoolItemProvider descriptorPoolItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.DescriptorPool}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptorPoolAdapter()
	{
		if (descriptorPoolItemProvider == null) {
			descriptorPoolItemProvider = new DescriptorPoolItemProvider(this);
		}

		return descriptorPoolItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ConstantBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantBufferItemProvider constantBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ConstantBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConstantBufferAdapter()
	{
		if (constantBufferItemProvider == null) {
			constantBufferItemProvider = new ConstantBufferItemProvider(this);
		}

		return constantBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.GenericConstantBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericConstantBufferItemProvider genericConstantBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.GenericConstantBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenericConstantBufferAdapter()
	{
		if (genericConstantBufferItemProvider == null) {
			genericConstantBufferItemProvider = new GenericConstantBufferItemProvider(this);
		}

		return genericConstantBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferReferenceItemProvider bufferReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferReferenceAdapter()
	{
		if (bufferReferenceItemProvider == null) {
			bufferReferenceItemProvider = new BufferReferenceItemProvider(this);
		}

		return bufferReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferDataProvider} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferDataProviderItemProvider bufferDataProviderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferDataProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferDataProviderAdapter()
	{
		if (bufferDataProviderItemProvider == null) {
			bufferDataProviderItemProvider = new BufferDataProviderItemProvider(this);
		}

		return bufferDataProviderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.StaticImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticImageItemProvider staticImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.StaticImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticImageAdapter()
	{
		if (staticImageItemProvider == null) {
			staticImageItemProvider = new StaticImageItemProvider(this);
		}

		return staticImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.FileImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileImageItemProvider fileImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.FileImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFileImageAdapter()
	{
		if (fileImageItemProvider == null) {
			fileImageItemProvider = new FileImageItemProvider(this);
		}

		return fileImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.FontImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontImageItemProvider fontImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.FontImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFontImageAdapter()
	{
		if (fontImageItemProvider == null) {
			fontImageItemProvider = new FontImageItemProvider(this);
		}

		return fontImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.CompositeImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeImageItemProvider compositeImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.CompositeImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeImageAdapter()
	{
		if (compositeImageItemProvider == null) {
			compositeImageItemProvider = new CompositeImageItemProvider(this);
		}

		return compositeImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageInlay} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageInlayItemProvider imageInlayItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageInlay}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageInlayAdapter()
	{
		if (imageInlayItemProvider == null) {
			imageInlayItemProvider = new ImageInlayItemProvider(this);
		}

		return imageInlayItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.SampledImage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampledImageItemProvider sampledImageItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.SampledImage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSampledImageAdapter()
	{
		if (sampledImageItemProvider == null) {
			sampledImageItemProvider = new SampledImageItemProvider(this);
		}

		return sampledImageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Sampler} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplerItemProvider samplerItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Sampler}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSamplerAdapter()
	{
		if (samplerItemProvider == null) {
			samplerItemProvider = new SamplerItemProvider(this);
		}

		return samplerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferDescriptorItemProvider bufferDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferDescriptorAdapter()
	{
		if (bufferDescriptorItemProvider == null) {
			bufferDescriptorItemProvider = new BufferDescriptorItemProvider(this);
		}

		return bufferDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageDescriptorItemProvider imageDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageDescriptorAdapter()
	{
		if (imageDescriptorItemProvider == null) {
			imageDescriptorItemProvider = new ImageDescriptorItemProvider(this);
		}

		return imageDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.SampledImageDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SampledImageDescriptorItemProvider sampledImageDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.SampledImageDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSampledImageDescriptorAdapter()
	{
		if (sampledImageDescriptorItemProvider == null) {
			sampledImageDescriptorItemProvider = new SampledImageDescriptorItemProvider(this);
		}

		return sampledImageDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.SamplerDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SamplerDescriptorItemProvider samplerDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.SamplerDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSamplerDescriptorAdapter()
	{
		if (samplerDescriptorItemProvider == null) {
			samplerDescriptorItemProvider = new SamplerDescriptorItemProvider(this);
		}

		return samplerDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.DescriptorSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DescriptorSetItemProvider descriptorSetItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.DescriptorSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDescriptorSetAdapter()
	{
		if (descriptorSetItemProvider == null) {
			descriptorSetItemProvider = new DescriptorSetItemProvider(this);
		}

		return descriptorSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferBarrierItemProvider bufferBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferBarrierAdapter()
	{
		if (bufferBarrierItemProvider == null) {
			bufferBarrierItemProvider = new BufferBarrierItemProvider(this);
		}

		return bufferBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageBarrier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageBarrierItemProvider imageBarrierItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageBarrier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageBarrierAdapter()
	{
		if (imageBarrierItemProvider == null) {
			imageBarrierItemProvider = new ImageBarrierItemProvider(this);
		}

		return imageBarrierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.Shader} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShaderItemProvider shaderItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.Shader}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createShaderAdapter()
	{
		if (shaderItemProvider == null) {
			shaderItemProvider = new ShaderItemProvider(this);
		}

		return shaderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.ImageArrayDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageArrayDescriptorItemProvider imageArrayDescriptorItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.ImageArrayDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createImageArrayDescriptorAdapter()
	{
		if (imageArrayDescriptorItemProvider == null) {
			imageArrayDescriptorItemProvider = new ImageArrayDescriptorItemProvider(this);
		}

		return imageArrayDescriptorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.MemoryChunk} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryChunkItemProvider memoryChunkItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.MemoryChunk}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMemoryChunkAdapter()
	{
		if (memoryChunkItemProvider == null) {
			memoryChunkItemProvider = new MemoryChunkItemProvider(this);
		}

		return memoryChunkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferMemory} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferMemoryItemProvider bufferMemoryItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferMemory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferMemoryAdapter()
	{
		if (bufferMemoryItemProvider == null) {
			bufferMemoryItemProvider = new BufferMemoryItemProvider(this);
		}

		return bufferMemoryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.StaticBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticBufferItemProvider staticBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.StaticBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStaticBufferAdapter()
	{
		if (staticBufferItemProvider == null) {
			staticBufferItemProvider = new StaticBufferItemProvider(this);
		}

		return staticBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.DataBuffer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataBufferItemProvider dataBufferItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.DataBuffer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataBufferAdapter()
	{
		if (dataBufferItemProvider == null) {
			dataBufferItemProvider = new DataBufferItemProvider(this);
		}

		return dataBufferItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.sheepy.lily.vulkan.model.resource.BufferViewer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BufferViewerItemProvider bufferViewerItemProvider;

	/**
	 * This creates an adapter for a {@link org.sheepy.lily.vulkan.model.resource.BufferViewer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBufferViewerAdapter()
	{
		if (bufferViewerItemProvider == null) {
			bufferViewerItemProvider = new BufferViewerItemProvider(this);
		}

		return bufferViewerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory()
	{
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory)
	{
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type)
	{
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type)
	{
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type)
	{
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders()
	{
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain)
	{
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator()
	{
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener)
	{
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification)
	{
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * A child creation extender for the {@link ResourcePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class ResourceChildCreationExtender implements IChildCreationExtender
	{
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends ResourceSwitch<Object>
		{
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) 
			{
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseResourcePkg(ResourcePkg object)
			{
				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createTransferBuffer()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createConstantBuffer()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createGenericConstantBuffer()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createFileImage()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createFontImage()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createCompositeImage()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createSampledImage()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createSampler()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createShader()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createMemoryChunk()));

				newChildDescriptors.add
					(createChildParameter
						(ResourcePackage.Literals.RESOURCE_PKG__RESOURCES,
						 VulkanResourceFactory.eINSTANCE.createStaticImage()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child)
			{
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain)
		{
			ArrayList<Object> result = new ArrayList<Object>();
			new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
			return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		@Override
		public ResourceLocator getResourceLocator()
		{
			return LilyVulkanEditPlugin.INSTANCE;
		}
	}

}
