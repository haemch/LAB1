/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.Conveyor;
import stl.InputSlot;
import stl.OutputSlot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conveyor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ConveyorImpl#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.impl.ConveyorImpl#getOutputslot <em>Outputslot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConveyorImpl extends ComponentsImpl implements Conveyor {
	/**
	 * The cached value of the '{@link #getInputslot() <em>Inputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputslot()
	 * @generated
	 * @ordered
	 */
	protected InputSlot inputslot;

	/**
	 * The cached value of the '{@link #getOutputslot() <em>Outputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputslot()
	 * @generated
	 * @ordered
	 */
	protected OutputSlot outputslot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConveyorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.CONVEYOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSlot getInputslot() {
		if (inputslot != null && inputslot.eIsProxy()) {
			InternalEObject oldInputslot = (InternalEObject) inputslot;
			inputslot = (InputSlot) eResolveProxy(oldInputslot);
			if (inputslot != oldInputslot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONVEYOR__INPUTSLOT,
							oldInputslot, inputslot));
			}
		}
		return inputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSlot basicGetInputslot() {
		return inputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputslot(InputSlot newInputslot) {
		InputSlot oldInputslot = inputslot;
		inputslot = newInputslot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONVEYOR__INPUTSLOT, oldInputslot,
					inputslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSlot getOutputslot() {
		if (outputslot != null && outputslot.eIsProxy()) {
			InternalEObject oldOutputslot = (InternalEObject) outputslot;
			outputslot = (OutputSlot) eResolveProxy(oldOutputslot);
			if (outputslot != oldOutputslot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONVEYOR__OUTPUTSLOT,
							oldOutputslot, outputslot));
			}
		}
		return outputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSlot basicGetOutputslot() {
		return outputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputslot(OutputSlot newOutputslot) {
		OutputSlot oldOutputslot = outputslot;
		outputslot = newOutputslot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONVEYOR__OUTPUTSLOT, oldOutputslot,
					outputslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.CONVEYOR__INPUTSLOT:
			if (resolve)
				return getInputslot();
			return basicGetInputslot();
		case StlPackage.CONVEYOR__OUTPUTSLOT:
			if (resolve)
				return getOutputslot();
			return basicGetOutputslot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.CONVEYOR__INPUTSLOT:
			setInputslot((InputSlot) newValue);
			return;
		case StlPackage.CONVEYOR__OUTPUTSLOT:
			setOutputslot((OutputSlot) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case StlPackage.CONVEYOR__INPUTSLOT:
			setInputslot((InputSlot) null);
			return;
		case StlPackage.CONVEYOR__OUTPUTSLOT:
			setOutputslot((OutputSlot) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case StlPackage.CONVEYOR__INPUTSLOT:
			return inputslot != null;
		case StlPackage.CONVEYOR__OUTPUTSLOT:
			return outputslot != null;
		}
		return super.eIsSet(featureID);
	}

} //ConveyorImpl
