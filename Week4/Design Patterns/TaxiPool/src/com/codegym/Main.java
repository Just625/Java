package com.codegym;

public class Main {

    public static final int NUMBER_OF_CLIENTS = 8;

    public static void main(String[] args) {
	// write your code here
        TaxiPool  taxiPool = new TaxiPool();
        for(int i = 1; i < NUMBER_OF_CLIENTS; i++){
            Runnable client = new TaxiThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
