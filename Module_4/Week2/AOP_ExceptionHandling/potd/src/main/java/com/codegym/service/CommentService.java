package com.codegym.service;

import com.codegym.model.Comment;
import com.codegym.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CommentService implements ICommentService {
    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public Iterable<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findOne(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Page<Comment> findByDates(int dates, Pageable pageable) {
        return commentRepository.findByDates(dates,pageable);
    }

    @Override
    public boolean isBadWord(String feedBack) {
        boolean isBadWord = false;
        List<String> badWords = new ArrayList<String>(){{
            add("Fanta");
            add("Tun");
        }};
        String[] feedBacks = feedBack.split(" ");
        for(String badWord:badWords){
            for(int i =0;i<feedBacks.length;i++){
                if(feedBacks[i].equals(badWord)){
                    isBadWord = true;
                    break;
                }
            }
        }
        return isBadWord;
    }


    @Override
    public void save(Comment comment) {
        commentRepository.save(comment);
    }
}
