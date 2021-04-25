package com.codegym;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriter {
    public List<String> readFile(String filePath) {
        List<String> list = new ArrayList<>();
        File file = new File(filePath);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.err.println("File not found!!!");
        }
        return list;
    }
    public void writeFile(String filePath, List<String> list){
        File file = new File(filePath);
        try{
            System.out.println("So ki tu trong file la: "+list.size());
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String element : list) {
                writer.write(element);
                writer.newLine();
            }
            writer.close();
            System.out.println("Copy successfully!");
        }catch(Exception e){
            System.err.println("File not found!!!");
        }
    }
}
