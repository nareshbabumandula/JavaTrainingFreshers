package com.java.basics;

public class OuterClass {

	static void m4() {
		System.out.println("Executing the static method from outer class");
	}

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		InnerClass inner = outer.new InnerClass();
		inner.test();

		Demo dem = new Demo();
		dem.m2();
		dem.m1();

		Demo.m1();
		//Demo.m2();

		Demo obj = new OuterClass.Demo();
		obj.m1();
		obj.m2();
		
		Fruits fruits = outer.new Fruits();
		fruits.m3();
		

	}

	// Nested class
	class InnerClass{

		void test() {
			System.out.println("Executing test method from innerclass");
		}
	}

	// nested static class
	static class Demo{
		static void m1() {
			System.out.println("Executing the static method from static class");
		}

		void m2() {
			System.out.println("Executing the non static method from static class");
		}


	}
	
	private class Fruits{
		void m3() {
			System.out.println("Executing the method m3 from private class");
		}
	}



}
