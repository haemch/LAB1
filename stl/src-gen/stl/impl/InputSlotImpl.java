/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.Connectors;
import stl.InputSlot;
import stl.ItemTypes;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.InputSlotImpl#getRequiredAsImput <em>Required As Imput</em>}</li>
 *   <li>{@link stl.impl.InputSlotImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputSlotImpl extends SlotsImpl implements InputSlot {
	/**
	 * The cached value of the '{@link #getRequiredAsImput() <em>Required As Imput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredAsImput()
	 * @generated
	 * @ordered
	 */
	protected ItemTypes requiredAsImput;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected Connectors connectors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.INPUT_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTypes getRequiredAsImput() {
		if (requiredAsImput != null && requiredAsImput.eIsProxy()) {
			InternalEObject oldRequiredAsImput = (InternalEObject) requiredAsImput;
			requiredAsImput = (ItemTypes) eResolveProxy(oldRequiredAsImput);
			if (requiredAsImput != oldRequiredAsImput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT,
							oldRequiredAsImput, requiredAsImput));
			}
		}
		return requiredAsImput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTypes basicGetRequiredAsImput() {
		return requiredAsImput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredAsImput(ItemTypes newRequiredAsImput) {
		ItemTypes oldRequiredAsImput = requiredAsImput;
		requiredAsImput = newRequiredAsImput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT,
					oldRequiredAsImput, requiredAsImput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectors getConnectors() {
		if (connectors != null && connectors.eIsProxy()) {
			InternalEObject oldConnectors = (InternalEObject) connectors;
			connectors = (Connectors) eResolveProxy(oldConnectors);
			if (connectors != oldConnectors) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.INPUT_SLOT__CONNECTORS,
							oldConnectors, connectors));
			}
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectors basicGetConnectors() {
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectors(Connectors newConnectors, NotificationChain msgs) {
		Connectors oldConnectors = connectors;
		connectors = newConnectors;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					StlPackage.INPUT_SLOT__CONNECTORS, oldConnectors, newConnectors);
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
	public void setConnectors(Connectors newConnectors) {
		if (newConnectors != connectors) {
			NotificationChain msgs = null;
			if (connectors != null)
				msgs = ((InternalEObject) connectors).eInverseRemove(this, StlPackage.CONNECTORS__INPUTSLOT,
						Connectors.class, msgs);
			if (newConnectors != null)
				msgs = ((InternalEObject) newConnectors).eInverseAdd(this, StlPackage.CONNECTORS__INPUTSLOT,
						Connectors.class, msgs);
			msgs = basicSetConnectors(newConnectors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.INPUT_SLOT__CONNECTORS, newConnectors,
					newConnectors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.INPUT_SLOT__CONNECTORS:
			if (connectors != null)
				msgs = ((InternalEObject) connectors).eInverseRemove(this, StlPackage.CONNECTORS__INPUTSLOT,
						Connectors.class, msgs);
			return basicSetConnectors((Connectors) otherEnd, msgs);
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
		case StlPackage.INPUT_SLOT__CONNECTORS:
			return basicSetConnectors(null, msgs);
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
		case StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT:
			if (resolve)
				return getRequiredAsImput();
			return basicGetRequiredAsImput();
		case StlPackage.INPUT_SLOT__CONNECTORS:
			if (resolve)
				return getConnectors();
			return basicGetConnectors();
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
		case StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT:
			setRequiredAsImput((ItemTypes) newValue);
			return;
		case StlPackage.INPUT_SLOT__CONNECTORS:
			setConnectors((Connectors) newValue);
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
		case StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT:
			setRequiredAsImput((ItemTypes) null);
			return;
		case StlPackage.INPUT_SLOT__CONNECTORS:
			setConnectors((Connectors) null);
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
		case StlPackage.INPUT_SLOT__REQUIRED_AS_IMPUT:
			return requiredAsImput != null;
		case StlPackage.INPUT_SLOT__CONNECTORS:
			return connectors != null;
		}
		return super.eIsSet(featureID);
	}

} //InputSlotImpl
