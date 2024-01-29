package com.java.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class StackTest {
	
	@Test
	void stackAssertions() {
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
		
		List<Integer> ranks = Arrays.asList(35,35,49,69,55,32);
		System.out.println(ranks.size());
		
		for (Integer subject : ranks) {
			Assert.assertEquals("Failed since marks scored are less than 35 and the score is : " + subject, true, subject>=35);
		}
						
		
	
		
		
	}

}
