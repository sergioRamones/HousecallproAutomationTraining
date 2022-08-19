package poo;

public class Account {
	
	private String name;
	private String accountNumber;
	private double interest; 
	private double balance; 
	
	
	
	public Account() {

	}
	public Account(String name) {
		
	}

	public Account(String name, String accountNumber, double interest, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.interest = interest;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getInterest() {
		return interest;
	}

	public double getBalance() {
		return balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean income(double n) {
		boolean correctIncome=true;

		if (n < 0) {
			correctIncome = false;
		} else {
			balance = balance + n;
		}
		return correctIncome;
	}
	
	public boolean refund(double n) {
		boolean correctRefund=true;
		
		if(n<0) {
			correctRefund = false;
		} else if(balance >=n) {
			balance -= n;
			//balance = balance -n;
		}else {
			correctRefund=false;
		}
		
		
		return correctRefund;
	}
	
	public boolean trasfer(Account a, double n) {
		boolean correct = true;
		
		if(n<0) {
			correct = false;
		} else if(balance >=n) {
			refund(n);
			a.income(n);
		}else {
			correct=false;
		}

		return correct;
	}
	
	
	

	
	

}// This is a comment that I'll push to Github
