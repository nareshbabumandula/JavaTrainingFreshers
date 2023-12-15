package com.java.programs;

import java.util.Scanner;

public class SumofNumbers {
		
	public static  void verifySumOfNumbers(int num) {
		int sum=0;
		for (int i = 1; i <=num; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of number is : " +sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		verifySumOfNumbers(num);
	}

}
