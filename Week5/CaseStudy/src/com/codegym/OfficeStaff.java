package com.codegym;

import java.io.Serializable;

public abstract class OfficeStaff extends Employee implements Serializable {
    private int numberOfTaskDone;

    public OfficeStaff() {
    }

    public OfficeStaff(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
        this.numberOfTaskDone = 0;
    }

    public void work(String task) {
        numberOfTaskDone++;
    }

    @Override
    public String toString() {
        return super.toString() + "OfficeStaff{" +
                "numberOfTaskDone=" + numberOfTaskDone +
                '}';
    }

    public abstract int calculateBonus();

    public int getNumberOfTaskDone() {
        return numberOfTaskDone;
    }

    public void setNumberOfTaskDone(int numberOfTaskDone) {
        this.numberOfTaskDone = numberOfTaskDone;
    }

    @Override
    public int calculateFinalSalary() {
        return getHardSalary() + calculateBonus() - calculateFine();
    }
    public void display(){
        System.out.printf("%-10s%-15s%-10s%-10s%-18d%-12d%-10d\n",this.getId(), this.getName(), this.getRole(), this.getAddress(), this.getWorkDaysInMonth(), this.getHardSalary(), this.getNumberOfTaskDone());
    }
}
