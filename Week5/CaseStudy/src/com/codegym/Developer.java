package com.codegym;

public class Developer extends OfficeStaff {
    public Developer() {
    }

    public Developer(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }

    @Override
    public int calculateBonus() {
        return 0;
    }

    @Override
    public void work(String task) {
        System.out.println("Developing " + task);
        super.work(task);
    }
}
