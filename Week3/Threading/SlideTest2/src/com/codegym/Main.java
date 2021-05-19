package com.codegym;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
static Account account = new Account();
    public static void main(String[] args) {
	// write your code here
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i =0;i<100;i++){
            executor.execute(new AddAPennyTask());
        }
        executor.shutdown();
        while(!executor.isTerminated()){
        }
        System.out.println("What is balance?"+account.getBalance());

    }
    private static class AddAPennyTask implements Runnable{

        @Override
        public void run() {
            account.deposit(1);
        }
    }
}
