package ArduinoCard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ArduinoCard.impl.*;
import ArduinoCard.util.*;

public class ToArduinoCode extends ArduinoCardSwitch<String> {
	
	

	public String transform(String file) {
		Card my = loadModel(file);
		ToArduinoCode d = new ToArduinoCode();
		String s = d.doSwitch(my);
		System.out.println(s);
		return s;
	}

	protected static Card loadModel(String fileName) {
		ResourceSet resources = setup();
		URI uri = URI.createFileURI(fileName);
		Resource resource = resources.getResource(uri, true);
		if (resource.isLoaded() && resource.getContents().size() > 0) {
			return (Card) resource.getContents().get(0);
		}
		throw new RuntimeException("Unable to load model!");
	}

	private static ResourceSet setup() {
		ResourceSet resources = new ResourceSetImpl();
		Resource.Factory.Registry registry = resources
				.getResourceFactoryRegistry();
		registry.getExtensionToFactoryMap().put("xmi",
				new XMIResourceFactoryImpl());
		resources.getPackageRegistry().put(ArduinoCardPackage.eNS_URI,
				ArduinoCardPackage.eINSTANCE);
		return resources;
	}

	public String caseState(State object) {
		String result = "";

		result += "void " + object.getName() + "() {\n";
		for (Command c : object.getCommand())
			result += "\t" + doSwitch(c);
		for (Transition t : object.getTransitions())
			result += doSwitch(t);
		result += " { return " + object.getName() + "(); }\n}\n";

		return result;
	}

	public String caseBlock(Block object) {
		String result = "";

		// TODO ou alors on jette une exception ?
		result += "/* error: raw block should not exist */";

		return result;
	}

	public String caseSensor(Sensor object) {
		String result = "";

		result += "pinMode(" + object.getPinNumber() + ", INPUT);\n";

		return result;
	}

	public String caseActuator(Actuator object) {
		String result = "";

		result += "pinMode(" + object.getPinNumber() + ", OUTPUT);\n";

		return result;
	}

	public String caseCondition(Condition object) {
		String result = "";

		
		result += "digitalRead(" + object.getSensor().getPinNumber() + ")";
		result += " == " + (object.isIsHigh() ? "HIGH" : "LOW");

		return result;
	}

	public String caseTransition(Transition object) {
		// TODO probleme d'indentation quand on as
		// plusieur Transition a la suite 
		// => \tif(...) { ... } \n\telse\t if(...)\n\telse...
		//                              oups
		String result = "";

		result += "\tif(";
		for (Condition c : object.getCondition())
			result += doSwitch(c) + " && ";
		result += "1 == 1) { return " + object.getNextState().getName()
				+ "(); }\n\telse";

		return result;
	}

	public String caseCommand(Command object) {
		String result = "";

		result += "digitalWrite(" + object.getActuator().getPinNumber();
		result += ", " + (object.isIsHigh() ? "HIGH" : "LOW") + ");\n";

		return result;
	}

	public String caseCard(Card object) {
		String result = "";
		State initial = null;

		result += "void setup() {\n";
		for (Block b : object.getBlocks())
			result += "\t" + doSwitch(b);
		result += "}\n";

		for (State s : object.getStates()) {
			result += doSwitch(s);
			if (s.isIsInitial()) {
				if (initial != null)
					System.out
							.println("Error, only one initial state is allowed !");
				initial = s;
			}
		}

		result += "void loop() { return " + initial.getName() + "(); }";

		return result;
	}

	public String caseBlockInteraction(BlockInteraction object) {
		String result = "";

		// TODO ou alors on jette une exception ?
		result += "error: raw blockInteraction should not exist */";

		return result;
	}

	public String defaultCase(EObject object) {
		return "";
	}
}
