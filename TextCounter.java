import javax.swing.*;
import java.awt.event.*;

public class TextCounter {
    public static void main(String[] args) {
        JFrame f = new JFrame("Text Counter");

        JTextArea area = new JTextArea();
        JLabel label = new JLabel("Chars: 0 Words: 0");

        area.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = area.getText();
                int chars = text.length();
                int words = text.trim().isEmpty() ? 0 : text.trim().split("\\s+").length;

                label.setText("Chars: " + chars + " Words: " + words);
            }
        });

        f.setLayout(null);
        area.setBounds(50, 50, 300, 150);
        label.setBounds(50, 220, 200, 30);

        f.add(area); f.add(label);
        f.setSize(400, 350);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}