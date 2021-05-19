package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Thread thread1 = new Thread(new PrintCharNTimes('a',100));
//        Thread thread2 = new Thread(new PrintCharNTimes('b',100));
        Thread thread1 = new PrintCharNTimes('a',100);
        Thread thread2 = new PrintCharNTimes('b',100);
        Thread thread3 = new Thread(new PrintFrom1ToChar(100));
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
