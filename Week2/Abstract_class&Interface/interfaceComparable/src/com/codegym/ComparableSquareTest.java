package com.codegym;

import java.util.Arrays;

public class ComparableSquareTest {
    public static void main(String[] args) {
        ComparableSquare[] squares = new ComparableSquare[3];
        squares[0] = new ComparableSquare(1.5);
        squares[1] = new ComparableSquare();
        squares[2] = new ComparableSquare(2,"green", false);
        System.out.println("Truoc khi sort:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }
        Arrays.sort(squares);
        System.out.println("Sau khi sort:");
        for(ComparableSquare square:squares){
            System.out.println(square);
        }
    }
}
