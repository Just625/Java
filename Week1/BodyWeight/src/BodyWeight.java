import java.util.Scanner;

public class BodyWeight {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao can nang: ");
        weight = src.nextDouble();
        System.out.println("Nhap vao chieu cao: ");
        height = src.nextDouble();
        bmi = weight / Math.pow(height,2);
        if(bmi>30){
            System.out.println("Obese");
        }else if(bmi>=25){
            System.out.println("Overweight");
        }else if(bmi>=18.5){
            System.out.println("Normal");
        }else{
            System.out.println("Underweight");
        }
    }
}
