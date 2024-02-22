package com.multithreading;

class MyRunnableTest implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class RunnableExample {
    public static void main(String args[]) {
        Thread t1 = new Thread(new MyRunnableTest());
        Thread t2 = new Thread(new MyRunnableTest());
        
        // Start both threads
        t1.start();
        t2.start();
    }
}
