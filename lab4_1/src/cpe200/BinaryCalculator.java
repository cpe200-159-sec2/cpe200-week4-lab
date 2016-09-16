package cpe200;


import java.math.BigDecimal;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private Operand operand;
   // private Double first,second,result;
    private BigDecimal first , second ,result;

    public BinaryCalculator() {
        setFirstOperand(new Operand(0));
        setSecondOperand(new Operand(0));
    }

    public void setFirstOperand(Operand operand) {
        first = new BigDecimal(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        second = new BigDecimal(operand.getOperand());
    }

    public String add() {
        result = first.add(second).stripTrailingZeros();
        return result.toString();
    }

    public String subtract() {
        result = first.subtract(second).stripTrailingZeros();
        return result.toString();
    }

    public String multiply() {
        result = first.multiply(second).stripTrailingZeros();
        return result.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (second.equals(0)){
            throw new RuntimeException("0");
        }else {
           return first.divide(second,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
        }
    }

    public String power() {
        result = first.pow(second.intValue()).stripTrailingZeros();
        return result.toString();
    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
