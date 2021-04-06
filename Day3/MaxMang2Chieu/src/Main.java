import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row;
        int col;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so dong:");
        row = src.nextInt();
        System.out.println("Nhap vao so cot:");
        col = src.nextInt();
        double[][] arr = new double[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap vao phan tu [%d][%d]:", i, j);
                arr[i][j] = src.nextDouble();
            }
        }
        showArray(arr);
        double maxOfArray = getMax(arr);
        System.out.printf("Phan tu lon nhat trong mang la %.2f", maxOfArray);
    }

    static void showArray(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static double getMax(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
