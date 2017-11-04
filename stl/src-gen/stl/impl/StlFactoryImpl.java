/**
 */
package stl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StlFactoryImpl extends EFactoryImpl implements StlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StlFactory init() {
		try {
			StlFactory theStlFactory = (StlFactory) EPackage.Registry.INSTANCE.getEFactory(StlPackage.eNS_URI);
			if (theStlFactory != null) {
				return theStlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case StlPackage.PRODUCTION_LINE_MODEL:
			return createProductionLineModel();
		case StlPackage.ITEM_TYPES:
			return createItemTypes();
		case StlPackage.AREA:
			return createArea();
		case StlPackage.CONNECTORS:
			return createConnectors();
		case StlPackage.ITEM_GENERATOR:
			return createItemGenerator();
		case StlPackage.CONVEYOR:
			return createConveyor();
		case StlPackage.TURNTABLE:
			return createTurntable();
		case StlPackage.MACHINE:
			return createMachine();
		case StlPackage.BUFFER:
			return createBuffer();
		case StlPackage.PRODUCT_STORE:
			return createProductStore();
		case StlPackage.WASTE_STORE:
			return createWasteStore();
		case StlPackage.INPUT_SLOT:
			return createInputSlot();
		case StlPackage.OUTPUT_SLOT:
			return createOutputSlot();
		case StlPackage.SERVICE:
			return createService();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineModel createProductionLineModel() {
		ProductionLineModelImpl productionLineModel = new ProductionLineModelImpl();
		return productionLineModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemTypes createItemTypes() {
		ItemTypesImpl itemTypes = new ItemTypesImpl();
		return itemTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Area createArea() {
		AreaImpl area = new AreaImpl();
		return area;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connectors createConnectors() {
		ConnectorsImpl connectors = new ConnectorsImpl();
		return connectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemGenerator createItemGenerator() {
		ItemGeneratorImpl itemGenerator = new ItemGeneratorImpl();
		return itemGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conveyor createConveyor() {
		ConveyorImpl conveyor = new ConveyorImpl();
		return conveyor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turntable createTurntable() {
		TurntableImpl turntable = new TurntableImpl();
		return turntable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Buffer createBuffer() {
		BufferImpl buffer = new BufferImpl();
		return buffer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductStore createProductStore() {
		ProductStoreImpl productStore = new ProductStoreImpl();
		return productStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WasteStore createWasteStore() {
		WasteStoreImpl wasteStore = new WasteStoreImpl();
		return wasteStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSlot createInputSlot() {
		InputSlotImpl inputSlot = new InputSlotImpl();
		return inputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSlot createOutputSlot() {
		OutputSlotImpl outputSlot = new OutputSlotImpl();
		return outputSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlPackage getStlPackage() {
		return (StlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StlPackage getPackage() {
		return StlPackage.eINSTANCE;
	}

} //StlFactoryImpl
