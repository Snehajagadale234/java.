import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorChanger {
    public static void main(String[] args) {
        JFrame f = new JFrame("Color Changer");

        String[] colors = {"Red", "Green", "Blue"};
        JComboBox<String> cb = new JComboBox<>(colors);

        cb.addActionListener(e -> {
            String color = (String) cb.getSelectedItem();

            switch (color) {
                case "Red": f.getContentPane().setBackground(Color.RED); break;
                case "Green": f.getContentPane().setBackground(Color.GREEN); break;
                case "Blue": f.getContentPane().setBackground(Color.BLUE); break;
            }
        });

        f.setLayout(new FlowLayout());
        f.add(cb);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}