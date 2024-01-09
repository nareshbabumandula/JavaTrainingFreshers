package com.oops;

public class MethodOverloadTest {
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
			
	void addition(int a, int b) {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
		
	void addition(int a, int b, int c) {
		int d=a+b+c;
		System.out.println("Addition of a, b and c is : " +d);
	}
	
	void addition(double a, double b) {
		double c=a+b;
		System.out.println("Addition of double a and b is : " +c);
	}
	
	public static void main(String[] args) {
		MethodOverloadTest mot = new MethodOverloadTest();
		mot.addition();
		mot.addition(15, 30);
		mot.addition(10, 20, 30);
		mot.addition(13.764, 123.234);
	}

}
