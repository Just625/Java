import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        int numb;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so can kiem tra: ");
        numb = src.nextInt();
        boolean condition = true;
        if(numb<2){
            condition = false;
        }
        int count = 0;
        for(int i = 1; i<=numb;i++){
            if(numb%i==0){
                count++;
            }
        }
        if(count!=2){
            condition = false;
        }
        if(condition){
            System.out.printf("%d la so nguyen to", numb);
        }else{
            System.out.printf("%d khong phai la so nguyen to", numb);
        }
    }
}
