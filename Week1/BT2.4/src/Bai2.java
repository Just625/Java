import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int numb;
        String result="";
        Scanner src = new Scanner(System.in);
        System.out.println("Nhap vao 1 so nguyen >= 0 va <=999: ");
        numb = src.nextInt();
        int hangTram = numb/100;
        int hangChuc = (numb%100)/10;
        int hangDonVi = (numb%100)%10;
        //doc hang tram
        switch(hangTram){
            case 1:
                result+="Một trăm ";
                break;
            case 2:
                result+="Hai trăm ";
                break;
            case 3:
                result+="Ba trăm ";
                break;
            case 4:
                result+="Bốn trăm ";
                break;
            case 5:
                result+="Năm trăm ";
                break;
            case 6:
                result+="Sáu trăm ";
                break;
            case 7:
                result+="Bảy trăm ";
                break;
            case 8:
                result+="Tám trăm ";
                break;
            case 9:
                result+="Chín trăm ";
                break;
        }
        /*doc hang chuc*/
        switch(hangChuc){
            case 0:
                if(hangTram!=0&&hangDonVi!=0){
                    result+="linh ";
                }
                break;
            case 1:
                result+="Mười ";
                break;
            case 2:
                result+="Hai mươi ";
                break;
            case 3:
                result+="Ba mươi ";
                break;
            case 4:
                result+="Bốn mươi ";
                break;
            case 5:
                result+="Năm mươi ";
                break;
            case 6:
                result+="Sáu mươi ";
                break;
            case 7:
                result+="Bảy mươi ";
                break;
            case 8:
                result+="Tám mươi ";
                break;
            case 9:
                result+="Chín mươi ";
                break;
        }
        //doc hang DonVi;
        switch(hangDonVi){
            case 0:
                if(hangChuc==0&&hangTram==0){
                    result+="Không";
                }
                break;
            case 1:
                if(hangChuc<=1){
                    result+="Một";
                }else{
                    result+="Mốt";
                }
                break;
            case 2:
                result+="Hai";
                break;
            case 3:
                result+="Ba";
                break;
            case 4:
                result+="Bốn";
                break;
            case 5:
                if(hangChuc==0&&(hangTram==0||hangTram!=0)){
                    result+="Năm";
                }else{
                    result+="Lăm";
                }
                break;
            case 6:
                result+="Sáu";
                break;
            case 7:
                result+="Bảy";
                break;
            case 8:
                result+="Tám";
                break;
            case 9:
                result+="Chín";
                break;
        }
        System.out.println(result);
    }
}
