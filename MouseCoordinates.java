import javax.swing.*;
import java.awt.event.*;

public class MouseCoordinates extends JFrame implements MouseMotionListener {
    JLabel label;

    MouseCoordinates() {
        label = new JLabel("Move mouse...");
        add(label);

        addMouseMotionListener(this);

        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("X: " + e.getX() + " Y: " + e.getY());
    }

    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseCoordinates();
    }
}