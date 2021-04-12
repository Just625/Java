import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numbRequired, count1=0, numb = 2;
        String result="";
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao so luong so nguyen to can lay ra: ");
        numbRequired = src.nextInt();
        while(count1<numbRequired){
            int count2=0;
            for(int i =2;i<=Math.sqrt(numb);i++){
                if(numb%i==0){
                    count2++;
                    break;
                }
            }
            if(count2==0){
                count1++;
                result+=numb+" ";
            }
            numb++;
        }
        System.out.println(result);
    }
}
