/**
 */
package stl.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public class StlValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StlValidator INSTANCE = new StlValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "stl";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return StlPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case StlPackage.PRODUCTION_LINE_MODEL:
			return validateProductionLineModel((ProductionLineModel) value, diagnostics, context);
		case StlPackage.ITEM_TYPES:
			return validateItemTypes((ItemTypes) value, diagnostics, context);
		case StlPackage.AREA:
			return validateArea((Area) value, diagnostics, context);
		case StlPackage.COMPONENTS:
			return validateComponents((Components) value, diagnostics, context);
		case StlPackage.CONNECTORS:
			return validateConnectors((Connectors) value, diagnostics, context);
		case StlPackage.ITEM_GENERATOR:
			return validateItemGenerator((ItemGenerator) value, diagnostics, context);
		case StlPackage.CONVEYOR:
			return validateConveyor((Conveyor) value, diagnostics, context);
		case StlPackage.TURNTABLE:
			return validateTurntable((Turntable) value, diagnostics, context);
		case StlPackage.MACHINE:
			return validateMachine((Machine) value, diagnostics, context);
		case StlPackage.BUFFER:
			return validateBuffer((Buffer) value, diagnostics, context);
		case StlPackage.PRODUCT_STORE:
			return validateProductStore((ProductStore) value, diagnostics, context);
		case StlPackage.WASTE_STORE:
			return validateWasteStore((WasteStore) value, diagnostics, context);
		case StlPackage.SLOTS:
			return validateSlots((Slots) value, diagnostics, context);
		case StlPackage.INPUT_SLOT:
			return validateInputSlot((InputSlot) value, diagnostics, context);
		case StlPackage.OUTPUT_SLOT:
			return validateOutputSlot((OutputSlot) value, diagnostics, context);
		case StlPackage.SERVICE:
			return validateService((Service) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductionLineModel(ProductionLineModel productionLineModel, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(productionLineModel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemTypes(ItemTypes itemTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemTypes, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemTypes, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemTypes_nameSet(itemTypes, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameSet constraint of '<em>Item Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_TYPES__NAME_SET__EEXPRESSION = "self.name.size() >0";

	/**
	 * Validates the nameSet constraint of '<em>Item Types</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemTypes_nameSet(ItemTypes itemTypes, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_TYPES, itemTypes, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameSet", ITEM_TYPES__NAME_SET__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(area, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(area, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateArea_nameSet(area, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the nameSet constraint of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AREA__NAME_SET__EEXPRESSION = "self.name.size() >0";

	/**
	 * Validates the nameSet constraint of '<em>Area</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArea_nameSet(Area area, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate(StlPackage.Literals.AREA, area, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameSet", AREA__NAME_SET__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponents(Components components, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(components, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(components, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(components, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the positiveCosts constraint of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENTS__POSITIVE_COSTS__EEXPRESSION = "self.costs >=0";

	/**
	 * Validates the positiveCosts constraint of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponents_positiveCosts(Components components, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.COMPONENTS, components, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "positiveCosts",
				COMPONENTS__POSITIVE_COSTS__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the nameSet constraint of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPONENTS__NAME_SET__EEXPRESSION = "self.name.size() >0";

	/**
	 * Validates the nameSet constraint of '<em>Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponents_nameSet(Components components, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.COMPONENTS, components, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "nameSet", COMPONENTS__NAME_SET__EEXPRESSION,
				Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectors(Connectors connectors, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(connectors, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectors_sameItemTypes(connectors, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConnectors_connectedArea(connectors, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sameItemTypes constraint of '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTORS__SAME_ITEM_TYPES__EEXPRESSION = "self.inputslot.requiredAsImput = self.outputslot.producedAsOutput";

	/**
	 * Validates the sameItemTypes constraint of '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectors_sameItemTypes(Connectors connectors, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTORS, connectors, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "sameItemTypes",
				CONNECTORS__SAME_ITEM_TYPES__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the connectedArea constraint of '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONNECTORS__CONNECTED_AREA__EEXPRESSION = "self.input_component.area = self.area";

	/**
	 * Validates the connectedArea constraint of '<em>Connectors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectors_connectedArea(Connectors connectors, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.CONNECTORS, connectors, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "connectedArea",
				CONNECTORS__CONNECTED_AREA__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator(ItemGenerator itemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemGenerator, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(itemGenerator, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateItemGenerator_sameItemOutput(itemGenerator, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sameItemOutput constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ITEM_GENERATOR__SAME_ITEM_OUTPUT__EEXPRESSION = "self.itemtypes = self.outputslot.producedAsOutput";

	/**
	 * Validates the sameItemOutput constraint of '<em>Item Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemGenerator_sameItemOutput(ItemGenerator itemGenerator, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.ITEM_GENERATOR, itemGenerator, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "sameItemOutput",
				ITEM_GENERATOR__SAME_ITEM_OUTPUT__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConveyor(Conveyor conveyor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conveyor, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(conveyor, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(conveyor, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTurntable(Turntable turntable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(turntable, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(turntable, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(turntable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMachine(Machine machine, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(machine, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(machine, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(machine, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBuffer(Buffer buffer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(buffer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(buffer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(buffer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(productStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductStore_capacityGreaterThan1(productStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateProductStore_enoughCapacity(productStore, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the capacityGreaterThan1 constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_STORE__CAPACITY_GREATER_THAN1__EEXPRESSION = "self.capacity >0";

	/**
	 * Validates the capacityGreaterThan1 constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore_capacityGreaterThan1(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.PRODUCT_STORE, productStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "capacityGreaterThan1",
				PRODUCT_STORE__CAPACITY_GREATER_THAN1__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the enoughCapacity constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PRODUCT_STORE__ENOUGH_CAPACITY__EEXPRESSION = "self.capacity >= self.itemtypes->size()";

	/**
	 * Validates the enoughCapacity constraint of '<em>Product Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProductStore_enoughCapacity(ProductStore productStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.PRODUCT_STORE, productStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "enoughCapacity",
				PRODUCT_STORE__ENOUGH_CAPACITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore(WasteStore wasteStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(wasteStore, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_positiveCosts(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateComponents_nameSet(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWasteStore_capacityGreaterThan1(wasteStore, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateWasteStore_enoughCapacity(wasteStore, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the capacityGreaterThan1 constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASTE_STORE__CAPACITY_GREATER_THAN1__EEXPRESSION = "self.capacity >0";

	/**
	 * Validates the capacityGreaterThan1 constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore_capacityGreaterThan1(WasteStore wasteStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.WASTE_STORE, wasteStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "capacityGreaterThan1",
				WASTE_STORE__CAPACITY_GREATER_THAN1__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * The cached validation expression for the enoughCapacity constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WASTE_STORE__ENOUGH_CAPACITY__EEXPRESSION = "self.capacity >= self.itemtypes->size()";

	/**
	 * Validates the enoughCapacity constraint of '<em>Waste Store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWasteStore_enoughCapacity(WasteStore wasteStore, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.WASTE_STORE, wasteStore, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "enoughCapacity",
				WASTE_STORE__ENOUGH_CAPACITY__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlots(Slots slots, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slots, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSlot(InputSlot inputSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSlot(OutputSlot outputSlot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outputSlot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateService_reliailityRange(service, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the reliailityRange constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVICE__RELIAILITY_RANGE__EEXPRESSION = "self.reliability >=0 and self.reliability <=1";

	/**
	 * Validates the reliailityRange constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateService_reliailityRange(Service service, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(StlPackage.Literals.SERVICE, service, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "reliailityRange",
				SERVICE__RELIAILITY_RANGE__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //StlValidator
