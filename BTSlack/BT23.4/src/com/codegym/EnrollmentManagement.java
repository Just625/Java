package com.codegym;

import java.util.ArrayList;
import java.util.List;


public class EnrollmentManagement {
    public static final String STUDENT_NOT_FOUND = "Student can not be found";
    public static final String EDIT_SUCCESSFULLY = "Edit successfully";
    public static final String CAN_NOT_DELETE = "Can not delete";
    public static final String ERASE_SUCCESSFULLY = "Erase successfully";
    private List<Student> studentList = new ArrayList<>();

    public EnrollmentManagement() {
    }

    public EnrollmentManagement(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void displayStudentList() {
        System.out.println("------------------------------Students List------------------------------");
        System.out.printf("%-3s %-15s  %-10s %-11s %-5s %-7s %-7s %-7s\n", "ID", "Name", "Address", "Prioritized", "Group", "Score 1", "Score 2", "Score 3");
        for (Student student : studentList) {
            student.displayInfo();
        }
    }

    public void addNewStudent(String studentGroup) {
        Student newStudent = new Student();
        switch (studentGroup) {
            case "A": {
                newStudent = new groupAStudent();
                break;
            }
            case "B": {
                newStudent = new groupBStudent();
                break;
            }
            case "C": {
                newStudent = new groupCStudent();
                break;
            }
        }
        newStudent.inputStudentInfo();
        studentList.add(newStudent);
        System.out.println("Add successfully");
    }

    public String compare2Strings(String str1, String str2) {
        String str = "equal";
        if (str1.equals(str2)) {
            return str;
        } else {
            int length = Math.min(str1.length(), str2.length());
            for (int i = 0; i < length; i++) {
                if (str1.charAt(i) < str2.charAt(i)) {
                    str = "smaller";
                    break;
                }
                if (str1.charAt(i) > str2.charAt(i)) {
                    str = "greater";
                    break;
                }
            }
            if (str.equals("equal")) {
                return str1.length() > str2.length() ? "greater" : "smaller";
            } else {
                return str;
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < studentList.size(); j++) {
                String comparedStudentName = studentList.get(j).getName();
                String minStudentName = studentList.get(indexMin).getName();
                boolean isSmaller = this.compare2Strings(comparedStudentName, minStudentName).equals("smaller");
                if (isSmaller) {
                    indexMin = j;
                }
            }
            if (indexMin != i) {
                Student temp = studentList.get(indexMin);
                studentList.set(indexMin, studentList.get(i));
                studentList.set(i, temp);
            }
        }
    }

    public int binarySearchID(int left, int right, int ID) {
        int middle = (left + right) / 2;
        while (left <= right) {
            int studentID = studentList.get(middle).getID();
            if (studentID == ID) {
                return middle;
            } else if (studentID < ID) {
                return binarySearchID(middle + 1, right, ID);
            } else {
                return binarySearchID(left, middle - 1, ID);
            }
        }
        return -1;
    }

    public void searchStudentByID(int ID) {
        this.insertionSortID();
        int index = this.binarySearchID(0, studentList.size() - 1, ID);
        if (index == -1) {
            System.out.println(STUDENT_NOT_FOUND);
        } else {
            System.out.println(studentList.get(index));
        }
    }

    public void insertionSortID() {
        for (int i = 1; i < studentList.size(); i++) {
            int position = i;
            Student temp = studentList.get(position);
            while (position > 0 && temp.getID() < studentList.get(position - 1).getID()) {
                studentList.set(position, studentList.get(position - 1));
                position--;
            }
            studentList.set(position, temp);
        }
    }

    public void editStudentInfoByID(int ID) {
        Student newStudent;
        this.insertionSortID();
        int index = this.binarySearchID(0, studentList.size() - 1, ID);
        if (index == -1) {
            System.out.println(STUDENT_NOT_FOUND);
        } else {
            if (studentList.get(index) instanceof groupAStudent) {
                newStudent = new groupAStudent();
            } else if (studentList.get(index) instanceof groupBStudent) {
                newStudent = new groupBStudent();
            } else {
                newStudent = new groupCStudent();
            }
            newStudent.inputStudentInfo();
            studentList.set(index, newStudent);
            System.out.println(EDIT_SUCCESSFULLY);
        }
    }

    public void eraseAStudent(int ID) {
        if (studentList.isEmpty()) {
            System.out.println(CAN_NOT_DELETE);
        } else {
            int index = this.binarySearchID(0, studentList.size() - 1, ID);
            if(index == -1){
                System.out.println(STUDENT_NOT_FOUND);
            }else{
                studentList.remove(index);
                System.out.println(ERASE_SUCCESSFULLY);
            }
        }

    }
}
