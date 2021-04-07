public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * this.a);
    }
    public void showResult(){
        if(this.getDiscriminant()<0){
            System.out.println("This equation has no roots");
        }else if(this.getDiscriminant()==0){
            System.out.printf("\nThis equation has one root: %.2f", this.getRoot1());
        }else{
            System.out.printf("\nThis equation has two roots: %.2f and %.2f", this.getRoot1(), this.getRoot2());
        }
    }


}
