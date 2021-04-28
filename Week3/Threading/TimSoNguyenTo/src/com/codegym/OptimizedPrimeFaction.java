package com.codegym;

public class OptimizedPrimeFaction implements Runnable {
    private String name;

    public OptimizedPrimeFaction(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + this.name + " start to run");
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(this.name + ": " + i);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Thread 2 finished in " + (endTime - startTime) + " ms");
    }

    public boolean isPrimeNumber(int numb) {
        if (numb < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(numb); i++) {
                if (numb % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
