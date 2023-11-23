package com.oops;

public class Student {
	
	// Characterstics or variables or members
	int studentID;
	String address;
	String branch;
	double fees;
	
	// parameterized constructor
	public Student(int studentID, String address, String branch, double fees) {
		super();
		this.studentID = studentID;
		this.address = address;
		this.branch = branch;
		this.fees = fees;
		System.out.println(studentID);
		System.out.println(address);
		System.out.println(branch);
		System.out.println(fees);
		
	}
	
	// no argument constructor
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	// Behavior  or action
	// public - access modifer, void - return type, study - methodname(signature){method body}
	public void study(){
		System.out.println("Student is studying..!");
	}
	
	public String play(String material){
		System.out.println("Student is playing with " + material);
		return material;
	}
	
	public void writeexam(){
		System.out.println("Student is writing exam..!");
	}
	
	public void presenations(){
		System.out.println("Student is giving presentation..!");
	}
	
	public void dance(String object) {
		System.out.println("Student is dancing with " +object);
	}	
	

	public static void main(String[] args) {
		// Create an object reference for the class
		// Classname objRef = new Constructor();
		Student s = new Student(111, "Kukatpally", "CSE", 25000.00);

		s.study();
		String output = s.play("ball");
		System.out.println(output);
		s.dance(output);
		s.presenations();
		s.writeexam();
		
	}
}
