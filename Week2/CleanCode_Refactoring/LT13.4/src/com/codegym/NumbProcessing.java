package com.codegym;

public class NumbProcessing {
    private int numb;
    private String message = "";
    static final String FIZZ_MESSAGE = "Fizz";
    static final String BUZZ_MESSAGE = "Buzz";

    public NumbProcessing() {

    }

    public NumbProcessing(int numb) {
        this.numb = numb;
    }

    public void checkNumber() {
        boolean isDivisibleBy3 = isDivisibleByNumb(3);
        boolean isDivisibleBy5 = isDivisibleByNumb(5);
        if (isDivisibleBy3) {
            this.message += FIZZ_MESSAGE;
        }
        if (isDivisibleBy5) {
            this.message += BUZZ_MESSAGE;
        }
        System.out.println(this.message);
    }

    private boolean isDivisibleByNumb(int i) {
        return this.numb % i == 0;
    }
}
