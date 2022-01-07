package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class CreateBill extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JLabel btnNewButton;
	private JLabel btnNewButton_1;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_7_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel_8;
	private JDateChooser dateChooser;
	private JTextField textField_7;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateBill frame = new CreateBill();
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
	public CreateBill() {
		setTitle("New Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 769, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_6());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getTextField_6());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getLblNewLabel_7());
		contentPane.add(getLblNewLabel_7_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getScrollPane());
		contentPane.add(getLblNewLabel_8());
		contentPane.add(getDateChooser());
		contentPane.add(getTextField_7());
		contentPane.add(getLblNewLabel_9());
		contentPane.add(getLblNewLabel_10());
		contentPane.add(getLblNewLabel_11());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Bill No.");
			lblNewLabel.setForeground(new Color(0, 0, 139));
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel.setBounds(38, 47, 101, 27);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Customer Name");
			lblNewLabel_1.setForeground(new Color(0, 0, 139));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_1.setBounds(38, 85, 101, 27);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Product ID");
			lblNewLabel_2.setForeground(new Color(0, 0, 139));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2.setBounds(38, 123, 101, 27);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Product Name");
			lblNewLabel_3.setForeground(new Color(0, 0, 139));
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_3.setBounds(38, 161, 101, 27);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("MRP");
			lblNewLabel_4.setForeground(new Color(0, 0, 139));
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_4.setBounds(38, 199, 101, 27);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("Quantity");
			lblNewLabel_5.setForeground(new Color(0, 0, 139));
			lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_5.setBounds(38, 237, 101, 27);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("Discount");
			lblNewLabel_6.setForeground(new Color(0, 0, 139));
			lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_6.setBounds(38, 282, 101, 27);
		}
		return lblNewLabel_6;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEnabled(false);
			textField.setBounds(151, 49, 147, 24);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(151, 87, 147, 24);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JComboBox getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JComboBox();
			textField_2.setBounds(151, 125, 147, 24);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(151, 163, 147, 24);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(151, 200, 147, 27);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(151, 239, 147, 24);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setBounds(151, 284, 147, 24);
			textField_6.setColumns(10);
		}
		return textField_6;
	}
	private JLabel getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JLabel("Add");
			btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					btnNewButton.getCursor().getPredefinedCursor(HAND_CURSOR);
				}
			});
			btnNewButton.setForeground(new Color(0, 0, 139));
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton.setBounds(96, 367, 69, 32);
		}
		return btnNewButton;
	}
	private JLabel getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JLabel("Remove");
			btnNewButton_1.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					btnNewButton_1.getCursor().getPredefinedCursor(HAND_CURSOR);
				}
			});
			btnNewButton_1.setForeground(new Color(0, 0, 139));
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			btnNewButton_1.setBounds(251, 368, 72, 32);
		}
		return btnNewButton_1;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setBounds(50, 373, 38, 27);
			lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\add.jpg").getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), 0)));
			
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_7_1() {
		if (lblNewLabel_7_1 == null) {
			lblNewLabel_7_1 = new JLabel("");
			lblNewLabel_7_1.setBounds(203, 373, 38, 27);
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
					new Homepage().setVisible(true);
					dispose();
				}
			});
			btnNewButton_2.setBounds(10, 469, 89, 23);
		}
		return btnNewButton_2;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new LineBorder(new Color(130, 135, 144)));
			scrollPane.setBounds(357, 85, 386, 314);
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
					"Quantity", "Name", "MRP", "Total Price"
				}
			));
		}
		return table;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			lblNewLabel_8 = new JLabel("Date");
			lblNewLabel_8.setForeground(new Color(0, 0, 139));
			lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_8.setBounds(408, 38, 89, 23);
		}
		return lblNewLabel_8;
	}
	private JDateChooser getDateChooser() {
		if (dateChooser == null) {
			dateChooser = new JDateChooser();
			dateChooser.setBounds(463, 38, 157, 24);
		}
		return dateChooser;
	}
	private JTextField getTextField_7() {
		if (textField_7 == null) {
			textField_7 = new JTextField();
			textField_7.setBounds(561, 411, 182, 27);
			textField_7.setColumns(10);
		}
		return textField_7;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("Total");
			lblNewLabel_9.setForeground(new Color(0, 0, 139));
			lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_9.setBounds(474, 410, 60, 27);
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("Print");
			lblNewLabel_10.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_10.getCursor().getPredefinedCursor(HAND_CURSOR);
				}
			});
			lblNewLabel_10.setForeground(new Color(0, 0, 139));
			lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_10.setBounds(509, 470, 69, 19);
		}
		return lblNewLabel_10;
	}
	private JLabel getLblNewLabel_11() {
		if (lblNewLabel_11 == null) {
			lblNewLabel_11 = new JLabel("");
			lblNewLabel_11.setBounds(459, 469, 38, 27);
			lblNewLabel_11.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\print.png").getImage().getScaledInstance(lblNewLabel_11.getWidth(), lblNewLabel_11.getHeight(), 0)));
			
		}
		return lblNewLabel_11;
	}
}
