/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import stl.Area;
import stl.Components;
import stl.Connectors;
import stl.ItemTypes;
import stl.ProductionLineModel;
import stl.Service;
import stl.Slots;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getItemtypes <em>Itemtypes</em>}</li>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getArea <em>Area</em>}</li>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link stl.impl.ProductionLineModelImpl#getService <em>Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineModelImpl extends MinimalEObjectImpl.Container implements ProductionLineModel {
	/**
	 * The cached value of the '{@link #getItemtypes() <em>Itemtypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemtypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ItemTypes> itemtypes;

	/**
	 * The cached value of the '{@link #getArea() <em>Area</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArea()
	 * @generated
	 * @ordered
	 */
	protected EList<Area> area;

	/**
	 * The cached value of the '{@link #getConnectors() <em>Connectors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connectors> connectors;

	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Components> components;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slots> slots;

	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference list.
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
	protected ProductionLineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.PRODUCTION_LINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemTypes> getItemtypes() {
		if (itemtypes == null) {
			itemtypes = new EObjectContainmentEList<ItemTypes>(ItemTypes.class, this,
					StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES);
		}
		return itemtypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Area> getArea() {
		if (area == null) {
			area = new EObjectContainmentEList<Area>(Area.class, this, StlPackage.PRODUCTION_LINE_MODEL__AREA);
		}
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connectors> getConnectors() {
		if (connectors == null) {
			connectors = new EObjectContainmentEList<Connectors>(Connectors.class, this,
					StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS);
		}
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Components> getComponents() {
		if (components == null) {
			components = new EObjectContainmentEList<Components>(Components.class, this,
					StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Slots> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentEList<Slots>(Slots.class, this, StlPackage.PRODUCTION_LINE_MODEL__SLOTS);
		}
		return slots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectContainmentEList<Service>(Service.class, this,
					StlPackage.PRODUCTION_LINE_MODEL__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
			return ((InternalEList<?>) getItemtypes()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
			return ((InternalEList<?>) getArea()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
			return ((InternalEList<?>) getConnectors()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
			return ((InternalEList<?>) getComponents()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
			return ((InternalEList<?>) getSlots()).basicRemove(otherEnd, msgs);
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
			return ((InternalEList<?>) getService()).basicRemove(otherEnd, msgs);
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
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
			return getItemtypes();
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
			return getArea();
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
			return getConnectors();
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
			return getComponents();
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
			return getSlots();
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
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
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
			getItemtypes().clear();
			getItemtypes().addAll((Collection<? extends ItemTypes>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
			getArea().clear();
			getArea().addAll((Collection<? extends Area>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
			getConnectors().clear();
			getConnectors().addAll((Collection<? extends Connectors>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
			getComponents().clear();
			getComponents().addAll((Collection<? extends Components>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
			getSlots().clear();
			getSlots().addAll((Collection<? extends Slots>) newValue);
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
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
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
			getItemtypes().clear();
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
			getArea().clear();
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
			getConnectors().clear();
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
			getComponents().clear();
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
			getSlots().clear();
			return;
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
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
		case StlPackage.PRODUCTION_LINE_MODEL__ITEMTYPES:
			return itemtypes != null && !itemtypes.isEmpty();
		case StlPackage.PRODUCTION_LINE_MODEL__AREA:
			return area != null && !area.isEmpty();
		case StlPackage.PRODUCTION_LINE_MODEL__CONNECTORS:
			return connectors != null && !connectors.isEmpty();
		case StlPackage.PRODUCTION_LINE_MODEL__COMPONENTS:
			return components != null && !components.isEmpty();
		case StlPackage.PRODUCTION_LINE_MODEL__SLOTS:
			return slots != null && !slots.isEmpty();
		case StlPackage.PRODUCTION_LINE_MODEL__SERVICE:
			return service != null && !service.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProductionLineModelImpl
