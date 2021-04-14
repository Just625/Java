package com.codegym;

public class TriangleClassifier {

    public static final String TAM_GIAC_THUONG = "tam giac thuong";
    public static final String TAM_GIAC_CAN = "tam giac can";
    public static final String TAM_GIAC_DEU = "tam giac deu";

    public String classifierTriangle(int firstNumb, int secondNumb, int thirdNumb) {
        String result = "khong phai la tam giac";
        boolean isTriangle = (firstNumb + secondNumb > thirdNumb)
                && (secondNumb + thirdNumb > firstNumb)
                && (firstNumb + thirdNumb > secondNumb);
        if (isTriangle) {
            result = TAM_GIAC_THUONG;
            boolean isTamGiacCan = firstNumb == secondNumb || secondNumb == thirdNumb || thirdNumb == firstNumb;
            if (isTamGiacCan) {
                result = TAM_GIAC_CAN;
            }
            boolean isTamGiacDeu = firstNumb == secondNumb && secondNumb == thirdNumb;
            if(isTamGiacDeu){
                result = TAM_GIAC_DEU;
            }
        }
        return result;
    }
}
