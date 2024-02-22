package com.multithreading;

class A {
	/**
	 * synchronized keyword is used to ensure that only one thread can access the method at a time
	 */
	synchronized void sum(int n){
		// Creating a Thread instance
		Thread t = Thread.currentThread();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(t.getName() + " : " + (n+i));
		}
	}
}


class B extends Thread{
	
	A a = new A();
	
	public void run() {
		a.sum(10);
	}

}


public class ThreadSafetyExample {
	
	public static void main(String[] args) {
		B b = new B();
		
		Thread t1 = new Thread(b);
		t1.setName("Thread A");
		t1.start();
		
		Thread t2 = new Thread(b);
		t2.setName("Thread B");
		t2.start();
	}

}
