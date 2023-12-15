package com.java.basics;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first name");
		String firstname = sc.next();
		System.out.println("Enter the last name");
		String lastname = sc.next();
		System.out.println("Fullname is : " + firstname + " " + lastname);
		System.out.println("Fullname is : ".concat(firstname).concat(" ").concat(lastname));
	}

}
