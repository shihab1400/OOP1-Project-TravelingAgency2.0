package Light;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaySuccess extends DefaultFrame {

    PaySuccess() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoBright.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -40, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Your Payment Has");
        label1.setBounds(430, 80, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Successfully Completed.");
        label1.setBounds(430, 130, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Happy Travel :)");
        label1.setBounds(430, 180, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        btn1 = new JButton("Feedback");
        btn1.setBounds(430, 290, 180, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Finish");
        btn2.setBounds(650, 290, 180, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Feedback frame = new Feedback();
                frame.setVisible(true);
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        PaySuccess frame = new PaySuccess();
        frame.setVisible(true);
    }
}

