package com.java.collections;

import java.util.Stack;

public class LIFOTest {

	public static void main(String[] args) {
		//L-I-F-O - Last In First Out
		Stack st = new Stack<>();
		st.push("Balu");
		st.push("Srinivas");
		st.push("Santhosh");
		st.push("Sharath");

		for (int i = 0; i <st.size(); i++) {
			System.out.println(st.get(i));
		}

		System.out.println("Lastly inserted element is : " + st.pop()); 

		for (int i = 0; i <st.size(); i++) {
			System.out.println(st.get(i));
		}
	}

}
