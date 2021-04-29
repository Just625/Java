package com.codegym;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlSongExample {

    public static void main(String[] args){
        // write your code here
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");

            //open stream and put it in BufferReader
            Scanner src = new Scanner(new InputStreamReader(url.openStream()));

            //?? Make a stop point?
            src.useDelimiter("\\Z");
            String content = src.next();

            //close scanner
            src.close();
//            System.out.println(content);

            //Remove all new line
            content = content.replaceAll("\\n+","");

            //Tao 1 pattern name_song">Chỗ cần lấy ten bai hai</a>  . Mo inspect len de xem
            //regex. Tai sao lai co dau "()" va "?"
            Pattern pattern = Pattern.compile("name_song\">(.*?)</a>");
            Matcher matcher = pattern.matcher(content);

            //Dung find() chu ko dung matches()
            while (matcher.find()){
                //Tai sao lai la 1? 0 thi in ra tat ca, 2 thi` ko duoc indexOutOfBound
                System.out.println(matcher.group(1));
            }
//            System.out.println(content);
        }catch(MalformedURLException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
