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
import com.model.Product;
import com.service.CashierService;
import com.service.CashierServiceImpl;
import com.service.ProductService;
import com.service.ProductServiceImpl;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UpdateStock extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField nametxt;
	private JTextField avbtxt;
	private JTextField addtxt;
	private JTextField mrptxt;
	private JButton btnNewButton;
	private JLabel lblNewLabel_7;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_2;
	private JButton DELETEBTN;
	private JLabel lblNewLabel;
	
	private int cid = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateStock frame = new UpdateStock();
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
	public UpdateStock() {
		setTitle("Add Cashier");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getNametxt());
		contentPane.add(getAvbtxt());
		contentPane.add(getAddtxt());
		contentPane.add(getMrptxt());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_3());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getDELETEBTN());
		contentPane.add(getLblNewLabel());
		displayData();
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product Name");
			lblNewLabel_1.setForeground(new Color(0, 0, 139));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(38, 140, 101, 27);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Quantity Available");
			lblNewLabel_3.setForeground(new Color(0, 0, 139));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_3.setBounds(38, 193, 129, 27);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Quantity Added");
			lblNewLabel_4.setForeground(new Color(0, 0, 139));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_4.setBounds(38, 246, 101, 27);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("MRP");
			lblNewLabel_5.setForeground(new Color(0, 0, 139));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_5.setBounds(38, 303, 101, 27);
		}
		return lblNewLabel_5;
	}
	private JTextField getNametxt() {
		if (nametxt == null) {
			nametxt = new JTextField();
			nametxt.setBounds(177, 142, 179, 24);
			nametxt.setColumns(10);
		}
		return nametxt;
	}
	private JTextField getAvbtxt() {
		if (avbtxt == null) {
			avbtxt = new JTextField();
			avbtxt.setBounds(177, 195, 179, 24);
			avbtxt.setColumns(10);
		}
		return avbtxt;
	}
	private JTextField getAddtxt() {
		if (addtxt == null) {
			addtxt = new JTextField();
			addtxt.setBounds(177, 247, 179, 27);
			addtxt.setColumns(10);
		}
		return addtxt;
	}
	private JTextField getMrptxt() {
		if (mrptxt == null) {
			mrptxt = new JTextField();
			mrptxt.setBounds(177, 305, 179, 24);
			mrptxt.setColumns(10);
		}
		return mrptxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if ( nametxt.getText().isEmpty())
					{JOptionPane.showMessageDialog(null, "Name required");
						
					}	else  if (avbtxt.getText().isEmpty()){
						JOptionPane.showMessageDialog(null, "available quantity required");
						
											
					}else if(mrptxt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "MRP required");
						
											
					}	else {		
					
					Product p = new Product ();
					
					p.setName(nametxt.getText());
					p.setAvailable(Integer.valueOf(avbtxt.getText()));
					p.setAdded(Integer.valueOf(addtxt.getText()));
					p.setMrp(Integer.valueOf(mrptxt.getText()));
					
					
					ProductService ps =new ProductServiceImpl();
					
					if (ps.addProduct(p) ) {
						JOptionPane.showMessageDialog(null, "Product Added Successfully!");
						displayData();
						
						nametxt.setText("");
						avbtxt.setText(null);
						addtxt.setText(null);
						mrptxt.setText(null);
						
						
						
					}else {
						JOptionPane.showMessageDialog(null, "Product Addition failed!");
					}
					
					
					
					
					
					
					}
					
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 139));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setBounds(62, 384, 70, 32);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblNewLabel_7.setBounds(20, 384, 38, 32);
			lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\add.jpg").getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), 0)));
			
		}
		return lblNewLabel_7;
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
			btnNewButton_2.setBounds(10, 55, 89, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
			scrollPane.setBounds(424, 11, 528, 501);
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
					String tblavb = model.getValueAt(table.getSelectedRow(), 2).toString();
					String tblmrp = model.getValueAt(table.getSelectedRow(), 3).toString();
					
					// set data to textfield
					
					
					

					int row = table.getSelectedRow();
					int id = (int )table.getModel().getValueAt(row, 0);
					
					cid = id;
					
					ProductService ps = new ProductServiceImpl();
					
					Product p = ps.getById(id);
					
					addtxt.setText(String.valueOf(p.getAdded()));
					avbtxt.setText(String.valueOf(p.getAvailable()));
					
					
					nametxt.setText(tblname);
					mrptxt.setText(tblmrp);
					
					
					
					
					
					
					
					
					
					
					
					
				}
			});
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Product ID", "Product Name", "Available", "MRP"
				}
			));
		}
		return table;
	}
	
	
	
	private void displayData() {
		ProductService ps= new ProductServiceImpl();
		List<Product> plist = ps.getallProduct();
		
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		
		
		
		for(Product p: plist) {
			int total = (Integer)p. getAvailable() + p.getAdded();
			tmodel.addRow(new Object[] { p.getId(),p.getName(), total, p.getMrp() });};
			
			
			
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
					
							
					
					
					Product p = new Product ();
					p.setId(cid);
					p.setName(nametxt.getText());
					p.setAvailable(Integer.valueOf(avbtxt.getText()));
					p.setAdded(Integer.valueOf(addtxt.getText()));
					p.setMrp(Integer.valueOf(mrptxt.getText()));
					
					
					
					
									
					
					
					
					
					
					ProductService ps = new ProductServiceImpl();
					
					if (ps.updateProduct(p)) {
						
						JOptionPane.showMessageDialog(null, "Updated successfully!");
						displayData();
						nametxt.setText("");
						avbtxt.setText(null);
						addtxt.setText(null);
						mrptxt.setText(null);
						
						
						
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Update failed!" );
						
					}
					
					
					
				}
			});
			btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_3.setForeground(new Color(0, 0, 139));
			btnNewButton_3.setBounds(210, 384, 89, 32);
		}
		return btnNewButton_3;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setBounds(172, 384, 38, 32);
			lblNewLabel_8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\update.png").getImage().getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), 0)));
			
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Update Stock");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_2.setForeground(new Color(0, 0, 139));
			lblNewLabel_2.setBounds(129, 40, 170, 46);
		}
		return lblNewLabel_2;
	}
	private JButton getDELETEBTN() {
		if (DELETEBTN == null) {
			DELETEBTN = new JButton("Delete");
			DELETEBTN.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(table.getSelectedRow()<0){
						JOptionPane.showMessageDialog(null, "please, select the row to be deleted");
						return;
						
					}	
					
					int row = table.getSelectedRow();
					int id = (int )table.getModel().getValueAt(row, 0);
					
					ProductService ps = new ProductServiceImpl();
					
					if (ps.deleteProduct(id)) {
						
						JOptionPane.showMessageDialog(null, "Deleted successfully!");
						displayData();
						nametxt.setText("");
						avbtxt.setText(null);
						addtxt.setText(null);
						mrptxt.setText(null);
						
						
					}else {
						
						JOptionPane.showMessageDialog(null,"Delete failed!" );
						
					}
					
				}
			});
			DELETEBTN.setForeground(new Color(0, 0, 139));
			DELETEBTN.setFont(new Font("Tahoma", Font.BOLD, 12));
			DELETEBTN.setBounds(132, 460, 89, 32);
		}
		return DELETEBTN;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(98, 460, 30, 27);
			lblNewLabel.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\remove.jpg").getImage().getScaledInstance(lblNewLabel.getWidth(), lblNewLabel.getHeight(), 0)));
			
		}
		return lblNewLabel;
	}
}
