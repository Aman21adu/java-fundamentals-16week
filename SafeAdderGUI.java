import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SafeAdderGUI extends JFrame implements ActionListener {

    private JTextField textField;
    private double sum = 0.0;

    public SafeAdderGUI() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        textField = new JTextField();
        contentPane.add(textField, BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton addButton = new JButton("Add");
        JButton resetButton = new JButton("Reset");

        addButton.addActionListener(this);
        resetButton.addActionListener(this);

        panel.add(addButton);
        panel.add(resetButton);

        contentPane.add(panel, BorderLayout.SOUTH);

        setTitle("Safe Adder");
        setSize(300, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            try {
                double value = Double.parseDouble(textField.getText());
                sum += value;
                textField.setText(String.valueOf(sum));
            } catch (NumberFormatException ex) {
                textField.setText("Invalid number");
            }
        } else {
            sum = 0.0;
            textField.setText("0.0");
        }
    }

    public static void main(String[] args) {
        new SafeAdderGUI();
    }
}
