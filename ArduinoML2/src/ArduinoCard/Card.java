/**
 */
package ArduinoCard;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ArduinoCard.Card#getStates <em>States</em>}</li>
 *   <li>{@link ArduinoCard.Card#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ArduinoCard.Card#getBlockInteractions <em>Block Interactions</em>}</li>
 *   <li>{@link ArduinoCard.Card#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @see ArduinoCard.ArduinoCardPackage#getCard()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Card extends CDOObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ArduinoCard.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ArduinoCard.ArduinoCardPackage#getCard_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link ArduinoCard.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see ArduinoCard.ArduinoCardPackage#getCard_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Block Interactions</b></em>' containment reference list.
	 * The list contents are of type {@link ArduinoCard.BlockInteraction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Interactions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Interactions</em>' containment reference list.
	 * @see ArduinoCard.ArduinoCardPackage#getCard_BlockInteractions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BlockInteraction> getBlockInteractions();

	/**
	 * Returns the value of the '<em><b>Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link ArduinoCard.Block}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocks</em>' containment reference list.
	 * @see ArduinoCard.ArduinoCardPackage#getCard_Blocks()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Block> getBlocks();

} // Card
