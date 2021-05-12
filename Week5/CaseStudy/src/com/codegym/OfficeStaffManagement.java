package com.codegym;

import java.io.*;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OfficeStaffManagement implements IGeneralInterface<OfficeStaff> {
    private List<OfficeStaff> officeStaffList;

    public OfficeStaffManagement() {
    }

    public OfficeStaffManagement(List<OfficeStaff> officeStaffList) {
        this.officeStaffList = officeStaffList;
    }

    public List<OfficeStaff> getOfficeStaffList() {
        return officeStaffList;
    }

    public void setOfficeStaffList(List<OfficeStaff> officeStaffList) {
        this.officeStaffList = officeStaffList;
    }

    @Override
    public void showAll() {
        System.out.printf("%-10s%-15s%-10s%-10s%-18s%-12s%-10s\n","Id","Name","Role","Address", "WorkDaysInMonth","HardSalary","NumberOfTaskDone");
        for (OfficeStaff staff : officeStaffList) {
            staff.display();
        }
    }

    @Override
    public OfficeStaff create(OfficeStaff o) {
        this.officeStaffList.add(o);
        return o;
    }

    @Override
    public OfficeStaff update(int index, OfficeStaff o) {
        this.officeStaffList.set(index, o);
        return o;
    }

    @Override
    public void remove(int index) {
        this.officeStaffList.remove(index);
    }

    public int getIndexById(String id) {
        int index = -1;
        for (int i = 0; i < officeStaffList.size(); i++) {
            if (officeStaffList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void calculateSalary() {
        int totalSalary = 0;
        for (OfficeStaff staff : officeStaffList) {
            totalSalary += staff.calculateFinalSalary();
        }
        System.out.println(totalSalary);
    }

    public void showFrequency() {
        Map<String, Integer> map = new TreeMap<>();
        for (OfficeStaff staff : officeStaffList) {
            String staffType = staff.getClass().getName().substring(12);
            if (!map.containsKey(staffType)) {
                map.put(staffType, 1);
            } else {
                map.replace(staffType, map.get(staffType) + 1);
            }
        }
        System.out.println(map);
    }

    public OfficeStaff showMVPOfficeStaff() {
        OfficeStaff mvpOfficeStaff = officeStaffList.get(0);
        for (int i = 1; i < officeStaffList.size(); i++) {
            int currentStaffTask = officeStaffList.get(i).getNumberOfTaskDone();
            if (mvpOfficeStaff.getNumberOfTaskDone() < currentStaffTask) {
                mvpOfficeStaff = officeStaffList.get(i);
            }
        }
        return mvpOfficeStaff;
    }

    public void writeToFile(String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(officeStaffList);
            System.out.println("Write completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(String filePath) {
        try {
            InputStream is = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(is);
            this.officeStaffList = (List<OfficeStaff>) ois.readObject();
            System.out.println("Read completed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void editPersonalInformation(String name, int age, String address, int index) {
        officeStaffList.get(index).setName(name);
        officeStaffList.get(index).setAge(age);
        officeStaffList.get(index).setAddress(address);
        System.out.println("Edit completed");
    }

    public OfficeStaff getOfficeStaffByIndex(int index) {
        return officeStaffList.get(index);
    }

}
