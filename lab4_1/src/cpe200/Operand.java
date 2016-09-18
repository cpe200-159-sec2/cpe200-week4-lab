package cpe200;

public class Operand {
    private String operand;

    public Operand(String operand) {
        this.setOperand(operand);
    }

    public Operand(int operand) {
        setOperand(operand);
        this.setOperand(getOperand());
    }

    public Operand(double operand) {
        setOperand(operand);
        this.setOperand(getOperand());
    }

    public String getOperand() {
        return this.operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    public void setOperand(int operand) {
        this.setOperand(Integer.toString(operand));
    }

    public void setOperand(double operand) {
        this.setOperand(Double.toString(operand));
    }
}