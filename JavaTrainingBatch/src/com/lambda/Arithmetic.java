package com.lambda;

/**
 * In Java a functional interface is an interface that has single abstract method
 * Functional Interface is a key concept in functional programming.
 * Functional programming is a programming practice that treats computation as the  
 * evaluation of mathematical functions and avoids changing the state and mutable data.
 * Functional programming is introduced from Java 8 version onwards
 * @author naresh
 *
 */
@FunctionalInterface
public interface Arithmetic {

	int calculate(int a, int b);
		
	default void defaultMethod() {
		System.out.println("Executing default method");
	}

	static void staticMethod() {
		System.out.println("Executing staticMethod method");
	}

}



