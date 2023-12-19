package com.access.modifers.outside.pkg;

import com.access.modifiers.PublicTest;

public class PublicOutsidePackageTest {

	public static void main(String[] args) {
		System.out.println("Accessing public constructor, variables and methods outside the package");	
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
