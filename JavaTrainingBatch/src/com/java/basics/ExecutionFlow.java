package com.java.basics;

public class ExecutionFlow {
	
	{
		System.out.println("Executing the instance block..!");
	}
	
	static {
		System.out.println("Executing the static block..!");
	}
	
	public ExecutionFlow() {
		System.out.println("Executing the constructor..!");
	}

	public static void main(String[] args) {
		ExecutionFlow ef = new ExecutionFlow();

	}

}
