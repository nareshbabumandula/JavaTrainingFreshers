package com.oops;

public class MethodOverrideTest extends MethodOverloadTest{
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b in subclass is : " +c);
	}
	
	void m1() {
		super.addition();
		this.addition();
	}

	public static void main(String[] args) {
		MethodOverrideTest mot = new MethodOverrideTest();
		mot.addition();
		mot.m1();
		
	}

}
