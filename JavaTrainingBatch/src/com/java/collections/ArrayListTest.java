package com.java.collections;

import java.awt.Adjustable;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList alist = new ArrayList();
		alist.add("Balu");
		alist.add("Sandeep");
		alist.add("Srikanth");
		alist.add("Sharath");
		alist.add("Srinivas");
		alist.add("Santhosh");
		alist.add("Balu");
		alist.add(true);
		alist.add(1000);
		System.out.println(alist);
		
		ArrayList<String> alist1 = new ArrayList<String>();
		alist1.add("Ravi");
		alist1.add("Kiran");
		System.out.println(alist1);
	}

}
