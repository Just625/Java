package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @RequestMapping("/")
    public String showInputForm() {
        return "index";
    }

    @PostMapping("/calculator")
    public ModelAndView calculate(@RequestParam(required = false) double firstNumb, double secondNumb, String operator) {
        ModelAndView modelAndView = new ModelAndView("index");
        double result = 0;
        switch (operator) {
            case "Addition": {
                result = firstNumb + secondNumb;
                break;
            }
            case "Subtraction": {
                result = firstNumb - secondNumb;
                break;
            }
            case "Multiplication": {
                result = firstNumb * secondNumb;
                break;
            }
            case "Division": {
                if (secondNumb == 0) {
                    modelAndView.addObject("error-msg","can not divided by 0");
                } else {
                    result = firstNumb / secondNumb;
                }
                break;
            }
        }
        modelAndView.addObject("result", result);
        modelAndView.addObject("operator", operator);
        modelAndView.addObject("firstNumb", firstNumb);
        modelAndView.addObject("secondNumb", secondNumb);
        return modelAndView;
    }
}
