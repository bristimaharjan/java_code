package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class SetColor extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField tf1;
    JButton btn1;

    SetColor() {
        // Set GridLayout with 4 rows and 1 column
        setLayout(new GridLayout(4, 1, 10, 10));  // 4 rows, 1 column, 10px gap between components

        l1 = new JLabel("Enter a color name:");
        add(l1);

        tf1 = new JTextField();
        add(tf1);

        btn1 = new JButton("Click");
        add(btn1);
        btn1.addActionListener(this);

        l2 = new JLabel();
        add(l2);

        setSize(400, 200);  // Adjusted size for better fit
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SetColor();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String colorName = tf1.getText().toLowerCase();
        try {
            // Use reflection to convert color name to actual Color object
            Field field = Class.forName("java.awt.Color").getField(colorName);
            Color color = (Color) field.get(null);

            // Set the text color in the JTextField to the selected color
            tf1.setForeground(color);
            l2.setText("Text color changed to " + colorName);
        } catch (Exception ex) {
            // If color name is invalid, show error message
            l2.setText("Invalid color. Try again.");
            tf1.setForeground(Color.BLACK);
        }
    }
}

