/**
 */
package ArduinoCard.impl;

import ArduinoCard.Actuator;
import ArduinoCard.ArduinoCardPackage;
import ArduinoCard.Command;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArduinoCard.impl.CommandImpl#getActuator <em>Actuator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandImpl extends BlockInteractionImpl implements Command {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoCardPackage.Literals.COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actuator getActuator() {
		return (Actuator)eGet(ArduinoCardPackage.Literals.COMMAND__ACTUATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuator(Actuator newActuator) {
		eSet(ArduinoCardPackage.Literals.COMMAND__ACTUATOR, newActuator);
	}

} //CommandImpl
