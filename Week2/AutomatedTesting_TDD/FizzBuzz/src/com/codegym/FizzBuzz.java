package com.codegym;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String MUOI = "Muoi";
    public static final String HAI = "Hai";
    public static final String BA = "Ba";
    public static final String BON = "Bon";
    public static final String NAM = "Nam";
    public static final String SAU = "Sau";
    public static final String BAY = "Bay";
    public static final String TAM = "Tam";
    public static final String CHIN = "Chin";
    public static final String LAM = "Lam";
    public static final String MOT = "Mot";
    public static final String KHONG = "Khong";

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
                    result = MUOI;
                    break;
                case 2:
                    result = HAI;
                    break;
                case 3:
                    result = BA;
                    break;
                case 4:
                    result = BON;
                    break;
                case 5:
                    result = NAM;
                    break;
                case 6:
                    result = SAU;
                    break;
                case 7:
                    result = BAY;
                    break;
                case 8:
                    result = TAM;
                    break;
                case 9:
                    result = CHIN;
                    break;

            }
            if(number/10!=0){
                result+=" ";
            }
            switch (number % 10) {
                case 0:
                    if (number / 10 == 0) {
                        result += KHONG;
                    } else if (number / 10 == 1) {
                        result += "";
                    } else {
                        result += MUOI;
                    }
                    break;
                case 1:
                    result += MOT;
                    break;
                case 2:
                    result += HAI;
                    break;
                case 3:
                    result += BA;
                    break;
                case 4:
                    result += BON;
                    break;
                case 5:
                    if (number / 10 != 0) {
                        result += LAM;
                    } else {
                        result += NAM;
                    }
                    break;
                case 6:
                    result += SAU;
                    break;
                case 7:
                    result += BAY;
                    break;
                case 8:
                    result += TAM;
                    break;
                case 9:
                    result += CHIN;
                    break;
            }

        }
        return result;
    }
}
