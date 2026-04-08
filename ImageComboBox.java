import javax.swing.*;
import java.awt.event.*;

public class ImageComboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("Image Viewer");

        String[] images = {"img1.jpg", "img2.jpg", "img3.jpg"};
        JComboBox<String> cb = new JComboBox<>(images);
        JLabel label = new JLabel();

        cb.addActionListener(e -> {
            String img = (String) cb.getSelectedItem();
            label.setIcon(new ImageIcon(img));
        });

        f.setLayout(null);
        cb.setBounds(100, 50, 150, 30);
        label.setBounds(100, 100, 200, 150);

        f.add(cb); f.add(label);
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}