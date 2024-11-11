package GUI;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {

    // Declare components
    private JLabel lblStudentID, lblStudentName, lblPhoneNumber, lblDepartment, lblCity, lblEmailAddress, lblFatherName, lblAddress, lblErrorMessage;
    private JTextField txtStudentID, txtStudentName, txtPhoneNumber, txtDepartment, txtCity, txtEmailAddress, txtFatherName, txtAddress;
    private JButton btnSubmit, btnClear;

    // Constructor to setup the GUI
    public RegistrationForm() {
        // Frame settings
        setTitle("Registration Form");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Initialize components
        lblStudentID = new JLabel("Student ID:");
        lblStudentName = new JLabel("Student Name:");
        lblPhoneNumber = new JLabel("Phone Number:");
        lblDepartment = new JLabel("Department:");
        lblCity = new JLabel("City:");
        lblEmailAddress = new JLabel("Email Address:");
        lblFatherName = new JLabel("Father Name:");
        lblAddress = new JLabel("Address:");

        // Error message label
        lblErrorMessage = new JLabel("");
        lblErrorMessage.setForeground(Color.RED);  // Error messages in red

        txtStudentID = new JTextField(15);
        txtStudentName = new JTextField(15);
        txtPhoneNumber = new JTextField(15);
        txtDepartment = new JTextField(15);
        txtCity = new JTextField(15);
        txtEmailAddress = new JTextField(15);
        txtFatherName = new JTextField(15);
        txtAddress = new JTextField(15);

        btnSubmit = new JButton("Submit");
        btnClear = new JButton("Clear");

        // Panel to hold the components using GridLayout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(10, 2, 10, 10));  // 10 rows, 2 columns

        panel.add(lblStudentID);
        panel.add(txtStudentID);
        panel.add(lblStudentName);
        panel.add(txtStudentName);
        panel.add(lblPhoneNumber);
        panel.add(txtPhoneNumber);
        panel.add(lblDepartment);
        panel.add(txtDepartment);
        panel.add(lblCity);
        panel.add(txtCity);
        panel.add(lblEmailAddress);
        panel.add(txtEmailAddress);
        panel.add(lblFatherName);
        panel.add(txtFatherName);
        panel.add(lblAddress);
        panel.add(txtAddress);
        panel.add(btnSubmit);
        panel.add(btnClear);
        panel.add(new JLabel());  // Empty space for layout
        panel.add(lblErrorMessage);  // Error message label at the bottom

        // Adding panel to the frame
        add(panel);

        // Action listener for the submit button to validate the form
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String studentName = txtStudentName.getText();
                String phoneNumber = txtPhoneNumber.getText();

                // Clear error message
                lblErrorMessage.setText("");

                // Validate Student Name (not empty)
                if (studentName.isEmpty()) {
                    lblErrorMessage.setText("ERROR!!Student Name is required!");
                    return;  // Stop further execution if validation fails
                }

                // Validate Phone Number (numeric and length check)
                if (phoneNumber.isEmpty() || !phoneNumber.matches("\\d{10}")) {
                    lblErrorMessage.setText(" ERROR!!!Enter a valid 10-digit phone number!");
                    return;
                }

                // If all validations pass
                lblErrorMessage.setText("Form submitted successfully!");
            }
        });

        // Action listener for the clear button to reset the form
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Use setText() to clear all fields
                txtStudentID.setText("");
                txtStudentName.setText("");
                txtPhoneNumber.setText("");
                txtDepartment.setText("");
                txtCity.setText("");
                txtEmailAddress.setText("");
                txtFatherName.setText("");
                txtAddress.setText("");

                // Clear error message as well
                lblErrorMessage.setText("");
            }
        });

        setVisible(true);
    }

    // Main method to run the form
    public static void main(String[] args) {
        new RegistrationForm();
    }
}
