/**
 */
package ArduinoCard.impl;

import ArduinoCard.ArduinoCardPackage;
import ArduinoCard.BlockInteraction;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArduinoCard.impl.BlockInteractionImpl#isIsHigh <em>Is High</em>}</li>
 *   <li>{@link ArduinoCard.impl.BlockInteractionImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BlockInteractionImpl extends CDOObjectImpl implements BlockInteraction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockInteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoCardPackage.Literals.BLOCK_INTERACTION;
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
	public boolean isIsHigh() {
		return (Boolean)eGet(ArduinoCardPackage.Literals.BLOCK_INTERACTION__IS_HIGH, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHigh(boolean newIsHigh) {
		eSet(ArduinoCardPackage.Literals.BLOCK_INTERACTION__IS_HIGH, newIsHigh);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(ArduinoCardPackage.Literals.BLOCK_INTERACTION__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(ArduinoCardPackage.Literals.BLOCK_INTERACTION__NAME, newName);
	}

} //BlockInteractionImpl
