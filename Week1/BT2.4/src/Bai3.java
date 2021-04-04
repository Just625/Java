import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        float firstNumb, secondNumb, thirdNumb;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao 3 so lon hon 0");
        System.out.println("Nhap vao so thu nhat: ");
        firstNumb = src.nextFloat();
        System.out.println("Nhap vao so thu hai: ");
        secondNumb = src.nextFloat();
        System.out.println("Nhap vao so thu ba: ");
        thirdNumb = src.nextFloat();
        //Tong do dai 2 canh bat ky > canh con lai
        float sumFirstSecond = firstNumb + secondNumb;
        float sumSecondThird = secondNumb + thirdNumb;
        float sumFirstThird = firstNumb + thirdNumb;
        if(sumFirstSecond>thirdNumb
                &&sumSecondThird>firstNumb
                &&sumFirstThird>secondNumb){
            System.out.printf("%.2f, %.2f, %.2f la 3 canh cua 1 tam giac", firstNumb, secondNumb, thirdNumb);
        }else{
            System.out.printf("%.2f, %.2f, %.2f khong phai la 3 canh cua 1 tam giac", firstNumb, secondNumb, thirdNumb);
        }
    }
}
