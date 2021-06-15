package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/customer/list")
    public ModelAndView findAll() {
        List<Customer> customers = customerService.findAll();
        ModelAndView modelAndView = new ModelAndView("/customer/index");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }


    @GetMapping("/customer/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject(new Customer());
        return modelAndView;

    }

    @PostMapping("/customer/create")
    public ModelAndView saveCustomer(@ModelAttribute(name = "customer") Customer customer) {
        customerService.save(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/create");
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "Customer added");
        return modelAndView;
    }
    @GetMapping("/customer/{id}/edit")
    public ModelAndView showEditForm(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
    @PostMapping("/customer/edit")
    public ModelAndView editCustomer(@ModelAttribute(name = "customer") Customer customer){
        ModelAndView modelAndView = new ModelAndView("/customer/edit");
        customerService.update(customer.getId(), customer);
        modelAndView.addObject("message", "Customer updated");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }
    @GetMapping("/customer/{id}/delete")
    public ModelAndView showDeleteForm(@PathVariable int id){
        ModelAndView modelAndView = new ModelAndView("/customer/delete");
        Customer customer = customerService.findById(id);
        modelAndView.addObject("customer", customer);
        return  modelAndView;
    }
    @PostMapping("/customer/delete")
    public ModelAndView deleteCustomer(@ModelAttribute Customer customer){
        //c1: su dung redirect
//        ModelAndView modelAndView = new ModelAndView("redirect:/customer/list");
        customerService.delete(customer.getId());
        //c2: truyen lai List<customer> cho index
        ModelAndView modelAndView = new ModelAndView("/customer/index");
        List<Customer> customers = customerService.findAll();
        modelAndView.addObject("customers",customers);
        return  modelAndView;
    }
    @GetMapping("/customer/{id}/view")
    public ModelAndView showCustomerDetail(@PathVariable int id){
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/customer/view","customer", customer);
        return  modelAndView;
    }
}
