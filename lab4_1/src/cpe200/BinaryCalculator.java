package cpe200;


import java.util.AbstractCollection;

public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private Double Num1, Num2;

    public BinaryCalculator() {
    }

    public void setFirstOperand(Operand operand) {
        Num1 = Double.parseDouble(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        Num2 = Double.parseDouble(operand.getOperand());
    }

    public String add() {
        Double Ans = Num1 + Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

    public String subtract() {
        Double Ans = Num1 - Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        long tmp_long = Math.round(Ans*100000);
        Ans = (double)tmp_long;
        Ans /= 100000;
        return Double.toString(Ans);
    }

    public String multiply() {
        Double Ans = Num1 * Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if (Num2 == 0)
            throw new RuntimeException();
        Double Ans = Num1 / Num2;
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        long tmp_long = Math.round(Ans*100000);
        Ans = (double)tmp_long;
        Ans /= 100000;
        return Double.toString(Ans);
    }

    public String power() {
        Double Ans = Math.pow(Num1, Num2);
        int tmp_int = Ans.intValue();
        if (tmp_int == Ans)
            return Integer.toString(tmp_int);
        return Double.toString(Ans);
    }

}
