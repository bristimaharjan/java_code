package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends JFrame {
    Gui() {
        // Set GridLayout for the frame (3 rows, 2 columns)
        setLayout(new GridLayout(3, 2, 2, 2));

        // Create text fields and button
        JTextField t1 = new JTextField(15);
        JTextField t2 = new JTextField(15);
        JTextField t3 = new JTextField(15);
        JButton b1 = new JButton("Addition");

        // Add components directly to the frame
        add(new JLabel("Input 1:"));
        add(t1);
        add(new JLabel("Input 2:"));
        add(t2);
        add(b1);
        add(t3);

        // Add action listener for the button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(num));
            }
        });

        // Frame settings
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Gui();
    }
}
