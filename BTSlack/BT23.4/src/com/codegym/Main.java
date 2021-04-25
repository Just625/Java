package com.codegym;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final String INVALID_CHOICE_MSG = "Invalid choice!!!";
    public static final String INPUT_ID_MSG = "Enter id:";
    public static final String TYPE_OF_STUDENT_MSG = "What kind of student? (A, B or C)";

    public static void main(String[] args) {
        // write your code here
        List<Student> studentList = new ArrayList<>();
        initStudentList(studentList);
        EnrollmentManagement management = new EnrollmentManagement(studentList);
        Scanner src = new Scanner(System.in);
        int choice;
        do {
            showMenu();
            choice = src.nextInt();
            if (choice < 0 || choice > 6) {
                System.out.println(INVALID_CHOICE_MSG);
            }
            switch (choice) {
                case 1: {
                    src.nextLine();
                    System.out.println(TYPE_OF_STUDENT_MSG);
                    String studentGroup = src.nextLine();
                    management.addNewStudent(studentGroup);
                    break;
                }
                case 2: {
                    management.displayStudentList();
                    break;
                }
                case 3: {
                    management.selectionSort();
                    break;
                }
                case 4: {
                    int ID = getId(src);
                    management.searchStudentByID(ID);
                    break;
                }
                case 5: {
                    int ID = getId(src);
                    management.editStudentInfoByID(ID);
                    break;
                }
                case 6: {
                    int ID = getId(src);
                    management.eraseAStudent(ID);
                    break;
                }
            }
        } while (choice != 0);
    }

    private static int getId(Scanner src) {
        System.out.println(INPUT_ID_MSG);
        return src.nextInt();
    }

    private static void initStudentList(List<Student> studentList) {
        studentList.add(new groupAStudent(6, "Nguyen Van A", "Ha Noi", false, 9, 7, 8));
        studentList.add(new groupCStudent(3, "Nguyen Van C", "Son La", true, 8, 9, 8));
        studentList.add(new groupBStudent(4, "Nguyen Van B", "Moc Chau", true, 10, 9, 7));
    }

    private static void showMenu() {
        System.out.println("1. Input new student");
        System.out.println("2. Show students 's info");
        System.out.println("3. Sort students by name");
        System.out.println("4. Search a student by ID");
        System.out.println("5. Edit a student's info by ID");
        System.out.println("6. Erase a student by ID");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }
}
