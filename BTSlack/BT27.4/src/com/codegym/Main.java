package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner src = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        List<Student> studentList = new ArrayList<>();
        initList(studentList);
        StudentManagement studentManagement = new StudentManagement(studentList);
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            if (choice < 0 ||choice > 9) {
                System.out.println("Invalid choice");
            }
            switch (choice) {
                case 1: {
                    studentManagement.displayList();
                    break;
                }
                case 2: {
                    studentManagement.addStudent();
                    break;
                }
                case 3: {
                    studentManagement.editStudent(getInputId());
                    break;
                }
                case 4: {
                    studentManagement.deleteStudent(getInputId());
                    break;
                }
                case 5: {
                    studentManagement.bubbleSortMark();
                    break;
                }
                case 6: {
                    studentManagement.findHighestMark();
                    break;
                }
                case 7: {
                    studentManagement.searchStudentByIdBinarySearch(getInputId());
                    break;
                }
                case 8: {
                    studentManagement.showStudentsFromEachClass();
                    break;
                }
                case 9:{
                    src.nextLine();
                    System.out.println("enter file path:");
                    String filePath = src.nextLine();
                    studentManagement.readDataFromFile(filePath);
                    break;
                }
                case 10:{
                    src.nextLine();
                    System.out.println("enter file path:");
                    String filePath = src.nextLine();
                    studentManagement.writeDataToFile(filePath);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static String getInputId() {
        src.nextLine();
        System.out.println("enter id");
        return src.nextLine();
    }

    private static void initList(List<Student> studentList) {
        studentList.add(new Student("Hero2", "Beast Master", "HN", "C02", 6));
        studentList.add(new Student("Hero1", "Legion Commander", "BN", "C01", 8));
        studentList.add(new Student("Hero3", "Axe", "HN", "C02", 7));
    }

    private static void showMenu() {
        System.out.println("1. Show all students");
        System.out.println("2. Add new student");
        System.out.println("3. Edit a student");
        System.out.println("4. Erase a student");
        System.out.println("5. Sort students by mark (decreasing oder)");
        System.out.println("6. Find students who have highest mark");
        System.out.println("7. Search student by id(binary search) ");
        System.out.println("8. Number of student from each class");
        System.out.println("9. Read student's data from file");
        System.out.println("10. Write student's data to file");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }
}
