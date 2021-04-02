import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float chieuDai;
        float chieuRong;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao chieu dai: ");
        chieuDai = src.nextFloat();
        System.out.println("Nhap vao chieu rong: ");
        chieuRong = src.nextFloat();
        float dienTich = chieuDai * chieuRong;
        System.out.printf("Dien tich hinh cn la = %.1f", dienTich);
    }
}
