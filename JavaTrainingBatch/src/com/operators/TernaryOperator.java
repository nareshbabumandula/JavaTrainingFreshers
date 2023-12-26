package com.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int x = 11;
		// System.out.println(x + 10);
	
		String result = (x == 10)?"X is 10":"X is not 10";
		System.out.println(result);
		String result1 = (true)?"X is 10":"X is not 10";
		System.out.println(result1);

	}

}
