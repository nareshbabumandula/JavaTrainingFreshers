package com.lambda;

public class ArithmeticImpl {

	public static void main(String[] args) {
		// Java lambda expression is treated as a function, so compiler does not create a .class file
		// Java Lambda expression syntax:
		// Syntax 1: (argument-list)->{body}
		// Syntax 2: ()->{body}
		// Syntax 3: (p1)->{body}
		// Syntax 4: (p1,p2)->{body}
		
		Arithmetic arth = (a,b) -> a+b;
		int res1=arth.calculate(10, 20);
		System.out.println(res1);
		
		arth = (a,b) -> a-b;
		int res2=arth.calculate(10, 20);
		System.out.println(res2);
		
		arth = (a,b) -> a*b;
		int res3=arth.calculate(10, 20);
		System.out.println(res3);
		
		arth = (a,b) -> b/a;
		int res4=arth.calculate(10, 20);
		System.out.println(res4);
		
		arth = (a,b) -> b%a;
		int res5=arth.calculate(10, 20);
		System.out.println(res5);

	}


	
}
