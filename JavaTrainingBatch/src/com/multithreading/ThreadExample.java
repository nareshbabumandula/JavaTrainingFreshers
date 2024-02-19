package com.multithreading;

class MyThread extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getId() + " Value " + i);
		}
	}
}

public class ThreadExample {
	public static void main(String args[]) {

		// Method 1: Extending Thread class
		MyThread t1 = new MyThread();
		t1.start();

		// Method 2: Implementing Runnable interface
		Thread t2 = new Thread(new MyRunnable());
		t2.start();

		// Method 3: Anonymous class implementing Runnable
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(Thread.currentThread().getId() + " Value " + i);
				}
			}
		});
		t3.start();

		// Method 4: Lambda expression for Runnable
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println(Thread.currentThread().getId() + " Value " + i);
			}
		});
		t4.start();

		// Displaying Thread States
		System.out.println("Thread States:");
		System.out.println("t1 state: " + t1.getState());
		System.out.println("t2 state: " + t2.getState());
		System.out.println("t3 state: " + t3.getState());
		System.out.println("t4 state: " + t4.getState());
	}
}
