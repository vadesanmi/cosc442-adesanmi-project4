package edu.towson.cis.cosc442.project4.coffeemaker;



/**
 * The class <code>CoffeeMakerFactory</code> implements static methods that return instances of the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 4/1/16 3:27 PM
 * @author vadesanmi
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	private CoffeeMakerFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link CoffeeMaker}</code>.
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	public static CoffeeMaker createCoffeeMaker() {
		return new CoffeeMaker();
	}
}