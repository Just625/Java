package com.codegym;

public abstract class NonOfficeStaff extends Employee {
    public NonOfficeStaff() {
    }

    public NonOfficeStaff(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }

    public int calculateFinalSalary() {
        return getHardSalary() - calculateFine();
    }

    public abstract void work();
}
