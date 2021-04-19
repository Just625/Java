package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Student student1 = new Student("B", 15, "Radiant");
        Student student2 = new Student("C", 16, "Radiant");
        Student student3 = new Student("A", 10, "Radiant");
        Student[] students = new Student[]{student1, student2, student3};
        display(students);
        Arrays.sort(students);
        System.out.println("Sau khi sap xep");
        display(students);
        StudentComparator student4 = new StudentComparator("B", 15, "Radiant");
        StudentComparator student5 = new StudentComparator("C", 16, "Radiant");
        StudentComparator student6 = new StudentComparator("A", 10, "Radiant");
        StudentComparator[] studentsComparator = new StudentComparator[]{student4, student5, student6};
        StudentComparator comparator = new StudentComparator();
        display1(studentsComparator);
        Arrays.sort(studentsComparator,comparator);
        System.out.println("Sau khi sap xep");
        display1(studentsComparator);

    }

    private static void display(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    private static void display1(StudentComparator[] students) {
        for (StudentComparator student : students) {
            System.out.println(student);
        }
    }
}
