package com.codegym;

public class Count implements Runnable {
    private Thread t;

    public Count() {
        t = new Thread(this, "my thread");
        System.out.println("My thread created" + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Printing " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("My thread is interrupted");
            }
        }
        System.out.println("My thread is stopped");
    }

    public Thread getT() {
        return t;
    }

    public void setT(Thread t) {
        this.t = t;
    }
}
