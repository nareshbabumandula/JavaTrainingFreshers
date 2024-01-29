package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class HashsetTest {

	/**
	 * Set Interface in Java is present in java.util package. It extends the Collection interface. 
	 * It represents the unordered set of elements which doesn't allow us to store the duplicate items. 
	 * We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Santhosh");
		set.add("Srinivas");
		set.add("Sharath");
		set.add("Sandeep");
		set.add("Srikanth");
		set.add("Sharath");
		set.add(null);
		set.add(null);
		System.out.println(set);		
	}

}
