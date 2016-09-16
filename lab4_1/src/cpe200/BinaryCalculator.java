package cpe200;


public class BinaryCalculator {
    private Operand firstOperand;
    private Operand secondOperand;

    public BinaryCalculator() {

        firstOperand = new Operand(0);
        secondOperand = new Operand(0);

    }

    public void setFirstOperand(Operand operand) {
        firstOperand.setOperand(operand.getOperand());
    }


    public void setSecondOperand(Operand operand) {
        secondOperand.setOperand(operand.getOperand());
    }

    public String add() {

        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        double sum = first + second ;
        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String subtract() {

        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        double sum = first - second ;

        String s = Double.toString(sum);

        s = String.format("%.5f",sum);
        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");

    }

    public String multiply() {

        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        double sum = first * second ;

        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    /* This method should throw an exception when divide by zero */
    public String division() throws ArithmeticException {

        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        if(second ==0) {
            throw new RuntimeException("ERROR");
        }
        double sum = first / second ;

        String s = Double.toString(sum);
        s = String.format("%.5f",sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

    public String power() {

        double first = Double.parseDouble(firstOperand.getOperand());
        double second = Double.parseDouble(secondOperand.getOperand());

        double sum = 1;

        for(int i = 0 ; i<second ;i++){

            sum*=first ;
        }

        String s = Double.toString(sum);

        return s = s.indexOf(".") < 0 ? s : s.replaceAll("0*$", "").replaceAll("\\.$", "");
    }

}
