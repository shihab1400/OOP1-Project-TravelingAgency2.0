package Dark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PaymentDark extends DefaultFrameDark {
    private ImageIcon img1, img2;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;

    public PaymentDark() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);


        img1 = new ImageIcon(getClass().getResource("/images/VisaCard.png"));
        imgLabel = new JLabel(img1);
        imgLabel.setBounds(620, 90, img1.getIconWidth(), img1.getIconHeight());
        c.add(imgLabel);

        img2 = new ImageIcon(getClass().getResource("/images/MasterCard.png"));
        imgLabel = new JLabel(img2);
        imgLabel.setBounds(705, 90, img2.getIconWidth(), img2.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);
        f4 = new Font("Segoe UI", Font.PLAIN, 15);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 15);
        f6 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Complete Your Payment");
        label1.setBounds(400, 20, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel("We Accept Only");
        label2.setBounds(420, 85, 500, 50);
        label2.setForeground(Color.decode("#99F2FA"));
        label2.setFont(f2);
        c.add(label2);

        label2 = new JLabel("Card Details");
        label2.setBounds(420, 140, 500, 50);
        label2.setForeground(Color.decode("#99F2FA"));
        label2.setFont(f2);
        c.add(label2);

        // Name On Card
        label3 = new JLabel("Name On Card");
        label3.setBounds(430, 180, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f3);
        c.add(label3);

        tf1 = new JTextField();
        tf1.setBounds(570, 190, 235, 30);
        tf1.setFont(f4);
        tf1.setForeground(Color.decode("#99F2FA"));
        tf1.setBackground(Color.decode("#2D3250"));
        tf1.setCaretColor(Color.decode("#99F2FA"));
        c.add(tf1);

        // Card Number
        label3 = new JLabel("Card Number");
        label3.setBounds(430, 220, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f3);
        c.add(label3);

        tf2 = new JTextField();
        tf2.setBounds(570, 230, 235, 30);
        tf2.setFont(f4);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        tf2.setForeground(Color.decode("#99F2FA"));
        tf2.setBackground(Color.decode("#2D3250"));
        tf2.setCaretColor(Color.decode("#99F2FA"));
        c.add(tf2);

        // Valid On
        label3 = new JLabel("Valid On");
        label3.setBounds(430, 260, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f3);
        c.add(label3);

        tf3 = new JTextField();
        tf3.setBounds(520, 270, 90, 30);
        tf3.setFont(f4);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        tf3.setForeground(Color.decode("#99F2FA"));
        tf3.setBackground(Color.decode("#2D3250"));
        tf3.setCaretColor(Color.decode("#99F2FA"));
        c.add(tf3);

        // CVV Code
        label3 = new JLabel("CVV Code");
        label3.setBounds(620, 260, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f3);
        c.add(label3);

        pf = new JPasswordField();
        pf.setBounds(725, 270, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
        pf.setEchoChar('*');
        pf.setFont(f5);
        pf.setForeground(Color.decode("#99F2FA"));
        pf.setBackground(Color.decode("#2D3250"));
        pf.setCaretColor(Color.decode("#99F2FA"));
        c.add(pf);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(75, 325, 190, 50);
        btn1.setFont(f6);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(300, 325, 190, 50);
        btn2.setFont(f6);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Confirm Payment");
        btn3.setBounds(524, 325, 300, 50);
        btn3.setFont(f6);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#2D3250"));
        btn3.setFocusable(false);
        c.add(btn3);

        // To limit characters
        tf1.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf1.getText().length() >= 10 )
                    e.consume();
            }
        });

        tf2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf2.getText().length() >= 19 )
                    e.consume();
            }
        });

        tf3.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (tf3.getText().length() >= 7 )
                    e.consume();
            }
        });

        pf.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (pf.getText().length() >= 3 )
                    e.consume();
            }
        });

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                PacksDark frame = new PacksDark();
                frame.setVisible(true);
            }
        });

        // Confirm Payment Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String nameOnCard = tf1.getText();
                String cardNumber = tf2.getText();
                String validOn = tf3.getText();
                String cvvCode = pf.getText();

                if (nameOnCard.isEmpty() || cardNumber.isEmpty() || validOn.isEmpty() || cvvCode.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaySuccessDark frame = new PaySuccessDark();
                    frame.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args) {

        PaymentDark frame = new PaymentDark();
        frame.setVisible(true);
    }
}

