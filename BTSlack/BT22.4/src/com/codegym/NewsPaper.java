package com.codegym;

import java.util.Scanner;

public class NewsPaper extends Paper {
    public static final String INPUT_DAY_RELEASE = "Enter day release:";
    private int dayReleased;

    public NewsPaper() {
    }

    public NewsPaper(int dayReleased) {
        this.dayReleased = dayReleased;
    }

    public NewsPaper(String code, String publisher, int numberOfCopy, int dayReleased) {
        super(code, publisher, numberOfCopy);
        this.dayReleased = dayReleased;
    }

    @Override
    public String toString() {
        return super.toString()+"NewsPaper{" +
                "dayReleased=" + dayReleased +
                '}';
    }

    public int getDayReleased() {
        return dayReleased;
    }

    public void setDayReleased(int dayReleased) {
        this.dayReleased = dayReleased;
    }
    public void newsPaperInfo(){
        Scanner src = new Scanner(System.in);
        super.paperInfo();
        System.out.println(INPUT_DAY_RELEASE);
        this.dayReleased = src.nextInt();
    }
}
