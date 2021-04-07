public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for(int i = 0; i<1000;i++){
            for(int j = 0; j<1000; j++){
                System.out.println(j);
            }
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
