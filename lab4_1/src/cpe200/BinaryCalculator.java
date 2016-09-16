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
        secondOperand = operand ;
    }

    public String add() {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        return first.add(second).stripTrailingZeros().toString();
    }

    public String subtract() {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        return first.subtract(second).stripTrailingZeros().toString();
    }

    public String multiply() {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        return first.multiply(second).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        return first.divide(second, 5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        BigDecimal first = new BigDecimal(firstOperand.getOperand());
        BigDecimal second = new BigDecimal(secondOperand.getOperand());
        return first.pow(second.intValue()).stripTrailingZeros().toString();
    }

}
