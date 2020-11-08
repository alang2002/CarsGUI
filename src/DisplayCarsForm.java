import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class DisplayCarsForm {
    private JPanel root;
    private JList carsList;
    private JButton returnButton;

    public DisplayCarsForm(List<Car> carArrayList) {
        JFrame frame = new JFrame("Display Cars Form");
        frame.setContentPane(root);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        String[] carArr;
        ArrayList<String> carToStringArrayList = new ArrayList<String>();
        for (Car car: carArrayList) {
            String carToString = car.toString();
            carToStringArrayList.add(carToString);
        }
        carArr = carToStringArrayList.toArray(new String[0]);
        carsList.setListData(carArr);

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                CarForm.mainFrame.setVisible(true);
            }
        });
    }
}
