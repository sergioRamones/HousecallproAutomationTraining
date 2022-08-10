package javaBasics;

import org.testng.annotations.Test;

public class VariablesTypes {
	
	int edge = 33;
	double numbers = 123123123.1234124125125151515312312312123;
	boolean flag = true;
	String name ="Sergio";
	Double value=123123.12312313;
	Boolean flag2 = false;

	
	
	//no common 
	float num = 123.123f;
	char letter ='s';
	
	
	
	
	
	@Test
	public void typeVaribles() {
		int number =33;
		
		if(number>10) {
			System.out.println("Yes is more than 10");
		}else {
			System.out.println("is less");
		}
	
		
	}
	
	@Test
	public void typeVaribles2() {
		
		edge = edge;
	}
	
	
	
	

}
