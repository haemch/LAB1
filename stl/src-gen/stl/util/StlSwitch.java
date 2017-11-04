/**
 */
package stl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public class StlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlSwitch() {
		if (modelPackage == null) {
			modelPackage = StlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case StlPackage.PRODUCTION_LINE_MODEL: {
			ProductionLineModel productionLineModel = (ProductionLineModel) theEObject;
			T result = caseProductionLineModel(productionLineModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.ITEM_TYPES: {
			ItemTypes itemTypes = (ItemTypes) theEObject;
			T result = caseItemTypes(itemTypes);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.AREA: {
			Area area = (Area) theEObject;
			T result = caseArea(area);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.COMPONENTS: {
			Components components = (Components) theEObject;
			T result = caseComponents(components);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.CONNECTORS: {
			Connectors connectors = (Connectors) theEObject;
			T result = caseConnectors(connectors);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.ITEM_GENERATOR: {
			ItemGenerator itemGenerator = (ItemGenerator) theEObject;
			T result = caseItemGenerator(itemGenerator);
			if (result == null)
				result = caseComponents(itemGenerator);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.CONVEYOR: {
			Conveyor conveyor = (Conveyor) theEObject;
			T result = caseConveyor(conveyor);
			if (result == null)
				result = caseComponents(conveyor);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.TURNTABLE: {
			Turntable turntable = (Turntable) theEObject;
			T result = caseTurntable(turntable);
			if (result == null)
				result = caseComponents(turntable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.MACHINE: {
			Machine machine = (Machine) theEObject;
			T result = caseMachine(machine);
			if (result == null)
				result = caseComponents(machine);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.BUFFER: {
			Buffer buffer = (Buffer) theEObject;
			T result = caseBuffer(buffer);
			if (result == null)
				result = caseComponents(buffer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.PRODUCT_STORE: {
			ProductStore productStore = (ProductStore) theEObject;
			T result = caseProductStore(productStore);
			if (result == null)
				result = caseComponents(productStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.WASTE_STORE: {
			WasteStore wasteStore = (WasteStore) theEObject;
			T result = caseWasteStore(wasteStore);
			if (result == null)
				result = caseComponents(wasteStore);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.SLOTS: {
			Slots slots = (Slots) theEObject;
			T result = caseSlots(slots);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.INPUT_SLOT: {
			InputSlot inputSlot = (InputSlot) theEObject;
			T result = caseInputSlot(inputSlot);
			if (result == null)
				result = caseSlots(inputSlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.OUTPUT_SLOT: {
			OutputSlot outputSlot = (OutputSlot) theEObject;
			T result = caseOutputSlot(outputSlot);
			if (result == null)
				result = caseSlots(outputSlot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case StlPackage.SERVICE: {
			Service service = (Service) theEObject;
			T result = caseService(service);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Production Line Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Production Line Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductionLineModel(ProductionLineModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Types</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Types</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemTypes(ItemTypes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArea(Area object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponents(Components object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectors</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectors(Connectors object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemGenerator(ItemGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conveyor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConveyor(Conveyor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turntable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turntable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurntable(Turntable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Machine</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMachine(Machine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Buffer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBuffer(Buffer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProductStore(ProductStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Waste Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWasteStore(WasteStore object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slots</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slots</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlots(Slots object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputSlot(InputSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputSlot(OutputSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StlSwitch
