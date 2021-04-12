import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int numb, choice;
//        Scanner src = new Scanner(System.in);
//        do{
//            System.out.println("Nhap vao 1 so can kiem tra(>0): ");
//            numb = src.nextInt();
//        }while (numb<=0);
//        do{
//            System.out.println("\nMenu\n1. Kiem tra so nguyen to\n2. Kiem tra so chan le\n3. Kiem tra so chinh phuong\n4. Thoat chuong trinh");
//            choice = src.nextInt();
//            switch(choice){
//                case 1:{
//                    int count = 0;
//                    for(int i = 2;i<=Math.sqrt(numb);i++){
//                        if(numb%i==0){
//                            count++;
//                        }
//                    }
//                    if(count==0){
//                        System.out.printf("%d la so nguyen to", numb);
//                    }else{
//                        System.out.printf("%d khong phai la so nguyen to", numb);
//                    }
//                    break;
//                }
//                case 2:{
//                    if(numb%2==0){
//                        System.out.printf("%d la so chan", numb);
//                    }else{
//                        System.out.printf("%d la so le", numb);
//                    }
//                    break;
//                }
//                case 3:{
//                    double canBacHai = Math.sqrt(numb);
//                    if(Math.floor(canBacHai)==canBacHai){
//                        System.out.printf("%d la so chinh phuong", numb);
//                    }else{
//                        System.out.printf("%d khong phai la so chinh phuong", numb);
//                    }
//                    break;
//                }
//                case 4:{
//                    System.exit(0);
//                }
//                default: {
//                    System.out.println("Invalid choice");
//                }
//            }
//        }while (choice!=4);
        double[][][] scores = {
                {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
                {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
                {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
                {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
                {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
                {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}}
        };
        System.out.print(scores[0][1][1]);
    }
}
