import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrder extends JFrame {
    private JPanel jpanel;
    private JButton btnOrder;
    private JCheckBox cbPizza;
    private JCheckBox cbBurger;
    private JCheckBox cbFries;
    private JCheckBox cbSoftdrinks;
    private JCheckBox cbTea;
    private JCheckBox cbSundae;
    private JRadioButton rbNone;
    private JRadioButton rbFive;
    private JRadioButton rbTen;
    private JRadioButton rbFifteen;
    private JLabel LblFood;
    private JLabel LblDiscounts;
    private JLabel LblPizzaPrice;
    private JLabel LblBurgerPrice;
    private JLabel LblFriesPrice;
    private JLabel LblSoftDrinkPrice;
    private JLabel LblTeaPrice;
    private JLabel LblSundaePrice;
    public FoodOrder() {
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float price = 0;

                if(cbPizza.isSelected()){
                    price += 100.0;
                }
                if(cbBurger.isSelected()){
                    price += 80.0;
                }
                if(cbFries.isSelected()){
                    price += 65.0;
                }
                if(cbSoftdrinks.isSelected()){
                    price += 55.0;
                }
                if(cbTea.isSelected()){
                    price += 50.0;
                }
                if(cbSundae.isSelected()){
                    price += 40.0;
                }

                if(rbFive.isSelected()){
                    price *= 0.95;
                }else if (rbTen.isSelected()){
                    price *= 0.90;
                } else if(rbFifteen.isSelected()){
                    price *= 0.85;
                }

                JOptionPane.showMessageDialog(jpanel, "The total price is Php " + price);
            }
        });
    }

    public static void main(String[] args) {
        FoodOrder app = new FoodOrder();
        app.setContentPane(app.jpanel);
        app.setSize(1000, 600);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setTitle("Leap Year Checker");
        app.setVisible(true);
    }
}
