package com.oops;

public interface RBI {
	
	// By default all the variables and methods are public, final and abstract
	
	int minNoOfCustomers=1000;
	
	//abstract methods
	void minDeposit();
	void maxDeposit();
	void minWithDrawl();
	void maxWithDrawl();
	void minBalance();
	
	// default method
	default void accountType() {
		System.out.println("Savings, Current and joint accounts are available..!");
	}
	
	// static method
	static void loans() {
		System.out.println("Loans facility is available..!");
	}

}
