package com.codegym.controller;

import com.codegym.model.User;
import com.codegym.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FormController {
    @Autowired
    private IUserService userService;

    @GetMapping("/create")
    public ModelAndView showInputForm(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveUser(@Validated @ModelAttribute("user") User user, BindingResult bindingResult){
        if(bindingResult.hasFieldErrors()){
            return new ModelAndView("/index");
        }else{
            List<User> users = userService.findAll();
            userService.saveUser(user);
            ModelAndView modelAndView = new ModelAndView("/result");
            modelAndView.addObject("users", users);
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
