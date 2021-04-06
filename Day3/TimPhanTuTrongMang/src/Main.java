import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int index = -1;
        String input;
        String[] studentArr = {"TimberSaw", "Axe", "Tide Hunter", "Legion Commander", "Pangolier", "Underlord"};
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao ten sinh vien muon tim:");
        input = src.nextLine();
        for(int i =0;i<studentArr.length;i++){
            if(input.equals(studentArr[i])){
                index = i;
                System.out.printf("%s nam o vi tri thu %d", input, index);
                break;
            }
        }
        if(index==-1){
            System.out.printf("Khong tim thay %s", input);
        }
    }
}
