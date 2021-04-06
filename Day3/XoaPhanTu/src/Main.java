import java.util.Scanner;

public class Main {
    static int[] removeElement(int[]arr, int index){
        int[] newArr = new int[arr.length-1];
        //Duyet mang tu dau mang den vi tri thu index
        for(int i = 0; i<index;i++){
            newArr[i] = arr[i];
        }
        //Duyet mang tu sau vi tri thu index den het
        for(int j = index+1;j<arr.length;j++){
            newArr[j-1] = arr[j];
        }
        return  newArr;
    }
    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 7, 8, 6};
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao phan tu can xoa:");
        int inputNumb = src.nextInt();
        int index = -1;
        for(int i = 0; i< arr.length;i++){
            if(arr[i]== inputNumb){
                index = i;
            }
        }
        if(index == -1){
            System.out.printf("%d khong thuoc mang", inputNumb);
        }else{
            int[] newArr = removeElement(arr, index);
            for(int i =0; i <newArr.length;i++){
                System.out.print(newArr[i]+" ");
            }
        }
    }
}
