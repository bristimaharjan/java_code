package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.awt.BorderLayout.NORTH;

public class Calculator extends JFrame implements ActionListener {

    // Components
     JTextField displayField;
     JPanel buttonPanel;
     JButton[] numberButtons = new JButton[10];
     JButton add, sub, mul, div, equal, clear;
     String operator = " ";
     double num1 = 0, num2 = 0, result = 0;

    public Calculator() {

        setTitle("Calculator");

        setLayout(new BorderLayout());

        // Create the display field
        displayField = new JTextField(20);
        displayField.setEditable(false);
        add(displayField, NORTH);

        // Create the button panel with GridLayout (4x4)
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

        // Create number buttons (0-9)
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            buttonPanel.add(numberButtons[i]);
        }

        // Create operation buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        equal = new JButton("=");
        clear = new JButton("C");

        // Add ActionListeners to operation buttons
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);

        // Add operation buttons to panel
        buttonPanel.add(add);
        buttonPanel.add(sub);
        buttonPanel.add(mul);
        buttonPanel.add(div);
        buttonPanel.add(equal);
        buttonPanel.add(clear);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Set the frame visibility
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button clicks
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                displayField.setText(displayField.getText().concat(String.valueOf(i)));
            }
        }

        if (e.getSource() == add) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "+";
            displayField.setText("");
        }

        if (e.getSource() == sub) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "-";
            displayField.setText("");
        }

        if (e.getSource() == mul) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "*";
            displayField.setText("");
        }

        if (e.getSource() == div) {
            num1 = Double.parseDouble(displayField.getText());
            operator = "/";
            displayField.setText("");
        }

        if (e.getSource() == equal) {
            num2 = Double.parseDouble(displayField.getText());

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
            }
            displayField.setText(String.valueOf(result));
            num1 = result;
        }

        if (e.getSource() == clear) {
            displayField.setText("");
        }
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
