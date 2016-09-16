package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    public BigDecimal firstOperand;
    public BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() {
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract() {
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        return  firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        return null;
    }

    public String power() {
        return firstOperand.pow(Integer.parseInt(secondOperand.toString())).stripTrailingZeros().toString();
    }

}
