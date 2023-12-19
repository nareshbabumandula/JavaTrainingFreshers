package com.access.modifiers;

public class PublicTest {
	
	public int a=10;
	public int b=20;
	
	public void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
	
	public PublicTest(){
		System.out.println("Executing public constructor..!");
	}

	public static void main(String[] args) {
		PublicTest pt = new PublicTest();
		System.out.println(pt.a);
		System.out.println(pt.b);
		pt.addition();
	}

}
