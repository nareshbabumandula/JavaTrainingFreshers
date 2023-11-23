package com.java.basics;

public class DataTypes {

	public static void main(String[] args) {
		//Primitive Datatypes --> byte, short, int, long, float, double, char & boolean
		byte b = 123; // Range -128 to 127
		short s = 23342;
		int i = 3453322;
		long l = 785675;
		float f = 23.5f;
		double d = 345.4564564;
		char c='a';
		boolean bflag=true;
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(bflag);
		
		System.out.println("Min value of byte container is : " + Byte.MIN_VALUE);
		System.out.println("Max value of byte container is : " + Byte.MAX_VALUE);
				
		System.out.println("Min value of short container is : " + Short.MIN_VALUE);
		System.out.println("Max value of short container is : " + Short.MAX_VALUE);
				
	
		// Non primitive data types
		String str = "hello";
		String[] names = {"Sandeep", "Santhosh", "Srinkanth", "Srinivas", "Balu", "Sharath"};
		System.out.println("No of elements in array are : " + names.length);
		for (String employee : names) {
			System.out.println(employee);
		}
		
		//type casting : widening (implicit casting) and narrowing (explicit) casting
		byte b2 = 125;
		System.out.println(b2);
		short s2=b2; // storing smaller container into a bigger container
		System.out.println(s2);
		
		short s3=130;
		System.out.println(s3);
		byte b3=(byte)s3; // Unresolved compilation problem: 
		System.out.println(b3);
		// byte->short->int->long->double -- widening 
		// double->long->int->short->byte -- narrrowing
		
		
		
	}

}
