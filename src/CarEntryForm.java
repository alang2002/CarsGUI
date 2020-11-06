import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CarEntryForm {
    private JPanel root;
    private JTextField makeTextField;
    private JTextField modelTextField;
    private JTextField yearTextField;
    private JTextField weightTextField;
    private JPanel carInfoEntryPanel;
    private JRadioButton gasCarRadioButton;
    private JRadioButton electricCarRadioButton;
    private JRadioButton blueRadioButton;
    private JRadioButton silverRadioButton;
    private JRadioButton redRadioButton;
    private JRadioButton yellowRadioButton;
    private JRadioButton greenRadioButton;
    private JPanel radioEntryPanel;
    private JPanel sizetypeEntryPanel;
    private JTextField fuelTypeTextField;
    private JTextField batteryTypeTextField;
    private JTextField tankSizeTextField;
    private JTextField batterySizeTextField;
    private JButton submitButton;
    private JButton returnButton;
    private JPanel buttonEntryPanel;

    public CarEntryForm() {
        JFrame frame = new JFrame("Car Entry Form");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        // ItemListener to listen for radio button clicks to determine which fields to disable and enable
        ItemListener listener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getSource() == gasCarRadioButton) {
                    batterySizeTextField.setEnabled(false);
                    batterySizeTextField.setEditable(false);
                    batteryTypeTextField.setEnabled(false);
                    batteryTypeTextField.setEditable(false);
                    tankSizeTextField.setEnabled(true);
                    tankSizeTextField.setEditable(true);
                    fuelTypeTextField.setEnabled(true);
                    fuelTypeTextField.setEditable(true);
                }
                else if (e.getSource() == electricCarRadioButton) {
                    tankSizeTextField.setEnabled(false);
                    tankSizeTextField.setEditable(false);
                    fuelTypeTextField.setEnabled(false);
                    fuelTypeTextField.setEditable(false);
                    batterySizeTextField.setEnabled(true);
                    batterySizeTextField.setEditable(true);
                    batteryTypeTextField.setEnabled(true);
                    batteryTypeTextField.setEditable(true);
                }
            }
        };
        gasCarRadioButton.addItemListener(listener);
        electricCarRadioButton.addItemListener(listener);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                CarForm.mainFrame.setVisible(true);
            }
        });
    }

}
