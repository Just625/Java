package com.codegym;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String check(int number){
        String result = "";
        boolean isDivisibleBy3 = number % 3 == 0;
        if(isDivisibleBy3){
            result+= FIZZ;
        }
        boolean isDivisibleBy5 = number % 5 == 0;
        if(isDivisibleBy5){
            result+= BUZZ;
        }
        if(result.equals("")){
            return number+"";
        }else{
            return result;
        }
    }
}
