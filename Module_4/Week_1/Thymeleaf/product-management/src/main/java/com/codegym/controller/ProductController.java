package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.IProductService;
import com.codegym.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {
    private final IProductService productService = new ProductService();

    @GetMapping("/products")
    public ModelAndView showList() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Product> products = productService.findAll();
        modelAndView.addObject("products", products);
        return modelAndView;
    }
    @GetMapping("/products/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("product", new Product());
        return modelAndView;
    }
    @PostMapping("/products/create")
    public ModelAndView createProduct(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("/create");
        productService.save(product);
        modelAndView.addObject("message", "Product added");
        return modelAndView;
    }
    @GetMapping("/products/{id}/edit")
    public ModelAndView showEditForm(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView("/edit");
        Product product = productService.findById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }
    @PostMapping("/products/edit")
    public ModelAndView editProduct(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("/edit");
        productService.edit(product.getId(), product);
        modelAndView.addObject("message", "Product updated");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
    @GetMapping("/products/{id}/delete")
    public String deleteProduct(@PathVariable("id") int id){
        Product product = productService.findById(id);
        productService.delete(product);
        return "redirect:/products";
    }
    @GetMapping("/products/{id}/view")
    public ModelAndView showViewForm(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView("/view");
        Product product = productService.findById(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }
    @GetMapping("/products/search")
    public ModelAndView showSearchList(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Product> products = productService.findByName(name);
        modelAndView.addObject("products", products);
        return modelAndView;
    }
}
