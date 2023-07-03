package MVCPart02;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{

    // Components
    private JTextField firstNumber = new JTextField(10);
    //private JLabel additionLabel = new JLabel("+");
    private JButton addButton = new JButton("+");
    private JButton subButton = new JButton("-");
    private JButton mulButton = new JButton("*");
    private JButton divButton = new JButton("/");
    private JTextField secondNumber = new JTextField(10);
    private JTextField calcSolution = new JTextField(10);



    // Setup Interface
    CalculatorView(){
        JPanel calcPanel = new JPanel();
        // To arrange items vertically --> BoxLayout
        calcPanel.setLayout(new BoxLayout(calcPanel, BoxLayout.Y_AXIS));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 250);

        calcPanel.add(firstNumber);
        calcPanel.add(addButton);
        calcPanel.add(subButton);
        calcPanel.add(mulButton);
        calcPanel.add(divButton);
        calcPanel.add(secondNumber);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }
    public Double getFirstNumber(){
        return Double.parseDouble(firstNumber.getText());
    }
    public Double getSecondNumber(){
        return Double.parseDouble(secondNumber.getText());
    }
    public Double getCalcSolution(){
        return Double.parseDouble(calcSolution.getText());
    }
    public void setCalcSolution(Double solution){
        calcSolution.setText(Double.toString(solution));
    }
    // they belong to Controller
    void addCalculationListener(ActionListener listenForCalcButton){
        addButton.addActionListener(listenForCalcButton);
    }
    void addSubtractionListener(ActionListener listenForCalcButton){
        subButton.addActionListener(listenForCalcButton);
    }
    void addMulListener(ActionListener listenForCalcButton){
        mulButton.addActionListener(listenForCalcButton);
    }
    void addDivListener(ActionListener listenForCalcButton){
        divButton.addActionListener(listenForCalcButton);
    }
    void displayErrorMessage(String errorMessage){
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
