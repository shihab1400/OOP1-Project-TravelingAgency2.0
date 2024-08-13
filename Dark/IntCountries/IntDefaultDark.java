package Dark.IntCountries;
import Dark.DefaultFrameDark;
import Dark.PaymentDark;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class IntDefaultDark extends DefaultFrameDark {
    public ButtonGroup radioButtonGroup;
    public JRadioButton pack1, pack2, pack3;
    public int selected = 0;

    IntDefaultDark() {
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 30);
        f2 = new Font("Segoe UI Semibold", Font.BOLD, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 25);
        f4 = new Font("Segoe UI", Font.PLAIN, 20);
        f5 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -60, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Title
        label1 = new JLabel();
        label1.setBounds(430, 35, 600, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        label2 = new JLabel();
        label2.setText("Select One : ");
        label2.setBounds(430, 70, 500, 50);
        label2.setForeground(Color.decode("#99F2FA"));
        label2.setFont(f1);
        c.add(label2);

        // Pack 1 Details
        pack1 = new JRadioButton("Pack 1");
        pack1.setBounds(430, 120, 100, 50);
        pack1.setFont(f3);
        pack1.setForeground(Color.decode("#99F2FA"));
        pack1.setBackground(Color.decode("#222831"));
        pack1.setCursor(cursor);
        c.add(pack1);

        label3 = new JLabel();
        label3.setText("* First Class");
        label3.setBounds(430, 150, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 5 Star Hotel");
        label3.setBounds(430, 180, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(430, 210, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 5 Persons");
        label3.setBounds(430, 240, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 6 Days");
        label3.setBounds(430, 270, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $3000");
        label3.setBounds(430, 300, 520, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        // Pack 2 Details
        pack2 = new JRadioButton("Pack 2");
        pack2.setBounds(610, 120, 100, 50);
        pack2.setFont(f3);
        pack2.setForeground(Color.decode("#99F2FA"));
        pack2.setBackground(Color.decode("#222831"));
        pack2.setCursor(cursor);
        c.add(pack2);

        label3 = new JLabel();
        label3.setText("* Second Class");
        label3.setBounds(610, 150, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 3 Star Hotel");
        label3.setBounds(610, 180, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(610, 210, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Persons");
        label3.setBounds(610, 240, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Days");
        label3.setBounds(610, 270, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1500");
        label3.setBounds(610, 300, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        // Pack 3 Details
        pack3 = new JRadioButton("Pack 3");
        pack3.setBounds(790, 120, 500, 50);
        pack3.setFont(f3);
        pack3.setForeground(Color.decode("#99F2FA"));
        pack3.setBackground(Color.decode("#222831"));
        pack3.setCursor(cursor);
        c.add(pack3);

        label3 = new JLabel();
        label3.setText("* Third Class");
        label3.setBounds(790, 150, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 2 Star Hotel");
        label3.setBounds(790, 180, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* By Airplane");
        label3.setBounds(790, 210, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 4 Persons");
        label3.setBounds(790, 240, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* 3 Days");
        label3.setBounds(790, 270, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        label3 = new JLabel();
        label3.setText("* Cost : $1000");
        label3.setBounds(790, 300, 500, 50);
        label3.setForeground(Color.decode("#99F2FA"));
        label3.setFont(f4);
        c.add(label3);

        // To group the radio buttons.
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(pack1);
        radioButtonGroup.add(pack2);
        radioButtonGroup.add(pack3);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(148, 375, 215, 50);
        btn1.setFont(f5);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(384, 375, 215, 50);
        btn2.setFont(f5);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Pay");
        btn3.setBounds(617, 375, 215, 50);
        btn3.setFont(f5);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#2D3250"));
        btn3.setFocusable(false);
        c.add(btn3);

        Handler handler = new Handler();
        pack1.addActionListener(handler);
        pack2.addActionListener(handler);
        pack3.addActionListener(handler);

        // Action Listener for JButtons
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
                IntCountriesDark frame = new IntCountriesDark();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (selected == 0) {
                    JOptionPane.showMessageDialog(null, "You did not select any packs.", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    setVisible(false);
                    PaymentDark frame = new PaymentDark();
                    frame.setVisible(true);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == pack1) {
                selected = 1;
            } else if (e.getSource() == pack2) {
                selected = 2;
            } else if (e.getSource() == pack3) {
                selected = 3;
            }
        }
    }
}

