/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.InputSlot#getRequiredAsImput <em>Required As Imput</em>}</li>
 *   <li>{@link stl.InputSlot#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getInputSlot()
 * @model
 * @generated
 */
public interface InputSlot extends Slots {
	/**
	 * Returns the value of the '<em><b>Required As Imput</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required As Imput</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required As Imput</em>' reference.
	 * @see #setRequiredAsImput(ItemTypes)
	 * @see stl.StlPackage#getInputSlot_RequiredAsImput()
	 * @model required="true"
	 * @generated
	 */
	ItemTypes getRequiredAsImput();

	/**
	 * Sets the value of the '{@link stl.InputSlot#getRequiredAsImput <em>Required As Imput</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required As Imput</em>' reference.
	 * @see #getRequiredAsImput()
	 * @generated
	 */
	void setRequiredAsImput(ItemTypes value);

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Connectors#getInputslot <em>Inputslot</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference.
	 * @see #setConnectors(Connectors)
	 * @see stl.StlPackage#getInputSlot_Connectors()
	 * @see stl.Connectors#getInputslot
	 * @model opposite="inputslot" required="true"
	 * @generated
	 */
	Connectors getConnectors();

	/**
	 * Sets the value of the '{@link stl.InputSlot#getConnectors <em>Connectors</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connectors</em>' reference.
	 * @see #getConnectors()
	 * @generated
	 */
	void setConnectors(Connectors value);

} // InputSlot
