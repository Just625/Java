package com.codegym.controller;

import com.codegym.model.Cart;
import com.codegym.model.Product;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @ModelAttribute("cart")
    public Cart setupCart(){
        return new Cart();
    }
    @Autowired
    private IProductService productService;

    @GetMapping("/shop")
    public ModelAndView shopShop(){
        return new ModelAndView("/shop","products",productService.findAll());
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id,@ModelAttribute Cart cart,@RequestParam("action") String action){
        Optional<Product> productOptional = productService.findById(id);
        if(!productOptional.isPresent()){
            return "/error-404";
        }
        if(action.equals("show")){
            cart.addProductToCart(productOptional.get());
            return "redirect:/shopping-cart";
        }
        cart.addProductToCart(productOptional.get());
        return "redirect:/shop";
    }

}
