/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import stl.InputSlot;
import stl.Machine;
import stl.OutputSlot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.MachineImpl#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.impl.MachineImpl#getOutputslot <em>Outputslot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineImpl extends ComponentsImpl implements Machine {
	/**
	 * The cached value of the '{@link #getInputslot() <em>Inputslot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputslot()
	 * @generated
	 * @ordered
	 */
	protected EList<InputSlot> inputslot;

	/**
	 * The cached value of the '{@link #getOutputslot() <em>Outputslot</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputslot()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputSlot> outputslot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSlot> getInputslot() {
		if (inputslot == null) {
			inputslot = new EObjectResolvingEList<InputSlot>(InputSlot.class, this, StlPackage.MACHINE__INPUTSLOT);
		}
		return inputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputSlot> getOutputslot() {
		if (outputslot == null) {
			outputslot = new EObjectResolvingEList<OutputSlot>(OutputSlot.class, this, StlPackage.MACHINE__OUTPUTSLOT);
		}
		return outputslot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.MACHINE__INPUTSLOT:
			return getInputslot();
		case StlPackage.MACHINE__OUTPUTSLOT:
			return getOutputslot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case StlPackage.MACHINE__INPUTSLOT:
			getInputslot().clear();
			getInputslot().addAll((Collection<? extends InputSlot>) newValue);
			return;
		case StlPackage.MACHINE__OUTPUTSLOT:
			getOutputslot().clear();
			getOutputslot().addAll((Collection<? extends OutputSlot>) newValue);
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
		case StlPackage.MACHINE__INPUTSLOT:
			getInputslot().clear();
			return;
		case StlPackage.MACHINE__OUTPUTSLOT:
			getOutputslot().clear();
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
		case StlPackage.MACHINE__INPUTSLOT:
			return inputslot != null && !inputslot.isEmpty();
		case StlPackage.MACHINE__OUTPUTSLOT:
			return outputslot != null && !outputslot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MachineImpl
