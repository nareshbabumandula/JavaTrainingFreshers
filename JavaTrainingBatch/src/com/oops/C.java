package com.oops;

public class C extends B{
	
	public void multiplication() {
		int c=a*b;
		System.out.println("Multiplication of a and b is : " +c);
	}
	
	public C() {
		System.out.println("Executing C class constructor..!");
	}


	public static void main(String[] args) {
		C c = new C();
		c.addition();
		c.subtraction();
		c.multiplication();

	}

}
