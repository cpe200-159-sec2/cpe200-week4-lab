package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;
    double sum=0,first=0,second=0;

    public BinaryCalculator() {
        firstOperand = new Operand(0);
        secondOperand= new Operand(0);

    }

    public void setFirstOperand(Operand operand) {
        first = new Double(operand.getOperand());

    }


    public void setSecondOperand(Operand operand) {
        second = new Double(operand.getOperand());

    }

    public String add() {
        sum = (first+second);
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String subtract() {
        sum=(first-second);
        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String multiply() {
        sum=(first*second);
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {
        if(second==0)
        {
            throw new RuntimeException( "ERROR" ) ;
        }

        sum=(first/second);
        String sums =  Double.toString(sum);
        sums = String.format("%.5f", sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String power() {
        sum = 1 ;
        for (int i = 1; i <= second; i++) {
            sum = sum*first;
        }
        String sums =  Double.toString(sum);
        return sums = sums.indexOf(".") < 0 ? sums : sums.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public Operand getFirstOperand() {
        return firstOperand;

    }

    public Operand getSecondOperand() {
        return secondOperand;

    }
}
