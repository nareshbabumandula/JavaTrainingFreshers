package com.oops;

public class A{

	int a=10;
	int b=20;
	
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	// No argument constructor
	public A() {
		System.out.println("Executing A class constructor..!");
	}
	
	// Parameterized constructor
	public A(int a, int b) {
		System.out.println("Executing A class parameterized constructor with parameters " + a + "," + b);
	}

	public static void main(String[] args) {
		A a = new A(); 
		a.addition();

	}

}
