package com.operators;

public class MakingDecisionWithOperators_3 {
	public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        if ( y || x ) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }
        
        if ( y && x ) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }

        if ((x||y)||(x&&y)) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }

        if (x) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }
        
        if (x==true) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }
        
        if (!x==true) {
            System.out.println("Condition is TRUE");
        }else {
            System.out.println("Condition is FALSE");
        }


	}
}
