package com.multithreading;

/**
* Thread class provides methods to control the thread's behavior during its lifecycle.

1.New: The thread is in this state before the start() method is called.
2.Runnable:The thread is in this state after calling start(), and it is ready to run. The thread scheduler selects it to run based on the priority and availability of CPU time.
3.Blocked:The thread is in this state if it is waiting for a monitor lock to enter a synchronized block/method or if it is waiting for I/O.
4.Waiting:The thread is in this state if it is waiting indefinitely for another thread to perform a specific action.
5.Timed Waiting:The thread is in this state if it is waiting for a specified amount of time.
6.Terminated:The thread is in this state when it has completed its execution.

 */
public class ThreadLifecycleExample {

    public static void main(String[] args) {
        // Creating a new thread
        Thread myThread = new Thread(new MyRunnable());
        // Get the initial state of the thread
        Thread.State initialState = myThread.getState();
        System.out.println("Initial Thread State: " + initialState);
        // Thread is in 'New' state

        // Starting the thread
        myThread.start();
        Thread.State afterStartState = myThread.getState();
        System.out.println("Thread State after start(): " + afterStartState);

        // Thread is in 'Runnable' state

        try {
            // Sleeping for some time to simulate thread execution
            Thread.sleep(2000);
            Thread.State afterSleepState = myThread.getState();
            System.out.println("Thread State after sleep(): " + afterSleepState);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread is in 'Terminated' state
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        // Code to be executed by the thread

        // Thread is in 'Runnable' state

        try {
            // Sleeping for some time to simulate thread execution
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Thread is in 'Terminated' state
        
    }
}


