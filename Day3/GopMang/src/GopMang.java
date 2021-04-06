import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap do dai cua mang 1");
        int firstArrLength = src.nextInt();
        int[] firstArr = new int[firstArrLength];
        for (int i = 0; i < firstArrLength; i++) {
            System.out.printf("Nhap vao phan tu thu %d cua mang:", i);
            firstArr[i] = src.nextInt();
        }
        System.out.println("Nhap do dai cua mang 2");
        int secondArrLength = src.nextInt();
        int[] secondArr = new int[secondArrLength];
        for (int i = 0; i < secondArrLength; i++) {
            System.out.printf("Nhap vao phan tu thu %d cua mang:", i);
            secondArr[i] = src.nextInt();
        }
        System.out.println("Mang 1:");
        showArray(firstArr);
        System.out.println("\nMang 2:");
        showArray(secondArr);
        int[] thirdArr = new int[firstArrLength + secondArrLength];
        for (int j = 0; j < firstArrLength; j++) {
            thirdArr[j] = firstArr[j];
        }
        for (int k = 0; k < secondArrLength; k++) {
            thirdArr[k + firstArrLength] = secondArr[k];
        }
        System.out.println("\nMang 3:");
        showArray(thirdArr);
    }

    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
