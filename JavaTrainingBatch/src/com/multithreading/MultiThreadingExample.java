package com.multithreading;

public class MultiThreadingExample {

	public static void main(String[] args) throws InterruptedException {
		int n=10;
		
		for (int i = 0; i < n; i++) {
			Thread1 t1 = new Thread1();
			t1.start();
		
			Thread t2 = new Thread(new Thread2());
			t2.start();
			
		}

	}

}
