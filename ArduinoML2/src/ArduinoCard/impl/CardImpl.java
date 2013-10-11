/**
 */
package ArduinoCard.impl;

import ArduinoCard.ArduinoCardPackage;
import ArduinoCard.Block;
import ArduinoCard.BlockInteraction;
import ArduinoCard.Card;
import ArduinoCard.State;
import ArduinoCard.Transition;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ArduinoCard.impl.CardImpl#getStates <em>States</em>}</li>
 *   <li>{@link ArduinoCard.impl.CardImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link ArduinoCard.impl.CardImpl#getBlockInteractions <em>Block Interactions</em>}</li>
 *   <li>{@link ArduinoCard.impl.CardImpl#getBlocks <em>Blocks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends CDOObjectImpl implements Card {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ArduinoCardPackage.Literals.CARD;
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
	public EList<State> getStates() {
		return (EList<State>)eGet(ArduinoCardPackage.Literals.CARD__STATES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transition> getTransitions() {
		return (EList<Transition>)eGet(ArduinoCardPackage.Literals.CARD__TRANSITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<BlockInteraction> getBlockInteractions() {
		return (EList<BlockInteraction>)eGet(ArduinoCardPackage.Literals.CARD__BLOCK_INTERACTIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Block> getBlocks() {
		return (EList<Block>)eGet(ArduinoCardPackage.Literals.CARD__BLOCKS, true);
	}

} //CardImpl
