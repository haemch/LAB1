/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turntable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Turntable#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.Turntable#getOutputslot <em>Outputslot</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getTurntable()
 * @model
 * @generated
 */
public interface Turntable extends Components {
	/**
	 * Returns the value of the '<em><b>Inputslot</b></em>' reference list.
	 * The list contents are of type {@link stl.InputSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputslot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputslot</em>' reference list.
	 * @see stl.StlPackage#getTurntable_Inputslot()
	 * @model required="true"
	 * @generated
	 */
	EList<InputSlot> getInputslot();

	/**
	 * Returns the value of the '<em><b>Outputslot</b></em>' reference list.
	 * The list contents are of type {@link stl.OutputSlot}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputslot</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputslot</em>' reference list.
	 * @see stl.StlPackage#getTurntable_Outputslot()
	 * @model required="true"
	 * @generated
	 */
	EList<OutputSlot> getOutputslot();

} // Turntable
