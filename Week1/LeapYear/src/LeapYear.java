import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int inputYear;
        boolean isLeapYear = false;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao nam can kiem tra: ");
        inputYear = src.nextInt();
        boolean isDivisibleBy4 = inputYear%4==0;
        if(isDivisibleBy4){
            boolean isNotDivisibleBy100 = inputYear%100!=0;
            if(isNotDivisibleBy100){
                isLeapYear = true;
            }else{
                boolean isDivisibleBy400 = inputYear%400==0;
                if(isDivisibleBy400){
                    isLeapYear = true;
                }
            }
        }
        if(isLeapYear){
            System.out.printf("%d la nam nhuan", inputYear);
        }else{
            System.out.printf("%d khong phai la nam nhuan", inputYear);
        }
    }
}
