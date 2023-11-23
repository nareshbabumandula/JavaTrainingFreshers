package com.practice;

public class Dog {
	
	String name="puppy";
	int age=5;
	String colour="red";
	String breed="husky";
	
	public void bark() {
		System.out.println();
	}
	public void dance() {
		System.out.println();
	}
	public void run() {
		System.out.println();
	}
	public void walk() {
		System.out.println();
	}

	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.run();
		d.dance();
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.colour);
		System.out.println(d.breed);
				
	}

}
