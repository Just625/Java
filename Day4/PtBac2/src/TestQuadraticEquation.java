import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner src = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        a = src.nextDouble();
        b = src.nextDouble();
        c = src.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        quadraticEquation.showResult();

    }
}
