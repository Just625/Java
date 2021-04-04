import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int numb;
        String result="";
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen: ");
        numb = src.nextInt();
        boolean isDivisibleBy3 = numb%3==0;
        boolean isDivisibleBy5 = numb%5==0;
        if(isDivisibleBy3){
            result+="Fizz";
        }
        if(isDivisibleBy5){
            result+="Buzz";
        }
        System.out.println(result);
    }
}
