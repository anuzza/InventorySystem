package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Cashier;

import com.service.CashierService;
import com.service.CashierServiceImpl;


import com.toedter.calendar.JDateChooser;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddCashier extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField nametxt;
	private JTextField phonetxt;
	private JTextField addresstxt;
	private JTextField emailtxt;
	private JPasswordField pwtxt;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_7_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_2;
	
	private int cid = 0;
	

	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCashier frame = new AddCashier();
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
	public AddCashier() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_7_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getNametxt());
		contentPane.add(getPhonetxt());
		contentPane.add(getAddresstxt());
		contentPane.add(getEmailtxt());
		contentPane.add(getPwtxt());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_2());
		
		displayData();
		
	
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Cashier Name");
			lblNewLabel_1.setForeground(new Color(0, 0, 139));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(38, 139, 101, 27);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Mobile Number");
			lblNewLabel_3.setForeground(new Color(0, 0, 139));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_3.setBounds(38, 177, 101, 27);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Address");
			lblNewLabel_4.setForeground(new Color(0, 0, 139));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_4.setBounds(38, 215, 101, 27);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Email-ID");
			lblNewLabel_5.setForeground(new Color(0, 0, 139));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_5.setBounds(38, 253, 101, 27);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Password");
			lblNewLabel_6.setForeground(new Color(0, 0, 139));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_6.setBounds(38, 291, 101, 27);
		}
		return lblNewLabel_6;
	}
	private JTextField getNametxt() {
		if (nametxt == null) {
			nametxt = new JTextField();
			nametxt.setBounds(149, 141, 158, 24);
			nametxt.setColumns(10);
		}
		return nametxt;
	}
	private JTextField getPhonetxt() {
		if (phonetxt == null) {
			phonetxt = new JTextField();
			phonetxt.setBounds(149, 179, 156, 24);
			phonetxt.setColumns(10);
		}
		return phonetxt;
	}
	private JTextField getAddresstxt() {
		if (addresstxt == null) {
			addresstxt = new JTextField();
			addresstxt.setBounds(151, 216, 156, 27);
			addresstxt.setColumns(10);
		}
		return addresstxt;
	}
	private JTextField getEmailtxt() {
		if (emailtxt == null) {
			emailtxt = new JTextField();
			emailtxt.setBounds(149, 254, 156, 24);
			emailtxt.setColumns(10);
		}
		return emailtxt;
	}
	private JPasswordField getPwtxt() {
		if (pwtxt == null) {
			pwtxt = new JPasswordField();
			pwtxt.setBounds(151, 289, 156, 24);
			pwtxt.setColumns(10);
		}
		return pwtxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Add New");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if ( nametxt.getText().isEmpty())
					{JOptionPane.showMessageDialog(null, "Name required");
						
					}	else  if (phonetxt.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "Phone required");
						
					}else if (addresstxt.getText().isEmpty())	{
						JOptionPane.showMessageDialog(null, "Address required");
						
					}else if(emailtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Email required");
						
					}	else if (pwtxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Password required");
						
					}	else {		
					
					Cashier c = new Cashier ();
					
					c.setName(nametxt.getText());
					c.setPhone(phonetxt.getText());
					c.setAddress(addresstxt.getText());
					c.setEmail(emailtxt.getText());
					c.setPassword(pwtxt.getText());
					
					CashierService cs =new CashierServiceImpl();
					
					if (cs.addCashier(c) ) {
						JOptionPane.showMessageDialog(null, "Cashier Added Successfully!");
						displayData();
						nametxt.setText("");
						phonetxt.setText("");
						addresstxt.setText("");
						emailtxt.setText("");
						pwtxt.setText("");
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Cashier Addition failed!");
					}
					
					
					
					
					
					
					}
					
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 139));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setBounds(48, 438, 91, 32);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Delete");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "please, select the row to be deleted");
						return;
						
					}	
					
					int row = table.getSelectedRow();
					int id = (int )table.getModel().getValueAt(row, 0);
					
					CashierService cs = new CashierServiceImpl();
					
					if (cs.deleteCashier(id)) {
						
						JOptionPane.showMessageDialog(null, "Deleted successfully!");
						displayData();
						nametxt.setText("");
						phonetxt.setText("");
						addresstxt.setText("");
						emailtxt.setText("");
						pwtxt.setText("");
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Delete failed!" );
						
					}
					
					
					
					
					
					
					
					
				}
			});
			btnNewButton_1.setForeground(new Color(0, 0, 139));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1.setBounds(350, 438, 89, 32);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblNewLabel_7.setBounds(10, 438, 38, 32);
			lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\add.jpg").getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), 0)));
			
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_7_1() {
		if (lblNewLabel_7_1 == null) {
			lblNewLabel_7_1 = new JLabel("");
			lblNewLabel_7_1.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblNewLabel_7_1.setBounds(314, 438, 36, 32);
			lblNewLabel_7_1.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\remove.jpg").getImage().getScaledInstance(lblNewLabel_7_1.getWidth(), lblNewLabel_7_1.getHeight(), 0)));
			
		}
		return lblNewLabel_7_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Back");
			btnNewButton_2.setForeground(new Color(0, 0, 139));
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Homepage2().setVisible(true);
					dispose();
				}
			});
			btnNewButton_2.setBounds(863, 489, 89, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
								
					
					
					
					
				}
			});
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
			scrollPane.setBounds(343, 11, 609, 402);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
											
														
							DefaultTableModel model = (DefaultTableModel)table.getModel();
							
							String tblname = model.getValueAt(table.getSelectedRow(), 1).toString();
							String tblphone = model.getValueAt(table.getSelectedRow(), 2).toString();
							String tbladdress = model.getValueAt(table.getSelectedRow(), 3).toString();
							String tblemail = model.getValueAt(table.getSelectedRow(), 4).toString();
							String tblpw = model.getValueAt(table.getSelectedRow(), 5).toString();
							
							// set data to textfield
							
							nametxt.setText(tblname);
							phonetxt.setText(tblphone);
							addresstxt.setText(tbladdress);
							emailtxt.setText(tblemail);
							pwtxt.setText(tblpw);
							
							
							
							
							
							
							
							
							
							
							
						}
					
				}
			);
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID", "Name", "Mobile No.", "Address", "Email", "Password"}));}
				
			
		
		return table;
		
		
		
		
	}
	
	private void displayData() {
	CashierService cs= new CashierServiceImpl();
	List<Cashier> slist = cs.getAllCashier();
	
	DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
	tmodel.setRowCount(0);
	
	for(Cashier c : slist) {
		tmodel.addRow(new Object[] { c.getId(),c.getName(), c.getPhone(), c.getAddress(), c.getEmail(), c.getPassword()  });
		
		
		
	}
	
	
	}
	
	
	
	
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("Update");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "please, select the row to be edited");
						return;
						
					}	
					
					
					
					
					
					int row = table.getSelectedRow();
					int id = (int )table.getModel().getValueAt(row, 0);
					
					
					cid = id;
							
					
					
					Cashier c = new Cashier ();
					c.setId(cid);
					c.setName(nametxt.getText());
					c.setPhone(phonetxt.getText());
					c.setAddress(addresstxt.getText());
					c.setEmail(emailtxt.getText());
					c.setPassword(pwtxt.getText());
					
									
					
					
					
					
					
					CashierService cs = new CashierServiceImpl();
					
					if (cs.updateCashier(c)) {
						
						JOptionPane.showMessageDialog(null, "Updated successfully!");
						displayData();
						nametxt.setText("");
						phonetxt.setText("");
						addresstxt.setText("");
						emailtxt.setText("");
						pwtxt.setText("");
						
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Update failed!" );
						
					}
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_3.setForeground(new Color(0, 0, 139));
			btnNewButton_3.setBounds(197, 438, 89, 32);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setBounds(160, 438, 38, 32);
			lblNewLabel_8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\update.png").getImage().getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), 0)));
			
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Add Cashier Details");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setForeground(new Color(0, 0, 139));
			lblNewLabel_2.setBounds(21, 44, 238, 46);
		}
		return lblNewLabel_2;
	}
	
	
	
//	public void setDataforEdit(int id) {
//		
//		int row = table.getSelectedRow();
//		int cid = (int )table.getModel().getValueAt(row, 0);
//		
//		 cid = id;	
//		CashierService cs = new CashierServiceImpl();
//		
//		Cashier c =cs.getById(id);
//		
//		nametxt.setText(c.getName());
//		phonetxt.setText(c.getPhone());
//		addresstxt.setText(c.getAddress());
//		emailtxt.setText(c.getEmail());
//		pwtxt.setText(c.getPassword());
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

