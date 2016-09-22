package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        firstOperand = new BigDecimal(0);
        secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.getOperand());
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add() {
        firstOperand = firstOperand.add(secondOperand).stripTrailingZeros();
        return firstOperand.toString();
    }

    public String subtract() {
        firstOperand = firstOperand.subtract(secondOperand).stripTrailingZeros();
        return firstOperand.toString();
    }

    public String multiply() {
        firstOperand = firstOperand.multiply(secondOperand).stripTrailingZeros();
        return firstOperand.toString();
    }
    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(secondOperand.equals(0)){
            throw new RuntimeException();
        }
        firstOperand = firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
             return firstOperand.toString();
    }

    public String power() {
        firstOperand = firstOperand.pow(secondOperand.intValue()).stripTrailingZeros();
        return firstOperand.toString();
    }


}
