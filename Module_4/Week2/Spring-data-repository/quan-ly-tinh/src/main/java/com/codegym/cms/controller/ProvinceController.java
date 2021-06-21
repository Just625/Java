package com.codegym.cms.controller;

import com.codegym.cms.model.Customer;
import com.codegym.cms.model.Province;
import com.codegym.cms.service.customer.CustomerService;
import com.codegym.cms.service.province.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class ProvinceController {
    @Autowired
    private ProvinceService provinceService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/province")
    public ModelAndView showProvince() {
        ModelAndView modelAndView = new ModelAndView("province/list");
        Iterable<Province> provinces = provinceService.findAll();
        modelAndView.addObject("provinces", provinces);
        return modelAndView;
    }

    @GetMapping("/province/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("province/create");
        modelAndView.addObject("province", new Province());
        return modelAndView;
    }

    @PostMapping("/province/create")
    public ModelAndView createNewProvince(@ModelAttribute("province") Province province) {
        ModelAndView modelAndView = new ModelAndView("province/create");
        provinceService.save(province);
        modelAndView.addObject("province", province);
        modelAndView.addObject("message", "Province created");
        return modelAndView;
    }

    @GetMapping("/{id}/edit-province")
    public ModelAndView showEditForm(@PathVariable Long id) {
        ModelAndView modelAndView;
        Optional<Province> province = provinceService.findById(id);
        if (province.isPresent()) {
            modelAndView = new ModelAndView("province/edit");
            modelAndView.addObject("province", province.get());
        } else {
            modelAndView = new ModelAndView("province/error-404");
        }
        return modelAndView;
    }

    @PostMapping("/edit-province")
    public ModelAndView editProvince(@ModelAttribute("province") Province province) {
        ModelAndView modelAndView = new ModelAndView("province/edit");
        provinceService.save(province);
        modelAndView.addObject("province", province);
        modelAndView.addObject("message", "province udpated");
        return modelAndView;
    }

    @GetMapping("/{id}/delete-province")
    public ModelAndView showDeleteForm(@PathVariable Long id) {
        ModelAndView modelAndView;
        Optional<Province> province = provinceService.findById(id);
        if (province.isPresent()) {
            modelAndView = new ModelAndView("province/delete");
            modelAndView.addObject("province", province.get());
        } else {
            modelAndView = new ModelAndView("province/error-404");
        }
        return modelAndView;
    }

    @PostMapping("/delete-province")
    public ModelAndView deleteProvince(@ModelAttribute("province") Province province) {
        ModelAndView modelAndView = new ModelAndView("redirect:province");
        provinceService.remove(province.getId());
        return modelAndView;
    }

    @GetMapping("/view-province/{id}")
    public ModelAndView viewProvince(@PathVariable("id") Long id) {
        Optional<Province> provinceOptional = provinceService.findById(id);
        if (!provinceOptional.isPresent()) {
            return new ModelAndView("province/error-404");
        }

        Iterable<Customer> customers = customerService.findAllByProvince(provinceOptional.get());
        ModelAndView modelAndView = new ModelAndView("province/view");
        modelAndView.addObject("customers", customers);
        modelAndView.addObject("province", provinceOptional.get());
        return modelAndView;
    }

}
