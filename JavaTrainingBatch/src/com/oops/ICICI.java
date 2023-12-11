package com.oops;

public class ICICI implements RBI{

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		icici.minBalance();
		icici.minDeposit();
		icici.minWithDrawl();
		icici.maxDeposit();
		icici.maxWithDrawl();
		icici.accountType();
		RBI.loans();
		//icici.minNoOfCustomers=100;
		
	}


	public void minDeposit() {
		System.out.println("Minimum deposit is 1000 rupees");
	}
	
	public void maxDeposit() {
		System.out.println("Maximum deposit is 25 lakhs");
	}


	public void minWithDrawl() {
		System.out.println("Minimum withdrawl is 100 rupees");
	}


	public void maxWithDrawl() {
		System.out.println("Max withdrawl is 25000 rupees");
	}


	public void minBalance() {
		System.out.println("Minimum balance is 1000 rupees");
	}

}
