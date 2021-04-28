package com.codegym;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentManagement {
    private List<Student> studentList;

    public StudentManagement() {
    }

    public StudentManagement(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void displayList() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        Student newStudent = new Student();
        newStudent.inputInfo();
        studentList.add(newStudent);
        System.out.println("Add success");
    }

    public int searchStudentById(String id) {
        int index = -1;
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void editStudent(String id) {
        int index = this.searchStudentById(id);
        if (index == -1) {
            System.out.println("Can not find student");
        } else {
            studentList.get(index).inputInfo();
            System.out.println("Edit success");
        }
    }

    public void deleteStudent(String id) {
        int index = this.searchStudentById(id);
        if (index == -1) {
            System.out.println("Can not find student");
        } else {
            studentList.remove(index);
            System.out.println("Delete success");
        }
    }

    public void bubbleSortMark() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i; j < studentList.size() - 1; j++) {
                if (studentList.get(j).getMark() < studentList.get(j + 1).getMark()) {
                    Student temp = studentList.get(j);
                    studentList.set(j, studentList.get(j + 1));
                    studentList.set(j + 1, temp);
                }
            }
        }
    }

    public void findHighestMark() {
        double maxMark = studentList.get(0).getMark();
        for (int i = 1; i < studentList.size(); i++) {
            if (studentList.get(i).getMark() > maxMark) {
                maxMark = studentList.get(i).getMark();
            }
        }
        for (Student student : studentList) {
            if (student.getMark() == maxMark) {
                System.out.println(student);
            }
        }
    }

    public int compareTwoString(String str1, String str2) {
        int lengthMin = Math.min(str1.length(), str2.length());
        for (int i = 0; i < lengthMin; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.charAt(i) - str2.charAt(i);
            }
        }
        if (str1.length() != str2.length()) {
            return str1.length() - str2.length();
        } else {
            return 0;
        }
    }

    public void sortByIdUsingSelectionSort() {
        for (int j = 0; j < studentList.size() - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < studentList.size(); i++) {
                String minID = studentList.get(minIndex).getId();
                String currentID = studentList.get(i).getId();
                if (this.compareTwoString(minID, currentID) > 0) {
                    minIndex = i;
                }
            }
            if (minIndex != j) {
                Student temp = studentList.get(j);
                studentList.set(j, studentList.get(minIndex));
                studentList.set(minIndex, temp);
            }
        }
    }

    public int binarySearchID(int left, int right, String id) {
        this.sortByIdUsingSelectionSort();
        int middle = (left + right) / 2;
        while (left <= right) {
            if (studentList.get(middle).getId().equals(id)) {
                return middle;
            } else if (compareTwoString(studentList.get(middle).getId(), id) < 0) {
                return binarySearchID(middle + 1, right, id);
            } else {
                return binarySearchID(left, middle - 1, id);
            }
        }
        return -1;
    }

    public void searchStudentByIdBinarySearch(String id) {
        int index = this.binarySearchID(0, studentList.size() - 1, id);
        if (index == -1) {
            System.out.println("Student not found");
        } else {
            System.out.println(studentList.get(index));
        }
    }

    public void showStudentsFromEachClass() {
        Map<String, Integer> frequency = new HashMap<>();
        for (Student student : studentList) {
            String currentClazz = student.getClazz();
            if (!frequency.containsKey(currentClazz)) {
                frequency.put(currentClazz, 1);
            } else {
                frequency.replace(currentClazz, frequency.get(currentClazz) + 1);
            }
        }
        for (Map.Entry<String, Integer> element : frequency.entrySet()) {
            System.out.println("Class" + element.getKey() + ": " + element.getValue() + " students");
        }
    }
    public void readDataFromFile(String filePath){
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            studentList = (List<Student>)ois.readObject();
            System.out.println("Read completed");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void writeDataToFile(String filePath){
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(studentList);
            System.out.println("Write completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


