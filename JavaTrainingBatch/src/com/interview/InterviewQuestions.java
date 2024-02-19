package com.interview;

public class InterviewQuestions {

	public static void main(String[] args) {
		String str1 = "hello";
		System.out.println(str1.hashCode());
		String str2 = "Hello";
		System.out.println(str2.hashCode());
		System.out.println(str1.equals(str2)); // In java .equals method will do value comparison
		System.out.println(str1.equalsIgnoreCase(str2)); 
		String str3 = new String("hello");
		System.out.println(str1.equals(str3));
		System.out.println(str3.hashCode());
		System.out.println(str1==str2); // == will do memory address comparison 
		System.out.println(str1==str3);
		
		

	}

}
