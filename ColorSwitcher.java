import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorSwitcher extends JFrame implements ActionListener {

    public ColorSwitcher() {
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        redButton.addActionListener(this);
        greenButton.addActionListener(this);

        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);

        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if (command.equals("Red")) {
            getContentPane().setBackground(Color.RED);
        } else if (command.equals("Green")) {
            getContentPane().setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new ColorSwitcher();
    }
}
