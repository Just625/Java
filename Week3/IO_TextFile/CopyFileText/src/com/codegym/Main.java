package com.codegym;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ReaderAndWriter readerAndWriter = new ReaderAndWriter();
        Scanner src = new Scanner(System.in);
        System.out.println("Enter source file path");
        String filePath = src.nextLine();
        List<String> list;
        list = readerAndWriter.readFile(filePath);
        System.out.println("Enter target file path");
        String targetFilePath = src.nextLine();
        readerAndWriter.writeFile(targetFilePath, list);
    }
}
