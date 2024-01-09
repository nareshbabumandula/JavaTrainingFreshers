package com.oops;

public class Child extends Parent{
	
	public void m1() {
		System.out.println("Executing m1 method from child class");
	}
	
	public void m3() {
		System.out.println("Executing m3 method from child class");
	}
	
	public void m2() {
		System.out.println("Executing m2 method from child class");
	}
	

	public static void main(String[] args) {
			
		Parent p = new Child(); //upcasting : converting sub type to its immediate super type
		p.m1();
		p.m2();
		
		System.out.println("Downcasting starts..!");
		
		//Downcasting is used when we need to develop a code that accesses behaviors of the child class.
		int a=23432;
		byte b =(byte)a; // type casting
		
		Child c = (Child)p; // Object downcasting casting
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		
		System.out.println(p instanceof Child);
		
		

	}

}
