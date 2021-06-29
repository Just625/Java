package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.service.ICustomerService;
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

    @GetMapping("/create-customer")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        modelAndView.addObject("customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create-customer")
    public ModelAndView createCustomer(@ModelAttribute("customer") Customer customer) {
        ModelAndView modelAndView = new ModelAndView("customer/create");
        customerService.save(customer);
        modelAndView.addObject("customer", new Customer());
        modelAndView.addObject("message", "");
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView showCustomerList() {
        ModelAndView modelAndView = new ModelAndView("customer/list");
        List<Customer> customers = customerService.findAll();
        customers.size();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/{id}/edit-customer")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView;
        if (customer != null) {
            modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer);
        } else {
            modelAndView = new ModelAndView("customer/error-404");
        }
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public ModelAndView EditCustomer(@ModelAttribute("customer") Customer customer) {
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        customerService.save(customer);
        modelAndView.addObject("message", "");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("{id}/delete-customer")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Customer customer = customerService.findById(id);
        ModelAndView modelAndView;
        if (customer != null) {
            modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer);
        } else {
            modelAndView = new ModelAndView("customer/error-404");
        }
        return modelAndView;
    }

    @PostMapping("delete-customer")
    public String deleteCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.remove(customer.getId());
        return "redirect:customers";
    }
}
