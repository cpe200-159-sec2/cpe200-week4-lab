package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    private double firstNum,secondNum;

    public BinaryCalculator() {
        firstOperand = new Operand('0');
        secondOperand = new Operand('0');
    }

    public void setFirstOperand(Operand operand) {
        this.firstOperand = operand;
        firstNum = Double.parseDouble(firstOperand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        this.secondOperand = operand;
        secondNum = Double.parseDouble(secondOperand.getOperand());
    }

    public String add() {
        String sum = new Double(firstNum+secondNum).toString();
        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public String subtract() {
        Double sumdb = firstNum-secondNum;
        String sum = new Double(firstNum-secondNum).toString();
        sum = String.format("%.5f",sumdb);

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public String multiply() {
        String sum = new Double(firstNum*secondNum).toString();

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(secondNum==0) throw new RuntimeException("ERROR");
        Double sumdb = firstNum/secondNum;

        String sum = new Double(firstNum/secondNum).toString();
        sum = String.format("%.5f",sumdb);
        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public String power() {
        double power = 1;
        for(int i=0;i<secondNum;i++){
            power *= firstNum;
        }
        String sum = new Double(power).toString();

        return sum.indexOf(".") < 0 ? sum : sum.replaceAll("0*$","").replaceAll("\\.$","");
    }

    public Operand getFirstOperand() {
        return firstOperand;
    }

    public Operand getSecondOperand() {
        return secondOperand;
    }
}
