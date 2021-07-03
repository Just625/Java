package com.codegym.controller;

import com.codegym.exception.BadWordException;
import com.codegym.exception.NotFoundException;
import com.codegym.model.Comment;
import com.codegym.service.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Calendar;
import java.util.Optional;
import java.util.TimeZone;

@Controller
public class PictureController {
    @Autowired
    private ICommentService commentService;

    @ModelAttribute("userVotes")
    public int[] setupUserVote() {
        return new int[]{1, 2, 3, 4, 5};
    }

    @GetMapping("/picture")
    public ModelAndView showPicture(@PageableDefault(size = 3) Pageable pageable) {
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("comment", new Comment());
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int dates = calendar.get(Calendar.DATE);
        Page<Comment> commentList = commentService.findByDates(dates, pageable);
        modelAndView.addObject("comments",commentList);
        return modelAndView;
    }

    @PostMapping("/comment")
    public ModelAndView saveComment(@ModelAttribute("comment") Comment comment, Pageable pageable) throws BadWordException {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int dates = calendar.get(Calendar.DATE);
        if(commentService.isBadWord(comment.getFeedBack())){
            throw new BadWordException();
        }else{
            commentService.save(comment);
            ModelAndView modelAndView = new ModelAndView("/index");
            modelAndView.addObject("comment", new Comment());
            Page<Comment> commentList = commentService.findByDates(dates, pageable);
            modelAndView.addObject("comments",commentList);
            return modelAndView;
        }
    }

    @GetMapping("/{id}")
    public ModelAndView increaseLike(@PathVariable Long id,Pageable pageable) throws NotFoundException {
        ModelAndView modelAndView = new ModelAndView("/index");
        Optional<Comment> commentOptional = commentService.findOne(id);
        if (commentOptional.isPresent()) {
            Comment comment = commentOptional.get();
            comment.setLikes(comment.getLikes() + 1);
            commentService.save(comment);
            Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
            int dates = calendar.get(Calendar.DATE);
            Page<Comment> commentList = commentService.findByDates(dates, pageable);
            modelAndView.addObject("comments",commentList);
            modelAndView.addObject("comment", new Comment());
            return modelAndView;
        } else {
            throw new NotFoundException();
        }
    }
}
