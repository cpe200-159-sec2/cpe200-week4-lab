package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private  Operand secondOperand;
    private BigDecimal FirstOper;
    private  BigDecimal SecondOper;

    public BinaryCalculator() {
        this.FirstOper = new BigDecimal(0);
        this.SecondOper = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand) {
        FirstOper = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        SecondOper = new BigDecimal((operand.getOperand()));
    }

    public String add() {

        return FirstOper.add(SecondOper).stripTrailingZeros().toString();
    }

    public String subtract() {
        return FirstOper.subtract(SecondOper).stripTrailingZeros().toString();

    }

    public String multiply() {
        return FirstOper.multiply(SecondOper).stripTrailingZeros().toString();

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (SecondOper.compareTo(BigDecimal.ZERO)==0){
            throw new RuntimeException("Error");
        }
        return FirstOper.divide(SecondOper,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }

    public String power() {

        return FirstOper.pow(SecondOper.intValue()).stripTrailingZeros().toString();
    }

}
