package com.codegym;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Luu y se overwrite lai file neu file da ton tai truoc do
//        File folder = new File("NewFolder");
//        folder.mkdir();
//        System.out.println(folder.getAbsolutePath());

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write("MSV\tName\tHometown\tScore\n");
            fileWriter.write("01\tQuan\tHa Noi\t9\n");
            fileWriter.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
