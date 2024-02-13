package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsTest {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<>();
		alist.add("balu");
		alist.add("srikanth");
		alist.add("sandeep");
		alist.add("sharath");
		alist.add("santhosh");

		// Using Stream to filter and transform data
		List<String> filteredAndUpperCase = alist.stream()
				.filter(person -> person.length() > 5)
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(filteredAndUpperCase);

		List<String> lowercaseLetters = Arrays.asList("a", "b", "c", "d", "e");

		// Using Java streams to convert lowercase letters to uppercase strings
		List<String> uppercaseList = lowercaseLetters.stream()
				.map(String::toUpperCase)
				.collect(Collectors.toList());

		System.out.println(uppercaseList);

		List<Integer> unorderedNumbers = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3);

		// Sort numbers
		List<Integer> sortedNumbers = unorderedNumbers.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(sortedNumbers);


	}

}
