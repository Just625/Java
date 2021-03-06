package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name="blogs")
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String content;
    private String description;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Blog(String content, String description, String author) {
        this.content = content;
        this.description = description;
        this.author = author;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Blog(String content, String description) {
        this.content = content;
        this.description = description;
    }

    public Blog() {
    }
}
