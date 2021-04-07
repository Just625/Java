public class StopWatch {
    private double startTime;
    private double endTime;
    StopWatch(){
    }

    public double getEndTime() {
        return this.endTime;
    }

    public double getStatTime() {
        return this.startTime;
    }
    void start(){
        this.startTime = System.currentTimeMillis();
    }
    void end(){
        this.endTime = System.currentTimeMillis();
    }
    double getElapsedTime(){
        return  this.endTime - this.startTime;
    }
}
