package com.codegym.controller;

import com.codegym.model.WordList;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class DictionaryController {
    private Map<String, String> wordList = WordList.init();
    @GetMapping("/dictionary")
    public String showInputForm(){
        return "index";
    }
    @PostMapping("/dictionary")
    public ModelAndView searchForWord(@RequestParam(required = false) String eWord){
        ModelAndView modelAndView = new ModelAndView("index");
        String vnWord = "";
        for(Map.Entry<String,String> word: wordList.entrySet()){
            if(word.getKey().equals(eWord)){
                vnWord = word.getValue();
                break;
            }
        }
        String message = "";
        if(vnWord.equals("")){
            message="Không tìm thấy";
        }
        modelAndView.addObject("message",message);
        modelAndView.addObject("eWord",eWord);
        modelAndView.addObject("vnWord",vnWord);
        return modelAndView;
    }
}
