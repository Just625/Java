public class Main {
    public static void main(String[] args) {
        int numb = 2;
        String result ="";
        while(numb<100){
            int count = 0;
            for(int i = 2;i<=Math.sqrt(numb);i++){
                if(numb%i==0){
                    count++;
                }
            }
            if(count==0){
                result+=numb+" ";
            }
            numb++;
        }
        System.out.println("So nguyen to nho hon 100 la: "+result);
    }
}
