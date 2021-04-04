import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int moneyInUsd, rate = 23000, moneyInVnd;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao gia tri tien USD: ");
        moneyInUsd = src.nextInt();
        if(moneyInUsd>0){
            moneyInVnd = moneyInUsd * rate;
            System.out.printf("%d VND", moneyInVnd);
        }else{
            System.out.println("Vui long nhap lai so tien hop le");
        }
    }
}
