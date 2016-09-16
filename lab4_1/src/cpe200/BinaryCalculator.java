package cpe200;
import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    BigDecimal FirstO, SecondO,Result;

    public BinaryCalculator() {

    }

    public void setFirstOperand(Operand operand) {
        FirstO = new BigDecimal(operand.getOperand());

    }


    public void setSecondOperand(Operand operand) {
        SecondO = new BigDecimal(operand.getOperand());
    }

    public String add() {
        Result=FirstO.add(SecondO).stripTrailingZeros();
        return Result.toString();

    }

    public String subtract() {
        Result=FirstO.subtract(SecondO).stripTrailingZeros();
        return Result.toString();
    }

    public String multiply() {
        Result=FirstO.multiply(SecondO).stripTrailingZeros();
        return Result.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (SecondO.toString()=="0") {
        throw new IllegalArgumentException("Argument divisor is 0");
            }
        Result=FirstO.divide(SecondO,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
         return Result.toString();

    }

    public String power() {

            Result = FirstO.pow(SecondO.intValue()).stripTrailingZeros();

        return Result.toString();

    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
