import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Jen on 10/18/2015.
 */
public class CelciusConverterGUI {
    private JTextField tempTextField;
    private JButton convertButton;
    private JLabel celciusLabel;
    private JLabel fahrenheitLabel;
    private JPanel converterForm;

    public static void main(String[] args) {
        JFrame frame = new JFrame("CelciusConverterGUI");
        frame.setContentPane(new CelciusConverterGUI().converterForm);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CelciusConverterGUI() {
        convertButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int tempFahr = (int)((Double.parseDouble(tempTextField.getText())) * 1.8 + 32);
                fahrenheitLabel.setText(tempFahr + " Fahrenheit");
            }
        });
    }
}
