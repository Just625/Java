package com.codegym.controller;

import com.codegym.model.Comment;
import com.codegym.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PictureController {
    @Autowired
    private ICommentService commentService;

    @ModelAttribute("userVotes")
    public int[] setupUserVote() {
        return new int[]{1, 2, 3, 4, 5};
    }

    @GetMapping("/picture")
    public ModelAndView showPicture() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Comment> commentList = commentService.findInDay();
        modelAndView.addObject("comment", new Comment());
        modelAndView.addObject("comments",commentList);
        return modelAndView;
    }
    @PostMapping("/comment")
    public ModelAndView saveComment(@ModelAttribute("comment") Comment comment){
        ModelAndView modelAndView = null;
        if(commentService.save(comment)==null){
            modelAndView= new ModelAndView("/error-404");
        }else{
            modelAndView = new ModelAndView("/index");
            List<Comment> commentList = commentService.findAll();
            modelAndView.addObject("comments",commentList);
        }
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView increaseLike(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/index");
            Comment comment = commentService.findOne(id);
            comment.setLikes(comment.getLikes()+1);
            commentService.save(comment);
            List<Comment> commentList = commentService.findInDay();
            modelAndView.addObject("comments",commentList);
            modelAndView.addObject("comment",new Comment());
        return modelAndView;
    }
}
