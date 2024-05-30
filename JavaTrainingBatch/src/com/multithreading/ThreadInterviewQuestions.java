package com.multithreading;

public class ThreadInterviewQuestions extends Thread{
	
	public void run() {
		System.out.println("Thread is running..!");
	}

	public static void main(String[] args) {
		//1. How to create a Thread in java
		ThreadInterviewQuestions t1 = new ThreadInterviewQuestions();
		t1.start();
		
		//OR
		
		Thread t2 = new Thread(()->{
			System.out.println("Thread is running via anonymus method implememtation");
		});
		t2.start();
		
		//OR
		Runnable t3 = ()->{
			System.out.println("Thread is running via anonymus method implememtation of Runnable interface");
		};
		
		Thread thread = new Thread(t3);
		thread.start();
	}

}
