package cpe200;


import java.math.BigDecimal;
import java.lang.Exception;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {

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
    public String division() {
        if (secondOperand.toString().equals("0")) {
            throw new ArithmeticException("ERROR");
        } else
            firstOperand = firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return firstOperand.toString();
    }

    public String power() {
        BigDecimal ans = new BigDecimal(
                Double.toString(
                        Math.pow(firstOperand.doubleValue(),secondOperand.doubleValue())
                )
        );
        ans = ans.stripTrailingZeros();
        return ans.toString();
    }
}
