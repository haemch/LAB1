/**
 */
package stl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ItemGenerator#getOutputslot <em>Outputslot</em>}</li>
 *   <li>{@link stl.ItemGenerator#getItemtypes <em>Itemtypes</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getItemGenerator()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sameItemOutput'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sameItemOutput='self.itemtypes = self.outputslot.producedAsOutput'"
 * @generated
 */
public interface ItemGenerator extends Components {
	/**
	 * Returns the value of the '<em><b>Outputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputslot</em>' reference.
	 * @see #setOutputslot(OutputSlot)
	 * @see stl.StlPackage#getItemGenerator_Outputslot()
	 * @model required="true"
	 * @generated
	 */
	OutputSlot getOutputslot();

	/**
	 * Sets the value of the '{@link stl.ItemGenerator#getOutputslot <em>Outputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputslot</em>' reference.
	 * @see #getOutputslot()
	 * @generated
	 */
	void setOutputslot(OutputSlot value);

	/**
	 * Returns the value of the '<em><b>Itemtypes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtypes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtypes</em>' reference.
	 * @see #setItemtypes(ItemTypes)
	 * @see stl.StlPackage#getItemGenerator_Itemtypes()
	 * @model required="true"
	 * @generated
	 */
	ItemTypes getItemtypes();

	/**
	 * Sets the value of the '{@link stl.ItemGenerator#getItemtypes <em>Itemtypes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Itemtypes</em>' reference.
	 * @see #getItemtypes()
	 * @generated
	 */
	void setItemtypes(ItemTypes value);

} // ItemGenerator
