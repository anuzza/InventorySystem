package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.db.DB;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class CashierLogin extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField untxt;
	private JPasswordField pwtxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierLogin frame = new CashierLogin();
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
	public CashierLogin() {
		setTitle("Cashier Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 383);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getUntxt());
		contentPane.add(getPwtxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Username:");
			lblNewLabel.setForeground(new Color(220, 220, 220));
			lblNewLabel.setBackground(new Color(220, 220, 220));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setBounds(46, 60, 104, 50);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password:");
			lblNewLabel_1.setForeground(new Color(220, 220, 220));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(46, 132, 104, 50);
		}
		return lblNewLabel_1;
	}
	private JTextField getUntxt() {
		if (untxt == null) {
			untxt = new JTextField();
			untxt.setBackground(new Color(220, 220, 220));
			untxt.setBounds(149, 71, 234, 33);
			untxt.setColumns(10);
		}
		return untxt;
	}
	private JPasswordField getPwtxt() {
		if (pwtxt == null) {
			pwtxt = new JPasswordField();
			pwtxt.setBackground(new Color(220, 220, 220));
			pwtxt.setBounds(149, 143, 234, 33);
			pwtxt.setColumns(10);
		}
		return pwtxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Cancel");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			btnNewButton.setBackground(new Color(255, 69, 0));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setBounds(121, 220, 104, 33);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Login");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (untxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Username is required");
						return;
						
					}
					
					if (pwtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "password is required");
						return;
						
					}
					
					String un = untxt.getText();
					String psw = pwtxt.getText();
					
					String sql = "select * from cashier where email = '"+un+"' and password = '"+psw+"' ";
					
					try {
						Statement stm = DB.getConnection().createStatement();
						ResultSet rs = stm.executeQuery(sql);
						
						if (rs.next()) {
							JOptionPane.showMessageDialog(null, "Login Success!");
							new Homepage().setVisible(true);
							dispose();
							
						}else {
							JOptionPane.showMessageDialog(null, "Cashier does not exist");
						}
					
					
					} catch (SQLException e1) {
					
						e1.printStackTrace();
					}
						
						
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setBackground(new Color(30, 144, 255));
			btnNewButton_1.setBounds(270, 220, 113, 33);
		}
		return btnNewButton_1;
	}
}
