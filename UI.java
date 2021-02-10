import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;

public class UI implements ActionListener {

    private int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    public UI() {
        frame = new JFrame();

        JButton button = new JButton("E we, picame");
        button.addActionListener(this);

        label = new JLabel("Clicks");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(50, 50, 10, 50));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("title");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new UI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Número de clicks " + count);
    }
}