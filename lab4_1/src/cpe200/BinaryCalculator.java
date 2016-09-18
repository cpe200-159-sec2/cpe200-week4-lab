package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add() { return ((firstOperand.add(secondOperand)).stripTrailingZeros()).toString(); }

    public String subtract() { return ((firstOperand.subtract(secondOperand)).stripTrailingZeros()).toString(); }

    public String multiply() { return  ((firstOperand.multiply(secondOperand)).stripTrailingZeros()).toString(); }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        String x;
        if(secondOperand==BigDecimal.ZERO){
            throw new ArithmeticException("CannotDividedByZero");
        }
        else {
            x = ((firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP)).stripTrailingZeros()).toString();
        }
        return x;
    }

    public String power() {return ((firstOperand.pow(secondOperand.intValue())).stripTrailingZeros()).toString(); }

}
