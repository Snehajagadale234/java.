import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton male, female;
    JButton submit;
    JLabel result;
    ButtonGroup bg;

    RadioButtonDemo() {
        // Create radio buttons
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        // Set positions
        male.setBounds(100, 50, 100, 30);
        female.setBounds(100, 90, 100, 30);

        // Group radio buttons
        bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        // Create button
        submit = new JButton("Submit");
        submit.setBounds(100, 130, 100, 30);

        // Label to show result
        result = new JLabel();
        result.setBounds(100, 170, 200, 30);

        // Add action listener
        submit.addActionListener(this);

        // Add components to frame
        add(male);
        add(female);
        add(submit);
        add(result);

        // Frame settings
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (male.isSelected()) {
            result.setText("Selected: Male");
        } else if (female.isSelected()) {
            result.setText("Selected: Female");
        } else {
            result.setText("Please select an option");
        }
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}