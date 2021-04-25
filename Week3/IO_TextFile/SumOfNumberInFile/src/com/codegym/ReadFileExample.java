package com.codegym;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileExample {
    public ReadFileExample() {
    }

    public void readFileText(String filePath) {
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line ;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            bufferedReader.close();
            System.out.println("Sum of number = "+sum);
        } catch (Exception e) {
            System.err.println("File not found or file doesn't contain all numbers");
        }
    }
}
