package com.codegym;

public class AbsoluteNumberCalculator {
    public AbsoluteNumberCalculator(){};
    public static int findAbsolute(int numb){
//        throw new UnsupportedOperationException();
        if(numb<0){
            return -numb;
        }else{
            return numb;
        }
    }
}
