package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1. ArrayList is heterogeneous
 * 2. ArrayList accepts duplicates values
 * 3. ArrayList maintains insertion order
 * 4. ArrayList accepts more than one null values
 * 5. ArrayList is good for storage and retrieval operations only
 */	
public class ArrayListTest {

	public static void main(String[] args) {
		
		List list = new ArrayList(); // upcasting : We can access all super type methods
		
		ArrayList alist = new ArrayList();
		alist.add("Balu");
		alist.add("Sandeep");
		alist.add("Srikanth");
		alist.add("Sharath");
		alist.add("Srinivas");
		alist.add("Santhosh");
		alist.add("Balu");
		alist.add(true);
		alist.add(0, "Kiran");
		alist.add(1, "Amit");
		alist.add(1000);
		alist.add(null);
		alist.add(null);
		alist.remove(1);
		System.out.println(alist);
		System.out.println(alist.get(0));
		System.out.println(alist.contains("Santhosh"));
		System.out.println(alist.isEmpty());
		System.out.println(alist.size());
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Ravi");
		alist1.add("Kiran");
		System.out.println(alist1);
		alist.addAll(alist1);
		System.out.println(alist);
		
		Iterator iter = alist.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		ArrayList<String> alist2 = new ArrayList<String>();		
		alist2.add("john");
		alist2.add("peter");
		//alist2.add(true);
		
		// lambda expression on ArrayList
		System.out.println("Iterating through the ArrayList via lambda");
		alist.forEach((name)->System.out.println(name));
		
	}

}
