package com.codegym;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        System.out.println("asdfsdv".matches(".*a$"));
//        String str = "Welcome    to gpcoder";
//        String regex = ".*r$";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(str);
//        boolean match = matcher.matches();
//        System.out.println(match);
//        Pattern p = Pattern.compile(".s");
//        Matcher m = p.matcher("*s");
//        boolean b = m.matches();
//        System.out.println(b);
//        String regex1 = "[\\d]{3}-[\\d]{2}-[\\d]{4}";
//        System.out.println("111-22-3333".matches(regex1));
//        System.out.println("11-22-3333".matches(regex1));
//        String regex2 = "[\\d]{0,}[02468]";
//        System.out.println("5".matches(regex2));
//        System.out.println("6".matches(regex2));
//        String regex3 = "([\\d]{3})[\\d]{3}-[\\d]{4}";
        String regex4 = "[A-Z][a-z[A-Z]]{1,24}";
        System.out.println("Smith".matches(regex4));
        System.out.println("Jones123".matches(regex4));
    }
}
