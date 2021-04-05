import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb, choice;
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Nhap vao 1 so can kiem tra(>0): ");
            numb = src.nextInt();
        }while (numb<=0);
        do{
            System.out.println("\nMenu\n1. Kiem tra so nguyen to\n2. Kiem tra so chan le\n3. Kiem tra so chinh phuong\n4. Thoat chuong trinh");
            choice = src.nextInt();
            switch(choice){
                case 1:{
                    int count = 0;
                    for(int i = 2;i<=Math.sqrt(numb);i++){
                        if(numb%i==0){
                            count++;
                        }
                    }
                    if(count==0){
                        System.out.printf("%d la so nguyen to", numb);
                    }else{
                        System.out.printf("%d khong phai la so nguyen to", numb);
                    }
                    break;
                }
                case 2:{
                    if(numb%2==0){
                        System.out.printf("%d la so chan", numb);
                    }else{
                        System.out.printf("%d la so le", numb);
                    }
                    break;
                }
                case 3:{
                    double canBacHai = Math.sqrt(numb);
                    if(Math.floor(canBacHai)==canBacHai){
                        System.out.printf("%d la so chinh phuong", numb);
                    }else{
                        System.out.printf("%d khong phai la so chinh phuong", numb);
                    }
                    break;
                }
                case 4:{
                    System.exit(0);
                }
                default: {
                    System.out.println("Invalid choice");
                }
            }
        }while (choice!=4);
    }
}
