package com.codegym;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TaxiThread implements Runnable {
    private TaxiPool taxiPool;

    public TaxiThread() {
    }

    public TaxiThread(TaxiPool taxiPool) {
        this.taxiPool = taxiPool;
    }

    @Override
    public void run() {
        takeATaxi();
    }

    private void takeATaxi() {
        try {
            System.out.println("New Client " + Thread.currentThread().getName());
            Taxi taxi = taxiPool.getTaxi();
            TimeUnit.MICROSECONDS.sleep(randInt(1000, 1500));
            taxiPool.release(taxi);
            System.out.println("Served the client: " + Thread.currentThread().getName());
        } catch (InterruptedException | TaxiNotFoundException e) {
            System.out.println("Reject client "+Thread.currentThread().getName());
        }
    }

    private long randInt(int min, int max) {
        return new Random().nextInt((max - min) + 1) + min;
    }
}
