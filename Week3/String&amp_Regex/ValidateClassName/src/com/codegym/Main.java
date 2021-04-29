package com.codegym;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src = new Scanner(System.in);
        while (true) {
            System.out.println("enter class name");
            String str = src.nextLine();
            String regex = "[CAP]\\d{4}[A-Za-z0-9]*[GHIKLM]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(str);
            if(matcher.find()){
                System.out.println("Class "+str+" is valid");
            }else{
                System.out.println("Class "+str+" is not valid");
            }
        }
    }
}
