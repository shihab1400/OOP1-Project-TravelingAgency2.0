package Dark;
import Dark.DomPlaces.DomPlacesDark;
import Dark.IntCountries.IntCountriesDark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DefPackTypesDark extends DefaultFrameDark {
    private JRadioButton international, domestic;
    private ButtonGroup radioButtonGroup;
    private int defPack = 0;

    public DefPackTypesDark() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, -80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Choose Tour Type");
        label1.setBounds(460, 70, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        // International Radio Button
        international = new JRadioButton("International");
        international.setBounds(480, 140, 300, 50);
        international.setFont(f2);
        international.setCursor(cursor);
        international.setForeground(Color.decode("#99F2FA"));
        international.setBackground(Color.decode("#222831"));
        c.add(international);

        // Domestic Radio Button
        domestic = new JRadioButton("Domestic");
        domestic.setBounds(480, 200, 300, 50);
        domestic.setFont(f2);
        domestic.setCursor(cursor);
        domestic.setForeground(Color.decode("#99F2FA"));
        domestic.setBackground(Color.decode("#222831"));
        c.add(domestic);

        // To group radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(international);
        radioButtonGroup.add(domestic);

        // Jbuttons
        btn1 = new JButton("Exit");
        btn1.setBounds(90, 325, 215, 50);
        btn1.setFont(f3);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(340, 325, 215, 50);
        btn2.setFont(f3);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(590, 325, 215, 50);
        btn3.setFont(f3);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#2D3250"));
        btn3.setFocusable(false);
        c.add(btn3);

        Handler handler = new Handler();
        international.addActionListener(handler);
        domestic.addActionListener(handler);

        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                PacksDark frame = new PacksDark();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (defPack == 1) {
                    IntCountriesDark frame = new IntCountriesDark();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else if (defPack == 2) {
                    DomPlacesDark frame = new DomPlacesDark();
                    frame.setVisible(true);
                    setVisible(false);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select tour type.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == international) {
                defPack = 1;
            } else if (e.getSource() == domestic) {
                defPack = 2;
            }
        }
    }

    public static void main(String[] args) {

        DefPackTypesDark frame = new DefPackTypesDark();
        frame.setVisible(true);
    }
}
