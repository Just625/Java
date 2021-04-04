import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int numb;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao 1 so: ");
        numb = src.nextInt();
        if(numb<0){
            System.out.printf("%d la so nguyen am", numb);
        }else{
            System.out.printf("%d la so nguyen duong", numb);
        }
    }
}
