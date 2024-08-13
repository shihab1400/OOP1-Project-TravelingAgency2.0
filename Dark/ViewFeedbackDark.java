package Dark;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.nio.file.*;
import java.lang.*;

public class ViewFeedbackDark extends DefaultFrameDark {
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;
    private String[] column = { "Email", "Rating", "Suggestion" };
    private String[] rows = new String[4];

    ViewFeedbackDark() {
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 40);
        f2 = new Font("Segoe UI Black", Font.PLAIN, 25);
        f3 = new Font("Segoe UI", Font.PLAIN, 20);

        // Title
        label1 = new JLabel();
        label1.setText("User Feedbacks");
        label1.setBounds(200, 10, 400, 80);
        label1.setFont(f1);
        label1.setForeground(Color.decode("#99F2FA"));
        c.add(label1);

        // JButtons
        btn1 = new JButton("Refresh");
        btn1.setBounds(54, 418, 278, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.decode("#99F2FA"));
        btn1.setBackground(Color.decode("#2D3250"));
        btn1.setFocusable(false);
        c.add(btn1);

        btn2 = new JButton("Delete");
        btn2.setBounds(342, 418, 284, 50);
        btn2.setFont(f2);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.decode("#99F2FA"));
        btn2.setBackground(Color.decode("#2D3250"));
        btn2.setFocusable(false);
        c.add(btn2);

        btn3 = new JButton("Exit");
        btn3.setBounds(54, 480, 278, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.decode("#99F2FA"));
        btn3.setBackground(Color.decode("#C00000"));
        btn3.setFocusable(false);
        c.add(btn3);

        btn4 = new JButton("Back");
        btn4.setBounds(342, 480, 284, 50);
        btn4.setFont(f2);
        btn4.setCursor(cursor);
        btn4.setForeground(Color.decode("#99F2FA"));
        btn4.setBackground(Color.decode("#2D3250"));
        btn4.setFocusable(false);
        c.add(btn4);

        // JTable Layout
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.decode("#76ABAE"));
        table.setBackground(Color.decode("#31363F"));
        table.setForeground(Color.decode("#99F2FA"));
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(320);
        table.getColumnModel().getColumn(1).setPreferredWidth(50);
        table.getColumnModel().getColumn(2).setPreferredWidth(480);

        scroll = new JScrollPane(table);
        scroll.setBounds(53, 96, 578, 300);
        scroll.setBackground(Color.decode("#31363F"));
        c.add(scroll);

        String file = ".\\Data\\user_feedbacks.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i < totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0, 5);
                if (x.equals("Email")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(8); // Email
                    rows[1] = Files.readAllLines(Paths.get(file)).get(i + 1).substring(9); // Rating
                    rows[2] = Files.readAllLines(Paths.get(file)).get(i + 2).substring(13); // Comment
                    rows[3] = Files.readAllLines(Paths.get(file)).get(i + 3).substring(14); // Date and time
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            return;
        }

        // Refresh Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                ViewFeedbackDark frame = new ViewFeedbackDark();
                frame.setVisible(true);

            }
        });

        // Delete Button
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                if (table.getSelectionModel().isSelectionEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please select a Feedback to delete", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    String removeComment = table.getModel().getValueAt(table.getSelectedRow(), 0).toString();

                    File oldFile = new File(file);
                    File newFile = new File(temp);

                    int q = 0;

                    try {

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i < totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(file)).get(i);
                            String x = line.substring(0, 5);
                            if (x.equals("Email")) {
                                String email = Files.readAllLines(Paths.get(file)).get(i);
                                if (email.substring(8).equals(removeComment)) {
                                    q = i;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        return;
                    }

                    try {

                        FileWriter fw = new FileWriter(temp, true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter pw = new PrintWriter(bw);

                        FileReader fr = new FileReader(file);
                        BufferedReader br = new BufferedReader(fr);

                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int j = 0; j < totalLines; j++) {
                            String line = Files.readAllLines(Paths.get(file)).get(j);
                            String x = line.substring(0, 5);

                            if (q != 0 && (j == q || j == (q + 1) || j == (q + 2) || j == (q + 3) || j == (q + 4) || j == (q + 5))) {
                                String email = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println("#Removed! " + email);
                            } else {
                                String email = Files.readAllLines(Paths.get(file)).get(j);
                                pw.println(email);
                            }
                        }
                        pw.flush();
                        pw.close();
                        fr.close();
                        br.close();
                        bw.close();
                        fw.close();

                    } catch (Exception ex) {
                        System.out.print(ex);
                    }

                    oldFile.delete();
                    File dump = new File(file);
                    newFile.renameTo(dump);

                    setVisible(false);
                    ViewFeedbackDark frame = new ViewFeedbackDark();
                    frame.setVisible(true);
                }

            }
        });

        // Exit Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // Back Button
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
                AdminDark frame = new AdminDark();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        ViewFeedbackDark frame = new ViewFeedbackDark();
        frame.setVisible(true);
    }
}

