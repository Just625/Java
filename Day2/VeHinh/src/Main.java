import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int userChoice;
        System.out.println("Menu: \n1. Print the rectangle\n2. Print the square triangleThe corner is square at 4 different angles: bottom-left, top-left, botton-right, top-right\n3. Print isosceles triangle\n4.Exit");
        Scanner src = new Scanner(System.in);
        do{
            System.out.println("Enter your choice (1-4): ");
            userChoice = src.nextInt();
            String result = "";
            switch (userChoice){
                case 1:{
                    System.out.println("Print the rectangle");
                    for(int i = 0; i<3;i++){
                        String dong="";
                        for(int j = 0; j<5;j++){
                            dong+=" *";
                        }
                        result+=dong+"\n";
                    }
                    System.out.println(result);
                    break;
                }
                case 2: {
                    System.out.println("Print the square triangle");
                    System.out.println("Enter square position:");
                    int squarePosition = src.nextInt();
                    if(squarePosition==1){
                        for(int i = 0;i<5;i++){
                            String dong="";
                            for(int j = 0;j<i+1;j++){
                                dong+=" *";
                            }
                            result+=dong+"\n";
                        }
                    }else if(squarePosition==2){
                        for(int i = 0;i<5;i++){
                            String dong="";
                            for(int j = 0;j<5-i;j++){
                                dong+=" *";
                            }
                            result+=dong+"\n";
                        }
                    }else if(squarePosition==3){
                        for(int i = 0;i<5;i++){
                            String dong = "";
                            for(int j =i;j<5-1;j++){
                                dong+="  ";
                            }
                            for(int k = 0;k<i+1;k++){
                                dong+=" *";
                            }
                            result+=dong+"\n";
                        }
                    }else{
                        for(int i = 0;i<5;i++){
                            String dong = "";
                            for(int k = 0;k<i;k++){
                                dong+="  ";
                            }
                            for(int j =i;j<5;j++){
                                dong+=" *";
                            }
                            result+=dong+"\n";
                        }
                    }
                    System.out.println(result);
                    break;
                }
                case 3: {
                    System.out.println("Print isosceles triangle");
                        for(int i = 0;i<5;i++){
                            String dong="";
                            for(int j =0;j<5-i-1;j++){
                                dong+="  ";
                            }
                            for(int k = 0;k<(i*2)+1;k++){
                                dong+=" *";
                            }
                            for(int j = 0;j<5-i-1;j++){
                                dong+="  ";
                            }
                            result+=dong+"\n";
                        }
                    System.out.println(result);
                    break;
                }
                case 0:
                    System.exit(0);
                default:{
                    System.out.println("Invalid choice");
                }
            }
        } while(userChoice>0);
    }
}
