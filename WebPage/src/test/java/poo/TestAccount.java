package poo;

import org.testng.annotations.Test;

public class TestAccount {
	
	
	@Test
	public void testAccountConstroctorWithoutParameters() {
		
		Account obj1 = new Account();
		
		String account = obj1.getAccountNumber();
	
		System.out.println(account);
		
		obj1.setAccountNumber("235135");
		account = obj1.getAccountNumber();
		
		System.out.println(account);
	
	}
	@Test
	public void testAccountConstructorParameters() {
		
		Account SergioAccount = new Account("Sergio","124125",23.0,10000);
		Account DiegoAccount = new Account("asdasd","asd",23.0,10000);

		System.out.println(SergioAccount.getBalance());
		SergioAccount.income(2500);
		System.out.println(SergioAccount.getBalance());
		
	}
	
	
	

}
