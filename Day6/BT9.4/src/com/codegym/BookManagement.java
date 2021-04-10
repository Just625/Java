package com.codegym;

import java.util.Arrays;

public class BookManagement {
    private Book[] books;
    public BookManagement(){

    }
    public BookManagement(Book[] books){
        this.books = books;
    }

    public Book[] getBooks() {
        return this.books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void displayBooks(){
        System.out.println("Danh sach cac quyen sach:");
        for(int i =0;i< books.length;i++){
            System.out.printf("Books %d: %s\n",i,books[i]);
        }
    }
    public void showTotalPrice() {
        int totalMoney = 0;
        for (int i = 0; i < this.books.length; i++) {
            totalMoney += this.books[i].getPrice();
        }
        System.out.printf("\nTong tien 10 cuon sach: %d\n", totalMoney);
    }
    public void showJavaBooks() {
        int count = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] instanceof ProgrammingBook) {
                if (((ProgrammingBook) this.books[i]).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.printf("\nSố sách ProgrammingBook có language là Java: %d\n", count);
    }
    public void sortPrice() {
        System.out.println("\nTruoc khi sap xep");
        this.displayBooks();
        for (int i = 0; i < this.books.length - 1; i++) {
            for (int j = i + 1; j < this.books.length; j++) {
                if (this.books[i].getPrice() < this.books[j].getPrice()) {
                    Book newBook = this.books[i];
                    this.books[i] = this.books[j];
                    this.books[j] = newBook;
                }
            }
        }
        System.out.println("\nSau khi sap xep");
        this.displayBooks();
    }
}
