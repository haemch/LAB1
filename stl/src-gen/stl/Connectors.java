/**
 */
package stl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectors</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Connectors#getArea <em>Area</em>}</li>
 *   <li>{@link stl.Connectors#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.Connectors#getOutputslot <em>Outputslot</em>}</li>
 *   <li>{@link stl.Connectors#getInput_component <em>Input component</em>}</li>
 *   <li>{@link stl.Connectors#getOutput_component <em>Output component</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getConnectors()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameItemTypes connectedArea'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sameItemTypes='self.inputslot.requiredAsImput = self.outputslot.producedAsOutput' connectedArea='self.input_component.area = self.area'"
 * @generated
 */
public interface Connectors extends EObject {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Area#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(Area)
	 * @see stl.StlPackage#getConnectors_Area()
	 * @see stl.Area#getConnectors
	 * @model opposite="connectors" required="true"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link stl.Connectors#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

	/**
	 * Returns the value of the '<em><b>Inputslot</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.InputSlot#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputslot</em>' reference.
	 * @see #setInputslot(InputSlot)
	 * @see stl.StlPackage#getConnectors_Inputslot()
	 * @see stl.InputSlot#getConnectors
	 * @model opposite="connectors" required="true"
	 * @generated
	 */
	InputSlot getInputslot();

	/**
	 * Sets the value of the '{@link stl.Connectors#getInputslot <em>Inputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputslot</em>' reference.
	 * @see #getInputslot()
	 * @generated
	 */
	void setInputslot(InputSlot value);

	/**
	 * Returns the value of the '<em><b>Outputslot</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.OutputSlot#getConnectors <em>Connectors</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputslot</em>' reference.
	 * @see #setOutputslot(OutputSlot)
	 * @see stl.StlPackage#getConnectors_Outputslot()
	 * @see stl.OutputSlot#getConnectors
	 * @model opposite="connectors" required="true"
	 * @generated
	 */
	OutputSlot getOutputslot();

	/**
	 * Sets the value of the '{@link stl.Connectors#getOutputslot <em>Outputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputslot</em>' reference.
	 * @see #getOutputslot()
	 * @generated
	 */
	void setOutputslot(OutputSlot value);

	/**
	 * Returns the value of the '<em><b>Input component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input component</em>' reference.
	 * @see #setInput_component(Components)
	 * @see stl.StlPackage#getConnectors_Input_component()
	 * @model required="true"
	 * @generated
	 */
	Components getInput_component();

	/**
	 * Sets the value of the '{@link stl.Connectors#getInput_component <em>Input component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input component</em>' reference.
	 * @see #getInput_component()
	 * @generated
	 */
	void setInput_component(Components value);

	/**
	 * Returns the value of the '<em><b>Output component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output component</em>' reference.
	 * @see #setOutput_component(Components)
	 * @see stl.StlPackage#getConnectors_Output_component()
	 * @model required="true"
	 * @generated
	 */
	Components getOutput_component();

	/**
	 * Sets the value of the '{@link stl.Connectors#getOutput_component <em>Output component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output component</em>' reference.
	 * @see #getOutput_component()
	 * @generated
	 */
	void setOutput_component(Components value);

} // Connectors
