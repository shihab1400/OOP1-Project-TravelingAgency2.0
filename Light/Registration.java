package Light;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class Registration extends DefaultFrame {
    private JTextField tf1, tf2, tf4, tf5;
    private JComboBox securityQsn;
    private int a, b;
    private JPasswordField tf3 = new JPasswordField();
    private ImageIcon show = new ImageIcon(getClass().getResource("/images/show.png"));
    private ImageIcon hide = new ImageIcon(getClass().getResource("/images/hide.png"));
    private JButton shbtn;
    private boolean bl = true;

    Registration() {

        // Logo and Images
        logo = new ImageIcon(getClass().getResource("/images/logoBright.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(-30, -80, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI Semibold", Font.PLAIN, 35);
        f4 = new Font("Segoe UI", Font.PLAIN, 25);
        f5 = new Font("Segoe UI", Font.PLAIN, 19);
        f6 = new Font("Segoe UI", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Enter Your Information");
        label1.setBounds(430, 25, 500, 50);
        label1.setFont(f1);
        c.add(label1);

        // User Name
        label1 = new JLabel();
        label1.setText("User Name");
        label1.setBounds(430, 75, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(570, 85, 260, 30);
        tf1.setFont(f5);
        c.add(tf1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(430, 110, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf2 = new JTextField();
        tf2.setBounds(570, 120, 260, 30);
        tf2.setFont(f5);
        c.add(tf2);

        // Password
        label1 = new JLabel();
        label1.setText("Password");
        label1.setBounds(430, 145, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf3.setBounds(570, 155, 220, 30);
        tf3.setFont(f2);
        tf3.setEchoChar('*');
        c.add(tf3);

        shbtn = new JButton();
        shbtn.setBounds(795, 155, show.getIconWidth(), show.getIconHeight());
        shbtn.setIcon(show);
        shbtn.setCursor(cursor);
        shbtn.setFocusable(false);
        shbtn.setBackground(null);
        shbtn.setBorder(null);
        c.add(shbtn);

        shbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if(bl==true) {
                    showbtn();
                } else {
                    hidebtn();
                }
            }
        });

        // Question
        label1 = new JLabel();
        label1.setText("Question");
        label1.setBounds(430, 180, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        String[] secQsn = { "Choose a Security Question...", "Your dream job?", "Your favorite song?",
                "First pet's name?", "Your favorite hobby?" };
        securityQsn = new JComboBox(secQsn);
        securityQsn.setBounds(570, 190, 259, 30);
        securityQsn.setSelectedIndex(0);
        securityQsn.setFont(f5);
        securityQsn.setBackground(Color.white);
        c.add(securityQsn);

        // Answer
        label1 = new JLabel();
        label1.setText("Answer");
        label1.setBounds(430, 215, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf4 = new JTextField();
        tf4.setBounds(570, 225, 260, 30);
        tf4.setFont(f5);
        c.add(tf4);

        // Captcha Label and Text Field
        label1 = new JLabel();
        label1.setText("Captcha");
        label1.setBounds(430, 250, 500, 50);
        label1.setFont(f4);
        c.add(label1);

        tf5 = new JTextField();
        tf5.setBounds(615, 260, 215, 30);
        tf5.setFont(f5);
        c.add(tf5);

        // To get a random number for captcha
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);

        // Captcha
        label1 = new JLabel();
        label1.setText(" " + a + " + " + b + " ");
        label1.setBounds(530, 260, 75, 30);
        label1.setFont(f4);
        label1.setForeground(Color.red);
        label1.setBackground(Color.decode("#FFD3D3"));
        label1.setOpaque(true);
        c.add(label1);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(53, 325, 183, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Back");
        btn2.setBounds(251, 325, 183, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Reset");
        btn3.setBounds(450, 325, 183, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        btn3.setFocusable(false);
        c.add(btn3);

        btn4 = new JButton("Register");
        btn4.setBounds(649, 325, 183, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#2E75B6"));
        btn4.setFocusable(false);
        c.add(btn4);

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
                Home frame = new Home();
                frame.setVisible(true);
            }
        });

        // Reset Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Registration frame = new Registration();
                frame.setVisible(true);
            }
        });

        // Register Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField1 = tf1.getText().toLowerCase(); // User Name
                String textField2 = tf2.getText(); // Email
                String textField3 = tf3.getText(); // Password
                String textField4 = tf4.getText(); // Security Question Answer
                String textField5 = tf5.getText(); // Captcha
                String secQsn = String.valueOf(securityQsn.getSelectedItem()); // Security Question
                int result = 0;

                if (textField5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    result = Integer.parseInt(tf5.getText());
                    if (textField1.isEmpty() || textField2.isEmpty() || textField3.isEmpty() || textField4.isEmpty()
                            || textField5.isEmpty() || ((securityQsn.getSelectedIndex()) == 0)) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    } else if (result != (a + b)) {
                        JOptionPane.showMessageDialog(null, "Wrong Captcha.", "Warning!", JOptionPane.WARNING_MESSAGE);
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

                        JOptionPane.showMessageDialog(null, "Registration Successfully Completed.",
                                "Registration Complete", JOptionPane.WARNING_MESSAGE);
                        setVisible(false);
                        Home frame = new Home();
                        frame.setVisible(true);
                    }
                }
            }
        });
    }

    public void showbtn() {
        shbtn.setIcon(hide);
        bl = false;
        tf3.setEchoChar((char)0);
    }

    public void hidebtn() {
        shbtn.setIcon(show);
        bl = true;
        tf3.setEchoChar('*');
    }

    public static void main(String[] args) {

        Registration frame = new Registration();
        frame.setVisible(true);
    }
}

