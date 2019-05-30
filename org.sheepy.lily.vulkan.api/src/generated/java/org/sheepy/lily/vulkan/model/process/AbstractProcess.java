/**
 */
package org.sheepy.lily.vulkan.model.process;

import org.eclipse.emf.common.util.EList;
import org.sheepy.lily.vulkan.model.IProcess;
import org.sheepy.lily.vulkan.model.resource.Semaphore;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#isWaitingFenceDuringAcquire <em>Waiting Fence During Acquire</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#getPartPkg <em>Part Pkg</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#isResetAllowed <em>Reset Allowed</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#getSignals <em>Signals</em>}</li>
 *   <li>{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#getWaitFor <em>Wait For</em>}</li>
 * </ul>
 *
 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess()
 * @model abstract="true"
 * @generated
 */
public interface AbstractProcess extends IProcess
{
	/**
	 * Returns the value of the '<em><b>Waiting Fence During Acquire</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Waiting Fence During Acquire</em>' attribute.
	 * @see #setWaitingFenceDuringAcquire(boolean)
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess_WaitingFenceDuringAcquire()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isWaitingFenceDuringAcquire();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#isWaitingFenceDuringAcquire <em>Waiting Fence During Acquire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Waiting Fence During Acquire</em>' attribute.
	 * @see #isWaitingFenceDuringAcquire()
	 * @generated
	 */
	void setWaitingFenceDuringAcquire(boolean value);

	/**
	 * Returns the value of the '<em><b>Part Pkg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Pkg</em>' containment reference.
	 * @see #setPartPkg(ProcessPartPkg)
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess_PartPkg()
	 * @model containment="true"
	 * @generated
	 */
	ProcessPartPkg getPartPkg();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#getPartPkg <em>Part Pkg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Pkg</em>' containment reference.
	 * @see #getPartPkg()
	 * @generated
	 */
	void setPartPkg(ProcessPartPkg value);

	/**
	 * Returns the value of the '<em><b>Reset Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Allowed</em>' attribute.
	 * @see #setResetAllowed(boolean)
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess_ResetAllowed()
	 * @model unique="false"
	 * @generated
	 */
	boolean isResetAllowed();

	/**
	 * Sets the value of the '{@link org.sheepy.lily.vulkan.model.process.AbstractProcess#isResetAllowed <em>Reset Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reset Allowed</em>' attribute.
	 * @see #isResetAllowed()
	 * @generated
	 */
	void setResetAllowed(boolean value);

	/**
	 * Returns the value of the '<em><b>Signals</b></em>' reference list.
	 * The list contents are of type {@link org.sheepy.lily.vulkan.model.resource.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signals</em>' reference list.
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess_Signals()
	 * @model
	 * @generated
	 */
	EList<Semaphore> getSignals();

	/**
	 * Returns the value of the '<em><b>Wait For</b></em>' reference list.
	 * The list contents are of type {@link org.sheepy.lily.vulkan.model.resource.Semaphore}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wait For</em>' reference list.
	 * @see org.sheepy.lily.vulkan.model.process.ProcessPackage#getAbstractProcess_WaitFor()
	 * @model
	 * @generated
	 */
	EList<Semaphore> getWaitFor();

} // AbstractProcess
