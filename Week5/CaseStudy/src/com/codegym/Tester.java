package com.codegym;

public class Tester extends OfficeStaff {
    public Tester() {
    }

    public Tester(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }

    @Override
    public int calculateBonus() {
        return 0;
    }

    @Override
    public void work(String task) {
        System.out.println("Testing " + task);
        super.work(task);
    }
}
