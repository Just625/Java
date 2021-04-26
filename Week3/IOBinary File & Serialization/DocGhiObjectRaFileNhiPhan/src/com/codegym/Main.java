package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
//Muc tieu: doc, ghi doi tuong ra file nhi phan
    public static void main(String[] args) {
        // write your code here
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "1", "1"));
        list.add(new Student(3, "3", "3"));
        list.add(new Student(4, "4", "4"));
        list.add(new Student(2, "2", "2"));
        writeDataToFile("student.txt", list);
        List<Student> readFromFile = readDataFromFile("student.txt");
        for (Student student : readFromFile) {
            System.out.println(student);
        }
    }

    private static void writeDataToFile(String filePath, List<Student> list) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
            System.out.println("Write to file completed");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private static List<Student> readDataFromFile(String filePath) {
        List<Student> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //lenh readObject tra ve Object nen phai ep kie ve lop con de co the gan vao list duoc
            list = (List<Student>) ois.readObject();
            ois.close();
            fis.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
