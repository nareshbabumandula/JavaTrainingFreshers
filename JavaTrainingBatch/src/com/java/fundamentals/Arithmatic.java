package com.java.fundamentals;

public class Arithmatic {

	// a and b are variables of type int OR also called as data members OR attributes OR characteristics
	int a=10;
	int b=20;

	//implementation OR logic OR action OR method
	// java method syntax
	/*
	 * access modifier (e.g. public, private, protected,default return type methodname(){}
	 * 
	 */
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : "+c);
	}
	
	public void subtraction(){
		int c=a-b;
		System.out.println("Subtraction of a and b is : "+c);
	}
	
	public void multipilcation(){
		int c=a*b;
		System.out.println("Multipilcation of a and b is : "+c);
	}
	
	public void division(){
		int c=b/a;
		System.out.println("Division of a and b is : "+c);
	}
	
	public void modulus(){
		int c=b%a;
		System.out.println("Modulus of a and b is : "+c);
	}
	
	public Arithmatic() {
		System.out.println("This is a no argument constructor..!");
	}
	
	public Arithmatic(int a, int b) {
		System.out.println("This is my parameterized constructor..!");
	}
	
	public static void main(String[] args) {
		//Create an object reference for a class
		// Syntax : ClassName  = new Constructor();
		Arithmatic arth = new Arithmatic();
		System.out.println(arth.hashCode());
		System.out.println(arth.a);
		System.out.println(arth.b);
		arth.addition();
		arth.subtraction();
		arth.multipilcation();
		arth.division();
		arth.modulus();
	}
	
	
}
