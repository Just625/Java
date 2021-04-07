public class Main {
    public static void main(String[] args) {
        Fan fan1 =  new  Fan("FAST", 10, "yellow", true);
        Fan fan2 = new Fan("MEDIUM", 5,"blue", false);
        Fan fan3 = new Fan();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        System.out.println(fan3.toString());
    }
}
