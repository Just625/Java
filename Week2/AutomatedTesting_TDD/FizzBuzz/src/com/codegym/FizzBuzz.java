package com.codegym;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String check(int number) {
        String result = "";
        boolean isDivisibleBy3 = number % 3 == 0;
        if (isDivisibleBy3) {
            result += FIZZ;
        }
        boolean isDivisibleBy5 = number % 5 == 0;
        if (isDivisibleBy5) {
            result += BUZZ;
        }
        if (result.equals("")) {
            switch (number / 10) {
                case 1:
                    result = "Muoi";
                    break;
                case 2:
                    result = "Hai";
                    break;
                case 3:
                    result = "Ba";
                    break;
                case 4:
                    result = "Bon";
                    break;
                case 5:
                    result = "Nam";
                    break;
                case 6:
                    result = "Sau";
                    break;
                case 7:
                    result = "Bay";
                    break;
                case 8:
                    result = "Tam";
                    break;
                case 9:
                    result = "Chin";
                    break;

            }
            if(number/10!=0){
                result+=" ";
            }
            switch (number % 10) {
                case 0:
                    if (number / 10 == 0) {
                        result += "Khong";
                    } else if (number / 10 == 1) {
                        result += "";
                    } else {
                        result += "Muoi";
                    }
                    break;
                case 1:
                    result += "Mot";
                    break;
                case 2:
                    result += "Hai";
                    break;
                case 3:
                    result += "Ba";
                    break;
                case 4:
                    result += "Bon";
                    break;
                case 5:
                    if (number / 10 != 0) {
                        result += "Lam";
                    } else {
                        result += "Nam";
                    }
                    break;
                case 6:
                    result += "Sau";
                    break;
                case 7:
                    result += "Bay";
                    break;
                case 8:
                    result += "Tam";
                    break;
                case 9:
                    result += "Chin";
                    break;
            }

        }
        return result;
    }
}
