package javaBasics;

import org.testng.annotations.Test;

public class MajorOrMinor {
	
	
	
	
	

	public void compareNumbers(int number1, int number2) {
		
		if(number1 >= number2) {
			
			if(number1 == number2) {
				System.out.println("Number 1: [ "+number1+" ] is equal than number 2: [ "+number2+" ]");
			}//second if
			else {
				System.out.println("Number 1: [ "+number1+" ] is Major than number 2: [ "+number2+" ]" );
			}
		}//frist if
		else {
				System.out.println("Number 2: [ "+number2+" ] is Major than number 1: [ "+number1+" ]" );
		}
		
		
		
		
//		/////////////////////////
//		if(number1==number2) {
//			System.out.println("Number 1: [ "+number1+" ] is equal than number 2: [ "+number2+" ]" );
//		}
//			
//		if(number1 > number2) {
//			System.out.println("Number 1: [ "+number1+" ] is Major than number 2: [ "+number2+" ]" );
//		}else {
//			System.out.println("Number 2: [ "+number2+" ] is Major than number 1: [ "+number1+" ]" );
//		}
		
		
		
		
	}
	
	@Test
	public void compareNumbersByKeyword() {
		
//		Scanner type = new Scanner(System.in);
//		
//		System.out.println("Please type number1");
//		int number1 = type.nextInt();
//		
//		System.out.println("Please type number2");
//		int number2 = type.nextInt();
//		
//		
//		compareNumbers(number1,number2);
		
		Calculator cal = new Calculator();
		
		System.out.println("Check number1 constructor without parameters " + cal.getNumber1());
		
		Calculator cal2 = new Calculator(2,6);
		
		System.out.println(cal.sumatory());
		System.out.println(cal2.sumatory());
		
		cal.setNumber1(100);
		cal.setNumber2(200);
		

		
		System.out.println("Check number1 constructor without parameters " + cal.getNumber1());
		
		System.out.println("Check number1 constructor with parameters " + cal2.getNumber1());
		
		System.out.println(cal.sumatory());
		
		
	}


}//End class
