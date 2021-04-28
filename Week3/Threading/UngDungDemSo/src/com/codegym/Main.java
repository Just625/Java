package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Main thread is running");
        Count count = new Count();
        while(count.getT().isAlive()){
            System.out.println("Main thread is alive until my thread is stopped");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println("Main thread is interrupted");
            }
        }
        //Vi co ham while
        System.out.println("Main thread is over");
    }
}
