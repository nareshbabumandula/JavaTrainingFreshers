package com.access.modifiers;

class ArraysTest {

	public static void main(String[] args) {
		char c = 'a';
		System.out.println((int)c);
		
		char d = 'A';
		System.out.println((int)d);
		
		//Arrays are fixed in nature
		// Array Declaration, initialization and assignment
		int[] marks = {10,20,40,60,75,90, 77,52,99};
		String[] person = {"ram", "ravi", "kiran", "suresh"};
		
		System.out.println("Length of the array is : " + marks.length);
		System.out.println("Length of the array is : " + person.length);
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		//System.out.println(marks[6]);
		
		System.out.println("For loop starts..!");
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		// Array Declaration and initialization
		int[] score = new int[3];
		score[0]=90;
		score[1]=40;
		score[2]=30;
		//score[3]=50;  // ArrayIndexOutOfBoundsException
		
		System.out.println("Score For loop starts..!");
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		String[] names = {"balu", "srikanth", "sharath", "srinivas", "sandeep", "santhosh"};
		System.out.println(names.length);
		System.out.println(names[0]);
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Array declaration
	    char[] lowerAlphabets = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		System.out.println("Printing lowercase aplhabets ascii values");
		for (int i = 0; i < lowerAlphabets.length; i++) {
			System.out.println((int)lowerAlphabets[i]);
		}
		
		System.out.println("Printing lowercase aplhabets ascii values using foreach or enhanced forloop");
		int nIteration=0;
		for (char alphabet : lowerAlphabets) {
			nIteration++;
			if (nIteration==5) {
				break;
			}
			System.out.println((int)alphabet);
		}
	
	}

}
