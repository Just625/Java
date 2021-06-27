package com.codegym.cms.controller;

import com.codegym.cms.model.Category;

import com.codegym.cms.service.category.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("/category/menu");
        List<Category> categories = (List<Category>) categoryService.findAll();
        modelAndView.addObject("categories",categories);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", new Category());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createCategory(@ModelAttribute("category") Category category){
        categoryService.save(category);
        ModelAndView modelAndView = new ModelAndView("/category/create");
        modelAndView.addObject("category", category);
        modelAndView.addObject("message","Category created");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Long id){
        Optional<Category> category = categoryService.findById(id);
        if(!category.isPresent()){
            return new ModelAndView("/error-404");
        }else{
            return new ModelAndView("/category/edit","category", category.get());
        }
    }

    @PostMapping("/edit")
    public ModelAndView editCategory(@ModelAttribute("category") Category category){
        ModelAndView  modelAndView = new ModelAndView("/category/edit");
        categoryService.save(category);
        modelAndView.addObject("category",category);
        modelAndView.addObject("message","Category updated");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable("id") Long id){
        Optional<Category> category = categoryService.findById(id);
        if(!category.isPresent()){
            return new ModelAndView("/error-404");
        }else{
            return new ModelAndView("/category/delete","category", category.get());
        }
    }

    @PostMapping("/delete")
    public String deleteCategory(@ModelAttribute("category") Category category){
        Category category11  = category;
        categoryService.remove(category.getId());
        return "redirect:/categories";
    }
}
