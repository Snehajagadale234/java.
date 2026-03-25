import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI extends JFrame implements ActionListener {

    private JTextField txtCounter;
    private JButton btnUp, btnDown, btnReset;
    private int count = 0;

    public CounterGUI() {

        setTitle("Counter");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Label
        JLabel lbl = new JLabel("Counter");

        // Text Field
        txtCounter = new JTextField("0", 10);
        txtCounter.setEditable(false);

        // Buttons
        btnUp = new JButton("Count Up");
        btnDown = new JButton("Count Down");
        btnReset = new JButton("Reset");

        // Add action listeners
        btnUp.addActionListener(this);
        btnDown.addActionListener(this);
        btnReset.addActionListener(this);

        // Add components
        panel.add(lbl);
        panel.add(txtCounter);
        panel.add(btnUp);
        panel.add(btnDown);
        panel.add(btnReset);

        add(panel);
    }

    // Button actions
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnUp) {
            count++;
        } else if (e.getSource() == btnDown) {
            count--;
        } else if (e.getSource() == btnReset) {
            count = 0;
        }

        txtCounter.setText(String.valueOf(count));
    }

    public static void main(String[] args) {
        CounterGUI obj = new CounterGUI();
        obj.setVisible(true);
    }
}