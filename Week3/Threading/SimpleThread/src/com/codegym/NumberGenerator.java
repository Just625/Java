package com.codegym;

public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator() {
    }

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.name + " is running");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " ,hash code: " + this.hashCode());
            hashCode();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread is interrupted");
            }
        }
        System.out.println("Thread "+this.name+" is stopped");
    }
}
