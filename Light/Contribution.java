package Light;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Contribution extends DefaultFrame {

    Contribution() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(565, 720);
        this.setLocationRelativeTo(null);

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/contributionBNew.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(45, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // JButtons
        btn1 = new JButton("OK");
        btn1.setBounds(175, 610, 180, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        btn1.setFocusable(false);
        c.add(btn1);

        // Action Listener for JButtons
        // OK Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });
    }

    public static void main(String[] args) {

        Contribution frame = new Contribution();
        frame.setVisible(true);
    }
}

