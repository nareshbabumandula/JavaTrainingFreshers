package com.control.statements;

public class LoopingStatements{

	/**
	 * @author naresh
	 * @Description : This method is used to demonstrate the loop with some iterations
	 * @Parameters : NA
	 * @CreationDate: 12-Dec-2023
	 * @ModifiedDate : 
	 */
	public static void forLoopDemo() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void infiniteForLoop() {
		int i=1;
		for(;;) {
			System.out.println(i);
		}
	}
	
	public static void verifyPrimeNumber(int num) {
		int mid=num/2;
		boolean isPrime=true;
		
		if(num==0 || num==1) {
			System.out.println(num + " is not a prime number");
		}else {
			for(int i=2;i<=mid;i++) {
				if(num%i==0) {
					System.out.println(num + " is not a prime number");
					isPrime=false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num + " is a prime number");
		}
	}

	public static void main(String[] args) {
		//forLoopDemo();
		//infiniteForLoop();
		//verifyPrimeNumber(0);
		//verifyPrimeNumber(1);
		verifyPrimeNumber(9);
		//verifyPrimeNumber(15);
		//verifyPrimeNumber(16);
		//verifyPrimeNumber(17);

	}

}
