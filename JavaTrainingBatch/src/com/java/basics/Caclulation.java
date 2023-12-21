package com.java.basics;

public class Caclulation extends Arithmatic{
	
	void subtraction() {
		int c=a-b;
		System.out.println("subtraction of a and b is : " +c);
	}

	public static void main(String[] args) {
		Caclulation cal = new Caclulation();
		cal.addition();
		cal.subtraction();
		
		Arithmatic arth = new Arithmatic();
		arth.addition();
	}
	

}

class Arithmatic{
	int a=10;
	int b=20;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b is : " +c);
	}
}
