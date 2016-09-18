package cpe200;
import java.math.BigDecimal;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        firstOperand = operand;
    }

    public void setSecondOperand(Operand operand) {
        secondOperand = operand;
    }

    public String add() {
        BigDecimal firstNumber = new BigDecimal(firstOperand.getOperand());
        BigDecimal secondNumber = new BigDecimal(secondOperand.getOperand());
        firstNumber = firstNumber.add(secondNumber).stripTrailingZeros();

        return firstNumber.toString();
    }

    public String subtract() {
        BigDecimal firstNumber = new BigDecimal(firstOperand.getOperand());
        BigDecimal secondNumber = new BigDecimal(secondOperand.getOperand());
        firstNumber = firstNumber.subtract(secondNumber).stripTrailingZeros();

        return firstNumber.toString();
    }

    public String multiply() {
        BigDecimal firstNumber = new BigDecimal(firstOperand.getOperand());
        BigDecimal secondNumber = new BigDecimal(secondOperand.getOperand());
        firstNumber = firstNumber.multiply(secondNumber).stripTrailingZeros();

        return firstNumber.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        BigDecimal firstNumber = new BigDecimal(firstOperand.getOperand());
        BigDecimal secondNumber = new BigDecimal(secondOperand.getOperand());

        if (secondNumber.equals(0)) {
            throw new ArithmeticException("1st number is divided by 0.");
        }
        else{
            firstNumber = firstNumber.divide(secondNumber, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        }

        return firstNumber.toString();
    }

    public String power() {
        BigDecimal firstNumber = new BigDecimal(firstOperand.getOperand());
        BigDecimal secondNumber = new BigDecimal(secondOperand.getOperand());
        firstNumber = firstNumber.pow(secondNumber.intValue()).stripTrailingZeros();
        return firstNumber.toString();
    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
