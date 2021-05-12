package com.codegym;

public class Sales extends OfficeStaff {
    public Sales() {
    }

    public Sales(String id, String name, String role, int age, String address, int hardSalary) {
        super(id, name, role, age, address, hardSalary);
    }

    @Override
    public int calculateBonus() {
        return 0;
    }

    @Override
    public void work(String task) {
        System.out.println("Selling" + task);
        super.work(task);
    }
}
