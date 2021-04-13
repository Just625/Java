package com.codegym;

public class ProcessNumb {
    private int numb;
    private String message = "";

    public ProcessNumb() {

    }

    public ProcessNumb(int numb) {
        this.numb = numb;
    }

    public void checkNumber() {
        boolean isDivisibleBy3 = this.numb % 3 == 0;
        boolean isDivisibleBy5 = this.numb % 5 == 0;
        if (isDivisibleBy3) {
            this.message += "Fizz";
        }
        if (isDivisibleBy5) {
            this.message += "Buzz";
        }
        System.out.println(this.message);
    }
}
