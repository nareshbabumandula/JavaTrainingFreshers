package com.interview;

public class Arithmatic{
	 
	  int a=10;
	  int b=20;

	  void addition(int a, int b){
	     System.out.println("Addition of a and b is : " + (a+b));  
	  }

	  double addition(double a, double b){
	     System.out.println("Addition of a and b is : " + (a+b));  
	     return a+b;
	  }

	  void addition(){
	     System.out.println("Addition of a and b is : " + a+b);  
	  }

	 public static void main(String[] args){

	     Arithmatic arth = new Arithmatic();
	     arth.a=1000;
	     arth.b=2000;
	     arth.addition(100,200);
	     arth.addition(35.50,45.60);
	     arth.addition();
	    
	 }

	}

