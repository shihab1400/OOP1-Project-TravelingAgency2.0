package Dark.DomPlaces;
import Dark.DefPackTypesDark;
import Dark.DefaultFrameDark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class DomPlacesDark extends DefaultFrameDark {
    private JRadioButton place1, place2, place3, place4, place5;
    private ButtonGroup jButtonGroup;
    private int place = 0;

    public DomPlacesDark() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 20);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Which Place Would You");
        label1.setBounds(430, 25, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Like to Visit?");
        label1.setBounds(430, 60, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        // Country JButtons
        place1 = new JRadioButton("Cox's Bazar");
        place1.setBounds(460, 100, 200, 50);
        place1.setFont(f2);
        place1.setForeground(Color.decode("#99F2FA"));
        place1.setBackground(Color.decode("#222831"));
        place1.setCursor(cursor);
        c.add(place1);

        place2 = new JRadioButton("Sajek Valley");
        place2.setBounds(460, 140, 200, 50);
        place2.setFont(f2);
        place2.setForeground(Color.decode("#99F2FA"));
        place2.setBackground(Color.decode("#222831"));
        place2.setCursor(cursor);
        c.add(place2);

        place3 = new JRadioButton("Sreemangal");
        place3.setBounds(460, 180, 200, 50);
        place3.setFont(f2);
        place3.setForeground(Color.decode("#99F2FA"));
        place3.setBackground(Color.decode("#222831"));
        place3.setCursor(cursor);
        c.add(place3);

        place4 = new JRadioButton("Bandarban");
        place4.setBounds(460, 220, 200, 50);
        place4.setFont(f2);
        place4.setForeground(Color.decode("#99F2FA"));
        place4.setBackground(Color.decode("#222831"));
        place4.setCursor(cursor);
        c.add(place4);

        place5 = new JRadioButton("Rangamati");
        place5.setBounds(460, 260, 200, 50);
        place5.setFont(f2);
        place5.setForeground(Color.decode("#99F2FA"));
        place5.setBackground(Color.decode("#222831"));
        place5.setCursor(cursor);
        c.add(place5);

        // To Group JButtons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(place1);
        jButtonGroup.add(place2);
        jButtonGroup.add(place3);
        jButtonGroup.add(place4);
        jButtonGroup.add(place5);

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
        place1.addActionListener(handler);
        place2.addActionListener(handler);
        place3.addActionListener(handler);
        place4.addActionListener(handler);
        place5.addActionListener(handler);

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
                DefPackTypesDark frame = new DefPackTypesDark();
                frame.setVisible(true);
                setVisible(false);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (place == 1) {
                    setVisible(false);
                    DomesticCoxsBazarDark frame = new DomesticCoxsBazarDark();
                    frame.setVisible(true);
                } else if (place == 2) {
                    setVisible(false);
                    DomesticSajekValleyDark frame = new DomesticSajekValleyDark();
                    frame.setVisible(true);
                } else if (place == 3) {
                    setVisible(false);
                    DomesticSreemangalDark frame = new DomesticSreemangalDark();
                    frame.setVisible(true);
                } else if (place == 4) {
                    setVisible(false);
                    DomesticBandarbanDark frame = new DomesticBandarbanDark();
                    frame.setVisible(true);
                } else if (place == 5) {
                    setVisible(false);
                    DomesticRangamatiDark frame = new DomesticRangamatiDark();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please select Place.", "Warning!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == place1) {
                place = 1;
            } else if (e.getSource() == place2) {
                place = 2;
            } else if (e.getSource() == place3) {
                place = 3;
            } else if (e.getSource() == place4) {
                place = 4;
            } else if (e.getSource() == place5) {
                place = 5;
            }
        }
    }

    public static void main(String[] args) {

        DomPlacesDark frame = new DomPlacesDark();
        frame.setVisible(true);
    }
}

