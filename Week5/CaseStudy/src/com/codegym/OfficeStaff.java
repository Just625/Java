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
}
