/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import stl.Area;
import stl.Components;
import stl.Connectors;
import stl.InputSlot;
import stl.OutputSlot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectors</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ConnectorsImpl#getArea <em>Area</em>}</li>
 *   <li>{@link stl.impl.ConnectorsImpl#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.impl.ConnectorsImpl#getOutputslot <em>Outputslot</em>}</li>
 *   <li>{@link stl.impl.ConnectorsImpl#getInput_component <em>Input component</em>}</li>
 *   <li>{@link stl.impl.ConnectorsImpl#getOutput_component <em>Output component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorsImpl extends MinimalEObjectImpl.Container implements Connectors {
	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected Area area;

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
	 * The cached value of the '{@link #getInput_component() <em>Input component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput_component()
	 * @generated
	 * @ordered
	 */
	protected Components input_component;

	/**
	 * The cached value of the '{@link #getOutput_component() <em>Output component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput_component()
	 * @generated
	 * @ordered
	 */
	protected Components output_component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.CONNECTORS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area getArea() {
		if (area != null && area.eIsProxy()) {
			InternalEObject oldArea = (InternalEObject) area;
			area = (Area) eResolveProxy(oldArea);
			if (area != oldArea) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTORS__AREA, oldArea,
							area));
			}
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area basicGetArea() {
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArea(Area newArea, NotificationChain msgs) {
		Area oldArea = area;
		area = newArea;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__AREA,
					oldArea, newArea);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArea(Area newArea) {
		if (newArea != area) {
			NotificationChain msgs = null;
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this, StlPackage.AREA__CONNECTORS, Area.class, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this, StlPackage.AREA__CONNECTORS, Area.class, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__AREA, newArea, newArea));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTORS__INPUTSLOT,
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
	public NotificationChain basicSetInputslot(InputSlot newInputslot, NotificationChain msgs) {
		InputSlot oldInputslot = inputslot;
		inputslot = newInputslot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTORS__INPUTSLOT, oldInputslot, newInputslot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputslot(InputSlot newInputslot) {
		if (newInputslot != inputslot) {
			NotificationChain msgs = null;
			if (inputslot != null)
				msgs = ((InternalEObject) inputslot).eInverseRemove(this, StlPackage.INPUT_SLOT__CONNECTORS,
						InputSlot.class, msgs);
			if (newInputslot != null)
				msgs = ((InternalEObject) newInputslot).eInverseAdd(this, StlPackage.INPUT_SLOT__CONNECTORS,
						InputSlot.class, msgs);
			msgs = basicSetInputslot(newInputslot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__INPUTSLOT, newInputslot,
					newInputslot));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTORS__OUTPUTSLOT,
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
	public NotificationChain basicSetOutputslot(OutputSlot newOutputslot, NotificationChain msgs) {
		OutputSlot oldOutputslot = outputslot;
		outputslot = newOutputslot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.CONNECTORS__OUTPUTSLOT, oldOutputslot, newOutputslot);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputslot(OutputSlot newOutputslot) {
		if (newOutputslot != outputslot) {
			NotificationChain msgs = null;
			if (outputslot != null)
				msgs = ((InternalEObject) outputslot).eInverseRemove(this, StlPackage.OUTPUT_SLOT__CONNECTORS,
						OutputSlot.class, msgs);
			if (newOutputslot != null)
				msgs = ((InternalEObject) newOutputslot).eInverseAdd(this, StlPackage.OUTPUT_SLOT__CONNECTORS,
						OutputSlot.class, msgs);
			msgs = basicSetOutputslot(newOutputslot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__OUTPUTSLOT, newOutputslot,
					newOutputslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getInput_component() {
		if (input_component != null && input_component.eIsProxy()) {
			InternalEObject oldInput_component = (InternalEObject) input_component;
			input_component = (Components) eResolveProxy(oldInput_component);
			if (input_component != oldInput_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTORS__INPUT_COMPONENT,
							oldInput_component, input_component));
			}
		}
		return input_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components basicGetInput_component() {
		return input_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput_component(Components newInput_component) {
		Components oldInput_component = input_component;
		input_component = newInput_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__INPUT_COMPONENT,
					oldInput_component, input_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components getOutput_component() {
		if (output_component != null && output_component.eIsProxy()) {
			InternalEObject oldOutput_component = (InternalEObject) output_component;
			output_component = (Components) eResolveProxy(oldOutput_component);
			if (output_component != oldOutput_component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.CONNECTORS__OUTPUT_COMPONENT,
							oldOutput_component, output_component));
			}
		}
		return output_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Components basicGetOutput_component() {
		return output_component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput_component(Components newOutput_component) {
		Components oldOutput_component = output_component;
		output_component = newOutput_component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.CONNECTORS__OUTPUT_COMPONENT,
					oldOutput_component, output_component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.CONNECTORS__AREA:
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this, StlPackage.AREA__CONNECTORS, Area.class, msgs);
			return basicSetArea((Area) otherEnd, msgs);
		case StlPackage.CONNECTORS__INPUTSLOT:
			if (inputslot != null)
				msgs = ((InternalEObject) inputslot).eInverseRemove(this, StlPackage.INPUT_SLOT__CONNECTORS,
						InputSlot.class, msgs);
			return basicSetInputslot((InputSlot) otherEnd, msgs);
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			if (outputslot != null)
				msgs = ((InternalEObject) outputslot).eInverseRemove(this, StlPackage.OUTPUT_SLOT__CONNECTORS,
						OutputSlot.class, msgs);
			return basicSetOutputslot((OutputSlot) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.CONNECTORS__AREA:
			return basicSetArea(null, msgs);
		case StlPackage.CONNECTORS__INPUTSLOT:
			return basicSetInputslot(null, msgs);
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			return basicSetOutputslot(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.CONNECTORS__AREA:
			if (resolve)
				return getArea();
			return basicGetArea();
		case StlPackage.CONNECTORS__INPUTSLOT:
			if (resolve)
				return getInputslot();
			return basicGetInputslot();
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			if (resolve)
				return getOutputslot();
			return basicGetOutputslot();
		case StlPackage.CONNECTORS__INPUT_COMPONENT:
			if (resolve)
				return getInput_component();
			return basicGetInput_component();
		case StlPackage.CONNECTORS__OUTPUT_COMPONENT:
			if (resolve)
				return getOutput_component();
			return basicGetOutput_component();
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
		case StlPackage.CONNECTORS__AREA:
			setArea((Area) newValue);
			return;
		case StlPackage.CONNECTORS__INPUTSLOT:
			setInputslot((InputSlot) newValue);
			return;
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			setOutputslot((OutputSlot) newValue);
			return;
		case StlPackage.CONNECTORS__INPUT_COMPONENT:
			setInput_component((Components) newValue);
			return;
		case StlPackage.CONNECTORS__OUTPUT_COMPONENT:
			setOutput_component((Components) newValue);
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
		case StlPackage.CONNECTORS__AREA:
			setArea((Area) null);
			return;
		case StlPackage.CONNECTORS__INPUTSLOT:
			setInputslot((InputSlot) null);
			return;
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			setOutputslot((OutputSlot) null);
			return;
		case StlPackage.CONNECTORS__INPUT_COMPONENT:
			setInput_component((Components) null);
			return;
		case StlPackage.CONNECTORS__OUTPUT_COMPONENT:
			setOutput_component((Components) null);
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
		case StlPackage.CONNECTORS__AREA:
			return area != null;
		case StlPackage.CONNECTORS__INPUTSLOT:
			return inputslot != null;
		case StlPackage.CONNECTORS__OUTPUTSLOT:
			return outputslot != null;
		case StlPackage.CONNECTORS__INPUT_COMPONENT:
			return input_component != null;
		case StlPackage.CONNECTORS__OUTPUT_COMPONENT:
			return output_component != null;
		}
		return super.eIsSet(featureID);
	}

} //ConnectorsImpl
