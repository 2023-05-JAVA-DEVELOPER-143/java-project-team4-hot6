package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 364, 452);
		contentPane.add(tabbedPane);
		
		JPanel memberTabPannel = new JPanel();
		tabbedPane.addTab("회원", null, memberTabPannel, null);
		memberTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 359, 423);
		memberTabPannel.add(tabbedPane_1);
		
		JPanel panel = new JPanel();
		tabbedPane_1.addTab("로그인", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane_1.addTab("회원가입", null, panel_1, null);
		
		JPanel productTabPannel = new JPanel();
		tabbedPane.addTab("제품", null, productTabPannel, null);
		productTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 359, 423);
		productTabPannel.add(tabbedPane_2);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_2.addTab("카테고리별", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_2.addTab("제품상세", null, panel_3, null);
		
		JPanel orderTabPannel = new JPanel();
		tabbedPane.addTab("주문", null, orderTabPannel, null);
		orderTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 359, 423);
		orderTabPannel.add(tabbedPane_3);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_3.addTab("장바구니", null, panel_4, null);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_3.addTab("결제", null, panel_5, null);
		
		JPanel panel_6 = new JPanel();
		tabbedPane_3.addTab("주문내역", null, panel_6, null);
	}
}
