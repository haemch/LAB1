/**
 */
package stl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see stl.StlFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface StlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "stl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/stl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "stl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StlPackage eINSTANCE = stl.impl.StlPackageImpl.init();

	/**
	 * The meta object id for the '{@link stl.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ProductionLineModelImpl
	 * @see stl.impl.StlPackageImpl#getProductionLineModel()
	 * @generated
	 */
	int PRODUCTION_LINE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Itemtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__ITEMTYPES = 0;

	/**
	 * The feature id for the '<em><b>Area</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__AREA = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__CONNECTORS = 2;

	/**
	 * The feature id for the '<em><b>Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__COMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Slots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__SLOTS = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL__SERVICE = 5;

	/**
	 * The number of structural features of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Production Line Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCTION_LINE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.ItemTypesImpl <em>Item Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ItemTypesImpl
	 * @see stl.impl.StlPackageImpl#getItemTypes()
	 * @generated
	 */
	int ITEM_TYPES = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPES__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPES__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Item Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.AreaImpl <em>Area</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.AreaImpl
	 * @see stl.impl.StlPackageImpl#getArea()
	 * @generated
	 */
	int AREA = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__COMPONENTS = 1;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA__CONNECTORS = 2;

	/**
	 * The number of structural features of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Area</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.ComponentsImpl <em>Components</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ComponentsImpl
	 * @see stl.impl.StlPackageImpl#getComponents()
	 * @generated
	 */
	int COMPONENTS = 3;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__AREA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__COSTS = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS__SERVICE = 3;

	/**
	 * The number of structural features of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Components</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.ConnectorsImpl <em>Connectors</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ConnectorsImpl
	 * @see stl.impl.StlPackageImpl#getConnectors()
	 * @generated
	 */
	int CONNECTORS = 4;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__AREA = 0;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__INPUTSLOT = 1;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__OUTPUTSLOT = 2;

	/**
	 * The feature id for the '<em><b>Input component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__INPUT_COMPONENT = 3;

	/**
	 * The feature id for the '<em><b>Output component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS__OUTPUT_COMPONENT = 4;

	/**
	 * The number of structural features of the '<em>Connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Connectors</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTORS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ItemGeneratorImpl
	 * @see stl.impl.StlPackageImpl#getItemGenerator()
	 * @generated
	 */
	int ITEM_GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__OUTPUTSLOT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Itemtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR__ITEMTYPES = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Item Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_GENERATOR_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.ConveyorImpl <em>Conveyor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ConveyorImpl
	 * @see stl.impl.StlPackageImpl#getConveyor()
	 * @generated
	 */
	int CONVEYOR = 6;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR__OUTPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conveyor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVEYOR_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.TurntableImpl <em>Turntable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.TurntableImpl
	 * @see stl.impl.StlPackageImpl#getTurntable()
	 * @generated
	 */
	int TURNTABLE = 7;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE__OUTPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Turntable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Turntable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURNTABLE_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.MachineImpl <em>Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.MachineImpl
	 * @see stl.impl.StlPackageImpl#getMachine()
	 * @generated
	 */
	int MACHINE = 8;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE__OUTPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACHINE_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.BufferImpl <em>Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.BufferImpl
	 * @see stl.impl.StlPackageImpl#getBuffer()
	 * @generated
	 */
	int BUFFER = 9;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER__OUTPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUFFER_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.ProductStoreImpl <em>Product Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ProductStoreImpl
	 * @see stl.impl.StlPackageImpl#getProductStore()
	 * @generated
	 */
	int PRODUCT_STORE = 10;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__CAPACITY = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Itemtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE__ITEMTYPES = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Product Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Product Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_STORE_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.WasteStoreImpl <em>Waste Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.WasteStoreImpl
	 * @see stl.impl.StlPackageImpl#getWasteStore()
	 * @generated
	 */
	int WASTE_STORE = 11;

	/**
	 * The feature id for the '<em><b>Area</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__AREA = COMPONENTS__AREA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__NAME = COMPONENTS__NAME;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__COSTS = COMPONENTS__COSTS;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__SERVICE = COMPONENTS__SERVICE;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__CAPACITY = COMPONENTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__INPUTSLOT = COMPONENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Itemtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE__ITEMTYPES = COMPONENTS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Waste Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE_FEATURE_COUNT = COMPONENTS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Waste Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WASTE_STORE_OPERATION_COUNT = COMPONENTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.SlotsImpl <em>Slots</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.SlotsImpl
	 * @see stl.impl.StlPackageImpl#getSlots()
	 * @generated
	 */
	int SLOTS = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Slots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Slots</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SLOTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link stl.impl.InputSlotImpl <em>Input Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.InputSlotImpl
	 * @see stl.impl.StlPackageImpl#getInputSlot()
	 * @generated
	 */
	int INPUT_SLOT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SLOT__NAME = SLOTS__NAME;

	/**
	 * The feature id for the '<em><b>Required As Imput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SLOT__REQUIRED_AS_IMPUT = SLOTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SLOT__CONNECTORS = SLOTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SLOT_FEATURE_COUNT = SLOTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Input Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_SLOT_OPERATION_COUNT = SLOTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.OutputSlotImpl <em>Output Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.OutputSlotImpl
	 * @see stl.impl.StlPackageImpl#getOutputSlot()
	 * @generated
	 */
	int OUTPUT_SLOT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SLOT__NAME = SLOTS__NAME;

	/**
	 * The feature id for the '<em><b>Produced As Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SLOT__PRODUCED_AS_OUTPUT = SLOTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connectors</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SLOT__CONNECTORS = SLOTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SLOT_FEATURE_COUNT = SLOTS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Output Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_SLOT_OPERATION_COUNT = SLOTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link stl.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see stl.impl.ServiceImpl
	 * @see stl.impl.StlPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__RELIABILITY = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TIME = 2;

	/**
	 * The feature id for the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__COSTS = 3;

	/**
	 * The feature id for the '<em><b>Named Parameters</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAMED_PARAMETERS = 4;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link stl.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Production Line Model</em>'.
	 * @see stl.ProductionLineModel
	 * @generated
	 */
	EClass getProductionLineModel();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getItemtypes <em>Itemtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Itemtypes</em>'.
	 * @see stl.ProductionLineModel#getItemtypes()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Itemtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Area</em>'.
	 * @see stl.ProductionLineModel#getArea()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Area();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connectors</em>'.
	 * @see stl.ProductionLineModel#getConnectors()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Connectors();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Components</em>'.
	 * @see stl.ProductionLineModel#getComponents()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Slots</em>'.
	 * @see stl.ProductionLineModel#getSlots()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Slots();

	/**
	 * Returns the meta object for the containment reference list '{@link stl.ProductionLineModel#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Service</em>'.
	 * @see stl.ProductionLineModel#getService()
	 * @see #getProductionLineModel()
	 * @generated
	 */
	EReference getProductionLineModel_Service();

	/**
	 * Returns the meta object for class '{@link stl.ItemTypes <em>Item Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Types</em>'.
	 * @see stl.ItemTypes
	 * @generated
	 */
	EClass getItemTypes();

	/**
	 * Returns the meta object for the attribute '{@link stl.ItemTypes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stl.ItemTypes#getName()
	 * @see #getItemTypes()
	 * @generated
	 */
	EAttribute getItemTypes_Name();

	/**
	 * Returns the meta object for the attribute '{@link stl.ItemTypes#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see stl.ItemTypes#getDescription()
	 * @see #getItemTypes()
	 * @generated
	 */
	EAttribute getItemTypes_Description();

	/**
	 * Returns the meta object for class '{@link stl.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Area</em>'.
	 * @see stl.Area
	 * @generated
	 */
	EClass getArea();

	/**
	 * Returns the meta object for the attribute '{@link stl.Area#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stl.Area#getName()
	 * @see #getArea()
	 * @generated
	 */
	EAttribute getArea_Name();

	/**
	 * Returns the meta object for the reference list '{@link stl.Area#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see stl.Area#getComponents()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Components();

	/**
	 * Returns the meta object for the reference list '{@link stl.Area#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connectors</em>'.
	 * @see stl.Area#getConnectors()
	 * @see #getArea()
	 * @generated
	 */
	EReference getArea_Connectors();

	/**
	 * Returns the meta object for class '{@link stl.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Components</em>'.
	 * @see stl.Components
	 * @generated
	 */
	EClass getComponents();

	/**
	 * Returns the meta object for the reference '{@link stl.Components#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see stl.Components#getArea()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Area();

	/**
	 * Returns the meta object for the attribute '{@link stl.Components#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stl.Components#getName()
	 * @see #getComponents()
	 * @generated
	 */
	EAttribute getComponents_Name();

	/**
	 * Returns the meta object for the attribute '{@link stl.Components#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs</em>'.
	 * @see stl.Components#getCosts()
	 * @see #getComponents()
	 * @generated
	 */
	EAttribute getComponents_Costs();

	/**
	 * Returns the meta object for the reference list '{@link stl.Components#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see stl.Components#getService()
	 * @see #getComponents()
	 * @generated
	 */
	EReference getComponents_Service();

	/**
	 * Returns the meta object for class '{@link stl.Connectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connectors</em>'.
	 * @see stl.Connectors
	 * @generated
	 */
	EClass getConnectors();

	/**
	 * Returns the meta object for the reference '{@link stl.Connectors#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Area</em>'.
	 * @see stl.Connectors#getArea()
	 * @see #getConnectors()
	 * @generated
	 */
	EReference getConnectors_Area();

	/**
	 * Returns the meta object for the reference '{@link stl.Connectors#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputslot</em>'.
	 * @see stl.Connectors#getInputslot()
	 * @see #getConnectors()
	 * @generated
	 */
	EReference getConnectors_Inputslot();

	/**
	 * Returns the meta object for the reference '{@link stl.Connectors#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputslot</em>'.
	 * @see stl.Connectors#getOutputslot()
	 * @see #getConnectors()
	 * @generated
	 */
	EReference getConnectors_Outputslot();

	/**
	 * Returns the meta object for the reference '{@link stl.Connectors#getInput_component <em>Input component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input component</em>'.
	 * @see stl.Connectors#getInput_component()
	 * @see #getConnectors()
	 * @generated
	 */
	EReference getConnectors_Input_component();

	/**
	 * Returns the meta object for the reference '{@link stl.Connectors#getOutput_component <em>Output component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output component</em>'.
	 * @see stl.Connectors#getOutput_component()
	 * @see #getConnectors()
	 * @generated
	 */
	EReference getConnectors_Output_component();

	/**
	 * Returns the meta object for class '{@link stl.ItemGenerator <em>Item Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Generator</em>'.
	 * @see stl.ItemGenerator
	 * @generated
	 */
	EClass getItemGenerator();

	/**
	 * Returns the meta object for the reference '{@link stl.ItemGenerator#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputslot</em>'.
	 * @see stl.ItemGenerator#getOutputslot()
	 * @see #getItemGenerator()
	 * @generated
	 */
	EReference getItemGenerator_Outputslot();

	/**
	 * Returns the meta object for the reference '{@link stl.ItemGenerator#getItemtypes <em>Itemtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Itemtypes</em>'.
	 * @see stl.ItemGenerator#getItemtypes()
	 * @see #getItemGenerator()
	 * @generated
	 */
	EReference getItemGenerator_Itemtypes();

	/**
	 * Returns the meta object for class '{@link stl.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conveyor</em>'.
	 * @see stl.Conveyor
	 * @generated
	 */
	EClass getConveyor();

	/**
	 * Returns the meta object for the reference '{@link stl.Conveyor#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputslot</em>'.
	 * @see stl.Conveyor#getInputslot()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Inputslot();

	/**
	 * Returns the meta object for the reference '{@link stl.Conveyor#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputslot</em>'.
	 * @see stl.Conveyor#getOutputslot()
	 * @see #getConveyor()
	 * @generated
	 */
	EReference getConveyor_Outputslot();

	/**
	 * Returns the meta object for class '{@link stl.Turntable <em>Turntable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turntable</em>'.
	 * @see stl.Turntable
	 * @generated
	 */
	EClass getTurntable();

	/**
	 * Returns the meta object for the reference list '{@link stl.Turntable#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputslot</em>'.
	 * @see stl.Turntable#getInputslot()
	 * @see #getTurntable()
	 * @generated
	 */
	EReference getTurntable_Inputslot();

	/**
	 * Returns the meta object for the reference list '{@link stl.Turntable#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputslot</em>'.
	 * @see stl.Turntable#getOutputslot()
	 * @see #getTurntable()
	 * @generated
	 */
	EReference getTurntable_Outputslot();

	/**
	 * Returns the meta object for class '{@link stl.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Machine</em>'.
	 * @see stl.Machine
	 * @generated
	 */
	EClass getMachine();

	/**
	 * Returns the meta object for the reference list '{@link stl.Machine#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputslot</em>'.
	 * @see stl.Machine#getInputslot()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Inputslot();

	/**
	 * Returns the meta object for the reference list '{@link stl.Machine#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outputslot</em>'.
	 * @see stl.Machine#getOutputslot()
	 * @see #getMachine()
	 * @generated
	 */
	EReference getMachine_Outputslot();

	/**
	 * Returns the meta object for class '{@link stl.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Buffer</em>'.
	 * @see stl.Buffer
	 * @generated
	 */
	EClass getBuffer();

	/**
	 * Returns the meta object for the reference '{@link stl.Buffer#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputslot</em>'.
	 * @see stl.Buffer#getInputslot()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Inputslot();

	/**
	 * Returns the meta object for the reference '{@link stl.Buffer#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Outputslot</em>'.
	 * @see stl.Buffer#getOutputslot()
	 * @see #getBuffer()
	 * @generated
	 */
	EReference getBuffer_Outputslot();

	/**
	 * Returns the meta object for class '{@link stl.ProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product Store</em>'.
	 * @see stl.ProductStore
	 * @generated
	 */
	EClass getProductStore();

	/**
	 * Returns the meta object for the attribute '{@link stl.ProductStore#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see stl.ProductStore#getCapacity()
	 * @see #getProductStore()
	 * @generated
	 */
	EAttribute getProductStore_Capacity();

	/**
	 * Returns the meta object for the reference '{@link stl.ProductStore#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputslot</em>'.
	 * @see stl.ProductStore#getInputslot()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_Inputslot();

	/**
	 * Returns the meta object for the reference list '{@link stl.ProductStore#getItemtypes <em>Itemtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Itemtypes</em>'.
	 * @see stl.ProductStore#getItemtypes()
	 * @see #getProductStore()
	 * @generated
	 */
	EReference getProductStore_Itemtypes();

	/**
	 * Returns the meta object for class '{@link stl.WasteStore <em>Waste Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Waste Store</em>'.
	 * @see stl.WasteStore
	 * @generated
	 */
	EClass getWasteStore();

	/**
	 * Returns the meta object for the attribute '{@link stl.WasteStore#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see stl.WasteStore#getCapacity()
	 * @see #getWasteStore()
	 * @generated
	 */
	EAttribute getWasteStore_Capacity();

	/**
	 * Returns the meta object for the reference '{@link stl.WasteStore#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Inputslot</em>'.
	 * @see stl.WasteStore#getInputslot()
	 * @see #getWasteStore()
	 * @generated
	 */
	EReference getWasteStore_Inputslot();

	/**
	 * Returns the meta object for the reference list '{@link stl.WasteStore#getItemtypes <em>Itemtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Itemtypes</em>'.
	 * @see stl.WasteStore#getItemtypes()
	 * @see #getWasteStore()
	 * @generated
	 */
	EReference getWasteStore_Itemtypes();

	/**
	 * Returns the meta object for class '{@link stl.Slots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Slots</em>'.
	 * @see stl.Slots
	 * @generated
	 */
	EClass getSlots();

	/**
	 * Returns the meta object for the attribute '{@link stl.Slots#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stl.Slots#getName()
	 * @see #getSlots()
	 * @generated
	 */
	EAttribute getSlots_Name();

	/**
	 * Returns the meta object for class '{@link stl.InputSlot <em>Input Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Slot</em>'.
	 * @see stl.InputSlot
	 * @generated
	 */
	EClass getInputSlot();

	/**
	 * Returns the meta object for the reference '{@link stl.InputSlot#getRequiredAsImput <em>Required As Imput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Required As Imput</em>'.
	 * @see stl.InputSlot#getRequiredAsImput()
	 * @see #getInputSlot()
	 * @generated
	 */
	EReference getInputSlot_RequiredAsImput();

	/**
	 * Returns the meta object for the reference '{@link stl.InputSlot#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectors</em>'.
	 * @see stl.InputSlot#getConnectors()
	 * @see #getInputSlot()
	 * @generated
	 */
	EReference getInputSlot_Connectors();

	/**
	 * Returns the meta object for class '{@link stl.OutputSlot <em>Output Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Slot</em>'.
	 * @see stl.OutputSlot
	 * @generated
	 */
	EClass getOutputSlot();

	/**
	 * Returns the meta object for the reference '{@link stl.OutputSlot#getProducedAsOutput <em>Produced As Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Produced As Output</em>'.
	 * @see stl.OutputSlot#getProducedAsOutput()
	 * @see #getOutputSlot()
	 * @generated
	 */
	EReference getOutputSlot_ProducedAsOutput();

	/**
	 * Returns the meta object for the reference '{@link stl.OutputSlot#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connectors</em>'.
	 * @see stl.OutputSlot#getConnectors()
	 * @see #getOutputSlot()
	 * @generated
	 */
	EReference getOutputSlot_Connectors();

	/**
	 * Returns the meta object for class '{@link stl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see stl.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link stl.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see stl.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link stl.Service#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reliability</em>'.
	 * @see stl.Service#getReliability()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Reliability();

	/**
	 * Returns the meta object for the attribute '{@link stl.Service#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see stl.Service#getTime()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Time();

	/**
	 * Returns the meta object for the attribute '{@link stl.Service#getCosts <em>Costs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Costs</em>'.
	 * @see stl.Service#getCosts()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Costs();

	/**
	 * Returns the meta object for the attribute list '{@link stl.Service#getNamedParameters <em>Named Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Named Parameters</em>'.
	 * @see stl.Service#getNamedParameters()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_NamedParameters();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StlFactory getStlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link stl.impl.ProductionLineModelImpl <em>Production Line Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ProductionLineModelImpl
		 * @see stl.impl.StlPackageImpl#getProductionLineModel()
		 * @generated
		 */
		EClass PRODUCTION_LINE_MODEL = eINSTANCE.getProductionLineModel();

		/**
		 * The meta object literal for the '<em><b>Itemtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__ITEMTYPES = eINSTANCE.getProductionLineModel_Itemtypes();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__AREA = eINSTANCE.getProductionLineModel_Area();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__CONNECTORS = eINSTANCE.getProductionLineModel_Connectors();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__COMPONENTS = eINSTANCE.getProductionLineModel_Components();

		/**
		 * The meta object literal for the '<em><b>Slots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__SLOTS = eINSTANCE.getProductionLineModel_Slots();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCTION_LINE_MODEL__SERVICE = eINSTANCE.getProductionLineModel_Service();

		/**
		 * The meta object literal for the '{@link stl.impl.ItemTypesImpl <em>Item Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ItemTypesImpl
		 * @see stl.impl.StlPackageImpl#getItemTypes()
		 * @generated
		 */
		EClass ITEM_TYPES = eINSTANCE.getItemTypes();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPES__NAME = eINSTANCE.getItemTypes_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPES__DESCRIPTION = eINSTANCE.getItemTypes_Description();

		/**
		 * The meta object literal for the '{@link stl.impl.AreaImpl <em>Area</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.AreaImpl
		 * @see stl.impl.StlPackageImpl#getArea()
		 * @generated
		 */
		EClass AREA = eINSTANCE.getArea();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AREA__NAME = eINSTANCE.getArea_Name();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__COMPONENTS = eINSTANCE.getArea_Components();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AREA__CONNECTORS = eINSTANCE.getArea_Connectors();

		/**
		 * The meta object literal for the '{@link stl.impl.ComponentsImpl <em>Components</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ComponentsImpl
		 * @see stl.impl.StlPackageImpl#getComponents()
		 * @generated
		 */
		EClass COMPONENTS = eINSTANCE.getComponents();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__AREA = eINSTANCE.getComponents_Area();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS__NAME = eINSTANCE.getComponents_Name();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENTS__COSTS = eINSTANCE.getComponents_Costs();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENTS__SERVICE = eINSTANCE.getComponents_Service();

		/**
		 * The meta object literal for the '{@link stl.impl.ConnectorsImpl <em>Connectors</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ConnectorsImpl
		 * @see stl.impl.StlPackageImpl#getConnectors()
		 * @generated
		 */
		EClass CONNECTORS = eINSTANCE.getConnectors();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__AREA = eINSTANCE.getConnectors_Area();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__INPUTSLOT = eINSTANCE.getConnectors_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__OUTPUTSLOT = eINSTANCE.getConnectors_Outputslot();

		/**
		 * The meta object literal for the '<em><b>Input component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__INPUT_COMPONENT = eINSTANCE.getConnectors_Input_component();

		/**
		 * The meta object literal for the '<em><b>Output component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTORS__OUTPUT_COMPONENT = eINSTANCE.getConnectors_Output_component();

		/**
		 * The meta object literal for the '{@link stl.impl.ItemGeneratorImpl <em>Item Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ItemGeneratorImpl
		 * @see stl.impl.StlPackageImpl#getItemGenerator()
		 * @generated
		 */
		EClass ITEM_GENERATOR = eINSTANCE.getItemGenerator();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_GENERATOR__OUTPUTSLOT = eINSTANCE.getItemGenerator_Outputslot();

		/**
		 * The meta object literal for the '<em><b>Itemtypes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_GENERATOR__ITEMTYPES = eINSTANCE.getItemGenerator_Itemtypes();

		/**
		 * The meta object literal for the '{@link stl.impl.ConveyorImpl <em>Conveyor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ConveyorImpl
		 * @see stl.impl.StlPackageImpl#getConveyor()
		 * @generated
		 */
		EClass CONVEYOR = eINSTANCE.getConveyor();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__INPUTSLOT = eINSTANCE.getConveyor_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONVEYOR__OUTPUTSLOT = eINSTANCE.getConveyor_Outputslot();

		/**
		 * The meta object literal for the '{@link stl.impl.TurntableImpl <em>Turntable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.TurntableImpl
		 * @see stl.impl.StlPackageImpl#getTurntable()
		 * @generated
		 */
		EClass TURNTABLE = eINSTANCE.getTurntable();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNTABLE__INPUTSLOT = eINSTANCE.getTurntable_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURNTABLE__OUTPUTSLOT = eINSTANCE.getTurntable_Outputslot();

		/**
		 * The meta object literal for the '{@link stl.impl.MachineImpl <em>Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.MachineImpl
		 * @see stl.impl.StlPackageImpl#getMachine()
		 * @generated
		 */
		EClass MACHINE = eINSTANCE.getMachine();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__INPUTSLOT = eINSTANCE.getMachine_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACHINE__OUTPUTSLOT = eINSTANCE.getMachine_Outputslot();

		/**
		 * The meta object literal for the '{@link stl.impl.BufferImpl <em>Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.BufferImpl
		 * @see stl.impl.StlPackageImpl#getBuffer()
		 * @generated
		 */
		EClass BUFFER = eINSTANCE.getBuffer();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__INPUTSLOT = eINSTANCE.getBuffer_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Outputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUFFER__OUTPUTSLOT = eINSTANCE.getBuffer_Outputslot();

		/**
		 * The meta object literal for the '{@link stl.impl.ProductStoreImpl <em>Product Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ProductStoreImpl
		 * @see stl.impl.StlPackageImpl#getProductStore()
		 * @generated
		 */
		EClass PRODUCT_STORE = eINSTANCE.getProductStore();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRODUCT_STORE__CAPACITY = eINSTANCE.getProductStore_Capacity();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__INPUTSLOT = eINSTANCE.getProductStore_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Itemtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCT_STORE__ITEMTYPES = eINSTANCE.getProductStore_Itemtypes();

		/**
		 * The meta object literal for the '{@link stl.impl.WasteStoreImpl <em>Waste Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.WasteStoreImpl
		 * @see stl.impl.StlPackageImpl#getWasteStore()
		 * @generated
		 */
		EClass WASTE_STORE = eINSTANCE.getWasteStore();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WASTE_STORE__CAPACITY = eINSTANCE.getWasteStore_Capacity();

		/**
		 * The meta object literal for the '<em><b>Inputslot</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASTE_STORE__INPUTSLOT = eINSTANCE.getWasteStore_Inputslot();

		/**
		 * The meta object literal for the '<em><b>Itemtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WASTE_STORE__ITEMTYPES = eINSTANCE.getWasteStore_Itemtypes();

		/**
		 * The meta object literal for the '{@link stl.impl.SlotsImpl <em>Slots</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.SlotsImpl
		 * @see stl.impl.StlPackageImpl#getSlots()
		 * @generated
		 */
		EClass SLOTS = eINSTANCE.getSlots();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SLOTS__NAME = eINSTANCE.getSlots_Name();

		/**
		 * The meta object literal for the '{@link stl.impl.InputSlotImpl <em>Input Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.InputSlotImpl
		 * @see stl.impl.StlPackageImpl#getInputSlot()
		 * @generated
		 */
		EClass INPUT_SLOT = eINSTANCE.getInputSlot();

		/**
		 * The meta object literal for the '<em><b>Required As Imput</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SLOT__REQUIRED_AS_IMPUT = eINSTANCE.getInputSlot_RequiredAsImput();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT_SLOT__CONNECTORS = eINSTANCE.getInputSlot_Connectors();

		/**
		 * The meta object literal for the '{@link stl.impl.OutputSlotImpl <em>Output Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.OutputSlotImpl
		 * @see stl.impl.StlPackageImpl#getOutputSlot()
		 * @generated
		 */
		EClass OUTPUT_SLOT = eINSTANCE.getOutputSlot();

		/**
		 * The meta object literal for the '<em><b>Produced As Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SLOT__PRODUCED_AS_OUTPUT = eINSTANCE.getOutputSlot_ProducedAsOutput();

		/**
		 * The meta object literal for the '<em><b>Connectors</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT_SLOT__CONNECTORS = eINSTANCE.getOutputSlot_Connectors();

		/**
		 * The meta object literal for the '{@link stl.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see stl.impl.ServiceImpl
		 * @see stl.impl.StlPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__RELIABILITY = eINSTANCE.getService_Reliability();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__TIME = eINSTANCE.getService_Time();

		/**
		 * The meta object literal for the '<em><b>Costs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__COSTS = eINSTANCE.getService_Costs();

		/**
		 * The meta object literal for the '<em><b>Named Parameters</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAMED_PARAMETERS = eINSTANCE.getService_NamedParameters();

	}

} //StlPackage
