package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel;
	private JLabel picture;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm frame = new LoginForm();
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
	public LoginForm() {
		setTitle("Quick Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 587, 423);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getPicture());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Admin Login");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new AdminLogin().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setForeground(new Color(0, 0, 0));
			btnNewButton.setBounds(353, 140, 177, 50);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Cashier Login\r\n");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new CashierLogin().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton_1.setBounds(353, 255, 177, 50);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Welcome to Super Market  Billing System");
			lblNewLabel.setBounds(64, 23, 437, 66);
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		}
		return lblNewLabel;
	}
	private JLabel getPicture() {
		if (picture == null) {
			picture = new JLabel("");
			picture.setBounds(38, 120, 256, 216);
			picture.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\looooogoooo.png").getImage().getScaledInstance(picture.getWidth(), picture.getHeight(), 0)));
			
		}
		return picture;
	}
}
