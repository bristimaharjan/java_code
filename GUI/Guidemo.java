package GUI;
import javax.swing.*;

public class Guidemo extends JFrame {
    Guidemo() {
        setLayout(null);


        JLabel l7 = new JLabel("Account Type*");
        l7.setBounds(20, 20, 100, 25);
        add(l7);

        JRadioButton r1 = new JRadioButton("Personal Account");
        r1.setBounds(140, 20, 150, 25);
        r1.setSelected(true);
        add(r1);

        JRadioButton r2 = new JRadioButton("Business Account");
        r2.setBounds(300, 20, 150, 25);
        add(r2);

        ButtonGroup account = new ButtonGroup();
        account.add(r1);
        account.add(r2);


        JLabel l1 = new JLabel("First Name *");
        l1.setBounds(20, 60, 100, 25);
        add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(140, 60, 200, 25);
        add(t1);


        JLabel l2 = new JLabel("Last Name *");
        l2.setBounds(20, 100, 100, 25);
        add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(140, 100, 200, 25);
        add(t2);

        // Country/Region
        JLabel l5 = new JLabel("Country/Region *");
        l5.setBounds(20, 140, 100, 25);
        add(l5);

        String[] country = {"United States", "Nepal", "India", "China", "UK", "Japan"};
        JComboBox<String> cob = new JComboBox<>(country);
        cob.setBounds(140, 140, 200, 25);
        add(cob);


        JLabel l3 = new JLabel("Street Address *");
        l3.setBounds(20, 180, 100, 25);
        add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(140, 180, 200, 25);
        add(t3);


        JLabel l4 = new JLabel("Street Address 2");
        l4.setBounds(20, 220, 100, 25);
        add(l4);

        JTextField t4 = new JTextField();
        t4.setBounds(140, 220, 200, 25);
        add(t4);

        JLabel l6 = new JLabel("City *");
        l6.setBounds(20, 260, 100, 25);
        add(l6);

        JTextField t6 = new JTextField();
        t6.setBounds(140, 260, 200, 25);
        add(t6);


        JLabel s1 = new JLabel("State/Province *");
        s1.setBounds(20, 300, 100, 25);
        add(s1);

        String[] state = {"Select State or Province", "Bagmati", "Gandaki", "Mechi", "Mahakali", "Koshi", "Janakpur"};
        JComboBox<String> st = new JComboBox<>(state);
        st.setBounds(140, 300, 200, 25);
        add(st);


        JLabel l8 = new JLabel("ZIP/Postal Code *");
        l8.setBounds(20, 340, 100, 25);
        add(l8);

        JTextArea t8 = new JTextArea();
        t8.setBounds(140, 340, 200, 50); // TextArea with a larger height
        add(t8);


        JLabel l9 = new JLabel("Phone Number *");
        l9.setBounds(20, 400, 100, 25);
        add(l9);

        JTextField t9 = new JTextField();
        t9.setBounds(140, 400, 200, 25);
        add(t9);



        setTitle("Required field(*)");
        setSize(450, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Guidemo();
    }
}
