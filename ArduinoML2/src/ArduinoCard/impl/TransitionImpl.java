/**
 */
package ArduinoCard.impl;

import ArduinoCard.ArduinoCardPackage;
import ArduinoCard.Condition;
import ArduinoCard.State;
import ArduinoCard.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArduinoCard.impl.TransitionImpl#getNextState <em>Next State</em>}</li>
 *   <li>{@link ArduinoCard.impl.TransitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ArduinoCard.impl.TransitionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends CDOObjectImpl implements Transition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoCardPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getNextState() {
		return (State)eGet(ArduinoCardPackage.Literals.TRANSITION__NEXT_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextState(State newNextState) {
		eSet(ArduinoCardPackage.Literals.TRANSITION__NEXT_STATE, newNextState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Condition> getCondition() {
		return (EList<Condition>)eGet(ArduinoCardPackage.Literals.TRANSITION__CONDITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ArduinoCardPackage.Literals.TRANSITION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ArduinoCardPackage.Literals.TRANSITION__NAME, newName);
	}

} //TransitionImpl
