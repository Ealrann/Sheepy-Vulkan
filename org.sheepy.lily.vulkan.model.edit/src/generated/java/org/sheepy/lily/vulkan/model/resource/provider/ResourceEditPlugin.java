/**
 */
package org.sheepy.lily.vulkan.model.resource.provider;

import org.eclipse.emf.common.EMFPlugin;

import org.eclipse.emf.common.util.ResourceLocator;
import org.sheepy.lily.core.model.action.provider.ActionEditPlugin;
import org.sheepy.lily.core.model.application.provider.ApplicationEditPlugin;
import org.sheepy.lily.core.model.inference.provider.InferenceEditPlugin;
import org.sheepy.lily.core.model.root.provider.RootEditPlugin;
import org.sheepy.lily.core.model.types.provider.TypesEditPlugin;
import org.sheepy.lily.vulkan.model.enumeration.provider.EnumerationEditPlugin;
import org.sheepy.lily.vulkan.model.provider.VulkanEditPlugin;

/**
 * This is the central singleton for the Resource edit plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class ResourceEditPlugin extends EMFPlugin
{
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ResourceEditPlugin INSTANCE = new ResourceEditPlugin();

	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceEditPlugin()
	{
		super
		  (new ResourceLocator [] 
		   {
		     VulkanEditPlugin.INSTANCE,
		     TypesEditPlugin.INSTANCE,
		     EnumerationEditPlugin.INSTANCE,
		     ApplicationEditPlugin.INSTANCE,
		     RootEditPlugin.INSTANCE,
		     InferenceEditPlugin.INSTANCE,
		     ActionEditPlugin.INSTANCE,
		   });
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator()
	{
		return plugin;
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin()
	{
		return plugin;
	}

	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipsePlugin
	{
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation()
		{
			super();

			// Remember the static instance.
			//
			plugin = this;
		}
	}

}