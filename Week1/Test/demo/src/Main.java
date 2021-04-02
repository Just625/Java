import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 5;
        float z = 6.0f;
        String a = "C0221H1";
        System.out.println(a);
        System.out.format("x=%5d\nz=%.2f", x, z);
        System.out.printf("x=%5d\nz=%.2f", x, z);
        System.out.println("Nhap gia tri thu nhat:");
        int number = sc.nextInt();
        if(number>0){
            System.out.println("So duong");
        }else{
            System.out.println("So am");
        }
        System.out.print(a);
    }
}
