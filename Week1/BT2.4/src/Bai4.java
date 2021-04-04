import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        float firstNumb, secondNumb, thirdNumb;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao 3 so >0");
        System.out.println("Nhap vao so thu nhat: ");
        firstNumb = src.nextFloat();
        System.out.println("Nhap vao so thu hai: ");
        secondNumb = src.nextFloat();
        System.out.println("Nhap vao so thu ba: ");
        thirdNumb = src.nextFloat();
        float sumSquareFirstSecond = (float) (Math.pow(firstNumb,2)+Math.pow(secondNumb,2));
        float sumSquareSecondThird = (float) (Math.pow(thirdNumb,2)+Math.pow(secondNumb,2));
        float sumSquareFirstThird = (float) (Math.pow(firstNumb,2)+Math.pow(thirdNumb,2));
        if(sumSquareFirstSecond==(float)Math.pow(thirdNumb,2)
            ||sumSquareSecondThird==(float)Math.pow(firstNumb,2)
            ||sumSquareFirstThird==(float)Math.pow(secondNumb,2)){
            System.out.printf("%.2f, %.2f, %.2f la 3 canh cua 1 tam giac vuong", firstNumb, secondNumb, thirdNumb);
        }else{
            System.out.printf("%.2f, %.2f, %.2f khong phai la 3 canh cua 1 tam giac vuong", firstNumb, secondNumb, thirdNumb);
        }
    }
}
