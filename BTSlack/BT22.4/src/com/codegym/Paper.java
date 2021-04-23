package com.codegym;

import java.util.Scanner;

public class Paper {
    public static final String INPUT_CODE = "Enter code:";
    public static final String INPUT_PUBLISHER = "Enter publisher:";
    public static final String INPUT_NUMBER_OF_COPY = "Enter number of copy:";
    private String code;
    private String publisher;
    private int numberOfCopy;

    public Paper() {
    }

    public Paper(String code, String publisher, int numberOfCopy) {
        this.code = code;
        this.publisher = publisher;
        this.numberOfCopy = numberOfCopy;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "code='" + code + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfCopy='" + numberOfCopy + '\'' +
                '}';
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfCopy() {
        return numberOfCopy;
    }

    public void setNumberOfCopy(int numberOfCopy) {
        this.numberOfCopy = numberOfCopy;
    }

    public void paperInfo() {
        Scanner src = new Scanner(System.in);
        System.out.println(INPUT_CODE);
        this.code = src.nextLine();
        System.out.println(INPUT_PUBLISHER);
        this.publisher = src.nextLine();
        System.out.println(INPUT_NUMBER_OF_COPY);
        this.numberOfCopy = src.nextInt();
    }
}
