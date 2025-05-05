package com.nj.rms.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MenuFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4997908521798374698L;
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
					MenuFrame frame = new MenuFrame();
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
	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new EtchedBorder(EtchedBorder.LOWERED, Color.BLACK, null));
		panel.setBackground(Color.WHITE);
		panel.setForeground(Color.WHITE);
		panel.setBounds(10, 11, 464, 37);
		contentPane.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Add Menu/Product");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(10, 59, 464, 212);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Product Name");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 63, 120, 34);
		panel_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField.setBounds(131, 62, 323, 34);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Price");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 109, 120, 34);
		panel_1.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(131, 109, 323, 34);
		panel_1.add(textField_1);
		
		JButton btnNewButton = new JButton("Add New Product");
		btnNewButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnNewButton.setBounds(10, 163, 138, 38);
		panel_1.add(btnNewButton);
		
		JButton btnUpdateProduct = new JButton("Update Product");
		btnUpdateProduct.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnUpdateProduct.setBounds(168, 163, 138, 38);
		panel_1.add(btnUpdateProduct);
		
		JButton btnViewMenu = new JButton("View Menu");
		btnViewMenu.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		btnViewMenu.setBounds(316, 163, 138, 38);
		panel_1.add(btnViewMenu);
		
		JLabel lblNewLabel_1_2 = new JLabel("Product Id");
		lblNewLabel_1_2.setToolTipText("");
		lblNewLabel_1_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(10, 11, 120, 34);
		panel_1.add(lblNewLabel_1_2);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Enter Product Id to update existing Product");
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(131, 11, 323, 34);
		panel_1.add(textField_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		panel_2.setBackground(new Color(245, 245, 245));
		panel_2.setBorder(new LineBorder(Color.GREEN, 2));
		panel_2.setBounds(10, 282, 464, 168);
		contentPane.add(panel_2);
	}
}
