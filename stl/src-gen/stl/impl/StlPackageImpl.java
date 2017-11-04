/**
 */
package stl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import stl.Area;
import stl.Buffer;
import stl.Components;
import stl.Connectors;
import stl.Conveyor;
import stl.InputSlot;
import stl.ItemGenerator;
import stl.ItemTypes;
import stl.Machine;
import stl.OutputSlot;
import stl.ProductStore;
import stl.ProductionLineModel;
import stl.Service;
import stl.Slots;
import stl.StlFactory;
import stl.StlPackage;
import stl.Turntable;
import stl.WasteStore;

import stl.util.StlValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StlPackageImpl extends EPackageImpl implements StlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass areaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conveyorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turntableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bufferEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wasteStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputSlotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see stl.StlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StlPackageImpl() {
		super(eNS_URI, StlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link StlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StlPackage init() {
		if (isInited)
			return (StlPackage) EPackage.Registry.INSTANCE.getEPackage(StlPackage.eNS_URI);

		// Obtain or create and register package
		StlPackageImpl theStlPackage = (StlPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof StlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new StlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theStlPackage.createPackageContents();

		// Initialize created meta-data
		theStlPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theStlPackage, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return StlValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theStlPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StlPackage.eNS_URI, theStlPackage);
		return theStlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLineModel() {
		return productionLineModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Itemtypes() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Area() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Connectors() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Components() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Slots() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineModel_Service() {
		return (EReference) productionLineModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemTypes() {
		return itemTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemTypes_Name() {
		return (EAttribute) itemTypesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemTypes_Description() {
		return (EAttribute) itemTypesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArea() {
		return areaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArea_Name() {
		return (EAttribute) areaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Components() {
		return (EReference) areaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArea_Connectors() {
		return (EReference) areaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponents() {
		return componentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Area() {
		return (EReference) componentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponents_Name() {
		return (EAttribute) componentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponents_Costs() {
		return (EAttribute) componentsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponents_Service() {
		return (EReference) componentsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectors() {
		return connectorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectors_Area() {
		return (EReference) connectorsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectors_Inputslot() {
		return (EReference) connectorsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectors_Outputslot() {
		return (EReference) connectorsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectors_Input_component() {
		return (EReference) connectorsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectors_Output_component() {
		return (EReference) connectorsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemGenerator() {
		return itemGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemGenerator_Outputslot() {
		return (EReference) itemGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemGenerator_Itemtypes() {
		return (EReference) itemGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConveyor() {
		return conveyorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Inputslot() {
		return (EReference) conveyorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConveyor_Outputslot() {
		return (EReference) conveyorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurntable() {
		return turntableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurntable_Inputslot() {
		return (EReference) turntableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTurntable_Outputslot() {
		return (EReference) turntableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMachine() {
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Inputslot() {
		return (EReference) machineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMachine_Outputslot() {
		return (EReference) machineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBuffer() {
		return bufferEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_Inputslot() {
		return (EReference) bufferEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBuffer_Outputslot() {
		return (EReference) bufferEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductStore() {
		return productStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProductStore_Capacity() {
		return (EAttribute) productStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductStore_Inputslot() {
		return (EReference) productStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductStore_Itemtypes() {
		return (EReference) productStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWasteStore() {
		return wasteStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWasteStore_Capacity() {
		return (EAttribute) wasteStoreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWasteStore_Inputslot() {
		return (EReference) wasteStoreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWasteStore_Itemtypes() {
		return (EReference) wasteStoreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlots() {
		return slotsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSlots_Name() {
		return (EAttribute) slotsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSlot() {
		return inputSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSlot_RequiredAsImput() {
		return (EReference) inputSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSlot_Connectors() {
		return (EReference) inputSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputSlot() {
		return outputSlotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSlot_ProducedAsOutput() {
		return (EReference) outputSlotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSlot_Connectors() {
		return (EReference) outputSlotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Reliability() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Time() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Costs() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_NamedParameters() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlFactory getStlFactory() {
		return (StlFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		productionLineModelEClass = createEClass(PRODUCTION_LINE_MODEL);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__ITEMTYPES);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__AREA);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__CONNECTORS);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__COMPONENTS);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__SLOTS);
		createEReference(productionLineModelEClass, PRODUCTION_LINE_MODEL__SERVICE);

		itemTypesEClass = createEClass(ITEM_TYPES);
		createEAttribute(itemTypesEClass, ITEM_TYPES__NAME);
		createEAttribute(itemTypesEClass, ITEM_TYPES__DESCRIPTION);

		areaEClass = createEClass(AREA);
		createEAttribute(areaEClass, AREA__NAME);
		createEReference(areaEClass, AREA__COMPONENTS);
		createEReference(areaEClass, AREA__CONNECTORS);

		componentsEClass = createEClass(COMPONENTS);
		createEReference(componentsEClass, COMPONENTS__AREA);
		createEAttribute(componentsEClass, COMPONENTS__NAME);
		createEAttribute(componentsEClass, COMPONENTS__COSTS);
		createEReference(componentsEClass, COMPONENTS__SERVICE);

		connectorsEClass = createEClass(CONNECTORS);
		createEReference(connectorsEClass, CONNECTORS__AREA);
		createEReference(connectorsEClass, CONNECTORS__INPUTSLOT);
		createEReference(connectorsEClass, CONNECTORS__OUTPUTSLOT);
		createEReference(connectorsEClass, CONNECTORS__INPUT_COMPONENT);
		createEReference(connectorsEClass, CONNECTORS__OUTPUT_COMPONENT);

		itemGeneratorEClass = createEClass(ITEM_GENERATOR);
		createEReference(itemGeneratorEClass, ITEM_GENERATOR__OUTPUTSLOT);
		createEReference(itemGeneratorEClass, ITEM_GENERATOR__ITEMTYPES);

		conveyorEClass = createEClass(CONVEYOR);
		createEReference(conveyorEClass, CONVEYOR__INPUTSLOT);
		createEReference(conveyorEClass, CONVEYOR__OUTPUTSLOT);

		turntableEClass = createEClass(TURNTABLE);
		createEReference(turntableEClass, TURNTABLE__INPUTSLOT);
		createEReference(turntableEClass, TURNTABLE__OUTPUTSLOT);

		machineEClass = createEClass(MACHINE);
		createEReference(machineEClass, MACHINE__INPUTSLOT);
		createEReference(machineEClass, MACHINE__OUTPUTSLOT);

		bufferEClass = createEClass(BUFFER);
		createEReference(bufferEClass, BUFFER__INPUTSLOT);
		createEReference(bufferEClass, BUFFER__OUTPUTSLOT);

		productStoreEClass = createEClass(PRODUCT_STORE);
		createEAttribute(productStoreEClass, PRODUCT_STORE__CAPACITY);
		createEReference(productStoreEClass, PRODUCT_STORE__INPUTSLOT);
		createEReference(productStoreEClass, PRODUCT_STORE__ITEMTYPES);

		wasteStoreEClass = createEClass(WASTE_STORE);
		createEAttribute(wasteStoreEClass, WASTE_STORE__CAPACITY);
		createEReference(wasteStoreEClass, WASTE_STORE__INPUTSLOT);
		createEReference(wasteStoreEClass, WASTE_STORE__ITEMTYPES);

		slotsEClass = createEClass(SLOTS);
		createEAttribute(slotsEClass, SLOTS__NAME);

		inputSlotEClass = createEClass(INPUT_SLOT);
		createEReference(inputSlotEClass, INPUT_SLOT__REQUIRED_AS_IMPUT);
		createEReference(inputSlotEClass, INPUT_SLOT__CONNECTORS);

		outputSlotEClass = createEClass(OUTPUT_SLOT);
		createEReference(outputSlotEClass, OUTPUT_SLOT__PRODUCED_AS_OUTPUT);
		createEReference(outputSlotEClass, OUTPUT_SLOT__CONNECTORS);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__RELIABILITY);
		createEAttribute(serviceEClass, SERVICE__TIME);
		createEAttribute(serviceEClass, SERVICE__COSTS);
		createEAttribute(serviceEClass, SERVICE__NAMED_PARAMETERS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		itemGeneratorEClass.getESuperTypes().add(this.getComponents());
		conveyorEClass.getESuperTypes().add(this.getComponents());
		turntableEClass.getESuperTypes().add(this.getComponents());
		machineEClass.getESuperTypes().add(this.getComponents());
		bufferEClass.getESuperTypes().add(this.getComponents());
		productStoreEClass.getESuperTypes().add(this.getComponents());
		wasteStoreEClass.getESuperTypes().add(this.getComponents());
		inputSlotEClass.getESuperTypes().add(this.getSlots());
		outputSlotEClass.getESuperTypes().add(this.getSlots());

		// Initialize classes, features, and operations; add parameters
		initEClass(productionLineModelEClass, ProductionLineModel.class, "ProductionLineModel", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLineModel_Itemtypes(), this.getItemTypes(), null, "itemtypes", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Area(), this.getArea(), null, "area", null, 1, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Connectors(), this.getConnectors(), null, "connectors", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Components(), this.getComponents(), null, "components", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Slots(), this.getSlots(), null, "slots", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductionLineModel_Service(), this.getService(), null, "service", null, 0, -1,
				ProductionLineModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemTypesEClass, ItemTypes.class, "ItemTypes", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemTypes_Name(), ecorePackage.getEString(), "name", null, 0, 1, ItemTypes.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemTypes_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ItemTypes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(areaEClass, Area.class, "Area", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArea_Name(), ecorePackage.getEString(), "name", null, 0, 1, Area.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArea_Components(), this.getComponents(), this.getComponents_Area(), "components", null, 0, -1,
				Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArea_Connectors(), this.getConnectors(), this.getConnectors_Area(), "connectors", null, 0, -1,
				Area.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentsEClass, Components.class, "Components", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponents_Area(), this.getArea(), this.getArea_Components(), "area", null, 1, 1,
				Components.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponents_Name(), ecorePackage.getEString(), "name", null, 0, 1, Components.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponents_Costs(), ecorePackage.getEInt(), "costs", null, 1, 1, Components.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComponents_Service(), this.getService(), null, "service", null, 0, -1, Components.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectorsEClass, Connectors.class, "Connectors", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectors_Area(), this.getArea(), this.getArea_Connectors(), "area", null, 1, 1,
				Connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectors_Inputslot(), this.getInputSlot(), this.getInputSlot_Connectors(), "inputslot",
				null, 1, 1, Connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectors_Outputslot(), this.getOutputSlot(), this.getOutputSlot_Connectors(), "outputslot",
				null, 1, 1, Connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectors_Input_component(), this.getComponents(), null, "input_component", null, 1, 1,
				Connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectors_Output_component(), this.getComponents(), null, "output_component", null, 1, 1,
				Connectors.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemGeneratorEClass, ItemGenerator.class, "ItemGenerator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemGenerator_Outputslot(), this.getOutputSlot(), null, "outputslot", null, 1, 1,
				ItemGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItemGenerator_Itemtypes(), this.getItemTypes(), null, "itemtypes", null, 1, 1,
				ItemGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conveyorEClass, Conveyor.class, "Conveyor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConveyor_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, 1, Conveyor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConveyor_Outputslot(), this.getOutputSlot(), null, "outputslot", null, 1, 1, Conveyor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(turntableEClass, Turntable.class, "Turntable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTurntable_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, -1, Turntable.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTurntable_Outputslot(), this.getOutputSlot(), null, "outputslot", null, 1, -1,
				Turntable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(machineEClass, Machine.class, "Machine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMachine_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, -1, Machine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMachine_Outputslot(), this.getOutputSlot(), null, "outputslot", null, 1, -1, Machine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bufferEClass, Buffer.class, "Buffer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBuffer_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, 1, Buffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBuffer_Outputslot(), this.getOutputSlot(), null, "outputslot", null, 1, 1, Buffer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productStoreEClass, ProductStore.class, "ProductStore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProductStore_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, ProductStore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductStore_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, 1,
				ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProductStore_Itemtypes(), this.getItemTypes(), null, "itemtypes", null, 0, -1,
				ProductStore.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wasteStoreEClass, WasteStore.class, "WasteStore", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWasteStore_Capacity(), ecorePackage.getEInt(), "capacity", null, 1, 1, WasteStore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWasteStore_Inputslot(), this.getInputSlot(), null, "inputslot", null, 1, 1, WasteStore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWasteStore_Itemtypes(), this.getItemTypes(), null, "itemtypes", null, 0, -1, WasteStore.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotsEClass, Slots.class, "Slots", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlots_Name(), ecorePackage.getEString(), "name", null, 0, 1, Slots.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputSlotEClass, InputSlot.class, "InputSlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInputSlot_RequiredAsImput(), this.getItemTypes(), null, "requiredAsImput", null, 1, 1,
				InputSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInputSlot_Connectors(), this.getConnectors(), this.getConnectors_Inputslot(), "connectors",
				null, 1, 1, InputSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputSlotEClass, OutputSlot.class, "OutputSlot", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOutputSlot_ProducedAsOutput(), this.getItemTypes(), null, "producedAsOutput", null, 1, 1,
				OutputSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOutputSlot_Connectors(), this.getConnectors(), this.getConnectors_Outputslot(), "connectors",
				null, 1, 1, OutputSlot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Reliability(), ecorePackage.getEDouble(), "reliability", null, 1, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Time(), ecorePackage.getEInt(), "time", null, 1, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Costs(), ecorePackage.getEInt(), "costs", null, 1, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_NamedParameters(), ecorePackage.getEString(), "namedParameters", null, 0, -1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(itemTypesEClass, source, new String[] { "constraints", "nameSet" });
		addAnnotation(areaEClass, source, new String[] { "constraints", "nameSet" });
		addAnnotation(componentsEClass, source, new String[] { "constraints", "positiveCosts nameSet" });
		addAnnotation(connectorsEClass, source, new String[] { "constraints", "sameItemTypes connectedArea" });
		addAnnotation(itemGeneratorEClass, source, new String[] { "constraints", "sameItemOutput" });
		addAnnotation(productStoreEClass, source,
				new String[] { "constraints", "capacityGreaterThan1 enoughCapacity" });
		addAnnotation(wasteStoreEClass, source, new String[] { "constraints", "capacityGreaterThan1 enoughCapacity" });
		addAnnotation(serviceEClass, source, new String[] { "constraints", "reliailityRange" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(itemTypesEClass, source, new String[] { "nameSet", "self.name.size() >0" });
		addAnnotation(areaEClass, source, new String[] { "nameSet", "self.name.size() >0" });
		addAnnotation(componentsEClass, source,
				new String[] { "positiveCosts", "self.costs >=0", "nameSet", "self.name.size() >0" });
		addAnnotation(connectorsEClass, source,
				new String[] { "sameItemTypes", "self.inputslot.requiredAsImput = self.outputslot.producedAsOutput",
						"connectedArea", "self.input_component.area = self.area" });
		addAnnotation(itemGeneratorEClass, source,
				new String[] { "sameItemOutput", "self.itemtypes = self.outputslot.producedAsOutput" });
		addAnnotation(productStoreEClass, source, new String[] { "capacityGreaterThan1", "self.capacity >0",
				"enoughCapacity", "self.capacity >= self.itemtypes->size()" });
		addAnnotation(wasteStoreEClass, source, new String[] { "capacityGreaterThan1", "self.capacity >0",
				"enoughCapacity", "self.capacity >= self.itemtypes->size()" });
		addAnnotation(serviceEClass, source,
				new String[] { "reliailityRange", "self.reliability >=0 and self.reliability <=1" });
	}

} //StlPackageImpl
