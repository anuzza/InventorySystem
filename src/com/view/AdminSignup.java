package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Rectangle;

import com.model.Admin;
import com.service.AdminService;
import com.service.AdminServiceImpl;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseMotionAdapter;
import java.sql.Date;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminSignup extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fnametxt;
	private JLabel lblNewLabel_1;
	private JTextField lnametxt;
	private JLabel lblNewLabel_2;
	private JTextField usernametxt;
	private JPasswordField passwordtxt;
	private JPasswordField repasswordtxt;
	private JDateChooser datechs;
	private JTextField addresstxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSignup frame = new AdminSignup();
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
	public AdminSignup() {
		setTitle("Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 487, 526);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(new Color(112, 128, 144));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFnametxt());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLnametxt());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getUsernametxt());
		contentPane.add(getPasswordtxt());
		contentPane.add(getRepasswordtxt());
		contentPane.add(getDatechs());
		contentPane.add(getAddresstxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getLblNewLabel_7());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("First Name:");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setBounds(31, 42, 111, 27);
		}
		return lblNewLabel;
	}
	private JTextField getFnametxt() {
		if (fnametxt == null) {
			fnametxt = new JTextField();
			fnametxt.setBounds(152, 42, 233, 31);
			fnametxt.setColumns(10);
		}
		return fnametxt;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Last Name:");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setBounds(31, 87, 84, 21);
		}
		return lblNewLabel_1;
	}
	private JTextField getLnametxt() {
		if (lnametxt == null) {
			lnametxt = new JTextField();
			lnametxt.setBounds(152, 82, 233, 35);
			lnametxt.setColumns(10);
		}
		return lnametxt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Username:");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setBounds(31, 133, 98, 30);
		}
		return lblNewLabel_2;
	}
	private JTextField getUsernametxt() {
		if (usernametxt == null) {
			usernametxt = new JTextField();
			usernametxt.setBounds(152, 128, 233, 35);
			usernametxt.setColumns(10);
		}
		return usernametxt;
	}
	private JPasswordField getPasswordtxt() {
		if (passwordtxt == null) {
			passwordtxt = new JPasswordField();
			passwordtxt.setBounds(152, 174, 233, 35);
			passwordtxt.setColumns(10);
		}
		return passwordtxt;
	}
	private JPasswordField getRepasswordtxt() {
		if (repasswordtxt == null) {
			repasswordtxt = new JPasswordField();
			repasswordtxt.setBounds(152, 215, 233, 35);
			repasswordtxt.setColumns(10);
		}
		return repasswordtxt;
	}
	private JDateChooser getDatechs() {
		if (datechs == null) {
			datechs = new JDateChooser();
			datechs.setBounds(152, 259, 233, 35);
		}
		return datechs;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setBounds(152, 305, 288, 66);
			addresstxt.setColumns(10);
		}
		return addresstxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Register");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String un = usernametxt.getText();
					Date dob = new Date (datechs.getDate().getTime());
					String lname = lnametxt.getText();
					String fname = fnametxt.getText();
					String pw = passwordtxt.getText();
					String rpw = repasswordtxt.getText();
					
					
					if (fnametxt.getText().isEmpty() | lnametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Fullname is required");
					}else if (usernametxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Username required");
                     }else if (passwordtxt.getText().isEmpty() |repasswordtxt.getText().isEmpty()) {
                    	 JOptionPane.showMessageDialog(null, "passwords required");
						
										
					
					
						
					
					} else if (addresstxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Address required");
						
					}else {
					
					
					
					
					
					
					
					
					
					
					
					
					
					if ( !pw.equals(rpw)) {
						JOptionPane.showMessageDialog(null, "Passwords does not match");
						
											
					} else {
					
					
					
					
					
					Admin ad = new Admin();
					
					ad.setFname(fnametxt.getText());
					ad.setLname(lnametxt.getText());
					ad.setDob(new Date (datechs.getDate().getTime()));
					ad.setAddress(addresstxt.getText());
					ad.setUsername(usernametxt.getText());
					ad.setPassword(passwordtxt.getText());
					
					
					AdminService as = new AdminServiceImpl ();
					
					if (as.addAdmin(ad)) {
						
						JOptionPane.showMessageDialog(null, "Admin registered successfully!");
						fnametxt.setText("");
						lnametxt.setText("");
						datechs.setDate(null);
						addresstxt.setText("");
						usernametxt.setText("");
						passwordtxt.setText("");
						repasswordtxt.setText("");
					}else {
						
						JOptionPane.showMessageDialog(null, "Registration failed!"); 
					
					}
					
					
					
				}
					
					}
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnNewButton.setBackground(new Color(30, 144, 255));
			btnNewButton.setForeground(new Color(255, 255, 255));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton.setBounds(287, 397, 98, 31);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Cancel");
			btnNewButton_1.setBackground(new Color(255, 69, 0));
			btnNewButton_1.setForeground(new Color(255, 255, 255));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNewButton_1.setBounds(108, 397, 98, 31);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Password:");
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_3.setForeground(new Color(255, 255, 255));
			lblNewLabel_3.setBounds(31, 176, 98, 27);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Re Password:");
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_4.setForeground(new Color(255, 255, 255));
			lblNewLabel_4.setBounds(31, 217, 111, 27);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("BirthDate:");
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_5.setForeground(new Color(255, 255, 255));
			lblNewLabel_5.setBounds(31, 267, 98, 27);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Address:");
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_6.setForeground(new Color(255, 255, 255));
			lblNewLabel_6.setBounds(31, 313, 98, 27);
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("click here to login");
			lblNewLabel_7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseExited(MouseEvent e) {
					lblNewLabel_7.setForeground(Color.white);
					
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					new AdminLogin().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_7.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
					lblNewLabel_7.setForeground(Color.green);
					
				}
			});
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
			lblNewLabel_7.setForeground(new Color(255, 255, 255));
			lblNewLabel_7.setBounds(182, 452, 130, 25);
		}
		return lblNewLabel_7;
	}
}
