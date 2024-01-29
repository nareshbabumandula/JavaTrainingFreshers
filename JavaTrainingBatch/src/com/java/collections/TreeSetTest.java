package com.java.collections;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Balu");
		set.add("Sandeep");
		set.add("Srikanth");
		set.add("Sharath");
		set.add("Srinivas");
		set.add("Santhosh");
		set.add("Balu"); // no duplicates
		//set.add(null); // null elements are not allowed
		System.out.println(set);
		
		ArrayList alist = new ArrayList();
		alist.add("John");
		alist.add("Peter");
		alist.add("Alex");
		alist.add("Zara");
		alist.add("Thomas");
		alist.add("Gena");
		alist.add("Sjoerd");
		
		TreeSet<String> tset = new TreeSet<>();
		tset.addAll(alist);
		System.out.println(tset);
		
		SortedSet sortedset = new TreeSet<>();
		sortedset.add("Varun");
		sortedset.add("Krishna");
		sortedset.add("Varun");
		//sortedset.add(null); // java.lang.NullPointerException
		sortedset.addAll(tset);
		System.out.println(sortedset);
		
		
		

	}

}
