package com.codegym;

public class FizzBuzz {
    public String check(int number){
        String result = "";
        if(number%3==0){
            result+="Fizz";
        }
        if(number%5==0){
            result+="Buzz";
        }
        return result;
    }
}
