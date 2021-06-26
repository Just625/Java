package com.codegym.service;

import com.codegym.model.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    Comment save(Comment comment);
    Comment findOne(Long id);
    List<Comment> findInDay();
}
