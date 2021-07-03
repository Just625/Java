package com.codegym.service;

import com.codegym.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICommentService {
    Iterable<Comment> findAll();
    void save(Comment comment);
    Optional<Comment> findOne(Long id);
    Page<Comment> findByDates(int dates, Pageable pageable);
    boolean isBadWord(String feedBack);
}
