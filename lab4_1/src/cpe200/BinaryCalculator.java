package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private BigDecimal first,second,sum,x;

    public BinaryCalculator() {
        Operand firstOperand=new Operand(0);
        Operand secondOperand=new Operand(0);
    }

    public void setFirstOperand(Operand operand) {
        first=new BigDecimal(operand.getOperand());

    }


    public void setSecondOperand(Operand operand) {
        second=new BigDecimal(operand.getOperand());
    }

    public String add() {
        sum=first.add(second).stripTrailingZeros();
        return sum.toString();
    }

    public String subtract() {
        sum=first.subtract(second).stripTrailingZeros();
        return sum.toString();
    }

    public String multiply() {
        sum=first.multiply(second).stripTrailingZeros();
        return sum.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (second.equals(0)) {
            throw new RuntimeException("0");
        } else {
            return first.divide(second, 5, BigDecimal.ROUND_UP).stripTrailingZeros().toString();

        }

    }

    public String power() {

        sum=first.pow(second.intValueExact()).setScale(0);
        return sum.toString();
    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
