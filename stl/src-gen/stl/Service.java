/**
 */
package stl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link stl.Service#getName <em>Name</em>}</li>
 *   <li>{@link stl.Service#getReliability <em>Reliability</em>}</li>
 *   <li>{@link stl.Service#getTime <em>Time</em>}</li>
 *   <li>{@link stl.Service#getCosts <em>Costs</em>}</li>
 *   <li>{@link stl.Service#getNamedParameters <em>Named Parameters</em>}</li>
 * </ul>
 *
 * @see stl.StlPackage#getService()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='reliailityRange'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot reliailityRange='self.reliability &gt;=0 and self.reliability &lt;=1'"
 * @generated
 */
public interface Service extends EObject {
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
	 * @see stl.StlPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link stl.Service#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reliability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reliability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reliability</em>' attribute.
	 * @see #setReliability(double)
	 * @see stl.StlPackage#getService_Reliability()
	 * @model required="true"
	 * @generated
	 */
	double getReliability();

	/**
	 * Sets the value of the '{@link stl.Service#getReliability <em>Reliability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reliability</em>' attribute.
	 * @see #getReliability()
	 * @generated
	 */
	void setReliability(double value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see stl.StlPackage#getService_Time()
	 * @model required="true"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link stl.Service#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

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
	 * @see stl.StlPackage#getService_Costs()
	 * @model required="true"
	 * @generated
	 */
	int getCosts();

	/**
	 * Sets the value of the '{@link stl.Service#getCosts <em>Costs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Costs</em>' attribute.
	 * @see #getCosts()
	 * @generated
	 */
	void setCosts(int value);

	/**
	 * Returns the value of the '<em><b>Named Parameters</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Named Parameters</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Named Parameters</em>' attribute list.
	 * @see stl.StlPackage#getService_NamedParameters()
	 * @model
	 * @generated
	 */
	EList<String> getNamedParameters();

} // Service
