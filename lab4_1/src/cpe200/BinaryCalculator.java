package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        firstOperand=operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand=operand;
    }

    public String add() {
        BigDecimal Num1= new BigDecimal(firstOperand.getOperand());
        BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
        Num1 = Num1.add(Num2).stripTrailingZeros();
        return Num1.toString();
    }

    public String subtract() {
        BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
        Num1 = Num1.subtract(Num2).stripTrailingZeros();
        return Num1.toString();
    }

    public String multiply() {
        BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
        Num1 = Num1.multiply(Num2).stripTrailingZeros();
        return Num1.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
        Num1 = Num1.divide(Num2,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return Num1.toString();
    }

    public String power() {
        BigDecimal Num1 = new BigDecimal(firstOperand.getOperand());
        BigDecimal Num2 = new BigDecimal(secondOperand.getOperand());
        Num1 = Num1.pow(Num2.intValue()).stripTrailingZeros();
        return Num1.toString();
    }

}
