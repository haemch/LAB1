/**
 */
package stl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import stl.Service;
import stl.StlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link stl.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getTime <em>Time</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.impl.ServiceImpl#getNamedParameters <em>Named Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends MinimalEObjectImpl.Container implements Service {
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
	 * The default value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected static final double RELIABILITY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected double reliability = RELIABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

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
	 * The cached value of the '{@link #getNamedParameters() <em>Named Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamedParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> namedParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StlPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getReliability() {
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReliability(double newReliability) {
		double oldReliability = reliability;
		reliability = newReliability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__RELIABILITY, oldReliability,
					reliability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__TIME, oldTime, time));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StlPackage.SERVICE__COSTS, oldCosts, costs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamedParameters() {
		if (namedParameters == null) {
			namedParameters = new EDataTypeUniqueEList<String>(String.class, this,
					StlPackage.SERVICE__NAMED_PARAMETERS);
		}
		return namedParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case StlPackage.SERVICE__NAME:
			return getName();
		case StlPackage.SERVICE__RELIABILITY:
			return getReliability();
		case StlPackage.SERVICE__TIME:
			return getTime();
		case StlPackage.SERVICE__COSTS:
			return getCosts();
		case StlPackage.SERVICE__NAMED_PARAMETERS:
			return getNamedParameters();
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
		case StlPackage.SERVICE__NAME:
			setName((String) newValue);
			return;
		case StlPackage.SERVICE__RELIABILITY:
			setReliability((Double) newValue);
			return;
		case StlPackage.SERVICE__TIME:
			setTime((Integer) newValue);
			return;
		case StlPackage.SERVICE__COSTS:
			setCosts((Integer) newValue);
			return;
		case StlPackage.SERVICE__NAMED_PARAMETERS:
			getNamedParameters().clear();
			getNamedParameters().addAll((Collection<? extends String>) newValue);
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
		case StlPackage.SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case StlPackage.SERVICE__RELIABILITY:
			setReliability(RELIABILITY_EDEFAULT);
			return;
		case StlPackage.SERVICE__TIME:
			setTime(TIME_EDEFAULT);
			return;
		case StlPackage.SERVICE__COSTS:
			setCosts(COSTS_EDEFAULT);
			return;
		case StlPackage.SERVICE__NAMED_PARAMETERS:
			getNamedParameters().clear();
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
		case StlPackage.SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case StlPackage.SERVICE__RELIABILITY:
			return reliability != RELIABILITY_EDEFAULT;
		case StlPackage.SERVICE__TIME:
			return time != TIME_EDEFAULT;
		case StlPackage.SERVICE__COSTS:
			return costs != COSTS_EDEFAULT;
		case StlPackage.SERVICE__NAMED_PARAMETERS:
			return namedParameters != null && !namedParameters.isEmpty();
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
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", time: ");
		result.append(time);
		result.append(", costs: ");
		result.append(costs);
		result.append(", namedParameters: ");
		result.append(namedParameters);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
