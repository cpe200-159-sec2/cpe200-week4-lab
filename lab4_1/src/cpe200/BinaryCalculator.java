package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal firstOperand,secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() {
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        return firstOperand.divide(secondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
    }

}