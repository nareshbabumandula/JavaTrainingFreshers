package com.multithreading;

public class Thread1 extends Thread {
	
	@Override
	public void run() {
		try {
			System.out.println("Thread1 is running..!");
		} catch (Exception e) {
			System.out.println("Exception occured..!");
		}
	}
	
}

class Thread2 implements Runnable {

	@Override
	public void run() {
		try {
			System.out.println("Thread2 is running..!");
		} catch (Exception e) {
			System.out.println("Exception occured..!");
		}
	}
	
}

