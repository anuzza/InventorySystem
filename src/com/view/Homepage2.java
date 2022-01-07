package com.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Homepage2 extends JFrame {

	private JPanel contentPane;
	private JPanel layeredPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage2 frame = new Homepage2();
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
	public Homepage2() {
		setFont(new Font("Dialog", Font.BOLD, 12));
		setTitle("Quick Bill");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1005, 476);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(72, 61, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLayeredPane_1());
	}
	private JPanel getLayeredPane_1() {
		if (layeredPane == null) {
			layeredPane = new JPanel();
			layeredPane.setForeground(Color.YELLOW);
			layeredPane.setBorder(new LineBorder(new Color(0, 0, 0)));
			layeredPane.setBackground(new Color(255, 255, 153));
			layeredPane.setBounds(0, 0, 989, 67);
			layeredPane.setLayout(null);
			layeredPane.add(getLblNewLabel_5());
			layeredPane.add(getLblNewLabel());
			layeredPane.add(getLblNewLabel_1());
			layeredPane.add(getLblNewLabel_2());
			layeredPane.add(getLblNewLabel_3());
			layeredPane.add(getLblNewLabel_4());
			layeredPane.add(getLblNewLabel_6());
			layeredPane.add(getLblNewLabel_7());
			layeredPane.add(getLblNewLabel_8());
			layeredPane.add(getLblNewLabel_9());
			layeredPane.add(getLblNewLabel_10());
		}
		return layeredPane;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Cashier");
			lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel.setCursor(getCursor().getPredefinedCursor(HAND_CURSOR));
					
				}
			});
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new AddCashier().setVisible(true);
					dispose();
					
				}
			});
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel.setForeground(new Color(51, 0, 102));
			lblNewLabel.setBounds(233, 21, 71, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Transaction");
			lblNewLabel_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
				}
			});
			lblNewLabel_1.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_1.setCursor(getCursor().getPredefinedCursor(HAND_CURSOR));
				}
			});
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_1.setForeground(new Color(51, 0, 102));
			lblNewLabel_1.setBounds(398, 21, 80, 14);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("Stock");
			lblNewLabel_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new UpdateStock().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_2.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_2.setCursor(getCursor().getPredefinedCursor(HAND_CURSOR));
				}
			});
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_2.setForeground(new Color(51, 0, 102));
			lblNewLabel_2.setBounds(564, 21, 87, 14);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("Sales");
			lblNewLabel_3.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_3.setCursor(getCursor().getPredefinedCursor(HAND_CURSOR));
					
				}
			});
			lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_3.setForeground(new Color(51, 0, 102));
			lblNewLabel_3.setBounds(703, 21, 63, 14);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("Exit");
			lblNewLabel_4.addMouseMotionListener(new MouseMotionAdapter() {
				@Override
				public void mouseMoved(MouseEvent e) {
					lblNewLabel_4.setCursor(getCursor().getPredefinedCursor(HAND_CURSOR));
					
				}
			});
			lblNewLabel_4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					new LoginForm().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
			lblNewLabel_4.setForeground(new Color(51, 0, 102));
			lblNewLabel_4.setBounds(945, 21, 34, 14);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setBounds(10, 11, 135, 45);
			lblNewLabel_5.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\quick.png").getImage().getScaledInstance(lblNewLabel_5.getWidth(), lblNewLabel_5.getHeight(), 0)));
			
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_6() {
		if (lblNewLabel_6 == null) {
			lblNewLabel_6 = new JLabel("");
			lblNewLabel_6.setBackground(new Color(255, 255, 153));
			lblNewLabel_6.setBounds(182, 11, 45, 34);
			lblNewLabel_6.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\cashier.jpg").getImage().getScaledInstance(lblNewLabel_6.getWidth(), lblNewLabel_6.getHeight(), 0)));
			
		}
		return lblNewLabel_6;
	}
	private JLabel getLblNewLabel_7() {
		if (lblNewLabel_7 == null) {
			lblNewLabel_7 = new JLabel("");
			lblNewLabel_7.setBounds(354, 11, 34, 34);
			lblNewLabel_7.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\transaction.jpg").getImage().getScaledInstance(lblNewLabel_7.getWidth(), lblNewLabel_7.getHeight(), 0)));
			
		}
		return lblNewLabel_7;
	}
	private JLabel getLblNewLabel_8() {
		if (lblNewLabel_8 == null) {
			
			lblNewLabel_8 = new JLabel("");
			lblNewLabel_8.setBounds(520, 11, 34, 34);
			lblNewLabel_8.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\stock.png").getImage().getScaledInstance(lblNewLabel_8.getWidth(), lblNewLabel_8.getHeight(), 0)));
			
		}
		return lblNewLabel_8;
	}
	private JLabel getLblNewLabel_9() {
		if (lblNewLabel_9 == null) {
			lblNewLabel_9 = new JLabel("");
			lblNewLabel_9.setBounds(659, 11, 32, 34);
			lblNewLabel_9.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\sales.png").getImage().getScaledInstance(lblNewLabel_9.getWidth(), lblNewLabel_9.getHeight(), 0)));
			
		}
		return lblNewLabel_9;
	}
	private JLabel getLblNewLabel_10() {
		if (lblNewLabel_10 == null) {
			lblNewLabel_10 = new JLabel("");
			lblNewLabel_10.setBounds(901, 11, 34, 34);
			lblNewLabel_10.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\icons\\exit.jpg").getImage().getScaledInstance(lblNewLabel_10.getWidth(), lblNewLabel_10.getHeight(), 0)));
			
		}
		return lblNewLabel_10;
	}
}
