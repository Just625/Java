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
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Nhap vao phan tu [%d][%d]:", i, j);
                arr[i][j] = src.nextInt();
            }
        }
        showArray(arr);
        int minOfArray = getMin(arr);
        System.out.printf("Phan tu nho nhat trong mang la %d", minOfArray);
    }

    static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int getMin(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
