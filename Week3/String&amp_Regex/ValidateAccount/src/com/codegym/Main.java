package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        while (true) {
            System.out.println("Enter account to check valid or not:");
            String str = src.nextLine();
            String regex = "^[a-z0-9_]{6,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()) {
                System.out.println("Account " + str + " is valid\n");
            } else {
                System.out.println("Account " + str + " is not valid\n");
            }
        }
    }
}
