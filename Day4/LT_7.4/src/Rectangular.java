public class Rectangular {
    double height;
    double width;

    public Rectangular() {
        this.height = 2;
        this.width = 1;
    }

    public Rectangular(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void display() {
        System.out.printf("Hinh chu nhat co height la %.2f, width la %.2f, chu vi la %.2f, dien tich la %.2f\n", this.height, this.width, getPerimeter(), getArea());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
