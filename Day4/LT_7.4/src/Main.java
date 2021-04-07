public class Main {
    public static void main(String[] args) {
        Rectangular rectangular1 = new Rectangular();
        rectangular1.display();
        Rectangular rectangular2 = new Rectangular(10, 5);
        rectangular2.display();
        System.out.println(rectangular2.getWidth());
        rectangular2.setHeight(15);
        rectangular2.display();
        System.out.println(rectangular2);
    }
}

