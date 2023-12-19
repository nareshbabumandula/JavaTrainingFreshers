package com.access.modifiers;

public class PublicOutsideTest {

	public static void main(String[] args) {
		System.out.println("Accessing public constructor, variables and methods outside the class");
		PublicTest pot = new PublicTest();
		System.out.println(pot.a);
		System.out.println(pot.b);
		pot.addition();
	}

}
