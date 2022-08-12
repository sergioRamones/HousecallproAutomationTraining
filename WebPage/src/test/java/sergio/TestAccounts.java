package sergio;

import org.testng.annotations.Test;

import poo.Account;

public class TestAccounts {
	
	
	
	@Test
	public void doTrasaction() {
		Account sergio = new Account("Sergio","8448805550",10.5,10000);
		Account mike = new Account("Mike","123456",9.5,25000);
		Account miego = new Account("Diego","09876",8.5,35000);
		Account curtis = new Account("Curtis","4567",12.5,55000);
		
		System.out.println("The old balance is: "+sergio.getBalance());
		System.out.println("The old balance is: "+curtis.getBalance());
		sergio.trasfer(curtis, 1000);
		System.out.println("The new balance is: "+sergio.getBalance());
		System.out.println("The new balance is: "+curtis.getBalance());
		
		System.out.println("Current balnace : "+mike.getBalance());
		mike.income(20000);
		System.out.println("balnace after payment: "+mike.getBalance());
		
		
		
	}
	
	

}
