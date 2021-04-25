package com.codegym;

import java.util.Scanner;

public class groupAStudent extends Student {
    private double mathsScore;
    private double physicsScore;
    private double chemistryScore;

    public groupAStudent() {
    }

    public groupAStudent(int identificationNumber, String name, String address, boolean isPrioritized, double mathsScore, double physicsScore, double chemistryScore) {
        super(identificationNumber, name, address, isPrioritized);
        this.mathsScore = mathsScore;
        this.physicsScore = physicsScore;
        this.chemistryScore = chemistryScore;
    }

    public double getMathsScore() {
        return mathsScore;
    }

    public void setMathsScore(double mathsScore) {
        this.mathsScore = mathsScore;
    }

    public double getPhysicsScore() {
        return physicsScore;
    }

    public void setPhysicsScore(double physicsScore) {
        this.physicsScore = physicsScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }
    @Override
    public void inputStudentInfo(){
        Scanner src = new Scanner(System.in);
        super.inputStudentInfo();
        System.out.println("Enter Maths score:");
        this.mathsScore = src.nextInt();
        System.out.println("Enter Physics score:");
        this.physicsScore = src.nextInt();
        System.out.println("Enter Chemistry score:");
        this.chemistryScore = src.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+ " group A Student{" +
                "Maths score= " + mathsScore +
                ", Physics score= " + physicsScore +
                ", Chemistry score= " + chemistryScore +
                '}';
    }
    @Override
    public void displayInfo(){
        System.out.printf("%-3s %-15s  %-10s %-11s %-5s %-7s %-7s %-7s\n", this.getID(), this.getName(), this.getAddress(),this.isPrioritized(),"A", this.mathsScore, this.physicsScore, this.chemistryScore);
    }
}
