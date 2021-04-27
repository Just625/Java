package com.codegym;

public class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    public RunnableDemo() {
    }

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating thread: " + threadName);
    }


    @Override
    public void run() {
        System.out.println("Running thread " + this.threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread " + this.threadName + ", " + i);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("Thread" +this.threadName+" interrupted");
            }
        }
        System.out.println("Thread" + this.threadName+ " exiting.");
    }

    public void start() {
        System.out.println("Starting thread" + this.threadName);
        if(t==null){
//            Constructor cua thread
//            Thread(Runnable target, String name)
//            Allocates a new Thread object.
            t = new Thread(this, this.threadName);
            t.start();
        }
    }
}
