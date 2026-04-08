import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StationaryPurchaseSystem extends JFrame implements ActionListener {

    JCheckBox notebook, pen, pencil;
    JButton orderBtn;
    int total = 0;

    public StationaryPurchaseSystem() {
        setTitle("Stationary Purchase System");
        setSize(300, 250);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        notebook = new JCheckBox("Notebook @ 50");
        notebook.setBounds(50, 30, 150, 20);

        pen = new JCheckBox("Pen @ 30");
        pen.setBounds(50, 60, 150, 20);

        pencil = new JCheckBox("Pencil @ 10");
        pencil.setBounds(50, 90, 150, 20);

        orderBtn = new JButton("Order");
        orderBtn.setBounds(90, 130, 100, 30);

        add(notebook);
        add(pen);
        add(pencil);
        add(orderBtn);

        orderBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        total = 0;
        String message = "";

        if (notebook.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Notebook:");
            int q = Integer.parseInt(qty);
            int cost = q * 50;
            total += cost;
            message += "Notebook Quantity: " + q + "\n";
        }

        if (pen.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Pen:");
            int q = Integer.parseInt(qty);
            int cost = q * 30;
            total += cost;
            message += "Pen Quantity: " + q + "\n";
        }

        if (pencil.isSelected()) {
            String qty = JOptionPane.showInputDialog("Enter Quantity for Pencil:");
            int q = Integer.parseInt(qty);
            int cost = q * 10;
            total += cost;
            message += "Pencil Quantity: " + q + "\n";
        }

        if (total > 0) {
            message += "Total: " + total;
            JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(this, "Successfully Ordered", "Alert", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No item selected!");
        }
    }

    public static void main(String[] args) {
        new StationaryPurchaseSystem();
    }
}