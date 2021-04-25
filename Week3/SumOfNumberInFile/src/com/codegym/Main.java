package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
        System.out.println("Enter file's path:");
        String filePath = src.nextLine();
        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(filePath);
        //file path: C:\Users\Admin\Desktop\CodeGym\Java\Java\Week3\SumOfNumberInFile\file.txt
    }
}
