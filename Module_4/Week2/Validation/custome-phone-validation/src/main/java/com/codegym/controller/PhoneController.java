package com.codegym.controller;

import com.codegym.model.Phone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class PhoneController  {
    @GetMapping("/phone")
    public String showForm(Model model){
        model.addAttribute("phone", new Phone());
        return "/index";
    }

    @PostMapping("/validate")
    public String checkValidation (@Validated @ModelAttribute("phone") Phone phone, BindingResult bindingResult, Model model){
        new Phone().validate(phone, bindingResult);
        if(bindingResult.hasFieldErrors()){
            return "/index";
        }else{
            model.addAttribute("phone", phone);
            return "/result";
        }

    }

}
