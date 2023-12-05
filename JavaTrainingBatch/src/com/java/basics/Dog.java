package com.java.basics;

public class Dog {
	int age=10;
	String name = "tillu";
	
	public void run() {
		System.out.println("Dog is running at the age of : " +age);
	}

	public void cry() {
		System.out.println(name + " is crying..!");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d.age);
		d.run();
		d.cry();
	}

}
