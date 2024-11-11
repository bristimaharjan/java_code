package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    // Declare components outside the constructor
    private JLabel userLabel, passLabel;
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;

    // Constructor to setup the GUI
    public LoginForm() {
        // Frame settings
        setTitle("Login Form");
        setSize(350, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocationRelativeTo(null);


        setLayout(new GridLayout(3, 2));

        userLabel = new JLabel("Username*:");
        passLabel = new JLabel("Password*:");
        userField = new JTextField(15);
        passField = new JPasswordField(15);
        loginButton = new JButton("Submit");

        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel());  // Empty label for alignment
        add(loginButton);

        // Action listener for the submit button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                // Check if the required fields (with *) are empty
                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all required fields marked with *", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Proceed with form submission or process further logic
                    JOptionPane.showMessageDialog(null, "Form submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    // Main method to run the form
    public static void main(String[] args) {
        new LoginForm();
    }
}





