package Dark;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FeedbackDark extends DefaultFrameDark {
    private JTextField tf1;
    private JTextArea ta1;
    private JScrollPane scroll;
    private JButton sbtn1, sbtn2, sbtn3, sbtn4, sbtn5;
    private ImageIcon blank, filled;
    private int rating = 0;
    FeedbackDark() {

        // Frame Layout
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(540, 480);
        this.setLocationRelativeTo(null);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.PLAIN, 35);
        f2 = new Font("Segoe UI", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 19);
        f4 = new Font("Segoe UI Black", Font.PLAIN, 25);

        // Title
        label1 = new JLabel();
        label1.setText("Write your Suggestion!");
        label1.setBounds(80, 25, 500, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f1);
        c.add(label1);

        // Email
        label1 = new JLabel();
        label1.setText("Email");
        label1.setBounds(45, 100, 100, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f2);
        c.add(label1);

        tf1 = new JTextField();
        tf1.setBounds(185, 110, 260, 30);
        tf1.setFont(f3);
        tf1.setForeground(Color.decode("#99F2FA"));
        tf1.setBackground(Color.decode("#2D3250"));
        tf1.setCaretColor(Color.decode("#99F2FA"));
        c.add(tf1);

        // Rate Us
        label1 = new JLabel();
        label1.setText("Rate Us");
        label1.setBounds(45, 150, 100, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f2);
        c.add(label1);

        // Star Button
        blank = new ImageIcon(getClass().getResource("/images/blank_star.png"));
        filled = new ImageIcon(getClass().getResource("/images/filled_star.png"));

        sbtn1 = new JButton();
        sbtn1.setIcon(blank);
        sbtn1.setBounds(185, 157, blank.getIconWidth(), blank.getIconHeight());
        sbtn1.setCursor(cursor);
        sbtn1.setFocusable(false);
        sbtn1.setBackground(null);
        sbtn1.setBorder(null);
        c.add(sbtn1);

        sbtn2 = new JButton();
        sbtn2.setIcon(blank);
        sbtn2.setBounds(220, 157, blank.getIconWidth(), blank.getIconHeight());
        sbtn2.setCursor(cursor);
        sbtn2.setFocusable(false);
        sbtn2.setBackground(null);
        sbtn2.setBorder(null);
        c.add(sbtn2);

        sbtn3 = new JButton();
        sbtn3.setIcon(blank);
        sbtn3.setBounds(255, 157, blank.getIconWidth(), blank.getIconHeight());
        sbtn3.setCursor(cursor);
        sbtn3.setFocusable(false);
        sbtn3.setBackground(null);
        sbtn3.setBorder(null);
        c.add(sbtn3);

        sbtn4 = new JButton();
        sbtn4.setIcon(blank);
        sbtn4.setBounds(290, 157, blank.getIconWidth(), blank.getIconHeight());
        sbtn4.setCursor(cursor);
        sbtn4.setFocusable(false);
        sbtn4.setBackground(null);
        sbtn4.setBorder(null);
        c.add(sbtn4);

        sbtn5 = new JButton();
        sbtn5.setIcon(blank);
        sbtn5.setBounds(325, 157, blank.getIconWidth(), blank.getIconHeight());
        sbtn5.setCursor(cursor);
        sbtn5.setFocusable(false);
        sbtn5.setBackground(null);
        sbtn5.setBorder(null);
        c.add(sbtn5);

        // Action Listener for Star Buttons
        // sbtn1 Button
        sbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                sbtn1.setIcon(filled);
                sbtn2.setIcon(blank);
                sbtn3.setIcon(blank);
                sbtn4.setIcon(blank);
                sbtn5.setIcon(blank);
                rating = 1;
            }
        });

        // sbtn2 Button
        sbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                sbtn1.setIcon(filled);
                sbtn2.setIcon(filled);
                sbtn3.setIcon(blank);
                sbtn4.setIcon(blank);
                sbtn5.setIcon(blank);
                rating = 2;
            }
        });

        // sbtn3 Button
        sbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                sbtn1.setIcon(filled);
                sbtn2.setIcon(filled);
                sbtn3.setIcon(filled);
                sbtn4.setIcon(blank);
                sbtn5.setIcon(blank);
                rating = 3;
            }
        });

        // sbtn4 Button
        sbtn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                sbtn1.setIcon(filled);
                sbtn2.setIcon(filled);
                sbtn3.setIcon(filled);
                sbtn4.setIcon(filled);
                sbtn5.setIcon(blank);
                rating = 4;
            }
        });

        // sbtn5 Button
        sbtn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                sbtn1.setIcon(filled);
                sbtn2.setIcon(filled);
                sbtn3.setIcon(filled);
                sbtn4.setIcon(filled);
                sbtn5.setIcon(filled);
                rating = 5;
            }
        });

        // Comment
        label1 = new JLabel();
        label1.setText("Suggestion");
        label1.setBounds(45, 200, 150, 50);
        label1.setForeground(Color.decode("#99F2FA"));
        label1.setFont(f2);
        c.add(label1);

        ta1 = new JTextArea();
        ta1.setBounds(185, 210, 260, 100);
        ta1.setFont(f3);
        ta1.setLineWrap(true);
        ta1.setForeground(Color.decode("#99F2FA"));
        ta1.setBackground(Color.decode("#2D3250"));
        ta1.setCaretColor(Color.decode("#99F2FA"));
        c.add(ta1);

        scroll = new JScrollPane(ta1);
        scroll.setBounds(185, 210, 260, 100);
        scroll.setBackground(Color.decode("#2D3250"));
        c.add(scroll);

        // JButtons
        btn1 = new JButton("Cancel");
        btn1.setBounds(55, 350, 180, 50);
        btn1.setFont(f4);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
        btn1.setFocusable(false);
        c.add(btn1);

        // JButtons
        btn2 = new JButton("Send");
        btn2.setBounds(285, 350, 180, 50);
        btn2.setFont(f4);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        // Action Listener for JButtons
        // Cancel Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
            }
        });

        // Send Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                String textField = tf1.getText().toLowerCase(); // Email
                String textArea = ta1.getText(); // Comment


                if (textField.isEmpty() || textArea.isEmpty() || rating==0) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        File file = new File(".\\Data\\user_feedbacks.txt");
                        if (!file.exists()) {
                            file.createNewFile();
                        }
                        FileWriter fw = new FileWriter(file, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        LocalDateTime myDateObj = LocalDateTime.now();
                        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm a, dd/MM/yyyy");

                        String timeAndDate = myDateObj.format(myFormatObj);

                        pw.println("Email : " + textField);
                        pw.println("Rating : " + rating);
                        pw.println("Suggestion : " + textArea);
                        pw.println("Time & Date : " + timeAndDate);
                        pw.println("===============================================");
                        pw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    JOptionPane.showMessageDialog(null, "Rating & Suggestion has been Added.", "Successful",
                            JOptionPane.INFORMATION_MESSAGE);
                    setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        FeedbackDark frame = new FeedbackDark();
        frame.setVisible(true);
    }
}

