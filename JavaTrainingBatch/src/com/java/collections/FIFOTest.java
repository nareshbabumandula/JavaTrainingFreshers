package com.java.collections;

import java.util.Deque;
import java.util.LinkedList;

public class FIFOTest {

	public static void main(String[] args) {
		//F-I-F-O - Firstly Inserted First Out
		Deque deque = new LinkedList();
		deque.offer("Balu");
		deque.offer("Srinivas");
		deque.offer("Santhosh");
		deque.offer("Sharath");
		
		System.out.println(deque);
		deque.poll();
		System.out.println(deque);  // FIFO
		
		while (!deque.isEmpty()) { 
			System.out.println(deque.poll()); // FIFO }
		}
		
	}
}
