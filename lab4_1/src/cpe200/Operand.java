package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
public class Operand {
    private String operand;

    public Operand(String operand)
    {
        this.operand = operand;
    }

    public Operand(int operand)
    {
        this.operand = Integer.toString(operand);
    }

    public Operand(double operand)
    {
        /* your code here */
        this.operand = Double.toString(operand);
    }

    public String getOperand() {
        return operand;
    }

}
