/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import stl.InputSlot;
import stl.ItemTypes;
import stl.StlPackage;
import stl.WasteStore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waste Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.WasteStoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link stl.impl.WasteStoreImpl#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.impl.WasteStoreImpl#getItemtypes <em>Itemtypes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WasteStoreImpl extends ComponentsImpl implements WasteStore {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

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
	 * The cached value of the '{@link #getItemtypes() <em>Itemtypes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemTypes> itemtypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WasteStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.WASTE_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.WASTE_STORE__CAPACITY, oldCapacity,
					capacity));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.WASTE_STORE__INPUTSLOT,
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
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.WASTE_STORE__INPUTSLOT, oldInputslot,
					inputslot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemTypes> getItemtypes() {
		if (itemtypes == null) {
			itemtypes = new EObjectResolvingEList<ItemTypes>(ItemTypes.class, this, StlPackage.WASTE_STORE__ITEMTYPES);
		}
		return itemtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.WASTE_STORE__CAPACITY:
			return getCapacity();
		case StlPackage.WASTE_STORE__INPUTSLOT:
			if (resolve)
				return getInputslot();
			return basicGetInputslot();
		case StlPackage.WASTE_STORE__ITEMTYPES:
			return getItemtypes();
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
		case StlPackage.WASTE_STORE__CAPACITY:
			setCapacity((Integer) newValue);
			return;
		case StlPackage.WASTE_STORE__INPUTSLOT:
			setInputslot((InputSlot) newValue);
			return;
		case StlPackage.WASTE_STORE__ITEMTYPES:
			getItemtypes().clear();
			getItemtypes().addAll((Collection<? extends ItemTypes>) newValue);
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
		case StlPackage.WASTE_STORE__CAPACITY:
			setCapacity(CAPACITY_EDEFAULT);
			return;
		case StlPackage.WASTE_STORE__INPUTSLOT:
			setInputslot((InputSlot) null);
			return;
		case StlPackage.WASTE_STORE__ITEMTYPES:
			getItemtypes().clear();
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
		case StlPackage.WASTE_STORE__CAPACITY:
			return capacity != CAPACITY_EDEFAULT;
		case StlPackage.WASTE_STORE__INPUTSLOT:
			return inputslot != null;
		case StlPackage.WASTE_STORE__ITEMTYPES:
			return itemtypes != null && !itemtypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //WasteStoreImpl
