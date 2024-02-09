package com.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class EachCharacterOccuranceHashMap {

	public static void main(String[] args) {
		
		String str = "sharath"; // output : s-1, h-2, a-2, r-1, t-1
		HashMap<Character, Integer> map = new HashMap<>();
		
		char[] chArray = str.toCharArray();
		
		for(Character c: chArray) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			} else {
				map.put(c, 1);
			}
		}
		
		for(Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
