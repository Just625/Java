public class Calculator {
    private int firstNumb;
    private int secondNumb;
    private String operand;

    public Calculator() {
    }

    public Calculator(int firstNumb, int secondNumb, String operand) {
        this.firstNumb = firstNumb;
        this.secondNumb = secondNumb;
        this.operand = operand;
    }

    public int calculate() {
        int result = 0;
        if (operand.equals("Addition")) {
            result = firstNumb + secondNumb;
        } else if (operand.equals("Subtraction")) {
            result = firstNumb - secondNumb;
        } else if (operand.equals("Multiplication")) {
            result = firstNumb * secondNumb;
        } else {
            if(secondNumb!=0){
                result = firstNumb / secondNumb;
            } else{
                throw new RuntimeException("Can't divided by zero");
            }
        }
        return result;
    }
}
