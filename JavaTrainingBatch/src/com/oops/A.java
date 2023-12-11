package com.oops;

public class A{

	static int a=10;
	static int b=20;
	
	// non static method
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	// static method
	public static void testsubtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
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
		System.out.println(a.hashCode());
		testsubtraction();
		A.testsubtraction();
	}

}
