package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner src = new Scanner(System.in);
        while (true) {
            System.out.println("enter phone number to check:");
            String str = src.nextLine();
            String regex = "\\([0-9]{2}\\)-\\(0[0-9]{9}\\)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                System.out.println("Phone number " + str + " is valid");
            } else {
                System.out.println("Phone number " + str + " is not valid");
            }
        }
    }
}
