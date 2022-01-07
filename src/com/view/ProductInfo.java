package com.view;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Product;

import com.service.ProductService;
import com.service.ProductServiceImpl;


import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class ProductInfo extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField searchtxt;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductInfo frame = new ProductInfo();
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
	public ProductInfo() {
		setTitle("Product Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getSearchtxt());
		contentPane.add(getBtnNewButton());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnNewButton_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Product Information");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel.setBounds(204, 34, 239, 49);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Product");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblNewLabel_1.setBounds(89, 112, 92, 30);
		}
		return lblNewLabel_1;
	}
	private JTextField getSearchtxt() {
		if (searchtxt == null) {
			searchtxt = new JTextField();
			searchtxt.setBounds(204, 111, 239, 30);
			searchtxt.setColumns(10);
		}
		return searchtxt;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Search");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (searchtxt.getText().isBlank()) {
						
						JOptionPane.showMessageDialog(null, "Please type the name or id of the product");
						
					}else {
					
					
					
					String data = searchtxt.getText().trim();
					ProductService ps = new ProductServiceImpl();
					
					List<Product> plist  = ps.searchProduct(data);
					
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					
					for(Product p : plist) {
						
					
						tmodel.addRow(new Object[] { p.getId(),p.getName(),p.getAvailable(), p.getMrp()});
					
					}
					}
					
				}
			});
			btnNewButton.setBounds(499, 112, 81, 30);
		}
		return btnNewButton;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
			lblNewLabel_2.setBounds(476, 112, 24, 30);
			lblNewLabel_2.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\search.png").getImage().getScaledInstance(lblNewLabel_2.getWidth(), lblNewLabel_2.getHeight(), 0)));
			
		}
		return lblNewLabel_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
			scrollPane.setBounds(33, 176, 566, 314);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
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
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Back");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Homepage().setVisible(true);
					dispose();
				}
			});
			btnNewButton_1.setBounds(33, 51, 89, 23);
		}
		return btnNewButton_1;
	}
}
