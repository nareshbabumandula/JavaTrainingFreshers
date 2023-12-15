package com.java.programs;

public class TableTest {
	
	public static void printTable(int table) {
		int res = 0;
		for (int i = 1; i<=10; i++) {
			res=table*i;
			System.out.println(table+ "*" + i + "=" +res);
		}
		
	}

	public static void main(String[] args) {
		printTable(5);
	}

}
