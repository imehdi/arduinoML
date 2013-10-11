/**
 */
package ArduinoCard;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArduinoCard.Transition#getNextState <em>Next State</em>}</li>
 *   <li>{@link ArduinoCard.Transition#getCondition <em>Condition</em>}</li>
 *   <li>{@link ArduinoCard.Transition#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArduinoCard.ArduinoCardPackage#getTransition()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Transition extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Next State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next State</em>' reference.
	 * @see #setNextState(State)
	 * @see ArduinoCard.ArduinoCardPackage#getTransition_NextState()
	 * @model required="true"
	 * @generated
	 */
	State getNextState();

	/**
	 * Sets the value of the '{@link ArduinoCard.Transition#getNextState <em>Next State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next State</em>' reference.
	 * @see #getNextState()
	 * @generated
	 */
	void setNextState(State value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference list.
	 * The list contents are of type {@link ArduinoCard.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference list.
	 * @see ArduinoCard.ArduinoCardPackage#getTransition_Condition()
	 * @model required="true"
	 * @generated
	 */
	EList<Condition> getCondition();

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
	 * @see ArduinoCard.ArduinoCardPackage#getTransition_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ArduinoCard.Transition#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transition
