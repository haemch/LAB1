/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import stl.Area;
import stl.Components;
import stl.Service;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ComponentsImpl#getArea <em>Area</em>}</li>
 *   <li>{@link stl.impl.ComponentsImpl#getName <em>Name</em>}</li>
 *   <li>{@link stl.impl.ComponentsImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.impl.ComponentsImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ComponentsImpl extends MinimalEObjectImpl.Container implements Components {
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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected static final int COSTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCosts() <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCosts()
	 * @generated
	 * @ordered
	 */
	protected int costs = COSTS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.COMPONENTS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StlPackage.COMPONENTS__AREA, oldArea,
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENTS__AREA,
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
				msgs = ((InternalEObject) area).eInverseRemove(this, StlPackage.AREA__COMPONENTS, Area.class, msgs);
			if (newArea != null)
				msgs = ((InternalEObject) newArea).eInverseAdd(this, StlPackage.AREA__COMPONENTS, Area.class, msgs);
			msgs = basicSetArea(newArea, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENTS__AREA, newArea, newArea));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENTS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCosts() {
		return costs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCosts(int newCosts) {
		int oldCosts = costs;
		costs = newCosts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.COMPONENTS__COSTS, oldCosts, costs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectResolvingEList<Service>(Service.class, this, StlPackage.COMPONENTS__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.COMPONENTS__AREA:
			if (area != null)
				msgs = ((InternalEObject) area).eInverseRemove(this, StlPackage.AREA__COMPONENTS, Area.class, msgs);
			return basicSetArea((Area) otherEnd, msgs);
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
		case StlPackage.COMPONENTS__AREA:
			return basicSetArea(null, msgs);
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
		case StlPackage.COMPONENTS__AREA:
			if (resolve)
				return getArea();
			return basicGetArea();
		case StlPackage.COMPONENTS__NAME:
			return getName();
		case StlPackage.COMPONENTS__COSTS:
			return getCosts();
		case StlPackage.COMPONENTS__SERVICE:
			return getService();
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
		case StlPackage.COMPONENTS__AREA:
			setArea((Area) newValue);
			return;
		case StlPackage.COMPONENTS__NAME:
			setName((String) newValue);
			return;
		case StlPackage.COMPONENTS__COSTS:
			setCosts((Integer) newValue);
			return;
		case StlPackage.COMPONENTS__SERVICE:
			getService().clear();
			getService().addAll((Collection<? extends Service>) newValue);
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
		case StlPackage.COMPONENTS__AREA:
			setArea((Area) null);
			return;
		case StlPackage.COMPONENTS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StlPackage.COMPONENTS__COSTS:
			setCosts(COSTS_EDEFAULT);
			return;
		case StlPackage.COMPONENTS__SERVICE:
			getService().clear();
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
		case StlPackage.COMPONENTS__AREA:
			return area != null;
		case StlPackage.COMPONENTS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StlPackage.COMPONENTS__COSTS:
			return costs != COSTS_EDEFAULT;
		case StlPackage.COMPONENTS__SERVICE:
			return service != null && !service.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", costs: ");
		result.append(costs);
		result.append(')');
		return result.toString();
	}

} //ComponentsImpl
