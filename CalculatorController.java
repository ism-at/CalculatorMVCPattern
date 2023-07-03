package MVCPart02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new addListener());
        this.theView.addSubtractionListener(new subListener());
        this.theView.addMulListener(new mulListener());
        this.theView.addDivListener(new divListener());
    }

    class addListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Double firstNumber, secondNumber = Double.valueOf(0);
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getAddResult());
            }
            catch (NumberFormatException ex){
                theView.displayErrorMessage("Enter the right format numbers");
            }
        }
    }
    class subListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Double firstNumber, secondNumber = Double.valueOf(0);
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.subNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getSubResult());
            }
            catch (NumberFormatException ex){
                theView.displayErrorMessage("Enter the right format numbers");
            }
        }
    }
    class mulListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Double firstNumber, secondNumber = Double.valueOf(0);
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.mulNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getMulResult());
            }
            catch (NumberFormatException ex){
                theView.displayErrorMessage("Enter the right format numbers");
            }
        }
    }
    class divListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Double firstNumber, secondNumber = Double.valueOf(0);
            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.divNumbers(firstNumber, secondNumber);
                theView.setCalcSolution(theModel.getDivResult());
            }
            catch (NumberFormatException ex){
                theView.displayErrorMessage("Enter the right format numbers");
            }
        }
    }
}
