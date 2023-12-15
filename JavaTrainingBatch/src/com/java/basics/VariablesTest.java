package com.java.basics;

public class VariablesTest{

	// Instance variables
	int a=10;
	int b=20;
	int c=30;

	// Global or Static Variables or Class variables
	static int e=55;

	// Method
	public void addition(){
		// local variables
		int a=100;
		int b=200;
		int c=300;
		int d=a+b+c;
		System.out.println(d);
	}

	public void suibtraction(){
		int d=a-b-c;
		System.out.println(d);
	}


	public static void main(String args[]){
		VariablesTest arth = new VariablesTest();
		VariablesTest arth1 = new VariablesTest();
		arth.addition(); 
		System.out.println(e); // accessing static variable without any instance
		System.out.println(arth.e); // accessing static variable with instance
		System.out.println(arth1.e); // accessing static variable with other instance
		System.out.println(VariablesTest.e); // accessing static variable with class reference
		System.out.println(arth.a);
	}

}