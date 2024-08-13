package Dark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ContributionDark extends DefaultFrameDark {

    ContributionDark() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(565, 720);
        this.setLocationRelativeTo(null);

        // Logo
        logo = new ImageIcon(getClass().getResource("/images/contributionDNew.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(45, 20, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // JButtons
        btn1 = new JButton("OK");
        btn1.setBounds(175, 610, 180, 50);
        btn1.setFont(f1);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
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

        ContributionDark frame = new ContributionDark();
        frame.setVisible(true);
    }
}
