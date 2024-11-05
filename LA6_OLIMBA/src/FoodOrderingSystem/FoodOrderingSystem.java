package FoodOrderingSystem;

import javax.swing.*;

public class FoodOrderingSystem extends JFrame{
    private JPanel MainPanel;
    private JCheckBox Pizza;
    private JCheckBox Burger;
    private JCheckBox Fries;
    private JCheckBox SoftDrinks;
    private JCheckBox Tea;
    private JCheckBox Sundae;
    private JRadioButton noneRadioButton;
    private JRadioButton a5OffRadioButton;
    private JRadioButton a10OffRadioButton;
    private JRadioButton a15OffRadioButton;
    private JButton btnOrder;
    private JLabel Food;

    public static void main(String[] args) {
        FoodOrderingSystem app = new FoodOrderingSystem();
        app.setContentPane(app.MainPanel);
        app.setSize(400,500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
