package LeapYearChecker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYear extends JFrame{
    private JPanel MainPanel;
    private JTextField yearTextField;
    private JButton CheckYearButton;

    public LeapYear() {
        setTitle("Leap Year Checker");
        CheckYearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int year = Integer.parseInt(yearTextField.getText());
                    if (year % 4 == 0) {
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                JOptionPane.showInternalMessageDialog(null, "Leap Year");
                            } else {
                                JOptionPane.showInternalMessageDialog(null, "Not a leap year");
                            }
                        } else {
                            JOptionPane.showInternalMessageDialog(null, "Leap Year");
                        }
                    } else {
                        JOptionPane.showInternalMessageDialog(null, "Not a leap year");
                    }
            }
        });
    }

    public static void main(String[] args) {
        LeapYear app = new LeapYear();
        app.setContentPane(app.MainPanel);
        app.setSize(300,150);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
