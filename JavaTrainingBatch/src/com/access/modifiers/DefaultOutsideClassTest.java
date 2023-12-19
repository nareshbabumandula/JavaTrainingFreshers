package com.access.modifiers;

public class DefaultOutsideClassTest {

	public static void main(String[] args) {
		System.out.println("Accessing default constructor, variables and methods outside the class");
		DefaultTest dt = new DefaultTest();
		System.out.println(dt.a);
		System.out.println(dt.b);
		dt.addition();

	}

}
