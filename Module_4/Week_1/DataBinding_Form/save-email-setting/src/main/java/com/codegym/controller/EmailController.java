package com.codegym.controller;

import com.codegym.model.Email;
import com.codegym.service.IEmailService;
import com.codegym.service.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmailController {
    private final IEmailService emailService = new EmailService();

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        List<Integer> sizes = new ArrayList<>();
        sizes.add(5);
        sizes.add(10);
        sizes.add(15);
        sizes.add(25);
        sizes.add(50);
        sizes.add(100);
        modelAndView.addObject("email", new Email());
        modelAndView.addObject("languages", languages);
        modelAndView.addObject("sizes", sizes);
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveSetting(@ModelAttribute("setting") Email email, @RequestParam String filterValue){
        if(filterValue.equals("false")){
            email.setFilterSpammed(false);
        }else{
            email.setFilterSpammed(true);
        }
        ModelAndView modelAndView = new ModelAndView("/create");
        emailService.editSetting(email);
        modelAndView.addObject("email", email);
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");
        List<Integer> sizes = new ArrayList<>();
        sizes.add(5);
        sizes.add(10);
        sizes.add(15);
        sizes.add(25);
        sizes.add(50);
        sizes.add(100);
        modelAndView.addObject("languages", languages);
        modelAndView.addObject("sizes", sizes);
        modelAndView.addObject("message", "Setting saved");
        return modelAndView;
    }
}
