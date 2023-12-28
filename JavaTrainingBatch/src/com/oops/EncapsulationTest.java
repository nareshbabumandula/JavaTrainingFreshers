package com.oops;

public class EncapsulationTest extends Employee{

	public static void main(String[] args) {
		EncapsulationTest et = new EncapsulationTest();
		et.setEmpID(222);
		System.out.println(et.getEmpID());
		et.setSalary(15000.00);
		System.out.println(et.getSalary());


	}

}
