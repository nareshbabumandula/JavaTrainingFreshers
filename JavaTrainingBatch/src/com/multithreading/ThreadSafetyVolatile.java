package com.multithreading;

public class ThreadSafetyVolatile {
	
	static volatile int count=0;

	static void increment() {
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10;i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0; i<10;i++) {
					increment();
				}

			}
		});

		t1.start();
		t2.start();
		

	}

}
