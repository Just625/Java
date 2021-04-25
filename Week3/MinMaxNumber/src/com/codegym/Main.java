package com.codegym;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("numbers.txt");
        int max = readAndWriteFile.findMaxNumber(list);
        //Neu ko co file, se tu tao 1 file moi
        readAndWriteFile.writeFile("result.txt", max);
    }
}
