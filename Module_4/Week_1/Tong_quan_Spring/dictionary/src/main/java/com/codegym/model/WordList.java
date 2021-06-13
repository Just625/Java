package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class WordList {
    public static Map<String, String> init(){
        Map<String, String> wordList = new HashMap<>();
        wordList.put("happy", "hạnh phúc");
        wordList.put("sad", "buồn bã");
        wordList.put("pen", "bút bi");
        wordList.put("laptop", "máy tính xách tay");
        wordList.put("mouse", "con chuột");
        return  wordList;
    }
}
