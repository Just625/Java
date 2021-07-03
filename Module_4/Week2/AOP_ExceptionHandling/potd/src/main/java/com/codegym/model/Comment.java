package com.codegym.model;

import javax.persistence.*;
import java.util.Calendar;
import java.util.TimeZone;

@Entity
public class Comment implements Cloneable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int rate;
    private String author;
    private String feedBack;
    private int dates;
    @Column(columnDefinition = "integer default 0")
    private int likes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedBack() {
        return feedBack;
    }

    public void setFeedBack(String feedBack) {
        this.feedBack = feedBack;
    }

    public int getDates() {
        return dates;
    }

    public void setDates(int dates) {
        this.dates = dates;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int like) {
        this.likes = like;
    }

    public Comment(int rate, String author, String feedBack, int likes) {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        this.dates = calendar.get(Calendar.DATE);
        this.rate = rate;
        this.author = author;
        this.feedBack = feedBack;
        this.likes = likes;
    }

    public Comment() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        this.dates = calendar.get(Calendar.DATE);
    }
}
