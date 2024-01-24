package com.java.collections;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

/*
 * 1. LinkedList is heterogeneous
 * 2. LinkedList accepts duplicates values
 * 3. LinkedList maintains insertion order
 * 4. LinkedList accepts more than one null values
 * 5. LinkedList is good for manipulation as it internally uses doubly linkedlist and hence there is no need of shifting of memory
  */	
public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList llist = new LinkedList();
		System.out.println(llist.pollFirst());
		llist.add("Ajay");
		llist.add("Balu");
		llist.add("Sandeep");
		llist.add("Srikanth");
		llist.add("Sharath");
		llist.add("Srinivas");
		llist.add("Santhosh");
		llist.add("Balu");
		llist.add("John");
		System.out.println(llist);
		System.out.println(llist.poll()); //Retrieves and removes the head (first element) of this list.
		System.out.println(llist.peek()); //Retrieves, but does not remove, the head (first element) of this list.
		System.out.println(llist.pollFirst()); //Retrieves and removes the head (first element) of this list.It returns the first element of the list and null if the list is empty
		llist.add(1000);
		llist.add(null);
		llist.add(null);
		llist.remove(1);
		System.out.println(llist);
		System.out.println(llist.get(0));
		System.out.println(llist.contains("Santhosh"));
		System.out.println(llist.isEmpty());
		System.out.println(llist.size());
		LinkedList<String> alist1 = new LinkedList<String>();
		alist1.add("Ravi");
		alist1.add("Kiran");
		System.out.println(alist1);
		llist.addAll(alist1);
		System.out.println(llist);
		
		Iterator iter = llist.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		LinkedList<String> linkedlist = new LinkedList<String>();		
		linkedlist.add("john");
		linkedlist.add("peter");
		//linkedlist.add(true);
		
	}

}
