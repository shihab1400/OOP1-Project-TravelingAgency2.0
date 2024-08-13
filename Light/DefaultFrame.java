package Light;

import javax.swing.*;
import java.awt.*;

public abstract class DefaultFrame extends JFrame {
    public Container c;
    public ImageIcon icon, logo;
    public JLabel label0, label1, label2, label3, imgLabel;
    public Font f1, f2, f3, f4, f5, f6;
    public JButton btn1, btn2, btn3, btn4, btn5;
    public Cursor cursor;

    public DefaultFrame() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Travel Agency");
        this.setSize(900, 450);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/iconnew.png"));
        this.setIconImage(icon.getImage());

    }


}

