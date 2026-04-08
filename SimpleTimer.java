import javax.swing.*;
import java.awt.event.*;

public class SimpleTimer {
    int count = 0;
    Timer timer;

    public SimpleTimer() {
        JFrame f = new JFrame("Timer");
        JLabel label = new JLabel("0", JLabel.CENTER);
        JButton start = new JButton("Start");
        JButton stop = new JButton("Stop");

        timer = new Timer(1000, e -> {
            count++;
            label.setText("" + count);
        });

        start.addActionListener(e -> timer.start());
        stop.addActionListener(e -> timer.stop());

        f.setLayout(null);
        label.setBounds(150, 50, 100, 30);
        start.setBounds(100, 100, 80, 30);
        stop.setBounds(200, 100, 80, 30);

        f.add(label); f.add(start); f.add(stop);
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleTimer();
    }
}