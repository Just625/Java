package com.codegym;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("Enter source file path:");
        String sourcePath = src.nextLine();
        System.out.println("Enter destination file path:");
        String destinationPath = src.nextLine();
        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);
        try {
//            copyFileUsingJava7Files(sourceFile, destinationFile);
            copyFileUsingStream(sourceFile, destinationFile);
            System.out.println("Copy completed");
        } catch (IOException e) {
            System.out.println("Can't copy that file");
            System.err.println(e.getMessage());
        }

    }

    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        FileInputStream is = new FileInputStream(source);
        FileOutputStream os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }

        is.close();
        os.close();
    }
}
