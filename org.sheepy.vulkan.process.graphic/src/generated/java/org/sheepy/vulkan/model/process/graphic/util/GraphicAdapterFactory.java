/**
 */
package org.sheepy.vulkan.model.process.graphic.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sheepy.vulkan.model.IGraphicProcessPool;
import org.sheepy.vulkan.model.IProcessPool;

import org.sheepy.vulkan.model.process.AbstractPipeline;
import org.sheepy.vulkan.model.process.AbstractProcess;
import org.sheepy.vulkan.model.process.AbstractProcessPool;
import org.sheepy.vulkan.model.process.Configuration;
import org.sheepy.vulkan.model.process.IProcessUnit;
import org.sheepy.vulkan.model.process.PipelineBarrier;
import org.sheepy.vulkan.model.process.graphic.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sheepy.vulkan.model.process.graphic.GraphicPackage
 * @generated
 */
public class GraphicAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GraphicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphicAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = GraphicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphicSwitch<Adapter> modelSwitch =
		new GraphicSwitch<Adapter>()
		{
			@Override
			public Adapter caseGraphicConfiguration(GraphicConfiguration object)
			{
				return createGraphicConfigurationAdapter();
			}
			@Override
			public Adapter caseRenderPassInfo(RenderPassInfo object)
			{
				return createRenderPassInfoAdapter();
			}
			@Override
			public Adapter caseSubpassDependency(SubpassDependency object)
			{
				return createSubpassDependencyAdapter();
			}
			@Override
			public Adapter caseAttachmentDescription(AttachmentDescription object)
			{
				return createAttachmentDescriptionAdapter();
			}
			@Override
			public Adapter caseGraphicProcessPool(GraphicProcessPool object)
			{
				return createGraphicProcessPoolAdapter();
			}
			@Override
			public Adapter caseGraphicProcess(GraphicProcess object)
			{
				return createGraphicProcessAdapter();
			}
			@Override
			public Adapter caseGraphicsPipeline(GraphicsPipeline object)
			{
				return createGraphicsPipelineAdapter();
			}
			@Override
			public Adapter caseImagePipeline(ImagePipeline object)
			{
				return createImagePipelineAdapter();
			}
			@Override
			public Adapter casePipelineImageBarrier(PipelineImageBarrier object)
			{
				return createPipelineImageBarrierAdapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object)
			{
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseIProcessPool(IProcessPool object)
			{
				return createIProcessPoolAdapter();
			}
			@Override
			public <T extends AbstractProcess> Adapter caseAbstractProcessPool(AbstractProcessPool<T> object)
			{
				return createAbstractProcessPoolAdapter();
			}
			@Override
			public Adapter caseIGraphicProcessPool(IGraphicProcessPool object)
			{
				return createIGraphicProcessPoolAdapter();
			}
			@Override
			public Adapter caseAbstractProcess(AbstractProcess object)
			{
				return createAbstractProcessAdapter();
			}
			@Override
			public Adapter caseIProcessUnit(IProcessUnit object)
			{
				return createIProcessUnitAdapter();
			}
			@Override
			public Adapter caseAbstractPipeline(AbstractPipeline object)
			{
				return createAbstractPipelineAdapter();
			}
			@Override
			public Adapter casePipelineBarrier(PipelineBarrier object)
			{
				return createPipelineBarrierAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.GraphicConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.GraphicConfiguration
	 * @generated
	 */
	public Adapter createGraphicConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.RenderPassInfo <em>Render Pass Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.RenderPassInfo
	 * @generated
	 */
	public Adapter createRenderPassInfoAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.SubpassDependency <em>Subpass Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.SubpassDependency
	 * @generated
	 */
	public Adapter createSubpassDependencyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.AttachmentDescription <em>Attachment Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.AttachmentDescription
	 * @generated
	 */
	public Adapter createAttachmentDescriptionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.GraphicProcessPool <em>Process Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.GraphicProcessPool
	 * @generated
	 */
	public Adapter createGraphicProcessPoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.GraphicProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.GraphicProcess
	 * @generated
	 */
	public Adapter createGraphicProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.GraphicsPipeline <em>Graphics Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.GraphicsPipeline
	 * @generated
	 */
	public Adapter createGraphicsPipelineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.ImagePipeline <em>Image Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.ImagePipeline
	 * @generated
	 */
	public Adapter createImagePipelineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.graphic.PipelineImageBarrier <em>Pipeline Image Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.graphic.PipelineImageBarrier
	 * @generated
	 */
	public Adapter createPipelineImageBarrierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.IProcessPool <em>IProcess Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.IProcessPool
	 * @generated
	 */
	public Adapter createIProcessPoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.AbstractProcessPool <em>Abstract Process Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.AbstractProcessPool
	 * @generated
	 */
	public Adapter createAbstractProcessPoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.IGraphicProcessPool <em>IGraphic Process Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.IGraphicProcessPool
	 * @generated
	 */
	public Adapter createIGraphicProcessPoolAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.AbstractProcess <em>Abstract Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.AbstractProcess
	 * @generated
	 */
	public Adapter createAbstractProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.IProcessUnit <em>IProcess Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.IProcessUnit
	 * @generated
	 */
	public Adapter createIProcessUnitAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.AbstractPipeline <em>Abstract Pipeline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.AbstractPipeline
	 * @generated
	 */
	public Adapter createAbstractPipelineAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.sheepy.vulkan.model.process.PipelineBarrier <em>Pipeline Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.sheepy.vulkan.model.process.PipelineBarrier
	 * @generated
	 */
	public Adapter createPipelineBarrierAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //GraphicAdapterFactory