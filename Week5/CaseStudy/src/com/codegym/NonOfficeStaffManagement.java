package com.codegym;

import java.util.List;

public class NonOfficeStaffManagement implements IGeneralInterface<NonOfficeStaff> {
    private List<NonOfficeStaff> nonOfficeStaffList;

    public NonOfficeStaffManagement() {
    }

    public NonOfficeStaffManagement(List<NonOfficeStaff> nonOfficeStaffList) {
        this.nonOfficeStaffList = nonOfficeStaffList;
    }

    @Override
    public void showAll() {
        for (NonOfficeStaff staff : nonOfficeStaffList) {
            System.out.println(staff);
        }
    }

    @Override
    public NonOfficeStaff create(NonOfficeStaff o) {
        this.nonOfficeStaffList.add(o);
        return o;
    }

    @Override
    public NonOfficeStaff update(int index, NonOfficeStaff o) {
        this.nonOfficeStaffList.set(index, o);
        return o;
    }

    @Override
    public void remove(int index) {
        this.nonOfficeStaffList.remove(index);
    }

    public int getIndexById(String id) {
        int index = -1;
        for (int i = 0; i < nonOfficeStaffList.size(); i++) {
            if (nonOfficeStaffList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
