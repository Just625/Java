package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.service.customer.ICustomerService;
import com.codegym.cms.service.province.IProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IProvinceService provinceService;
    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

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
        modelAndView.addObject("message", "New customer added");
        return modelAndView;
    }

    @GetMapping("/customers")
    public ModelAndView showCustomerList(@RequestParam("search") Optional<String> search,Pageable pageable) {
        Page<Customer> customers;
        if(search.isPresent()){
            customers = customerService.findAllByFirstNameContaining(search.get(),pageable);
        }else{
            customers = customerService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/list");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("/{id}/edit-customer")
    public ModelAndView showEditForm(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        ModelAndView modelAndView;
        if (customer.isPresent()) {
            modelAndView = new ModelAndView("customer/edit");
            modelAndView.addObject("customer", customer.get());
        } else {
            modelAndView = new ModelAndView("customer/error-404");
        }
        return modelAndView;
    }

    @PostMapping("/edit-customer")
    public ModelAndView EditCustomer(@ModelAttribute("customer") Customer customer) {
        ModelAndView modelAndView = new ModelAndView("customer/edit");
        customerService.save(customer);
        modelAndView.addObject("message", "Customer updated");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("{id}/delete-customer")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        Optional<Customer> customer = customerService.findById(id);
        ModelAndView modelAndView;
        if (customer.isPresent()) {
            modelAndView = new ModelAndView("customer/delete");
            modelAndView.addObject("customer", customer.get());
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
