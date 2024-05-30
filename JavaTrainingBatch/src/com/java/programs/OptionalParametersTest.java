package com.java.programs;

public class OptionalParametersTest {

	/**
	 * In java ellipsis(...) represents variable arguments, also know as varagrs. It allows
   	  the variable number of arguments of the same type.
	 * @param args
	 */
	public void addition(int... num) {
		for (int i : num) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		OptionalParametersTest opt = new OptionalParametersTest();
		System.out.println("Method call..!");
		opt.addition();
		System.out.println("Method call..!");
		opt.addition(1);
		System.out.println("Method call..!");
		opt.addition(1,2);
		System.out.println("Method call..!");
		opt.addition(1,2,3);
		System.out.println("Method call..!");
		opt.addition(1,2,3,4);
		
	}

}
