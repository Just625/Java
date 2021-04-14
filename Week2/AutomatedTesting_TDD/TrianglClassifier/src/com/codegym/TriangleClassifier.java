package com.codegym;

public class TriangleClassifier {
    public String classifierTriangle(int firstNumb, int secondNumb, int thirdNumb) {
        String result ="khong phai la tam giac";
        if ((firstNumb + secondNumb > thirdNumb)
                && (secondNumb + thirdNumb > firstNumb)
                && (firstNumb + thirdNumb > secondNumb)) {
            result = "tam giac thuong";
        }
        return result;
    }
}
