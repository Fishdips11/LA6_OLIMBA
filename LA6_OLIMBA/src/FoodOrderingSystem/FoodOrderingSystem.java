package FoodOrderingSystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderingSystem extends JFrame{
    private JPanel MainPanel;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rbNone;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JButton btnOrder;
    private JLabel Food;
    private JRadioButton[] radioButtons = {rbNone, rb5, rb10, rb15};

    public FoodOrderingSystem() {
        setTitle("Food Ordering System");
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sum = 0;
                if(cPizza.isSelected()) sum+=100;
                if(cBurger.isSelected()) sum+=80;
                if(cFries.isSelected()) sum+=65;
                if(cSoftDrinks.isSelected()) sum+=55;
                if(cTea.isSelected()) sum+=50;
                if(cSundae.isSelected()) sum+=40;


                double discount = 0.0;
                if(rbNone.isSelected()) discount = 0.0;
                else if(rb5.isSelected()) discount = 0.05;
                else if(rb10.isSelected()) discount = 0.10;
                else if(rb15.isSelected()) discount = 0.15;


                double price = sum - (sum * discount);
                String amount = String.format("%.2f", price);

                JOptionPane.showMessageDialog(MainPanel, "The total price is Php " + amount);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.MainPanel);
        app.setSize(600,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public JRadioButton[] getRadioButtons() {
        return radioButtons;
    }

    public void setRadioButtons(JRadioButton[] radioButtons) {
        this.radioButtons = radioButtons;
    }
}
