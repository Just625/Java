import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arraySize;
        Scanner src = new Scanner(System.in);
        do {
            System.out.println("enter the size of array:");
            arraySize = src.nextInt();
        }while(arraySize<1 || arraySize>20);
        int[] array = new int[arraySize];
        for(int i = 0; i <arraySize;i++){
            System.out.printf("Nhap vao phan tu thu %d:\n", i);
            int element = src.nextInt();
            array[i] = element;
        }
        System.out.println("Mang sau khi nhap: ");
        for(int i = 0;i<arraySize;i++){
            System.out.print(array[i]+" ");
        }
        for(int j = 0; j<arraySize/2;j++){
            int middle = array[j];
            array[j] = array[arraySize-1-j];
            array[arraySize-1-j] = middle;
        }
        System.out.println("Mang sau khi hoan doi:");
        for(int i = 0; i<arraySize;i++){
            System.out.println(array[i] +" ");
        }
    }
}
