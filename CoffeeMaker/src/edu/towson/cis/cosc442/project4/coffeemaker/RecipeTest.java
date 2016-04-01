package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>RecipeTest</code> contains tests for the class <code>{@link Recipe}</code>.
 *
 * @generatedBy CodePro at 4/1/16 3:27 PM
 * @author vadesanmi
 * @version $Revision: 1.0 $
 */
public class RecipeTest {
	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testEquals_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testEquals_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean equals(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testEquals_3()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.equals(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the int getAmtChocolate() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtChocolate();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtCoffee() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtCoffee();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtMilk() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtMilk();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the int getAmtSugar() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getAmtSugar();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the String getName() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.getName();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Run the int getPrice() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testGetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		int result = fixture.getPrice();

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtChocolate_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = -1;

		fixture.setAmtChocolate(amtChocolate);

		// add additional test code here
	}

	/**
	 * Run the void setAmtChocolate(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtChocolate_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtChocolate = 1;

		fixture.setAmtChocolate(amtChocolate);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtCoffee_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = -1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtCoffee(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtCoffee_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtCoffee = 1;

		fixture.setAmtCoffee(amtCoffee);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtMilk_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = -1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtMilk(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtMilk_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtMilk = 1;

		fixture.setAmtMilk(amtMilk);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtSugar_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = -1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setAmtSugar(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetAmtSugar_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int amtSugar = 1;

		fixture.setAmtSugar(amtSugar);

		// add additional test code here
	}

	/**
	 * Run the void setName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetName_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		String name = "";

		fixture.setName(name);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetPrice_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = -1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the void setPrice(int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testSetPrice_2()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();
		int price = 1;

		fixture.setPrice(price);

		// add additional test code here
	}

	/**
	 * Run the String toString() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Test
	public void testToString_1()
		throws Exception {
		Recipe fixture = RecipeFactory.createRecipe();

		String result = fixture.toString();

		// add additional test code here
		assertEquals(null, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/1/16 3:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RecipeTest.class);
	}
}