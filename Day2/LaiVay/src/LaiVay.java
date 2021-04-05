import java.util.Scanner;

public class LaiVay {
    public static void main(String[] args) {
        int money;
        double rate;
        int month;
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so tien:");
            money = src.nextInt();
        }while (money<0);
        do{
            System.out.println("Nhap vao lai suat vay:");
            rate = src.nextDouble();
        }while (rate<0||rate>100);
        do{
            System.out.println("Nhap vao so thang:");
            month = src.nextInt();
        }while (month<0||month>12);
        int interest = (int) (((money * (rate / 100)) / 12) * month);
        System.out.printf("So tien lai la: %d", interest);
    }
}
