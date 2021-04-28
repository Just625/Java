package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Thuat toan ko toi uu bang thread2
        Thread thread1 = new Thread(new LazyPrimeFactorization("1st"));
        thread1.start();
        //Thuat toan toi uu hon nen chay nhanh hon thread1
        Thread thread2 = new Thread(new OptimizedPrimeFaction("2nd"));
        thread2.start();

    }
}
