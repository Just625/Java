package com.codegym;

public class PrintCharNTimes extends Thread{
    private char charToPrint;
    private int times;

    public PrintCharNTimes() {
    }

    public PrintCharNTimes(char charToPrint, int times){
        this.charToPrint = charToPrint;
        this.times = times;
    }
    @Override
    public void run(){
        for(int i = 0;i<this.times;i++){
            System.out.println(this.charToPrint);
        }
    }
}
