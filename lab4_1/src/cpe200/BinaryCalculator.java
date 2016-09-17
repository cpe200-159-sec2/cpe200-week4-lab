package cpe200;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
    }

    protected String format(double val) {
        long significanceFactor = 100000;
        if (Math.abs(significanceFactor * val - significanceFactor * Math.round(val)) < 1) {
            return String.format("%d", (long) val);
        } else {
            return String.format("%s", (double) Math.round(significanceFactor * val) / significanceFactor);
        }
    }

    public String add() {
        double a = Double.parseDouble(firstOperand.getOperand());
        double b = Double.parseDouble(secondOperand.getOperand());
        double c = a + b;
        return format(c);
    }

    public String subtract() {
        double a = Double.parseDouble(firstOperand.getOperand());
        double b = Double.parseDouble(secondOperand.getOperand());
        double c = a - b;
        return format(c);
    }

    public String multiply() {
        double a = Double.parseDouble(firstOperand.getOperand());
        double b = Double.parseDouble(secondOperand.getOperand());
        double c = a * b;
        return format(c);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        double b = Double.parseDouble(secondOperand.getOperand());
        if (Math.abs(b) < 1e-5) throw new ArithmeticException("Cannot divide by zero");
        double a = Double.parseDouble(firstOperand.getOperand());
        double c = a / b;
        return format(c);
    }

    public String power() {
        double a = Double.parseDouble(firstOperand.getOperand());
        double b = Double.parseDouble(secondOperand.getOperand());
        double c = Math.pow(a, b);
        return format(c);
    }

}
