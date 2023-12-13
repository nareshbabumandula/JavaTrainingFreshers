package com.java.programs;

public class VerifyNumbers {
	
	public void verifyEvenOrOdd(int num) {
		if (num%2==0) {
			System.out.println(num + " : is an even number");
		} else {
			System.out.println(num + " : is an odd number");
		}
	}
	
	public void verifyPrime(int num) {
		
	}
	
	void demo() {
		for (int i = 1; i < 100; i++) {
			System.out.println(i);
		}
	}
	
	
	static void reverseNumber() {
		int num=123;
		int rev = 0,rem=0;
		
		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}

	public static void main(String[] args) {
		VerifyNumbers ver = new VerifyNumbers();
		//ver.verifyEvenOrOdd(4);
		//ver.verifyPrime(5);
		//ver.demo();
		reverseNumber();
	}

}
