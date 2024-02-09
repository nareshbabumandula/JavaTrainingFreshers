package com.java.collections;

import java.util.HashMap;
import java.util.Map.Entry;

/**
 * Hashmap takes key and value pairs
 * It maaintains insertion order
 * It accepts duplicate values
 * keys will be unique. It replaces the key with the latest occurance
 * @author nares
 *
 */
public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Python");
		map.put(2, "Scala");
		map.put(3, "Java");
		map.put(4, "C#");
		map.put(5, "JavaScript");
		map.put(6, "Python");
		map.put(2, "Ruby");
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for(Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}

	}

}
