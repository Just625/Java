package com.codegym;

public class Solver {

    public static final String VÔ_NGHIỆM = "Phương trình vô nghiệm";
    public static final String CÓ_1_NGHIỆM_X = "Phương trình có 1 nghiệm, x: ";
    public static final String CÓ_2_NGHIỆM = "Phương trình có 2 nghiệm";

    public static void main(String[] args) {
        // write your code here
    }

    public static void solveQuadraticEquation(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println(VÔ_NGHIỆM);
            } else {
                float x = -c / b;
                System.out.println(CÓ_1_NGHIỆM_X + x);
            }
        }
        float delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println(VÔ_NGHIỆM);
        } else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.println(CÓ_1_NGHIỆM_X + x);
        } else {
            float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println(CÓ_2_NGHIỆM + ", x1: " + x1 + ", x2: " + x2);
        }

    }
}
