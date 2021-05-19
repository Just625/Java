package com.codegym;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// write your code here
        OddThread oddThread = new OddThread();
        oddThread.start();
        oddThread.join();
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
