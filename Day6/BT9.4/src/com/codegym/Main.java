package com.codegym;

public class Main {

    public static void main(String[] args) {
        //5 programming books
        Book programmingBook0 = new ProgrammingBook("000", "first", 1, "1", "JavaScript", "1");
        Book programmingBook1 = new ProgrammingBook("444", "second", 3, "1", "Java", "1");
        Book programmingBook2 = new ProgrammingBook("111", "third", 4, "1", "PHP", "1");
        Book programmingBook3 = new ProgrammingBook("333", "fourth", 5, "1", "Python", "1");
        Book programmingBook4 = new ProgrammingBook("222", "fifth", 6, "1", "Java", "1");
        //5 fiction books
        Book fictionBook0 = new FictionBook("777", "Dota", 6, "1", "1");
        Book fictionBook1 = new FictionBook("999", "Dota2", 5, "1", "1");
        Book fictionBook2 = new FictionBook("666", "LOL", 4, "1", "1");
        Book fictionBook3 = new FictionBook("555", "3Q", 3, "1", "1");
        Book fictionBook4 = new FictionBook("888", "HOS", 1, "1", "1");

        Book[] books = new Book[]{programmingBook0, programmingBook1, programmingBook2, programmingBook3, programmingBook4, fictionBook0, fictionBook1, fictionBook2, fictionBook3, fictionBook4};

        BookManagement bookManagement = new BookManagement(books);
        //In ra cac books
        bookManagement.displayBooks();

        //In ra tong tien
        bookManagement.showTotalPrice();

        //In ra cac quyen sach co ngon ngu la Java
        bookManagement.showJavaBooks();

        //Sap xep theo thu tu gia
        bookManagement.sortPrice();
    }
}
