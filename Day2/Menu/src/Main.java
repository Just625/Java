import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice;
        System.out.println("Menu\n1. Draw the triangle\n2. Draw the square\n3. Draw the rectangle\nExit");
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Enter your choice (1-3): ");
            userChoice = src.nextInt();
            String result = "";
            switch (userChoice){
                case 1:{
                    System.out.println("Draw the triangle");
                    for(int i = 0;i<5;i++){
                        result += "*";
                        System.out.println(result);
                    }
                    break;
                }
                case 2: {
                    System.out.println("Draw the square");
                    for(int j = 0;j<5;j++){
                        result="* * * * *";
                        System.out.println(result);
                    }

                    break;
                }
                case 3: {
                    System.out.println("Draw the rectangle");
                    for(int k =0; k<3;k++){
                        result="* * * * *";
                        System.out.println(result);
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid choice");
                }
            }
        } while(userChoice!=0);
    }
}
