package com.codegym;

import java.util.Scanner;

public class groupCStudent extends Student {
    private double literatureScore;
    private double historyScore;
    private double geographyScore;

    public groupCStudent() {
    }

    public groupCStudent(int identificationNumber, String name, String address, boolean isPrioritized, double literatureScore, double historyScore, double geographyScore) {
        super(identificationNumber, name, address, isPrioritized);
        this.literatureScore = literatureScore;
        this.historyScore = historyScore;
        this.geographyScore = geographyScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(double literatureScore) {
        this.literatureScore = literatureScore;
    }

    public double getHistoryScore() {
        return historyScore;
    }

    public void setHistoryScore(double historyScore) {
        this.historyScore = historyScore;
    }

    public double getGeographyScore() {
        return geographyScore;
    }

    public void setGeographyScore(double geographyScore) {
        this.geographyScore = geographyScore;
    }

    @Override
    public void inputStudentInfo() {
        Scanner src = new Scanner(System.in);
        super.inputStudentInfo();
        System.out.println("Enter Literature score:");
        this.literatureScore = src.nextInt();
        System.out.println("Enter History score:");
        this.historyScore = src.nextInt();
        System.out.println("Enter Geography score:");
        this.geographyScore = src.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " group C Student{" +
                "Literature score =" + literatureScore +
                ", History score= " + historyScore +
                ", Geography score =" + geographyScore +
                '}';
    }
    @Override
    public void displayInfo(){
        System.out.printf("%-3s %-15s  %-10s %-11s %-5s %-7s %-7s %-7s\n", this.getID(), this.getName(), this.getAddress(),this.isPrioritized(),"C", this.literatureScore,this.historyScore, this.geographyScore);
    }
}
