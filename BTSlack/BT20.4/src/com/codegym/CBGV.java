package com.codegym;

import java.util.Scanner;

public class CBGV {
    private int salary;
    private int bonus;
    private int minus;
    private int finalSalary = 0;
    private CanBo canbo = new CanBo();

    public CBGV() {
    }

    public CBGV(int salary, int bonus, int minus, CanBo canbo) {
        this.salary = salary;
        this.bonus = bonus;
        this.minus = minus;
        this.canbo = canbo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMinus() {
        return minus;
    }

    public void setMinus(int minus) {
        this.minus = minus;
    }

    public int getFinalSalary() {
        return finalSalary;
    }

    public void setFinalSalary(int finalSalary) {
        this.finalSalary = finalSalary;
    }

    public CanBo getCanbo() {
        return canbo;
    }

    public void setCanbo(CanBo canbo) {
        this.canbo = canbo;
    }

    @Override
    public String toString() {
        return "salary=" + salary +
                ", bonus=" + bonus +
                ", minus=" + minus +
                ", finalSalary=" + finalSalary +
                ", " + canbo +"\n";
    }

    public CBGV inputCBGVInfo() {
        Scanner src = new Scanner(System.in);
        System.out.println("enter salary: ");
        int salary = src.nextInt();
        System.out.println("enter bonus: ");
        int bonus = src.nextInt();
        System.out.println("enter minus: ");
        int minus = src.nextInt();
        src.nextLine();
        this.canbo = this.canbo.inputCanBoInfo();
        return new CBGV(salary,bonus,minus,canbo);
    }
    public void calculateFinalSalary(){
        this.finalSalary = this.salary + this.bonus - this.minus;
    }
}
