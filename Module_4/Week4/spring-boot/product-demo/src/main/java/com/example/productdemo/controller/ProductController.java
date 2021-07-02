package com.example.productdemo.controller;

import com.example.productdemo.model.Product;
import com.example.productdemo.service.IProductService;
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
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        return new ModelAndView("/product/create","product", new Product());
    }

    @PostMapping("/create")
    public ModelAndView saveProduct(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("/product/create");
        productService.save(product);
        modelAndView.addObject("message","Product added");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/products")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("/product/list");
        List<Product> products = (List<Product>) productService.findAll();
        modelAndView.addObject("products",products);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showeditForm(@PathVariable("id") Long id){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return new ModelAndView("error-404");
        }else{
            ModelAndView modelAndView = new ModelAndView("/product/edit");
            modelAndView.addObject("product", productOptional.get());
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView editProduct(@ModelAttribute("product") Product product){
        ModelAndView modelAndView = new ModelAndView("product/edit");
        productService.save(product);
        modelAndView.addObject("product", product);
        modelAndView.addObject("message", "Product updated");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") Long id){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return new ModelAndView("/error-404");
        }else{
            return new ModelAndView("/product/delete","product",productOptional.get());
        }
    }
    @PostMapping("/delete")
    public String deleteProduct(@ModelAttribute("product") Product product){
        productService.delete(product.getId());
        return "redirect:/products";
    }
}
