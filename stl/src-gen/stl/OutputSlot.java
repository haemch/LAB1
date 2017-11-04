/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.OutputSlot#getProducedAsOutput <em>Produced As Output</em>}</li>
 *   <li>{@link stl.OutputSlot#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getOutputSlot()
 * @model
 * @generated
 */
public interface OutputSlot extends Slots {
	/**
	 * Returns the value of the '<em><b>Produced As Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produced As Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produced As Output</em>' reference.
	 * @see #setProducedAsOutput(ItemTypes)
	 * @see stl.StlPackage#getOutputSlot_ProducedAsOutput()
	 * @model required="true"
	 * @generated
	 */
	ItemTypes getProducedAsOutput();

	/**
	 * Sets the value of the '{@link stl.OutputSlot#getProducedAsOutput <em>Produced As Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Produced As Output</em>' reference.
	 * @see #getProducedAsOutput()
	 * @generated
	 */
	void setProducedAsOutput(ItemTypes value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Connectors#getOutputslot <em>Outputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference.
	 * @see #setConnectors(Connectors)
	 * @see stl.StlPackage#getOutputSlot_Connectors()
	 * @see stl.Connectors#getOutputslot
	 * @model opposite="outputslot" required="true"
	 * @generated
	 */
	Connectors getConnectors();

	/**
	 * Sets the value of the '{@link stl.OutputSlot#getConnectors <em>Connectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectors</em>' reference.
	 * @see #getConnectors()
	 * @generated
	 */
	void setConnectors(Connectors value);

} // OutputSlot
