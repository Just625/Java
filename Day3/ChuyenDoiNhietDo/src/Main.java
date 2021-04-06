import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double input;
        double finalResult = 0;
        int userChoice;
        Scanner src = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        do {
            System.out.println("Nhap vao lua chon (0-2):");
            userChoice = src.nextInt();
            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Lua chon khong hop le");
            }
        } while (userChoice < 0 || userChoice > 2);
        switch (userChoice) {
            case 2: {
                System.out.println("Nhap vao nhiet do tuong ung:");
                input = src.nextDouble();
                finalResult = celsiusToFahrenheit(input);
                break;
            }
            case 1: {
                System.out.println("Nhap vao nhiet do tuong ung:");
                input = src.nextDouble();
                finalResult = fahrenheitToCelsius(input);
                break;
            }
            case 0: {
                System.exit(0);
            }
        }
        System.out.printf("Ket qua la %.2f", finalResult);
    }

    static double celsiusToFahrenheit(double celsius) {
        double result = celsius * (9 / 5.0) + 32;
        return result;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        double result = (fahrenheit - 32) * (5.0 / 9);
        return result;
    }
}
