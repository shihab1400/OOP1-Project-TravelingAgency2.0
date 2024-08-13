package Dark;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class AdminAddDark extends DefaultFrameDark {
    private JTextField tf1, tf2, tf4;
    private JComboBox securityQsn;
    private JPasswordField tf3 = new JPasswordField();
    private ImageIcon show = new ImageIcon(getClass().getResource("/images/showDark.png"));
    private ImageIcon hide = new ImageIcon(getClass().getResource("/images/hideDark.png"));
    private JButton shbtn;
    private boolean b = true;

    AdminAddDark() {
        this.setSize(510, 400);
        this.setLocationRelativeTo(null);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Information");
        label1.setBounds(100, 25, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(45, 75, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(185, 85, 260, 30);
        tf1.setFont(f5);
        tf1.setForeground(Color.decode("#99F2FA"));
        tf1.setBackground(Color.decode("#2D3250"));
        tf1.setCaretColor(Color.decode("#EEEEEE"));
        c.add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(45, 110, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(185, 120, 260, 30);
        tf2.setFont(f5);
        tf2.setForeground(Color.decode("#99F2FA"));
        tf2.setBackground(Color.decode("#2D3250"));
        tf2.setCaretColor(Color.decode("#EEEEEE"));
        c.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(45, 145, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f4);
        c.add(label1);

        tf3.setBounds(185, 155, 220, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        tf3.setForeground(Color.decode("#99F2FA"));
        tf3.setBackground(Color.decode("#2D3250"));
        tf3.setCaretColor(Color.decode("#EEEEEE"));
        c.add(tf3);

        shbtn = new JButton();
        shbtn.setBounds(410, 155, show.getIconWidth(), show.getIconHeight());
        shbtn.setIcon(show);
        shbtn.setCursor(cursor);
        shbtn.setFocusable(false);
        shbtn.setBackground(null);
        shbtn.setBorder(null);
        c.add(shbtn);

        shbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(b==true) {
                    showbtn();
                } else {
                    hidebtn();
                }
            }
        });

        // Question
        label1 = new JLabel();
        label1.setText("Question");
        label1.setBounds(45, 180, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f4);
        c.add(label1);

        String[] secQsn = { "Choose a Security Question...", "Your dream job?", "Your favorite song?",
                "First pet's name?", "Your favorite hobby?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(185, 190, 259, 30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f5);
        securityQsn.setForeground(Color.decode("#99F2FA"));
        securityQsn.setBackground(Color.decode("#2D3250"));
        c.add(securityQsn);

        // Answer
        label1 = new JLabel();
        label1.setText("Answer");
        label1.setBounds(45, 215, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f4);
        c.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(185, 225, 260, 30);
        tf4.setForeground(Color.decode("#99F2FA"));
        tf4.setBackground(Color.decode("#2D3250"));
        tf4.setCaretColor(Color.decode("#EEEEEE"));
        tf4.setFont(f5);
        c.add(tf4);

        // JButtons
        btn1 = new JButton("Back");
        btn1.setBounds(51, 280, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Add");
        btn2.setBounds(260, 280, 183, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        // Back Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                UserDataDark frame = new UserDataDark();
                frame.setVisible(true);
            }
        });

        // Add Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Security Question Answer
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question

                if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                        || ((securityQsn.getSelectedIndex()) == 0)) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        File file = new File(".\\Data\\user_data.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);

                        pw.println("             ## Added by Admin ##");
                        pw.println("User Name : " + textField1);
                        pw.println("Password : " + textField3);
                        pw.println("Email : " + textField2);
                        pw.println("Security Question : " + secQsn);
                        pw.println("Answer : " + textField4);
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "User has been added.", "User Added",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                    AdminAddDark frame = new AdminAddDark();
                    frame.setVisible(true);
                }
            }
        });
    }

    public void showbtn() {
        shbtn.setIcon(hide);
        b = false;
        tf3.setEchoChar((char)0);
    }

    public void hidebtn() {
        shbtn.setIcon(show);
        b = true;
        tf3.setEchoChar('*');
    }

    public static void main(String[] args) {

        AdminAddDark frame = new AdminAddDark();
        frame.setVisible(true);
    }
}

