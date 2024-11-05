package SimpleCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame{
    private JTextField tfNumber1;
    private JTextField tfNumber2;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField lblResult;
    private JPanel MainPanel;
    private JLabel First;
    private JLabel Second;
    private JLabel Result;


    public SimpleCalculator() {
        setTitle("Simple Calculator");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(tfNumber1.getText());
                int num2 = Integer.parseInt(tfNumber2.getText());
                char operation = cbOperations.getSelectedItem().toString().charAt(0);
                switch (operation) {
                    case '+':
                        lblResult.setText(Integer.toString(num1+num2));
                        break;
                    case '-':
                        lblResult.setText(Integer.toString(num1-num2));
                        break;
                    case '*':
                        lblResult.setText(Integer.toString(num1*num2));
                        break;
                    case '/':
                        lblResult.setText(Integer.toString(num1/num2));
                        break;
                }
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalculator app = new SimpleCalculator();
        app.setContentPane(app.MainPanel);
        app.setSize(500,200);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
