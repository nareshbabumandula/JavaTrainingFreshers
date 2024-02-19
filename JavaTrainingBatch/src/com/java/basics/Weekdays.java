package com.java.basics;

enum Seasons {SPRING, SUMMER, RAINY, WINTER}

public class Weekdays {
	
	/**
	 * ENUM stands for enumeration (special data type in java)
	 * enums values are constants by default 
	 * enum values are final and static
	 * @author nares
	 *
	 */
	enum Days {SUNDAY,MONDAY,TUESDAY, WEDNESDAY,THURSDAY,FRIDAY,SATURDAY}
	

	public static void main(String[] args) {
		enum Students {BALU, SRIKANTH, SANTHOSH, SANDEEP}
		
		for (Students student : Students.values()) {
			System.out.println(student);
		}
		System.out.println("--------------------------------------");
		
		
		for (Days day : Days.values()) {
			System.out.println(day);
		}
		
		System.out.println("--------------------------------------");
		
		for (Seasons season : Seasons.values()) {
			System.out.println(season);
		}
	}
	
	

}


class TestEnum{
	
	public static void main(String[] args) {
		for (Weekdays.Days day : Weekdays.Days.values()) {
			System.out.println(day);
		}
	}
	
}



