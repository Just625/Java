package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        while (true) {
            System.out.println("enter email");
            String str = src.nextLine();
            String regex = "[A-Za-z0-9]+@[A-Za-z0-9]+\\.com";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            System.out.println(matcher.matches());
        }
    }
}
