package com.codegym.cms.controller;

import com.codegym.cms.model.Blog;
import com.codegym.cms.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView saveBlog(@ModelAttribute("blog") Blog blog){
        ModelAndView modelAndView = new ModelAndView("/create");
        blogService.save(blog);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message","Blog created");
        return modelAndView;
    }

    @GetMapping("/blogs")
    public ModelAndView showBlogs(){
        ModelAndView modelAndView = new ModelAndView("/menu");
        List<Blog> blogs = blogService.findAll();
        modelAndView.addObject("blogs", blogs);
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView showDetail(@PathVariable("id") Long id){
        ModelAndView  modelAndView = new ModelAndView("/view");
        Blog blog = blogService.findById(id);
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }
    @GetMapping("/edit/{id}")
    public ModelAndView showEditForm(@PathVariable("id") Long id){
        ModelAndView modelAndView;
        Blog blog = blogService.findById(id);
        if(blog==null){
            modelAndView = new ModelAndView("/error-404");
        }else{
            modelAndView= new ModelAndView("/edit");
            modelAndView.addObject("blog", blog);
        }
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editBlog(@ModelAttribute Blog blog){
        ModelAndView modelAndView = new ModelAndView("/edit");
        blogService.save(blog);
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("message", "Blog edited successfully");
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteForm(@PathVariable("id") Long id){
        ModelAndView modelAndView;
        Blog blog = blogService.findById(id);
        if(blog==null){
            modelAndView = new ModelAndView("/error-404");
        }else{
            modelAndView = new ModelAndView("/delete","blog", blog);
        }
        return modelAndView;
    }
    @PostMapping("/delete")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/blogs";
    }
}
