package com.codegym;

import java.util.Scanner;

public class Book extends Paper {
    public static final String INPUT_AUTHOR_S_NAME = "Enter author's name";
    public static final String INPUT_BOOK_S_PAGES = "Enter book's pages:";
    private String authorName;
    private int numberOfPages;

    public Book() {
    }

    @Override
    public String toString() {
        return super.toString() + "Book{" +
                "authorName='" + authorName + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                '}';
    }

    public Book(String code, String publisher, int numberOfCopy, String authorName, int numberOfPages) {
        super(code, publisher, numberOfCopy);
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    public Book(String authorName, int numberOfPages) {
        this.authorName = authorName;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void bookInfo() {
        super.paperInfo();
        Scanner src = new Scanner(System.in);
        System.out.println(INPUT_AUTHOR_S_NAME);
        this.authorName = src.nextLine();
        System.out.println(INPUT_BOOK_S_PAGES);
        this.numberOfPages = src.nextInt();
    }
}
