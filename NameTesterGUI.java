import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NameTesterGUI extends JFrame implements ActionListener {

    private JTextField textField;

    public NameTesterGUI() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(2, 1));

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());

        JLabel label = new JLabel("Enter your name here:");
        textField = new JTextField();

        topPanel.add(label, BorderLayout.WEST);
        topPanel.add(textField, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());

        JButton testButton = new JButton("Test");
        JButton clearButton = new JButton("Clear");

        testButton.addActionListener(this);
        clearButton.addActionListener(this);

        bottomPanel.add(testButton);
        bottomPanel.add(clearButton);

        contentPane.add(topPanel);
        contentPane.add(bottomPanel);

        setTitle("Name Tester");
        setSize(350, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Test")) {
            textField.setText("A Very Good Name");
        } else {
            textField.setText("");
        }
    }

    public static void main(String[] args) {
        new NameTesterGUI();
    }
}
