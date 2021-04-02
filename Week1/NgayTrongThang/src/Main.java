import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day;
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao thang: ");
        day = src.nextInt();
        String result;
        switch(day){
            case 2:
                result = "co 28 hoac 29 ngay";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               result = "co 31 ngay";
               break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "co 30 ngay";
                break;
            default:
                result="Invalid input";
                break;
        }
        if(result!="Invalid input"){
            System.out.printf("Thang %d %s", day, result);
        }else{
            System.out.println(result);
        }
    }
}
