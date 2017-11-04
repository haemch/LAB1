/**
 */
package stl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public interface StlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StlFactory eINSTANCE = stl.impl.StlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Production Line Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Line Model</em>'.
	 * @generated
	 */
	ProductionLineModel createProductionLineModel();

	/**
	 * Returns a new object of class '<em>Item Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Types</em>'.
	 * @generated
	 */
	ItemTypes createItemTypes();

	/**
	 * Returns a new object of class '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Area</em>'.
	 * @generated
	 */
	Area createArea();

	/**
	 * Returns a new object of class '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connectors</em>'.
	 * @generated
	 */
	Connectors createConnectors();

	/**
	 * Returns a new object of class '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Item Generator</em>'.
	 * @generated
	 */
	ItemGenerator createItemGenerator();

	/**
	 * Returns a new object of class '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conveyor</em>'.
	 * @generated
	 */
	Conveyor createConveyor();

	/**
	 * Returns a new object of class '<em>Turntable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turntable</em>'.
	 * @generated
	 */
	Turntable createTurntable();

	/**
	 * Returns a new object of class '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Machine</em>'.
	 * @generated
	 */
	Machine createMachine();

	/**
	 * Returns a new object of class '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Buffer</em>'.
	 * @generated
	 */
	Buffer createBuffer();

	/**
	 * Returns a new object of class '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product Store</em>'.
	 * @generated
	 */
	ProductStore createProductStore();

	/**
	 * Returns a new object of class '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Waste Store</em>'.
	 * @generated
	 */
	WasteStore createWasteStore();

	/**
	 * Returns a new object of class '<em>Input Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Input Slot</em>'.
	 * @generated
	 */
	InputSlot createInputSlot();

	/**
	 * Returns a new object of class '<em>Output Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Output Slot</em>'.
	 * @generated
	 */
	OutputSlot createOutputSlot();

	/**
	 * Returns a new object of class '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service</em>'.
	 * @generated
	 */
	Service createService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	StlPackage getStlPackage();

} //StlFactory
