package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/customer/create")
    public ModelAndView createNewCustomer(@ModelAttribute("customer") Customer customer){
        ModelAndView modelAndView = new ModelAndView("index");
        customerService.insertWithStoredProcedure(customer);
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("message", "Customer added");
        return modelAndView;
    }

}
