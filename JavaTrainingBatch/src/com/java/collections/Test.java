package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<>(); 
		alist.add(100);
		alist.add(101);
		alist.add(102);
		alist.add(103);
		
		System.out.println("Iterating through the collection via for loop..!");
		for (int i = 0; i < alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		
		Iterator<Integer> iter = alist.iterator();
		System.out.println("Iterating through the collection via iterator..!");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("Iterating through the collection via foreach loop..!");
		for (int score : alist) {
			System.out.println(score);
		}
		
		System.out.println("Iterating through the collection via lambda..!");		
		alist.forEach(marks->System.out.println(marks));
		
	}

}
