package com.codegym;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();
        bookBorrower1.borrowBook();
        System.out.println("Book borrower 1 asked to borrow the book");
        System.out.println("The name of author and title of the book is");
        System.out.println(bookBorrower1.getAuthorAndTitle());
        bookBorrower2.borrowBook();
        System.out.println("Book borrower 2 asked to borrow the book");
        System.out.println("The name of author and title of the book is");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("Book borrower 1 return the book");
        bookBorrower2.borrowBook();
        System.out.println("Book borrower 2 asked to borrow the book");
        System.out.println("The name of author and title of the book is");
        System.out.println(bookBorrower2.getAuthorAndTitle());
    }
}
