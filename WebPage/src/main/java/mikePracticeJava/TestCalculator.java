package mikePracticeJava;

import org.testng.annotations.Test;

public class TestCalculator {
	
//testing no constructor	
	@Test
	public void testCalVarNoConstructor() {
		
		CalculatorVariables object = new CalculatorVariables();
		object.setSubTotal(57.99);
		object.calTax(0.0875);
		System.out.println("Subtotal = " + " " + object.getSubTotal());
		System.out.println("Tax amount = " + " " + object.getTaxAmount());
		System.out.println("Your total bill = " + " " + object.calTotal());
		
	}

}//end class
