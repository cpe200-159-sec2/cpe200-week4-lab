package cpe200;


import java.math.BigDecimal;

public class BinaryCalculator {
    private BigDecimal firstOperand;
    private BigDecimal secondOperand;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        setFirstOperand(new BigDecimal(operand.getOperand()));
    }


    public void setSecondOperand(Operand operand) {
        setSecondOperand(new BigDecimal(operand.getOperand()));
    }

    public String add() {
        return getFirstOperand().add(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String subtract() {
        return getFirstOperand().subtract(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String multiply() {
        return  getFirstOperand().multiply(getSecondOperand()).stripTrailingZeros().toString();
    }

    public String division() throws ArithmeticException {
        if(getSecondOperand().toString()=="0"){
            throw new RuntimeException("Error");
        }
        return getFirstOperand().divide(getSecondOperand(),5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }

    public String power() {
        return getFirstOperand().pow(Integer.parseInt(getSecondOperand().stripTrailingZeros().toString())).stripTrailingZeros().toString();
    }

    public BigDecimal getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(BigDecimal firstOperand) {
        this.firstOperand = firstOperand;
    }

    public BigDecimal getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(BigDecimal secondOperand) {
        this.secondOperand = secondOperand;
    }
}
