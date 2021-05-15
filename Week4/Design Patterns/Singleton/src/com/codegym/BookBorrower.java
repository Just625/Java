package com.codegym;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook;

    public BookBorrower() {
    }

    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if(borrowedBook == null){
            haveBook = false;
        }else{
            haveBook = true;
        }
    }
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }else{
            return "I can't borrow that book yet";
        }
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
