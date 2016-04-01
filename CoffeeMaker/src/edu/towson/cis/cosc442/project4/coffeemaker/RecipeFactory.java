package edu.towson.cis.cosc442.project4.coffeemaker;



/**
 * The class <code>RecipeFactory</code> implements static methods that return instances of the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/1/16 3:27 PM
 * @author vadesanmi
 * @version $Revision: 1.0 $
 */
public class RecipeFactory
 {
	/**
	 * Prevent creation of instances of this class.
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	private RecipeFactory() {
	}


	/**
	 * Create an instance of the class <code>{@link Recipe}</code>.
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	public static Recipe createRecipe() {
		return new Recipe();
	}
}