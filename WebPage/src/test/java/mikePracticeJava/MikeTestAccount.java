package mikePracticeJava;

import org.testng.annotations.Test;

import poo.Account;

public class MikeTestAccount {
	
	@Test
	
	public void doTransaction() {
		Account mike = new Account("Mike's Checking", "8855789", 12.89, 100000);
		Account bob = new Account ("Bob's Checking", "778899", 15.25, 200000);
		Account tim = new Account ("Tim's Savings", "6698524", 9.56, 25000);
		
		System.out.println("The old balance is" + " " + mike.getBalance());
		System.out.println("The old balance is" + " " + tim.getBalance());
		
		mike.trasfer(tim, 15000);
		
		System.out.println("The new balance is" + " " + mike.getBalance());
		System.out.println("The new balance is" + " " + tim.getBalance());
		
	}
}
