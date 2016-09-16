package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getValue());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getValue());
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
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() {
        return firstOperand.pow(Integer.parseInt(secondOperand.stripTrailingZeros().toString())).stripTrailingZeros().toString();
    }

}
