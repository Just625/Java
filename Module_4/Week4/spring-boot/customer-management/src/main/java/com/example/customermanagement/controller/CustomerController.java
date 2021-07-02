package com.example.customermanagement.controller;

import com.example.customermanagement.model.Customer;
import com.example.customermanagement.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView saveCustomer(@ModelAttribute("customer") Customer customer){
        ModelAndView modelAndView =new ModelAndView("/customer/create");
        customerService.save(customer);
        modelAndView.addObject("customer",customer);
        modelAndView.addObject("message","Customer created");
        return modelAndView;
    }
    @GetMapping("/customers")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("/customer/list");
        List<Customer> customerList = (List<Customer>) customerService.findAll();
        modelAndView.addObject("customers", customerList);
        return modelAndView;
    }
    @GetMapping("/edit-customer/{id}")
    public ModelAndView showeditForm(@PathVariable("id") Long id){
        Optional<Customer> customer = customerService.findById(id);
        if(!customer.isPresent()){
            return new ModelAndView("error-404");
        }else{
            return new ModelAndView("/customer/edit","customer",customer.get());
        }
    }

    @PostMapping("/edit-customer")
    public ModelAndView editCustomer(@ModelAttribute("customer") Customer customer){
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        modelAndView.addObject("message", "Customer edited");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("/delete-customer/{id}")
    public ModelAndView showdeleteCustomer(@PathVariable("id") Long id){
        Optional<Customer> customerOptional = customerService.findById(id);
        if(!customerOptional.isPresent()){
            return new ModelAndView("/error-404");
        }else{
            return new ModelAndView("/customer/delete","customer", customerOptional.get());
        }
    }

    @PostMapping("/delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer){
        customerService.remove(customer.getId());
        return "redirect:/customers";
    }
}
