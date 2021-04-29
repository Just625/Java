package com.codegym;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            URL url = new URL("https://dantri.com.vn/");
            Scanner src = new Scanner(new InputStreamReader(url.openStream()));
            src.useDelimiter("\\Z");
            String content = src.next();
            src.close();
            //Do trang dantri xuong dong = R ?
            content = content.replaceAll("\\R", "");
//            System.out.println(content);
            String smallerContent = getSmallerContent(content);
            String finalResult = "";
            Pattern pattern2 = Pattern.compile("htm\">(.*?)</a>");
            Matcher matcher2 = pattern2.matcher(smallerContent);
            while (matcher2.find()) {
                finalResult += matcher2.group(1).trim() + "\n";
            }
            finalResult = finalResult.replaceAll("&quot;", "'");
            System.out.println(finalResult);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getSmallerContent(String content) {
        String smallerContent = "";
        Pattern pattern1 = Pattern.compile("dt-list dt-list--link\">(.*?)</ul>");
        Matcher matcher1 = pattern1.matcher(content);
        while (matcher1.find()) {
            smallerContent += matcher1.group(1);
        }
//            System.out.println(smallerContent);
        return smallerContent;
    }
}
