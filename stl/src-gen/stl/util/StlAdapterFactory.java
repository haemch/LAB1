/**
 */
package stl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import stl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see stl.StlPackage
 * @generated
 */
public class StlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StlSwitch<Adapter> modelSwitch = new StlSwitch<Adapter>() {
		@Override
		public Adapter caseProductionLineModel(ProductionLineModel object) {
			return createProductionLineModelAdapter();
		}

		@Override
		public Adapter caseItemTypes(ItemTypes object) {
			return createItemTypesAdapter();
		}

		@Override
		public Adapter caseArea(Area object) {
			return createAreaAdapter();
		}

		@Override
		public Adapter caseComponents(Components object) {
			return createComponentsAdapter();
		}

		@Override
		public Adapter caseConnectors(Connectors object) {
			return createConnectorsAdapter();
		}

		@Override
		public Adapter caseItemGenerator(ItemGenerator object) {
			return createItemGeneratorAdapter();
		}

		@Override
		public Adapter caseConveyor(Conveyor object) {
			return createConveyorAdapter();
		}

		@Override
		public Adapter caseTurntable(Turntable object) {
			return createTurntableAdapter();
		}

		@Override
		public Adapter caseMachine(Machine object) {
			return createMachineAdapter();
		}

		@Override
		public Adapter caseBuffer(Buffer object) {
			return createBufferAdapter();
		}

		@Override
		public Adapter caseProductStore(ProductStore object) {
			return createProductStoreAdapter();
		}

		@Override
		public Adapter caseWasteStore(WasteStore object) {
			return createWasteStoreAdapter();
		}

		@Override
		public Adapter caseSlots(Slots object) {
			return createSlotsAdapter();
		}

		@Override
		public Adapter caseInputSlot(InputSlot object) {
			return createInputSlotAdapter();
		}

		@Override
		public Adapter caseOutputSlot(OutputSlot object) {
			return createOutputSlotAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.ProductionLineModel <em>Production Line Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.ProductionLineModel
	 * @generated
	 */
	public Adapter createProductionLineModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.ItemTypes <em>Item Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.ItemTypes
	 * @generated
	 */
	public Adapter createItemTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Area <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Area
	 * @generated
	 */
	public Adapter createAreaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Components <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Components
	 * @generated
	 */
	public Adapter createComponentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Connectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Connectors
	 * @generated
	 */
	public Adapter createConnectorsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.ItemGenerator <em>Item Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.ItemGenerator
	 * @generated
	 */
	public Adapter createItemGeneratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Conveyor <em>Conveyor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Conveyor
	 * @generated
	 */
	public Adapter createConveyorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Turntable <em>Turntable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Turntable
	 * @generated
	 */
	public Adapter createTurntableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Buffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Buffer
	 * @generated
	 */
	public Adapter createBufferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.ProductStore <em>Product Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.ProductStore
	 * @generated
	 */
	public Adapter createProductStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.WasteStore <em>Waste Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.WasteStore
	 * @generated
	 */
	public Adapter createWasteStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Slots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Slots
	 * @generated
	 */
	public Adapter createSlotsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.InputSlot <em>Input Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.InputSlot
	 * @generated
	 */
	public Adapter createInputSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.OutputSlot <em>Output Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.OutputSlot
	 * @generated
	 */
	public Adapter createOutputSlotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link stl.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see stl.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StlAdapterFactory
