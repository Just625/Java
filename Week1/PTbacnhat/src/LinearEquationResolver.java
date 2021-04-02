import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        float firstNumb;
        float secondNumb;
        float nghiemPT;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao he so a: ");
        firstNumb = src.nextFloat();
        System.out.println("Nhap vao he so b: ");
        secondNumb = src.nextFloat();
        if(firstNumb == 0){
            if(secondNumb == 0){
                System.out.println("Phuong trinh co vo so nghiem");
            }else{
                System.out.println("Phuong trinh vo nghiem");
            }
        }else{
            nghiemPT = -secondNumb/firstNumb;
            System.out.printf("Nghiem pt la: %.2f", nghiemPT);
        }
    }
}
