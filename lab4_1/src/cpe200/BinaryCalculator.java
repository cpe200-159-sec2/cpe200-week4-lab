package cpe200;


import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;



    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        return one.add(two).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        return one.subtract(two).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        return one.multiply(two).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        return one.divide(two,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal one = new BigDecimal(firstOperand.getOperand());
        BigDecimal two = new BigDecimal(secondOperand.getOperand());

        return one.pow(two.intValueExact()).stripTrailingZeros().toString();
    }

}
