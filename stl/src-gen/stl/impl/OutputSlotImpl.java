/**
 */
package stl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import stl.Connectors;
import stl.ItemTypes;
import stl.OutputSlot;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Output Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.OutputSlotImpl#getProducedAsOutput <em>Produced As Output</em>}</li>
 *   <li>{@link stl.impl.OutputSlotImpl#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OutputSlotImpl extends SlotsImpl implements OutputSlot {
	/**
	 * The cached value of the '{@link #getProducedAsOutput() <em>Produced As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducedAsOutput()
	 * @generated
	 * @ordered
	 */
	protected ItemTypes producedAsOutput;

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
	protected OutputSlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.OUTPUT_SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTypes getProducedAsOutput() {
		if (producedAsOutput != null && producedAsOutput.eIsProxy()) {
			InternalEObject oldProducedAsOutput = (InternalEObject) producedAsOutput;
			producedAsOutput = (ItemTypes) eResolveProxy(oldProducedAsOutput);
			if (producedAsOutput != oldProducedAsOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT, oldProducedAsOutput, producedAsOutput));
			}
		}
		return producedAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTypes basicGetProducedAsOutput() {
		return producedAsOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProducedAsOutput(ItemTypes newProducedAsOutput) {
		ItemTypes oldProducedAsOutput = producedAsOutput;
		producedAsOutput = newProducedAsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT,
					oldProducedAsOutput, producedAsOutput));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.OUTPUT_SLOT__CONNECTORS,
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
					StlPackage.OUTPUT_SLOT__CONNECTORS, oldConnectors, newConnectors);
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
				msgs = ((InternalEObject) connectors).eInverseRemove(this, StlPackage.CONNECTORS__OUTPUTSLOT,
						Connectors.class, msgs);
			if (newConnectors != null)
				msgs = ((InternalEObject) newConnectors).eInverseAdd(this, StlPackage.CONNECTORS__OUTPUTSLOT,
						Connectors.class, msgs);
			msgs = basicSetConnectors(newConnectors, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.OUTPUT_SLOT__CONNECTORS, newConnectors,
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
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
			if (connectors != null)
				msgs = ((InternalEObject) connectors).eInverseRemove(this, StlPackage.CONNECTORS__OUTPUTSLOT,
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
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
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
		case StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT:
			if (resolve)
				return getProducedAsOutput();
			return basicGetProducedAsOutput();
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
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
		case StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT:
			setProducedAsOutput((ItemTypes) newValue);
			return;
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
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
		case StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT:
			setProducedAsOutput((ItemTypes) null);
			return;
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
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
		case StlPackage.OUTPUT_SLOT__PRODUCED_AS_OUTPUT:
			return producedAsOutput != null;
		case StlPackage.OUTPUT_SLOT__CONNECTORS:
			return connectors != null;
		}
		return super.eIsSet(featureID);
	}

} //OutputSlotImpl
