package com.oops;

public class B extends A{
	
	public void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b is : " +c);
	}
	
	public B() {
		System.out.println("Executing B class constructor..!");
	}

	public static void main(String[] args) {
		B b = new B();
		b.addition();
		b.subtraction();
		System.out.println(b.a);
		System.out.println(b.b);
		System.out.println(b.hashCode());
	}

}
