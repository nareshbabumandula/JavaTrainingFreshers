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

	public static void main(String[] args) {
		VerifyNumbers ver = new VerifyNumbers();
		ver.verifyEvenOrOdd(4);
		ver.verifyPrime(5);
	}

}
