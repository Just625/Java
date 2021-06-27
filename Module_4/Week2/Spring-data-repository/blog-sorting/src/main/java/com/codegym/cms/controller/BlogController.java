package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import com.codegym.cms.service.blog.IBlogService;
import com.codegym.cms.service.category.ICategoryService;
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
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @ModelAttribute("categories")
    public List<Category> setUpCategory() {
        return (List<Category>) categoryService.findAll();
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm() {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/blog/create");
        blogService.save(blog);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog created");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public ModelAndView showBlogs() {
        ModelAndView modelAndView = new ModelAndView("/blog/menu");
        List<Blog> blogs = (List<Blog>) blogService.findAll();
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView showDetail(@PathVariable("id") Long id) {
        Optional<Blog> blog = blogService.findById(id);
        Blog blog1 = blog.get();
        blog1.getCategory().getId();
        if (!blog.isPresent()) {
            return new ModelAndView("/error-404");
        } else {
            return new ModelAndView("/blog/view", "blog", blog.get());
        }

    }

    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (!blog.isPresent()) {
            return new ModelAndView("/error-404");
        } else {
            return new ModelAndView("/blog/edit","blog", blog.get());
        }
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute Blog blog) {
        ModelAndView modelAndView = new ModelAndView("/blog/edit");
        blogService.save(blog);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog edited successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable("id") Long id) {
        Optional<Blog> blog = blogService.findById(id);
        if (!blog.isPresent()) {
            return new ModelAndView("/error-404");
        } else {
            return new ModelAndView("/blog/delete", "blog", blog.get());
        }
    }

    @PostMapping("/delete")
    public String deleteBlog(@ModelAttribute("blog") Blog blog) {
        blogService.remove(blog.getId());
        return "redirect:/blogs";
    }
}
