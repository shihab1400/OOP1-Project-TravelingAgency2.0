package Light;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Admin extends DefaultFrame {

    Admin() {
        this.setSize(650, 700);
        this.setLocationRelativeTo(null);

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/Admin.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(127, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 60);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Admin Panel");
        label1.setBounds(123, 420, 433, 50);
        label1.setFont(f1);
        c.add(label1);

        // JButtons
        btn1 = new JButton("User Data");
        btn1.setBounds(64, 510, 195, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#2E75B6"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Admin Password");
        btn2.setBounds(285, 510, 282, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Feedbacks");
        btn3.setBounds(64, 581, 195, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        btn3.setFocusable(false);
        c.add(btn3);

        btn4 = new JButton("Back");
        btn4.setBounds(285, 581, 135, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        btn4.setFocusable(false);
        c.add(btn4);

        btn5 = new JButton("Exit");
        btn5.setBounds(433, 581, 135, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#C00000"));
        btn5.setFocusable(false);
        c.add(btn5);

        // User Data
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserData frame = new UserData();
                frame.setVisible(true);
            }
        });

        // Admin Password
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdminPassword frame = new AdminPassword();
                frame.setVisible(true);
            }
        });

        // Comment Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                ViewFeedback frame = new ViewFeedback();
                frame.setVisible(true);
            }
        });

        // Back
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

        // Exit Button
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {

        Admin frame = new Admin();
        frame.setVisible(true);
    }
}

