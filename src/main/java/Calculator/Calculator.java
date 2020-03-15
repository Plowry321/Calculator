package Calculator;

public class Calculator {

    private String mainNumber = "0";
    private String previousNumber;

    public Calculator() {
        this("");
    }

    public Calculator(String mainNumber) {
        this.mainNumber = mainNumber;
    }

    public String appendToMainNumber(String toAppend) {
        mainNumber += toAppend;
        return mainNumber;
    }

    public void resetMainNumber() {
        mainNumber = "";
    }

    public String getMainNumber() {
        return mainNumber;
    }

    public String toAdd(String toAdd) {
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toAdd,10);
        var result = mainNumberInteger + newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String toSubtract(String toSubtract) {
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toSubtract,10);
        var result = mainNumberInteger - newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String toMultiply(String toMultiply) {
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toMultiply,10);
        var result = mainNumberInteger * newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public String toDivide(String toDivide) {
        var mainNumberInteger = Integer.parseInt(previousNumber,10);
        var newNumberInteger = Integer.parseInt(toDivide,10);
        var result = mainNumberInteger / newNumberInteger;
        mainNumber = Integer.toString(result);
        return mainNumber;
    }

    public void storeAndResetMainNumber(){
        previousNumber = mainNumber;
        resetMainNumber();
    }

}
