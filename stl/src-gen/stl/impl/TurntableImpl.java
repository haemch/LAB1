/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import stl.InputSlot;
import stl.OutputSlot;
import stl.StlPackage;
import stl.Turntable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Turntable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.TurntableImpl#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.impl.TurntableImpl#getOutputslot <em>Outputslot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TurntableImpl extends ComponentsImpl implements Turntable {
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
	protected TurntableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.TURNTABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSlot> getInputslot() {
		if (inputslot == null) {
			inputslot = new EObjectResolvingEList<InputSlot>(InputSlot.class, this, StlPackage.TURNTABLE__INPUTSLOT);
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
			outputslot = new EObjectResolvingEList<OutputSlot>(OutputSlot.class, this,
					StlPackage.TURNTABLE__OUTPUTSLOT);
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
		case StlPackage.TURNTABLE__INPUTSLOT:
			return getInputslot();
		case StlPackage.TURNTABLE__OUTPUTSLOT:
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
		case StlPackage.TURNTABLE__INPUTSLOT:
			getInputslot().clear();
			getInputslot().addAll((Collection<? extends InputSlot>) newValue);
			return;
		case StlPackage.TURNTABLE__OUTPUTSLOT:
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
		case StlPackage.TURNTABLE__INPUTSLOT:
			getInputslot().clear();
			return;
		case StlPackage.TURNTABLE__OUTPUTSLOT:
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
		case StlPackage.TURNTABLE__INPUTSLOT:
			return inputslot != null && !inputslot.isEmpty();
		case StlPackage.TURNTABLE__OUTPUTSLOT:
			return outputslot != null && !outputslot.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TurntableImpl
