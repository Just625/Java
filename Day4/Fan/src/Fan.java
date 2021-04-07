public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }
    public Fan(String speed, double radius, String color, boolean on){
        if(speed.equals(SLOW)){
            this.speed = this.SLOW;
        }else if(speed.equals(MEDIUM )){
            this.speed = this.MEDIUM;
        }else if(speed.equals(FAST)){
            this.speed = this.FAST;
        }
        this.radius = radius;
        this.color = color;
        this.on = on;
    }
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(this.on){
            return "Fan is on\nSpeed: " + this.speed + " Color: " + this.color + " Radius: " + this.radius;
        }else{
            return "Fan is off\n"+ "Color: " + this.color + " Radius: " + this.radius;
        }
    }
}
