public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.printf("Ban kinh: %.2f, Chu vi: %.2f, Dien tich:%.2f", circle1.radius, circle1.getChuVi(), circle1.getDienTich());
        SimpleCircle circle2 = new SimpleCircle(125);
        System.out.printf("\nBan kinh: %.2f, Chu vi: %.2f, Dien tich:%.2f", circle2.radius, circle2.getChuVi(), circle2.getDienTich());
        circle2.setRadius(5);
        System.out.printf("\nBan kinh: %.2f, Chu vi: %.2f, Dien tich:%.2f", circle2.radius, circle2.getChuVi(), circle2.getDienTich());
    }
    static class SimpleCircle{
        double radius;
        SimpleCircle(){
            this.radius = 1;
        }
        SimpleCircle(double radius){
            this.radius = radius;
        }
        double getChuVi(){
            return 2 * this.radius * Math.PI;
        }
        double getDienTich(){
            return this.radius * this.radius * Math.PI;
        }
        void setRadius(double radius){
            this.radius = radius;
        }
    }
    static class TV{
        int channel;
        int volumeLevel;
        boolean on =false;
        TV(){
        }
        void turnOn(){
            this.on = true;
        }
        void turnOff(){
            this.on = false;
        }
        void setChannel(int channel){
            if(channel >0 && channel <120 && this.on){
                this.channel = channel;
            }
        }
        void channelUP(){
            if(this.on && this.channel <120){
                this.channel +=1;
            }
        }
}
}
