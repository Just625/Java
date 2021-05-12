package com.codegym;

public class NonOfficeStaffFactory {
    public static NonOfficeStaff getNonOfficeStaffType(String nonOfficerType,String id, String name, String role, int age, String address, int hardSalary) {
        NonOfficeStaff nonOfficeStaff;
        switch (nonOfficerType) {
            case "Security": {
                nonOfficeStaff = new Security(id, name, role, age, address, hardSalary);
                break;
            }
            case "Cleaner": {
                nonOfficeStaff = new Cleaner(id, name, role, age, address, hardSalary);
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: "+ nonOfficerType);
        }
        return nonOfficeStaff;
    }
}
