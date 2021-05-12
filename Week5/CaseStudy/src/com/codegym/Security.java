package com.codegym;

public class Security extends NonOfficeStaff {
    public Security() {
    }

    public Security(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }
    @Override
    public void work() {
        System.out.println("Guarding");
    }
}
