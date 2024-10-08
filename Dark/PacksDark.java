package Dark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PacksDark extends DefaultFrameDark {

    private ButtonGroup jButtonGroup;
    private JRadioButton defPacks, selfChosenPacks;
    private int pack = 0;

    PacksDark() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoDark.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 40);
        f2 = new Font("Segoe UI Semibold", Font.PLAIN, 30);
        f3 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Choose Your Package");
        label1.setBounds(425, 40, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        label1 = new JLabel();
        label1.setText("Type");
        label1.setBounds(425, 90, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        defPacks = new JRadioButton("Default Packs");
        defPacks.setBounds(445, 160, 300, 50);
        defPacks.setFont(f2);
        defPacks.setCursor(cursor);
        defPacks.setBackground(Color.decode("#222831"));
        defPacks.setForeground(Color.decode("#99F2FA"));
        c.add(defPacks);

        selfChosenPacks = new JRadioButton("Self-Chosen Packs");
        selfChosenPacks.setBounds(445, 220, 300, 50);
        selfChosenPacks.setFont(f2);
        selfChosenPacks.setCursor(cursor);
        selfChosenPacks.setBackground(Color.decode("#222831"));
        selfChosenPacks.setForeground(Color.decode("#99F2FA"));
        c.add(selfChosenPacks);

        // To group radio buttons
        jButtonGroup = new ButtonGroup();
        jButtonGroup.add(defPacks);
        jButtonGroup.add(selfChosenPacks);

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
        defPacks.addActionListener(handler);
        selfChosenPacks.addActionListener(handler);

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
                LoginDark frame = new LoginDark();
                frame.setVisible(true);
            }
        });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (pack == 1) {
                    setVisible(false);
                    DefPackTypesDark frame = new DefPackTypesDark();
                    frame.setVisible(true);
                } else if (pack == 2) {
                    setVisible(false);
                    SelfChoosenPacksDark frame = new SelfChoosenPacksDark();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "You forgot to select package type :(", "Warming!!!",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }

    class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == defPacks) {
                pack = 1;
            } else if (e.getSource() == selfChosenPacks) {
                pack = 2;
            }
        }
    }

    public static void main(String[] args) {

        PacksDark frame = new PacksDark();
        frame.setVisible(true);
    }
}
