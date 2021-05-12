package com.codegym;

public class OfficeStaffFactory {
    public static OfficeStaff getOfficerType(String officerType,String id, String name, String role, int age, String address, int hardSalary) {
        OfficeStaff officeStaff;
        switch (officerType) {
            case "Developer": {
                officeStaff = new Developer(id, name, role, age,address,hardSalary);
                break;
            }
            case "Tester": {
                officeStaff = new Tester(id, name, role, age,address,hardSalary);
                break;
            }
            case "Sales": {
                officeStaff = new Sales(id, name, role, age,address,hardSalary);
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: "+ officerType);
        }
        return officeStaff;
    }
}
