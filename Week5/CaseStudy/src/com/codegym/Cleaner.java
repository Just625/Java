package com.codegym;

public class Cleaner extends NonOfficeStaff {
    public Cleaner() {
    }

    public Cleaner(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }
    @Override
    public void work() {
        System.out.println("Cleaning");
    }
}
