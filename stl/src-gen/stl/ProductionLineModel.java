/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ProductionLineModel#getItemtypes <em>Itemtypes</em>}</li>
 *   <li>{@link stl.ProductionLineModel#getArea <em>Area</em>}</li>
 *   <li>{@link stl.ProductionLineModel#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link stl.ProductionLineModel#getComponents <em>Components</em>}</li>
 *   <li>{@link stl.ProductionLineModel#getSlots <em>Slots</em>}</li>
 *   <li>{@link stl.ProductionLineModel#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getProductionLineModel()
 * @model
 * @generated
 */
public interface ProductionLineModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Itemtypes</b></em>' containment reference list.
	 * The list contents are of type {@link stl.ItemTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtypes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtypes</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Itemtypes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ItemTypes> getItemtypes();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Area}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Area()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Area> getArea();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Connectors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Connectors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connectors> getConnectors();

	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Components}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Components()
	 * @model containment="true"
	 * @generated
	 */
	EList<Components> getComponents();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Slots}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Slots</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Slots()
	 * @model containment="true"
	 * @generated
	 */
	EList<Slots> getSlots();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link stl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see stl.StlPackage#getProductionLineModel_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

} // ProductionLineModel
