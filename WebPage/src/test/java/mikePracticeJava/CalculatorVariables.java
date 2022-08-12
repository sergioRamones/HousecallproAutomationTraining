package mikePracticeJava;

//These variables and methods are components that will help calculate the total bill for customer dining at a restaurant.
//The user should be able to calculate the total sub total/tax/total 

public class CalculatorVariables {
	private double subTotal;
	private double taxRate;
	private double taxAmount;
	
	public  CalculatorVariables() {
		
	}
	
	public CalculatorVariables (double subTotal, double taxRate, double taxAmount) {
		this.subTotal = subTotal;
		this.taxRate = taxRate;
		this.taxAmount = taxAmount;	
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(double taxAmount) {
		this.taxAmount = taxAmount;
	}

	//calculate tax method
	public boolean calTax(double n) {
		boolean correctTax = true;
		
		if (n < 0) {
			correctTax = false;
		} else {
			taxAmount = n * subTotal;
			
		}
		return correctTax;
	}
	
	public double calTotal() {
			double total = subTotal + taxAmount;
			return total;
	}
	
//	//calculate total
//	public double calTotal() {
//		double correctTotal = subTotal + taxAmount;
//		return correctTotal;
//	}  
	
	
	
	
	

}// end class
