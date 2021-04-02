import java.util.Scanner;

public class LoiChao {
    public static void main(String[] args) {
        String inputName;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        inputName = src.nextLine();
        System.out.printf("Hello %s", inputName);
    }
}
