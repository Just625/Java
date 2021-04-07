import java.util.Scanner;

public class TestRec {
    public static void main(String[] args) {
        Rectangular rectangular1 = new Rectangular(10,5);
        rectangular1.display();
        Scanner src = new Scanner(System.in);
        System.out.println("enter width:");
        double width = src.nextDouble();
        System.out.println("enter height:");
        double height = src.nextDouble();
        Rectangular rectangular2 = new Rectangular(width, height);
        rectangular2.display();
        System.out.println(rectangular2.getArea());
        System.out.println(rectangular2.getPerimeter());
    }
}
