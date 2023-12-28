package com.exceptions;

public class UncheckedExceptionTest {

	static void uncheckedExceptionsExample() {
		int c=0;
		try {
			String str=null;
			System.out.println(str.length());
			int a=10;
			int b=10;
			c=a/b;
		    String name[] = {"Sandeep","Balu", "Srinivas", "Sharath", "Srikanth"};
		    System.out.println(name[0]);
		    System.out.println(name[2]);
		    
		    for (String person : name) {
				System.out.println(person);
			}
		} catch (NullPointerException e) {
			System.out.println("Executing NullPointerException catch block..!");
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch(ArithmeticException e) {
			System.out.println("Executing ArithmeticException catch block..!");
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Executing ArrayIndexOutOfBoundsException catch block..!");
			e.printStackTrace();
		}catch (RuntimeException e) {
			System.out.println("Executing RuntimeException catch block..!");
			e.printStackTrace();
		}catch (Exception e) {
			System.out.println("Executing Exception catch block..!");
			e.printStackTrace();
		}catch (Throwable e) {
			System.out.println("Executing Throwable catch block..!");
			e.printStackTrace();
		}
		finally {
			System.out.println("Successfully verified the unchecked exceptions..!");
		}
	}
	
	static void division() {
		int c=0;
		try {
			int a=10;
			int b=0;
			c=a/b;
		} catch (Exception e) {
			System.out.println("Division of a and b is : " +c);
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		division();
		uncheckedExceptionsExample();
	}

}
