package com.codegym;

public class TriangleClassifier {
    public String classifierTriangle(int firstNumb, int secondNumb, int thirdNumb) {
        String result = "khong phai la tam giac";
        if ((firstNumb + secondNumb > thirdNumb)
                && (secondNumb + thirdNumb > firstNumb)
                && (firstNumb + thirdNumb > secondNumb)) {
            result = "tam giac thuong";
            if (firstNumb == secondNumb || secondNumb == thirdNumb || thirdNumb == firstNumb) {
                result = "tam giac can";
            }
            if(firstNumb == secondNumb && secondNumb == thirdNumb){
                result = "tam giac deu";
            }
        }
        return result;
    }
}
