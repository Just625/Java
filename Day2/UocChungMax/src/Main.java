import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, UCLN = 1;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so dau tien:");
        a = src.nextInt();
        System.out.println("Nhap vao so thu hai:");
        b = src.nextInt();
        if(a==0 && b==0){
            System.out.printf("%d va %d khong co uoc chung lon nhat", a,b);
        }else if(a==0){
            System.out.printf("%d va %d uoc chung lon nhat la %d", a,b,Math.abs(b));
        }else if(b==0){
            System.out.printf("%d va %d uoc chung lon nhat la %d", a,b,Math.abs(a));
        }else{
            for(int i =1;i<=a;i++){
                if(a%i==0 && b%i==0){
                    UCLN = i;
                }
            }
            System.out.printf("Uoc chung lon nhat cua %d va %d la %d", a,b, UCLN);
        }
        
    }
}
