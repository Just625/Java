package com.codegym;

public class PrintFrom1ToChar implements Runnable {
    private int numb;

    public PrintFrom1ToChar() {

    }

    public PrintFrom1ToChar(int numb) {
        this.numb = numb;
    }

    @Override
    public void run() {
        for (int i = 1; i <= this.numb; i++) {
            System.out.println(i);
        }
    }
}
