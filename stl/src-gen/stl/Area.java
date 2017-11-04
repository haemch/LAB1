/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Area#getName <em>Name</em>}</li>
 *   <li>{@link stl.Area#getComponents <em>Components</em>}</li>
 *   <li>{@link stl.Area#getConnectors <em>Connectors</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getArea()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='nameSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot nameSet='self.name.size() &gt;0'"
 * @generated
 */
public interface Area extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see stl.StlPackage#getArea_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stl.Area#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link stl.Components}.
	 * It is bidirectional and its opposite is '{@link stl.Components#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see stl.StlPackage#getArea_Components()
	 * @see stl.Components#getArea
	 * @model opposite="area"
	 * @generated
	 */
	EList<Components> getComponents();

	/**
	 * Returns the value of the '<em><b>Connectors</b></em>' reference list.
	 * The list contents are of type {@link stl.Connectors}.
	 * It is bidirectional and its opposite is '{@link stl.Connectors#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connectors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connectors</em>' reference list.
	 * @see stl.StlPackage#getArea_Connectors()
	 * @see stl.Connectors#getArea
	 * @model opposite="area"
	 * @generated
	 */
	EList<Connectors> getConnectors();

} // Area
