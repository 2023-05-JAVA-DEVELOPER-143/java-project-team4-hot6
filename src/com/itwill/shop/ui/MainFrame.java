package com.itwill.shop.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JList;
import javax.swing.ImageIcon;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField userSignUpIdTF;
	private JTextField userSignupNameTF;
	private JTextField userSignupEmailTF;
	private JTextField userSignupBDTF;
	private JTextField userSignupPhoneTF;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField userSignUpPwTF;
	private JPasswordField userSignUpPwCheckTF;
	private JTextField userEditIDTF;
	private JTextField userEditNameTF;
	private JTextField userEditEmailTF;
	private JTextField userEditBDTF;
	private JTextField userEditPhoneTF;
	private JPasswordField userEditPwTF;
	private JPasswordField userEditPwCheckTF;
	private JTextField textField_1;
	private JTextField userFindidTF;
	private JTextField userFindPwTF;
	private JTextField textField_4;
	private JTextField productNameTF;
	private JTextField productPriceTF;
	private JTextField productReadCountTF;
	private JTextField productDetailTF;
	private JTextField productDateTF;

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
		setBounds(100, 100, 380, 495);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("프로그램");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("로그아웃");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("종료");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 364, 452);
		contentPane.add(tabbedPane);
		
		JPanel userTabPannel = new JPanel();
		tabbedPane.addTab("회원", null, userTabPannel, null);
		userTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setBounds(0, 0, 359, 423);
		userTabPannel.add(tabbedPane_1);
		
		JPanel userLoginPanel = new JPanel();
		tabbedPane_1.addTab("로그인", null, userLoginPanel, null);
		userLoginPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(133, 66, 116, 21);
		userLoginPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("아이디");
		lblNewLabel_7.setBounds(64, 69, 57, 15);
		userLoginPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("비밀번호");
		lblNewLabel_8.setBounds(50, 113, 57, 15);
		userLoginPanel.add(lblNewLabel_8);
		
		textField_2 = new JTextField();
		textField_2.setBounds(133, 251, 116, 21);
		userLoginPanel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(133, 300, 116, 21);
		userLoginPanel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("이름");
		lblNewLabel_9.setBounds(50, 254, 57, 15);
		userLoginPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("휴대전화");
		lblNewLabel_10.setBounds(50, 303, 57, 15);
		userLoginPanel.add(lblNewLabel_10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(116, 152, 97, 23);
		userLoginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("비회원 로그인");
		btnNewButton_1.setBounds(116, 331, 133, 23);
		userLoginPanel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(133, 110, 116, 21);
		userLoginPanel.add(passwordField);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 200, 330, 21);
		userLoginPanel.add(separator);
		
		JPanel userSignUpPanel = new JPanel();
		tabbedPane_1.addTab("회원가입", null, userSignUpPanel, null);
		userSignUpPanel.setLayout(null);
		
		userSignUpIdTF = new JTextField();
		userSignUpIdTF.setBounds(128, 10, 142, 21);
		userSignUpPanel.add(userSignUpIdTF);
		userSignUpIdTF.setColumns(10);
		
		userSignupNameTF = new JTextField();
		userSignupNameTF.setBounds(128, 103, 142, 21);
		userSignUpPanel.add(userSignupNameTF);
		userSignupNameTF.setColumns(10);
		
		userSignupEmailTF = new JTextField();
		userSignupEmailTF.setBounds(128, 134, 142, 21);
		userSignUpPanel.add(userSignupEmailTF);
		userSignupEmailTF.setColumns(10);
		
		userSignupBDTF = new JTextField();
		userSignupBDTF.setBounds(128, 190, 142, 21);
		userSignUpPanel.add(userSignupBDTF);
		userSignupBDTF.setColumns(10);
		
		userSignupPhoneTF = new JTextField();
		userSignupPhoneTF.setBounds(128, 221, 142, 21);
		userSignUpPanel.add(userSignupPhoneTF);
		userSignupPhoneTF.setColumns(10);
		
		JComboBox userSignupSexComboBox = new JComboBox();
		userSignupSexComboBox.setModel(new DefaultComboBoxModel(new String[] {"남자", "여자"}));
		userSignupSexComboBox.setBounds(128, 252, 142, 23);
		userSignUpPanel.add(userSignupSexComboBox);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(66, 13, 57, 15);
		userSignUpPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(53, 41, 57, 15);
		userSignUpPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1.setBounds(30, 75, 86, 15);
		userSignUpPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(66, 106, 57, 15);
		userSignUpPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("이메일");
		lblNewLabel_3.setBounds(59, 137, 57, 15);
		userSignUpPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("생년월일");
		lblNewLabel_4.setBounds(53, 193, 57, 15);
		userSignUpPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("휴대전화");
		lblNewLabel_5.setBounds(53, 224, 57, 15);
		userSignUpPanel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("성별");
		lblNewLabel_6.setBounds(59, 256, 57, 15);
		userSignUpPanel.add(lblNewLabel_6);
		
		JCheckBox userSignUpEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userSignUpEmailCheckBox.setBounds(128, 161, 142, 23);
		userSignUpPanel.add(userSignUpEmailCheckBox);
		
		JButton userSignUpButton = new JButton("회원가입");
		userSignUpButton.setBounds(120, 301, 97, 23);
		userSignUpPanel.add(userSignUpButton);
		
		userSignUpPwTF = new JPasswordField();
		userSignUpPwTF.setBounds(128, 41, 142, 21);
		userSignUpPanel.add(userSignUpPwTF);
		
		userSignUpPwCheckTF = new JPasswordField();
		userSignUpPwCheckTF.setBounds(127, 72, 143, 21);
		userSignUpPanel.add(userSignUpPwCheckTF);
		
		JPanel userEditPanel = new JPanel();
		userEditPanel.setLayout(null);
		tabbedPane_1.addTab("회원정보", null, userEditPanel, null);
		
		userEditIDTF = new JTextField();
		userEditIDTF.setEditable(false);
		userEditIDTF.setColumns(10);
		userEditIDTF.setBounds(128, 10, 142, 21);
		userEditPanel.add(userEditIDTF);
		
		userEditNameTF = new JTextField();
		userEditNameTF.setColumns(10);
		userEditNameTF.setBounds(128, 103, 142, 21);
		userEditPanel.add(userEditNameTF);
		
		userEditEmailTF = new JTextField();
		userEditEmailTF.setColumns(10);
		userEditEmailTF.setBounds(128, 134, 142, 21);
		userEditPanel.add(userEditEmailTF);
		
		userEditBDTF = new JTextField();
		userEditBDTF.setColumns(10);
		userEditBDTF.setBounds(128, 190, 142, 21);
		userEditPanel.add(userEditBDTF);
		
		userEditPhoneTF = new JTextField();
		userEditPhoneTF.setColumns(10);
		userEditPhoneTF.setBounds(128, 221, 142, 21);
		userEditPanel.add(userEditPhoneTF);
		
		JComboBox userEditSexComboBox = new JComboBox();
		userEditSexComboBox.setBounds(128, 252, 142, 23);
		userEditPanel.add(userEditSexComboBox);
		
		JLabel lblNewLabel_11 = new JLabel("아이디");
		lblNewLabel_11.setBounds(66, 13, 57, 15);
		userEditPanel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_1_2 = new JLabel("비밀번호");
		lblNewLabel_1_2.setBounds(53, 41, 57, 15);
		userEditPanel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1.setBounds(30, 75, 86, 15);
		userEditPanel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(66, 106, 57, 15);
		userEditPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("이메일");
		lblNewLabel_3_1.setBounds(59, 137, 57, 15);
		userEditPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("생년월일");
		lblNewLabel_4_1.setBounds(53, 193, 57, 15);
		userEditPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("휴대전화");
		lblNewLabel_5_1.setBounds(53, 224, 57, 15);
		userEditPanel.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("성별");
		lblNewLabel_6_1.setBounds(59, 256, 57, 15);
		userEditPanel.add(lblNewLabel_6_1);
		
		JCheckBox userEditEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userEditEmailCheckBox.setBounds(128, 161, 142, 23);
		userEditPanel.add(userEditEmailCheckBox);
		
		JButton userEditButton = new JButton("회원정보 수정");
		userEditButton.setBounds(110, 305, 131, 23);
		userEditPanel.add(userEditButton);
		
		userEditPwTF = new JPasswordField();
		userEditPwTF.setBounds(128, 41, 142, 21);
		userEditPanel.add(userEditPwTF);
		
		userEditPwCheckTF = new JPasswordField();
		userEditPwCheckTF.setBounds(127, 72, 143, 21);
		userEditPanel.add(userEditPwCheckTF);
		
		JButton userEditQuitButton = new JButton("회원탈퇴");
		userEditQuitButton.setBounds(130, 338, 97, 23);
		userEditPanel.add(userEditQuitButton);
		
		JPanel userFindPanel = new JPanel();
		tabbedPane_1.addTab("ID/PW찾기", null, userFindPanel, null);
		userFindPanel.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBounds(58, 51, 152, 21);
		userFindPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("조회");
		btnNewButton_2.setBounds(222, 50, 97, 23);
		userFindPanel.add(btnNewButton_2);
		
		userFindidTF = new JTextField();
		userFindidTF.setText("당신의 아이디는");
		userFindidTF.setEditable(false);
		userFindidTF.setBounds(77, 143, 195, 21);
		userFindPanel.add(userFindidTF);
		userFindidTF.setColumns(10);
		
		userFindPwTF = new JTextField();
		userFindPwTF.setEditable(false);
		userFindPwTF.setText("당신의 비밀번호는");
		userFindPwTF.setBounds(77, 206, 195, 21);
		userFindPanel.add(userFindPwTF);
		userFindPwTF.setColumns(10);
		
		JPanel productTabPannel = new JPanel();
		tabbedPane.addTab("제품", null, productTabPannel, null);
		productTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 359, 423);
		productTabPannel.add(tabbedPane_2);
		
		JPanel productMainPanel = new JPanel();
		tabbedPane_2.addTab("메인", null, productMainPanel, null);
		productMainPanel.setLayout(null);
		
		textField_4 = new JTextField();
		textField_4.setBounds(117, 10, 116, 21);
		productMainPanel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("취미찾기");
		btnNewButton_3.setBounds(245, 9, 97, 23);
		productMainPanel.add(btnNewButton_3);
		
		JLabel lblNewLabel_12 = new JLabel("수공예");
		lblNewLabel_12.setBounds(56, 100, 57, 15);
		productMainPanel.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("요리");
		lblNewLabel_13.setBounds(56, 195, 57, 15);
		productMainPanel.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("미술");
		lblNewLabel_14.setBounds(56, 290, 57, 15);
		productMainPanel.add(lblNewLabel_14);
		
		JPanel productCategoryPanel = new JPanel();
		tabbedPane_2.addTab("카테고리별", null, productCategoryPanel, null);
		productCategoryPanel.setLayout(null);
		
		JTabbedPane tabbedPane_4 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_4.setBounds(-1, 1, 354, 391);
		productCategoryPanel.add(tabbedPane_4);
		
		JPanel panel_7 = new JPanel();
		tabbedPane_4.addTab("수공예", null, panel_7, null);
		panel_7.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		tabbedPane_4.addTab("요리", null, panel_8, null);
		panel_8.setLayout(null);
		
		JPanel panel_9 = new JPanel();
		tabbedPane_4.addTab("미술", null, panel_9, null);
		panel_9.setLayout(null);
		
		JPanel productDetailPanel = new JPanel();
		tabbedPane_2.addTab("제품상세", null, productDetailPanel, null);
		productDetailPanel.setLayout(null);
		
		productNameTF = new JTextField();
		productNameTF.setText("제품이름");
		productNameTF.setBounds(201, 23, 116, 21);
		productDetailPanel.add(productNameTF);
		productNameTF.setColumns(10);
		
		productPriceTF = new JTextField();
		productPriceTF.setText("제품가격");
		productPriceTF.setBounds(201, 54, 116, 21);
		productDetailPanel.add(productPriceTF);
		productPriceTF.setColumns(10);
		
		productReadCountTF = new JTextField();
		productReadCountTF.setText("조회수");
		productReadCountTF.setBounds(201, 85, 116, 21);
		productDetailPanel.add(productReadCountTF);
		productReadCountTF.setColumns(10);
		
		productDetailTF = new JTextField();
		productDetailTF.setText("상세설명");
		productDetailTF.setBounds(201, 169, 116, 124);
		productDetailPanel.add(productDetailTF);
		productDetailTF.setColumns(10);
		
		productDateTF = new JTextField();
		productDateTF.setText("날짜");
		productDateTF.setBounds(201, 116, 116, 21);
		productDetailPanel.add(productDateTF);
		productDateTF.setColumns(10);
		
		JLabel productImageLabel = new JLabel("");
		productImageLabel.setIcon(new ImageIcon(MainFrame.class.getResource("/images/nothing.jpg")));
		productImageLabel.setBounds(65, 68, 76, 114);
		productDetailPanel.add(productImageLabel);
		
		JComboBox productQtyComboBox = new JComboBox();
		productQtyComboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		productQtyComboBox.setBounds(37, 303, 127, 23);
		productDetailPanel.add(productQtyComboBox);
		
		JButton productCartButton = new JButton("장바구니 담기");
		productCartButton.setBounds(201, 303, 116, 23);
		productDetailPanel.add(productCartButton);
		
		JButton productPayButton = new JButton("주문하기");
		productPayButton.setBounds(201, 339, 116, 23);
		productDetailPanel.add(productPayButton);
		
		JPanel orderTabPannel = new JPanel();
		tabbedPane.addTab("주문", null, orderTabPannel, null);
		orderTabPannel.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 359, 423);
		orderTabPannel.add(tabbedPane_3);
		
		JPanel orderCartPanel = new JPanel();
		tabbedPane_3.addTab("장바구니", null, orderCartPanel, null);
		
		JPanel orderPayPanel = new JPanel();
		tabbedPane_3.addTab("결제", null, orderPayPanel, null);
		
		JPanel orderListPanel = new JPanel();
		tabbedPane_3.addTab("주문내역", null, orderListPanel, null);
	}
}
