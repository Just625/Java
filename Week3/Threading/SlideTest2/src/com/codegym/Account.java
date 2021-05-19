package com.codegym;

public class Account {
    private int balance;

    public Account() {
    }

    public Account(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    //Them  synchronized vao thi se in duoc ket qua dung
    public synchronized void  deposit(int amount){
        int newBalance = balance+ amount;
        try{
            Thread.sleep(5);
        }catch(InterruptedException ex){
        }
        this.balance = newBalance;
    }
}
