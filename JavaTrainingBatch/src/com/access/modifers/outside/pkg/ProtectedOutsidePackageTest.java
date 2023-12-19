package com.access.modifers.outside.pkg;

import com.access.modifiers.ProtectedTest;

public class ProtectedOutsidePackageTest extends ProtectedTest{

	public static void main(String[] args) {
		System.out.println("Accessing protected constructor, variables and methods outside the package");
//		ProtectedTest pt = new ProtectedTest();
//		System.out.println(pt.a);
//		System.out.println(pt.b);
//		pt.addition();
		ProtectedOutsidePackageTest pot = new ProtectedOutsidePackageTest();
		System.out.println(pot.a);
		System.out.println(pot.b);
		pot.addition();
		
	}

}
