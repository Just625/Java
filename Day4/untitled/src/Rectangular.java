public class Rectangular {
    double width;
    double height;

    public Rectangular() {
    }
    public Rectangular(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return  (this.width + this.height)*2;
    }
    public void display(){
        System.out.printf("This rectangular has width: %.2f, height: %.2f, area: %.2f, perimeter: %.2f\n", this.width, this.height, this.getArea(), this.getPerimeter());
    }
}
