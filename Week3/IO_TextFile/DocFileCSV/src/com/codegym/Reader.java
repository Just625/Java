package com.codegym;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public void readFile(String filePath) {
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            System.out.printf("%-2s %-4s %s\n", "ID", "Code", "Name");
            reader.readLine();
            while ((line = reader.readLine()) != null) {
//                System.out.println(reader.read());
                String[] arr = line.split(",");
                System.out.printf("%-2s %-4s %s\n",arr[0], arr[1], arr[2]);
            }
            reader.close();
            System.out.println("The end");
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}
