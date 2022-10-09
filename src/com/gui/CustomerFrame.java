package com.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

public class CustomerFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7298276036278570993L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerFrame frame = new CustomerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerFrame() {
		setBackground(Color.LIGHT_GRAY);
		setTitle("CustomerFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 50, 526, 385);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Customer Name");
		lblNewLabel.setBounds(20, 11, 163, 28);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		
		textField = new JTextField();
		textField.setToolTipText("Enter Customer name");
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField.setBounds(183, 11, 333, 28);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblGender.setBounds(20, 50, 163, 28);
		panel.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblAddress.setBounds(20, 178, 163, 28);
		panel.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblEmail.setBounds(20, 100, 163, 28);
		panel.add(lblEmail);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setToolTipText("Select Gender");
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Male", "Female", "Other"}));
		comboBox.setBounds(183, 50, 333, 28);
		panel.add(comboBox);
		
		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("Enter Customer Address");
		textArea.setBorder(UIManager.getBorder("TextField.border"));
		textArea.setAutoscrolls(false);
		textArea.setBackground(Color.WHITE);
		textArea.setRows(4);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textArea.setBounds(183, 182, 333, 63);
		panel.add(textArea);
		
		JLabel lblNewLabel_3_1 = new JLabel("Mobile");
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(20, 139, 163, 28);
		panel.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Enter Customer Email");
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(183, 100, 333, 28);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Enter Customer Mobile");
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(183, 139, 333, 28);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Add Customer");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton.setBounds(73, 276, 163, 34);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Customer");
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton_1.setBounds(73, 330, 163, 34);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Add Customer");
		btnNewButton_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton_1_1.setBounds(284, 330, 163, 34);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Add Customer");
		btnNewButton_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 13));
		btnNewButton_1_1_1.setBounds(284, 276, 163, 34);
		panel.add(btnNewButton_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(new Color(255, 255, 255));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 11, 764, 32);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Restaurant");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(546, 50, 228, 385);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image waiterImg = new ImageIcon(this.getClass().getResource("/waiterImg.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(waiterImg));
		lblNewLabel_2.setBounds(0, 0, 228, 385);
		panel_2.add(lblNewLabel_2);
	}
}
