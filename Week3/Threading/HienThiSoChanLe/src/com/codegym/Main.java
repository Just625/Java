package com.codegym;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here
        Thread thread1 = new Thread(new OddThread());
        Thread thread2 = new Thread(new EvenThread());
        thread1.start();
        thread1.join();
        thread2.start();
    }
}
