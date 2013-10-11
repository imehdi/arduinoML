/**
 */
package ArduinoCard.impl;

import ArduinoCard.ArduinoCardPackage;
import ArduinoCard.Command;
import ArduinoCard.State;
import ArduinoCard.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArduinoCard.impl.StateImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ArduinoCard.impl.StateImpl#getCommand <em>Command</em>}</li>
 *   <li>{@link ArduinoCard.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link ArduinoCard.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends CDOObjectImpl implements State {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoCardPackage.Literals.STATE;
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
	@SuppressWarnings("unchecked")
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eGet(ArduinoCardPackage.Literals.STATE__TRANSITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Command> getCommand() {
		return (EList<Command>)eGet(ArduinoCardPackage.Literals.STATE__COMMAND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ArduinoCardPackage.Literals.STATE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ArduinoCardPackage.Literals.STATE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInitial() {
		return (Boolean)eGet(ArduinoCardPackage.Literals.STATE__IS_INITIAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInitial(boolean newIsInitial) {
		eSet(ArduinoCardPackage.Literals.STATE__IS_INITIAL, newIsInitial);
	}

} //StateImpl
