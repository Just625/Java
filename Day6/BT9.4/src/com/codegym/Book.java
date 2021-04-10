package com.codegym;

public class Book {
    private String bookCode;
    private String name;
    private int price;
    private String author;
    public Book(){

    }
    public Book(String bookCode, String name, int price, String author){
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public String getBookCode(){
        return this.bookCode;
    }
    public void setBookCode(String bookCode){
        this.bookCode = bookCode;
    }
    public String name(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    @Override
    public String toString() {
        return
                "bookCode='" + this.bookCode + '\'' +
                ", name='" + this.name + '\'' +
                ", price=" + this.price  + '\''+
                ", author='" + this.author + '\'';
    }
}
