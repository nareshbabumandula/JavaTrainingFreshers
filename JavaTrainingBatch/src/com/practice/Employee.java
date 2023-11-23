package com.practice;
//employee details


public class Employee {
	int employeeid;
	String employeename;
	double salary;

	public void work() {
		System.out.println("he is working");
	}
	public String lunch(String item) {
		System.out.println("he is eating " + item);
		return item;
	}
	
	public void getEmpDetails(int employeeid, String employeename, double salary) {
		System.out.println("Employee ID is " + employeeid);
		System.out.println("Employee name is " + employeename);
		System.out.println("Employee salary is " +salary);
		System.out.println("Employee ID is " + this.employeeid);
		System.out.println("Employee name is " + this.employeename);
		System.out.println("Employee salary is " +this.salary);
		
	}
	
	public Employee(int employeeid, String employeename, double salary) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.salary = salary;
	}
	
	
	public static void main(String[] args) {
		Employee e = new Employee(123,"Prashanth",50000.00);
		e.work();
		e.lunch("biryani");
		e.getEmpDetails(124, "Srikanth", 30000.00);
		
	}


	
}
