import java.util.Scanner;

public class Main {
    //De ben ngoai phuong thuc main
    static boolean kiemTraChanLe(int numb) {
        return numb % 2 == 0;
    }
    //de sau phuong thuc main cung duoc
    static int getSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i <arr.length;i++){
            for(int j  =0; j<arr[i].length;j++){
                sum+= arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        String[] array = {"ab", "bc", "cd", "de"};
//        String input;
//        int index = -1;
//        int i = 0;
//        Scanner src = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi can kiem tra:");
//        input = src.nextLine();
//        for (String element : array) {
//            if (element.equals(input)) {
//                index = i;
//                System.out.printf("Tim thay %s o vi tri thu %d", input, index);
//                break;
//            }
//            i++;
//        }
//        if (index == -1) {
//            System.out.println("Khong tim thay");
//        }
        int[][] array = {
                {1, 8, 6, 5},
                {3, 4, 1, 2}
        };
//        for (int j = 0; j < array[0].length; j++) {
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i][j] % 2 == 0) {
//                    count++;
//                }
//            }
//            System.out.printf("Cot %d co %d so chan\n", j, count);
//        }
        System.out.println(getSum(array));
    }
}

