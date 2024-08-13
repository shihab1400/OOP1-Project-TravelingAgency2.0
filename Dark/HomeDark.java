package Dark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HomeDark extends DefaultFrameDark {

    HomeDark() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -50, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Tahoma", Font.BOLD, 40);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Travel for your");
        label1.setBounds(420, 25, 500, 65);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Inner Peace :)");
        label1.setBounds(420, 80, 500, 65);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);


        // JButtons
        btn1 = new JButton("Login");
        btn1.setBounds(418, 160, 170, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Register");
        btn2.setBounds(620, 160, 170, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Admin Login");
        btn3.setBounds(418, 235, 372, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#2D3250"));
        btn3.setFocusable(false);
        c.add(btn3);

        btn4 = new JButton("Back");
        btn4.setBounds(418, 310, 170, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.decode("#99F2FA"));
        btn4.setBackground(Color.decode("#2D3250"));
        btn4.setFocusable(false);
        c.add(btn4);

        btn5 = new JButton("Exit");
        btn5.setBounds(620, 310, 170, 50);
        btn5.setFont(f2);
        btn5.setCursor(cursor);
        btn5.setForeground(Color.decode("#99F2FA"));
        btn5.setBackground(Color.decode("#C00000"));
        btn5.setFocusable(false);
        c.add(btn5);


        // Login
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                LoginDark frame = new LoginDark();
                frame.setVisible(true);
            }
        });

        // Register
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                RegistrationDark frame = new RegistrationDark();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Admin Login
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminLoginDark frame = new AdminLoginDark();
                frame.setVisible(true);
            }
        });

        // Back
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                WelcomeDark frame = new WelcomeDark();
                frame.setVisible(true);
            }
        });

        // Exit
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {

        HomeDark frame = new HomeDark();
        frame.setVisible(true);
    }
}

