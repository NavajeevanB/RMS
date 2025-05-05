package com.nj.rms.view;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.io.Serial;
import java.util.Objects;

public class AdminMenuFrame extends JFrame {

    @Serial
    private static final long serialVersionUID = 4988966948739553563L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                AdminMenuFrame frame = new AdminMenuFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the frame.
     */
    public AdminMenuFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(10, 198, 466, 230);
        contentPane.add(panel_1);
        panel_1.setLayout(null);

        JButton btnNewButton = new JButton("Customer");
        btnNewButton.addActionListener(e -> {
            // TODO document why this method is empty
        });
        btnNewButton.setBackground(Color.LIGHT_GRAY);
        btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton.setBounds(32, 21, 162, 47);
        panel_1.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Sales");
        btnNewButton_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1.setBounds(32, 88, 162, 47);
        panel_1.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("View Data");
        btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton_1_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1_1.setBounds(32, 158, 162, 47);
        panel_1.add(btnNewButton_1_1);

        JButton btnNewButton_1_1_1 = new JButton("Member");
        btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton_1_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton_1_1_1.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1_1_1.setBounds(245, 21, 162, 47);
        panel_1.add(btnNewButton_1_1_1);

        JButton btnNewButton_1_1_2 = new JButton("Menu");
        btnNewButton_1_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton_1_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton_1_1_2.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1_1_2.setBounds(245, 88, 162, 47);
        panel_1.add(btnNewButton_1_1_2);

        JButton btnNewButton_1_1_3 = new JButton("Log Out");
        btnNewButton_1_1_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
        btnNewButton_1_1_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
        btnNewButton_1_1_3.setBackground(Color.LIGHT_GRAY);
        btnNewButton_1_1_3.setBounds(245, 158, 162, 47);
        panel_1.add(btnNewButton_1_1_3);

        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 10, 466, 156);
        contentPane.add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        Image AdminLogo = new ImageIcon(Objects.requireNonNull(this.getClass().getResource("/images/AdminLogo.jpg"))).getImage();
        lblNewLabel_1.setIcon(new ImageIcon(AdminLogo));
        lblNewLabel_1.setBounds(10, 10, 446, 136);
        panel_2.add(lblNewLabel_1);
    }
}
