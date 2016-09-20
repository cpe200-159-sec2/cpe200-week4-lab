package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
        this.firstOperand = new BigDecimal(0);
        this.secondOperand = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = new BigDecimal(operand.getOperand());
    }

    public String add()
    {
        return firstOperand.add(secondOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return firstOperand.subtract(secondOperand).stripTrailingZeros().toString();
    }

    public String multiply() {

        return firstOperand.multiply(secondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {

        if (secondOperand.compareTo(BigDecimal.ZERO)==0){
            throw new RuntimeException("ERROR");
        }
        return firstOperand.divide(secondOperand,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() {
        return firstOperand.pow(secondOperand.intValue()).stripTrailingZeros().toString();
            }



}
