package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
//        List<Student> list = new ArrayList<>();
//        list.add(new Student("1", "A"));
//        list.add(new Student("2", "B"));
//        list.add(new Student("3", "C"));
////        writeDataToFile(list, "demo.txt");
//        List<Student> list2 = new ArrayList<>();
//        list2 = readDataFromFile("demo.txt");
//        System.out.println(list2);
        System.out.println("enter source file");
        String sourcePath = src.nextLine();
        System.out.println("enter destination file");
        String destPath = src.nextLine();
        File source = new File(sourcePath);
        File dest = new File(destPath);
        try {
            copyFileUsingStream(source, dest);
            System.out.println("Copy completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeDataToFile(List<Student> list, String filePath) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> readDataFromFile(String filePath) {
        List<Student> list = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            list = (List<Student>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);

        }
        is.close();
        os.close();
    }
}
