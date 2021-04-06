import java.util.Scanner;

public class Main {
    static void showElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static String getMaxElement(int[] arr){
        int maxElement = arr[0];
        int index = 0;
        for(int i = 0; i<arr.length;i++){
            if(maxElement<arr[i]){
                maxElement = arr[i];
                index = i;
            }
        }
        return  "Max la " + maxElement + " nam o vi tri thu " + index;
    }
    public static void main(String[] args) {
        int arrSize;
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Nhap vao so luong ty phu (<=20): ");
            arrSize = src.nextInt();
        }while (arrSize<0 || arrSize >20);
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Nhap vao gia tri tai san: ");
            arr[i] = src.nextInt();
        }
        showElement(arr);
        System.out.printf(getMaxElement(arr));
    }
}
