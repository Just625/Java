import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 12, 15};
        int index;
        Scanner src = new Scanner(System.in);
        System.out.println("So muon them vao mang:");
        int inputNumb = src.nextInt();
        do {
            System.out.println("Vi tri muon them vao mang");
            index = src.nextInt();
            if (index <= 1 || index > arr.length - 1) {
                System.out.println("Vi tri khong hop le");
            }
        } while (index <= 1 || index > arr.length - 1);
        System.out.println("Mang truoc khi them");
        showArray(arr);
        int[] newArr = addElement(arr, inputNumb, index);
        System.out.println("\nMang sau khi them");
        showArray(newArr);

    }

    static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] addElement(int[] arr, int inputNumb, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = inputNumb;
        for (int j = index + 1; j < arr.length + 1; j++) {
            newArr[j] = arr[j - 1];
        }
        return newArr;
    }
}

