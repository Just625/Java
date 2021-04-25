package com.codegym;

import java.util.Scanner;

public class groupBStudent extends Student {
    private double mathsScore;
    private double chemistryScore;
    private double biologyScore;

    public groupBStudent() {
    }

    public groupBStudent(int identificationNumber, String name, String address, boolean isPrioritized, double mathsScore, double chemistryScore, double biologyScore) {
        super(identificationNumber, name, address, isPrioritized);
        this.mathsScore = mathsScore;
        this.chemistryScore = chemistryScore;
        this.biologyScore = biologyScore;
    }

    public double getMathsScore() {
        return mathsScore;
    }

    public void setMathsScore(double mathsScore) {
        this.mathsScore = mathsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getBiologyScore() {
        return biologyScore;
    }

    public void setBiologyScore(double biologyScore) {
        this.biologyScore = biologyScore;
    }

    @Override
    public void inputStudentInfo() {
        Scanner src = new Scanner(System.in);
        super.inputStudentInfo();
        System.out.println("Enter Maths score:");
        this.mathsScore = src.nextInt();
        System.out.println("Enter Chemistry score:");
        this.chemistryScore = src.nextInt();
        System.out.println("Enter Biology score:");
        this.biologyScore = src.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + " group B Student{" +
                "Maths score= " + mathsScore +
                ", Chemistry score= " + chemistryScore +
                ", Biology score= " + biologyScore +
                '}';
    }
    @Override
    public void displayInfo(){
        System.out.printf("%-3s %-15s  %-10s %-11s %-5s %-7s %-7s %-7s\n", this.getID(), this.getName(), this.getAddress(),this.isPrioritized(), "B",this.mathsScore,this.chemistryScore, this.biologyScore);
    }
}
