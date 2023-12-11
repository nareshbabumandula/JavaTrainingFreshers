package com.inheritance.types;

public class Result extends Exam implements Project {	
	

	public void disp() {
		int totalScore = marks+pm;
		System.out.println("Roll no is : " +rollNo);
		System.out.println("Internal marks is : " +internalMarks);
		System.out.println("External marks is : " +externalMarks);
		System.out.println("Project marks is : " +pm);
		System.out.println("Total score is : "+totalScore);
	}
	

	public static void main(String[] args) {
		Result res = new Result();
		res.disp();

	}


}
