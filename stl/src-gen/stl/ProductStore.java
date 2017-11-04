/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.ProductStore#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link stl.ProductStore#getInputslot <em>Inputslot</em>}</li>
 *   <li>{@link stl.ProductStore#getItemtypes <em>Itemtypes</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getProductStore()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='capacityGreaterThan1 enoughCapacity'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot capacityGreaterThan1='self.capacity &gt;0' enoughCapacity='self.capacity &gt;= self.itemtypes-&gt;size()'"
 * @generated
 */
public interface ProductStore extends Components {
	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' attribute.
	 * @see #setCapacity(int)
	 * @see stl.StlPackage#getProductStore_Capacity()
	 * @model required="true"
	 * @generated
	 */
	int getCapacity();

	/**
	 * Sets the value of the '{@link stl.ProductStore#getCapacity <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' attribute.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Inputslot</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputslot</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputslot</em>' reference.
	 * @see #setInputslot(InputSlot)
	 * @see stl.StlPackage#getProductStore_Inputslot()
	 * @model required="true"
	 * @generated
	 */
	InputSlot getInputslot();

	/**
	 * Sets the value of the '{@link stl.ProductStore#getInputslot <em>Inputslot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputslot</em>' reference.
	 * @see #getInputslot()
	 * @generated
	 */
	void setInputslot(InputSlot value);

	/**
	 * Returns the value of the '<em><b>Itemtypes</b></em>' reference list.
	 * The list contents are of type {@link stl.ItemTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Itemtypes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Itemtypes</em>' reference list.
	 * @see stl.StlPackage#getProductStore_Itemtypes()
	 * @model
	 * @generated
	 */
	EList<ItemTypes> getItemtypes();

} // ProductStore
