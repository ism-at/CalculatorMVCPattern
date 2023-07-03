package MVCPart02;
public class CalculatorModel {
    private Double addResult;
    private Double subResult;
    private Double mulResult;
    private Double divResult;
    public void addNumbers(Double firstNumber, Double secondNumber){
        addResult = firstNumber + secondNumber;
    }
    public double getAddResult() {
        return addResult;
    }
    public void subNumbers(Double firstNumber, Double secondNumber){
        subResult = firstNumber - secondNumber;
    }
    public Double getSubResult() {
        return subResult;
    }
    public void mulNumbers(Double firstNumber, Double secondNumber){
        mulResult = firstNumber * secondNumber;
    }
    public Double getMulResult(){
        return mulResult;
    }
    public void divNumbers(Double firstNumber, Double secondNumber){
        divResult = firstNumber / secondNumber;
    }
    public Double getDivResult(){
        return divResult;
    }
}
