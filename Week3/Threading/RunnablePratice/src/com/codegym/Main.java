package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Main thread running");
        RunnableDemo runnableDemo1 = new RunnableDemo("thread 1");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("thread 2");
        runnableDemo2.start();
        System.out.println("Main thread stopped");
    }
}
