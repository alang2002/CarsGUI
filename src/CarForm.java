import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CarForm {
    public static JFrame mainFrame;
    public static CarEntryForm carEntryForm;
    public static DisplayCarsForm displayCarsForm;
    private JPanel root;
    private JButton addEntryButton;
    private JButton displayEntriesButton;
    public static List<Car> carArrayList = new ArrayList<Car>();

    public CarForm() {
        addEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carEntryForm = new CarEntryForm(carArrayList);
                mainFrame.setVisible(false);
            }
        });
        displayEntriesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayCarsForm = new DisplayCarsForm(carArrayList);
                mainFrame.setVisible(false);
            }
        });
    }

    public static void main(String[] args) {
        mainFrame = new JFrame("Main Menu");
        mainFrame.setContentPane(new CarForm().root);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.pack();
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);
    }
}
