package com.codegym;

import java.util.Scanner;

public class Magazine extends  Paper{
    public static final String INPUT_SO_PHAT_HANH = "Enter so phat hanh";
    public static final String INPUT_MONTH_RELEASE = "Enter month release:";
    private String monthReleased;
    private String soPhatHanh;

    public Magazine() {
    }

    public Magazine(String code, String publisher, int numberOfCopy, String soPhatHanh, String monthReleased) {
        super(code, publisher, numberOfCopy);
        this.soPhatHanh = soPhatHanh;
        this.monthReleased = monthReleased;
    }

    public Magazine(String soPhatHanh, String monthReleased) {
        this.soPhatHanh = soPhatHanh;
        this.monthReleased = monthReleased;
    }

    public String getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(String soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public String getMonthReleased() {
        return monthReleased;
    }

    public void setMonthReleased(String monthReleased) {
        this.monthReleased = monthReleased;
    }
    public void magazineInfo(){
        Scanner src = new Scanner(System.in);
        super.paperInfo();
        System.out.println(INPUT_SO_PHAT_HANH);
        this.soPhatHanh = src.nextLine();
        System.out.println(INPUT_MONTH_RELEASE);
        this.monthReleased= src.nextLine();
    }
    @Override
    public String toString() {
        return super.toString()+"Magazine{" +
                "soPhatHanh='" + soPhatHanh + '\'' +
                ", monthReleased='" + monthReleased + '\'' +
                '}';
    }
}
