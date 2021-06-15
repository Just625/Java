package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class CondimentController {
    @RequestMapping("/")
    public String showForm(){
        return "index";
    }
    @RequestMapping("/save")
    public ModelAndView save(@RequestParam(value = "condiment",required = false) String[] condiments){
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("condiments", condiments);
        if(condiments==null){
            modelAndView.addObject("message","Nothing was picked");
        }
        return modelAndView;
    }
}
