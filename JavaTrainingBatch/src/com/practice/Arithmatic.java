package com.practice;

public class Arithmatic {
	
	static int a=10;
	static int b=20;
	
	public void addition() {
		System.out.println("Addition of a and b is :  " + (a+b));
	}
	
	public void subtraction() {
		System.out.println("Subtraction of a and b is :  " + (a-b));
	}
	public void multiplication() {
		System.out.println("Multiplication of a and b is :  " + (a*b));
	}
	
	public void division() {
		System.out.println("Division of a and b is :  " + (b/a));
	}
	
	public static void modulus() {
		System.out.println("Modules of a and b is :  " + (b%a));
	}

	public static void main(String[] args) {
		Arithmatic arth = new Arithmatic();
		arth.addition();
		arth.subtraction();
		arth.multiplication();
		arth.division();
		modulus();

	}

}
