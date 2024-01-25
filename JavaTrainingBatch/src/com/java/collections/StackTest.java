package com.java.collections;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.add("Balu");
		stack.add("Santhosh");
		stack.add("Srikanth");
		stack.add("Santhosh");
		stack.add("Srinivas");
		stack.add("Sandeep");
		stack.add("Sharath");
		stack.add("Aravind");
			
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println(stack.capacity());
		System.out.println(stack);
		System.out.println(stack.search("Aravind"));
		System.out.println(stack.pop());
		System.out.println(stack.contains("Aravind"));
		System.out.println(stack.contains("BALU".toLowerCase()));
		System.out.println(stack.elementAt(0));
		System.out.println(stack.get(1));
		System.out.println(stack.lastIndexOf("Santhosh"));
		System.out.println(stack.search("Balu"));
		
	}

}
