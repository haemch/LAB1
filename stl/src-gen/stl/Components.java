/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Components</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Components#getArea <em>Area</em>}</li>
 *   <li>{@link stl.Components#getName <em>Name</em>}</li>
 *   <li>{@link stl.Components#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.Components#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getComponents()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='positiveCosts nameSet'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot positiveCosts='self.costs &gt;=0' nameSet='self.name.size() &gt;0'"
 * @generated
 */
public interface Components extends EObject {
	/**
	 * Returns the value of the '<em><b>Area</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link stl.Area#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' reference.
	 * @see #setArea(Area)
	 * @see stl.StlPackage#getComponents_Area()
	 * @see stl.Area#getComponents
	 * @model opposite="components" required="true"
	 * @generated
	 */
	Area getArea();

	/**
	 * Sets the value of the '{@link stl.Components#getArea <em>Area</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' reference.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(Area value);

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
	 * @see stl.StlPackage#getComponents_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stl.Components#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Costs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Costs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Costs</em>' attribute.
	 * @see #setCosts(int)
	 * @see stl.StlPackage#getComponents_Costs()
	 * @model required="true"
	 * @generated
	 */
	int getCosts();

	/**
	 * Sets the value of the '{@link stl.Components#getCosts <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs</em>' attribute.
	 * @see #getCosts()
	 * @generated
	 */
	void setCosts(int value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference list.
	 * The list contents are of type {@link stl.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference list.
	 * @see stl.StlPackage#getComponents_Service()
	 * @model
	 * @generated
	 */
	EList<Service> getService();

} // Components
