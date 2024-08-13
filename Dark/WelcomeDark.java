package Dark;
import Light.Welcome;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeDark extends DefaultFrameDark {
    public WelcomeDark() {

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 20);
        f2 = new Font("Segoe UI Black", Font.BOLD, 42);

        // Label
        label1 = new JLabel("Welcome to Wanderlust Adventures!");
        label1.setBounds(40, 10, 850, 70);
        label1.setFont(f2);
        label1.setForeground(Color.decode("#99F2FA"));
        c.add(label1);

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-10, -10, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // JButtons
        btn1 = new JButton("Contribution");
        btn1.setBounds(460, 160, 170, 60);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Next");
        btn2.setBounds(660, 160, 170, 60);
        btn2.setFont(f1);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Light Mode");
        btn3.setBounds(460, 245, 170, 60);
        btn3.setFont(f1);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#2D3250"));
        btn3.setFocusable(false);
        c.add(btn3);

        btn4 = new JButton("Exit");
        btn4.setBounds(660, 245, 170, 60);
        btn4.setFont(f1);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.decode("#99F2FA"));
        btn4.setBackground(Color.decode("#C00000"));
        btn4.setFocusable(false);
        c.add(btn4);

        // Action Listener for JButtons
        // Contribution Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                ContributionDark frame = new ContributionDark();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                HomeDark frame = new HomeDark();
                frame.setVisible(true);
            }
        });

        // Dark Mode Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                JOptionPane.showMessageDialog(null, "Switching to Light Mode!", "Warning!",
                        JOptionPane.WARNING_MESSAGE);
                setVisible(false);
                Welcome frame = new Welcome();
                frame.setVisible(true);
            }
        });

        // Exit Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {

        WelcomeDark frame = new WelcomeDark();
        frame.setVisible(true);
    }
}

