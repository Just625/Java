package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public ReadAndWriteFile() {
    }

    public List<Integer> readFile(String filePath) {
        List<Integer> list = new ArrayList<>();
        File file = new File(filePath);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("File not found or wrong format");
        }
        return list;
    }

    public int findMaxNumber(List<Integer> list) {
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public void writeFile(String filePath, int max) {
        File file = new File(filePath);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write("Max number is " + max);
            writer.close();
            System.out.println("Write successfully!");
        } catch(Exception e){
            System.err.println("File not found");
        }
    }
}
