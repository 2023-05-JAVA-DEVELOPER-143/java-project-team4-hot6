package com.itwill.shop.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.itwill.shop.userinfo.User;
import com.itwill.shop.userinfo.UserService;

public class MainFrameUser extends JFrame {

	private JPanel contentPane;
	private JTextField userSignUpIdTF;
	private JTextField userSignupNameTF;
	private JTextField userSignupEmailTF;
	private JTextField userSignupBDTF;
	private JTextField userSignupPhoneTF;
	private JTextField userIdTF;
	private JTextField userNameTF;
	private JTextField userPhoneTF;
	private JPasswordField userPasswordTF;
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
	private JTextField orderListIdTF;
	private JTable orderListTable;
	private JTable orderCartTable;
	private JTextField orderCartPriceTF;
	private JTextField orderCartNameTF;
	private JTextField orderCartDetailTF;
	private JTextField orderCartDateTF;
	private JTextField orderPayPriceTF;
	private JTable table;
	private JTextField orderPayNameTF;
	private JTextField orderPayPhoneTF;
	private JTextField productCategoryTF;
	private JLabel idCheckMsgLabel;

	// 서비스 객체 멤버 변수 선언
	private UserService userService;

	// 로그인한 user 객체을 저장할 user 객체선언
	private User loginUser = null;
	private JLabel userIdTextLabel;
	private JLabel userPwTextLabel;
	private JComboBox userEditSexComboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrameUser frame = new MainFrameUser();
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
	public MainFrameUser() {
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

		userIdTF = new JTextField();
		userIdTF.setBounds(119, 43, 116, 21);
		userLoginPanel.add(userIdTF);
		userIdTF.setColumns(10);

		JLabel userIdLabel = new JLabel("아이디");
		userIdLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userIdLabel.setBounds(50, 46, 57, 15);
		userLoginPanel.add(userIdLabel);

		JLabel userPasswordLabel = new JLabel("비밀번호");
		userPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		userPasswordLabel.setBounds(50, 97, 57, 15);
		userLoginPanel.add(userPasswordLabel);

		userNameTF = new JTextField();
		userNameTF.setBounds(119, 231, 116, 21);
		userLoginPanel.add(userNameTF);
		userNameTF.setColumns(10);

		userPhoneTF = new JTextField();
		userPhoneTF.setBounds(119, 277, 116, 21);
		userLoginPanel.add(userPhoneTF);
		userPhoneTF.setColumns(10);

		JLabel noUserNameTF = new JLabel("이름");
		noUserNameTF.setHorizontalAlignment(SwingConstants.CENTER);
		noUserNameTF.setBounds(50, 234, 57, 15);
		userLoginPanel.add(noUserNameTF);

		JLabel noUserPhoneTF = new JLabel("휴대전화");
		noUserPhoneTF.setHorizontalAlignment(SwingConstants.CENTER);
		noUserPhoneTF.setBounds(50, 280, 57, 15);
		userLoginPanel.add(noUserPhoneTF);

		JButton userLoginButton = new JButton("로그인");
		userLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userId = userIdTF.getText();
				String userPassword = userPasswordTF.getText();
				if (userId.equals("")) {
					userIdTextLabel.setText("아이디를 입력하세요");
					userIdTF.requestFocus();
					return;
				}
				if (userPassword.equals("")) {
					userPwTextLabel.setText("비밀번호를 입력하세요");
					userPasswordTF.requestFocus();
					return;
				}
				try {
					int result = userService.login(userId, userPassword);
					if (result == 1) {
						// 로그인 성공
						User loginUser = userService.findUser(userId);
						loginProcess(loginUser);

					} else if (result == 0) {
						// 로그인 실패
						JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 확인하세요.");
					}
				} catch (Exception e1) {
					// TODO: handle exception
				}
			}

		});

		userLoginButton.setBounds(65, 148, 97, 23);
		userLoginPanel.add(userLoginButton);

		JButton noUserLoginButton = new JButton("비회원 로그인");
		noUserLoginButton.setBounds(88, 325, 182, 23);
		userLoginPanel.add(noUserLoginButton);

		userPasswordTF = new JPasswordField();
		userPasswordTF.setBounds(119, 94, 116, 21);
		userLoginPanel.add(userPasswordTF);

		JSeparator separator = new JSeparator();
		separator.setBounds(12, 181, 330, 15);
		userLoginPanel.add(separator);

		userIdTextLabel = new JLabel("");
		userIdTextLabel.setForeground(Color.RED);
		userIdTextLabel.setBounds(119, 69, 151, 15);
		userLoginPanel.add(userIdTextLabel);

		userPwTextLabel = new JLabel("");
		userPwTextLabel.setForeground(Color.RED);
		userPwTextLabel.setBounds(119, 125, 151, 15);
		userLoginPanel.add(userPwTextLabel);

		JButton userJoinNewButton = new JButton("가입");
		userJoinNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		userJoinNewButton.setBounds(185, 148, 97, 23);
		userLoginPanel.add(userJoinNewButton);

		JPanel userSignUpPanel = new JPanel();
		tabbedPane_1.addTab("회원가입", null, userSignUpPanel, null);
		userSignUpPanel.setLayout(null);

		userSignUpIdTF = new JTextField();
		userSignUpIdTF.setBounds(128, 24, 142, 21);
		userSignUpPanel.add(userSignUpIdTF);
		userSignUpIdTF.setColumns(10);

		userSignupNameTF = new JTextField();
		userSignupNameTF.setBounds(128, 149, 142, 21);
		userSignUpPanel.add(userSignupNameTF);
		userSignupNameTF.setColumns(10);

		userSignupEmailTF = new JTextField();
		userSignupEmailTF.setBounds(128, 180, 142, 21);
		userSignUpPanel.add(userSignupEmailTF);
		userSignupEmailTF.setColumns(10);

		userSignupBDTF = new JTextField();
		userSignupBDTF.setBounds(128, 233, 142, 21);
		userSignUpPanel.add(userSignupBDTF);
		userSignupBDTF.setColumns(10);

		userSignupPhoneTF = new JTextField();
		userSignupPhoneTF.setBounds(128, 264, 142, 21);
		userSignUpPanel.add(userSignupPhoneTF);
		userSignupPhoneTF.setColumns(10);

		JComboBox userSignupSexComboBox = new JComboBox();
		userSignupSexComboBox.setModel(new DefaultComboBoxModel(new String[] { "여성", "남성" }));
		userSignupSexComboBox.setBounds(128, 295, 142, 23);
		userSignUpPanel.add(userSignupSexComboBox);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(59, 27, 57, 15);
		userSignUpPanel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(58, 74, 57, 15);
		userSignUpPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1.setBounds(28, 121, 86, 15);
		userSignUpPanel.add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("이름");
		lblNewLabel_2.setBounds(66, 152, 57, 15);
		userSignUpPanel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("이메일");
		lblNewLabel_3.setBounds(53, 186, 57, 15);
		userSignUpPanel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("생년월일");
		lblNewLabel_4.setBounds(53, 236, 57, 15);
		userSignUpPanel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("휴대전화");
		lblNewLabel_5.setBounds(53, 267, 57, 15);
		userSignUpPanel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("성별");
		lblNewLabel_6.setBounds(59, 299, 57, 15);
		userSignUpPanel.add(lblNewLabel_6);

		JCheckBox userSignUpEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userSignUpEmailCheckBox.setBounds(128, 204, 142, 23);
		userSignUpPanel.add(userSignUpEmailCheckBox);

		JButton userSignUpButton = new JButton("회원가입");
		userSignUpButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// 회원가입 버튼
					String id = userSignUpIdTF.getText();
					String password = new String(userSignUpPwTF.getPassword());
					String passwordCheck = new String(userSignUpPwCheckTF.getPassword());
					if (passwordCheck.equals(password)) {
						passwordCheck = new String(userSignUpPwCheckTF.getPassword());
					} else {
						JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
						userSignUpPwCheckTF.requestFocus();
					}
					String name = userSignupNameTF.getText();
					String email = userSignupEmailTF.getText();
					String emailSend = "";
					if (userSignUpEmailCheckBox.isSelected()) {
						emailSend = "T";
					} else {
						emailSend = "F";
					}
					String birthdate = userSignupBDTF.getText();
					String phone = userSignupPhoneTF.getText();
					String sex = (String) userSignupSexComboBox.getSelectedItem();

					if (id.equals("")) {
						idCheckMsgLabel.setText("아이디를 입력하세요.");
						userSignUpIdTF.requestFocus();
						return;
					} else {
						idCheckMsgLabel.setText("");
					}

					if (password.equals("")) {
						idCheckMsgLabel.setText("비밀번호를 입력하세요.");
						userSignUpPwTF.requestFocus();
						return;
					} else {
						idCheckMsgLabel.setText("");
					}

					if (passwordCheck.equals(password)) {
						User user = new User(id, password, passwordCheck, name, email, emailSend, birthdate, phone,
								sex);
						boolean isAdd = userService.addUser(user);
						if (isAdd) {
							//로그인 화면으로 이동
							tabbedPane_1.setSelectedIndex(0);
						} else {
							JOptionPane.showMessageDialog(null, id + "당신의 가입은 실패하였습니다.");
						}

						System.out.println(user);
					}

				} catch (Exception e1) {
					System.out.println("회원가입에러 --> " + e1.getMessage());
				}
				// 아이디 유효성 체크
			}
		});

		userSignUpButton.setBounds(109, 339, 97, 23);
		userSignUpPanel.add(userSignUpButton);

		userSignUpPwTF = new JPasswordField();
		userSignUpPwTF.setBounds(128, 71, 142, 21);
		userSignUpPanel.add(userSignUpPwTF);

		userSignUpPwCheckTF = new JPasswordField();
		userSignUpPwCheckTF.setBounds(127, 118, 143, 21);
		userSignUpPanel.add(userSignUpPwCheckTF);

		JButton btnNewButton_41 = new JButton("중복");
		btnNewButton_41.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/***************/
				boolean isUser = true;
				try {
					userService = new UserService();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					isUser = userService.isDuplicatedId(userSignUpIdTF.getText());
					if (isUser == true) {
						JOptionPane.showMessageDialog(null, "중복된 아이디 입니다.");
						userSignUpIdTF.setText("");
						userSignUpIdTF.requestFocus();
						return;
					} else {
						JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		btnNewButton_41.setBounds(282, 23, 60, 23);
		userSignUpPanel.add(btnNewButton_41);

		idCheckMsgLabel = new JLabel("");
		idCheckMsgLabel.setForeground(new Color(255, 0, 0));
		idCheckMsgLabel.setBounds(69, 52, 240, 15);
		userSignUpPanel.add(idCheckMsgLabel);

		JPanel userEditPanel = new JPanel();
		userEditPanel.setBackground(SystemColor.inactiveCaption);
		userEditPanel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/************ 회원정보 불러오기 ************/
				displayUserInfo(loginUser);

			}
		});
		userEditPanel.setLayout(null);
		tabbedPane_1.addTab("회원정보", null, userEditPanel, null);

		userEditIDTF = new JTextField();
		userEditIDTF.setColumns(10);
		userEditIDTF.setBounds(153, 20, 142, 21);
		userEditPanel.add(userEditIDTF);

		userEditNameTF = new JTextField();
		userEditNameTF.setColumns(10);
		userEditNameTF.setBounds(153, 113, 142, 21);
		userEditPanel.add(userEditNameTF);

		userEditEmailTF = new JTextField();
		userEditEmailTF.setColumns(10);
		userEditEmailTF.setBounds(153, 144, 142, 21);
		userEditPanel.add(userEditEmailTF);

		userEditBDTF = new JTextField();
		userEditBDTF.setColumns(10);
		userEditBDTF.setBounds(153, 200, 142, 21);
		userEditPanel.add(userEditBDTF);

		userEditPhoneTF = new JTextField();
		userEditPhoneTF.setColumns(10);
		userEditPhoneTF.setBounds(153, 231, 142, 21);
		userEditPanel.add(userEditPhoneTF);

		userEditSexComboBox = new JComboBox();
		userEditSexComboBox.setModel(new DefaultComboBoxModel(new String[] { "여성", "남성" }));
		userEditSexComboBox.setEditable(true);
		userEditSexComboBox.setBounds(153, 262, 142, 23);
		userEditPanel.add(userEditSexComboBox);

		JLabel lblNewLabel_11 = new JLabel("아이디");
		lblNewLabel_11.setBounds(78, 23, 57, 15);
		userEditPanel.add(lblNewLabel_11);

		JLabel lblNewLabel_1_2 = new JLabel("비밀번호");
		lblNewLabel_1_2.setBounds(67, 54, 57, 15);
		userEditPanel.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1_1_1.setBounds(36, 85, 86, 15);
		userEditPanel.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(84, 116, 57, 15);
		userEditPanel.add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("이메일");
		lblNewLabel_3_1.setBounds(78, 147, 57, 15);
		userEditPanel.add(lblNewLabel_3_1);

		JLabel lblNewLabel_4_1 = new JLabel("생년월일");
		lblNewLabel_4_1.setBounds(67, 203, 57, 15);
		userEditPanel.add(lblNewLabel_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("휴대전화");
		lblNewLabel_5_1.setBounds(67, 234, 57, 15);
		userEditPanel.add(lblNewLabel_5_1);

		JLabel lblNewLabel_6_1 = new JLabel("성별");
		lblNewLabel_6_1.setBounds(84, 266, 57, 15);
		userEditPanel.add(lblNewLabel_6_1);

		JCheckBox userEditEmailCheckBox = new JCheckBox("이메일 수신 동의");
		userEditEmailCheckBox.setBounds(153, 171, 142, 23);
		userEditPanel.add(userEditEmailCheckBox);

		JButton userEditButton = new JButton("회원정보 수정");
		userEditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/********* 수정폼 활성화 *********/
//				userEditIDTF.setEditable(true);
//				userEditPwTF.setEnabled(true);
//				userEditPwCheckTF.setEnabled(true);
//				userEditNameTF.setEnabled(true);
//				userEditEmailTF.setEnabled(true);
//				userEditEmailCheckBox.setEnabled(true);
//				userEditBDTF.setEnabled(true);
//				userEditPhoneTF.setEnabled(true);
//				userEditSexComboBox.setEnabled(true);

				/*********** 수정 가능 **********/
				String id = userEditIDTF.getText();
				String password = new String(userEditPwTF.getPassword());
				String name = userEditNameTF.getText();
				String email = userEditEmailTF.getText();
				String emailSend = "";
				if (userEditEmailCheckBox.isSelected()) {
					emailSend = "T";
				} else {
					emailSend = "F";
				}
				String jumin = userEditBDTF.getText();
				String phone = userEditPhoneTF.getText();
				String sex = (String) userSignupSexComboBox.getSelectedItem();

			}
		});
		userEditButton.setBounds(110, 305, 131, 23);
		userEditPanel.add(userEditButton);

		userEditPwTF = new JPasswordField();
		userEditPwTF.setBounds(153, 51, 142, 21);
		userEditPanel.add(userEditPwTF);

		userEditPwCheckTF = new JPasswordField();
		userEditPwCheckTF.setBounds(152, 82, 143, 21);
		userEditPanel.add(userEditPwCheckTF);

		JButton userEditQuitButton = new JButton("회원탈퇴");
		userEditQuitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/************ 회원 탈퇴 ************/
				try {
					userService.remove(loginUser.getUserId());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
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
		userFindidTF.setEditable(false);
		userFindidTF.setBounds(77, 143, 195, 21);
		userFindPanel.add(userFindidTF);
		userFindidTF.setColumns(10);

		userFindPwTF = new JTextField();
		userFindPwTF.setEditable(false);
		userFindPwTF.setBounds(77, 206, 195, 21);
		userFindPanel.add(userFindPwTF);
		userFindPwTF.setColumns(10);

		JLabel lblNewLabel_25 = new JLabel("당신의 아이디는...");
		lblNewLabel_25.setBounds(77, 118, 143, 15);
		userFindPanel.add(lblNewLabel_25);

		JLabel lblNewLabel_26 = new JLabel("당신의 비밀번호는...");
		lblNewLabel_26.setBounds(77, 181, 133, 15);
		userFindPanel.add(lblNewLabel_26);

		JPanel productTabPannel = new JPanel();
		tabbedPane.addTab("제품", null, productTabPannel, null);
		productTabPannel.setLayout(null);

		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_2.setBounds(0, 0, 359, 423);
		productTabPannel.add(tabbedPane_2);

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

		JPanel panel = new JPanel();
		tabbedPane_4.addTab("스포츠", null, panel, null);
		panel.setLayout(null);

		JPanel productDetailPanel = new JPanel();
		tabbedPane_2.addTab("제품상세", null, productDetailPanel, null);
		productDetailPanel.setLayout(null);

		productNameTF = new JTextField();
		productNameTF.setEditable(false);
		productNameTF.setText("제품이름");
		productNameTF.setBounds(201, 45, 116, 21);
		productDetailPanel.add(productNameTF);
		productNameTF.setColumns(10);

		productPriceTF = new JTextField();
		productPriceTF.setEditable(false);
		productPriceTF.setText("제품가격");
		productPriceTF.setBounds(201, 76, 116, 21);
		productDetailPanel.add(productPriceTF);
		productPriceTF.setColumns(10);

		productReadCountTF = new JTextField();
		productReadCountTF.setEditable(false);
		productReadCountTF.setText("조회수");
		productReadCountTF.setBounds(201, 107, 116, 21);
		productDetailPanel.add(productReadCountTF);
		productReadCountTF.setColumns(10);

		productDetailTF = new JTextField();
		productDetailTF.setEditable(false);
		productDetailTF.setText("상세설명");
		productDetailTF.setBounds(201, 169, 116, 124);
		productDetailPanel.add(productDetailTF);
		productDetailTF.setColumns(10);

		productDateTF = new JTextField();
		productDateTF.setEditable(false);
		productDateTF.setText("날짜");
		productDateTF.setBounds(201, 138, 116, 21);
		productDetailPanel.add(productDateTF);
		productDateTF.setColumns(10);

		JLabel productImageLabel = new JLabel("");
		productImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		productImageLabel.setIcon(new ImageIcon(MainFrameUser.class.getResource("/images/nothing.jpg")));
		productImageLabel.setBounds(12, 14, 158, 218);
		productDetailPanel.add(productImageLabel);

		JComboBox productQtyComboBox = new JComboBox();
		productQtyComboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		productQtyComboBox.setBounds(37, 303, 127, 23);
		productDetailPanel.add(productQtyComboBox);

		JButton productCartButton = new JButton("장바구니 담기");
		productCartButton.setBounds(201, 303, 116, 23);
		productDetailPanel.add(productCartButton);

		JButton productPayButton = new JButton("주문하기");
		productPayButton.setBounds(201, 339, 116, 23);
		productDetailPanel.add(productPayButton);

		productCategoryTF = new JTextField();
		productCategoryTF.setText("카테고리");
		productCategoryTF.setEditable(false);
		productCategoryTF.setBounds(201, 14, 116, 21);
		productDetailPanel.add(productCategoryTF);
		productCategoryTF.setColumns(10);

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
		lblNewLabel_12.setBounds(56, 130, 57, 15);
		productMainPanel.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("요리");
		lblNewLabel_13.setBounds(244, 130, 57, 15);
		productMainPanel.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("미술");
		lblNewLabel_14.setBounds(56, 290, 57, 15);
		productMainPanel.add(lblNewLabel_14);

		JLabel lblNewLabel_27 = new JLabel("스포츠");
		lblNewLabel_27.setBounds(244, 290, 57, 15);
		productMainPanel.add(lblNewLabel_27);

		JPanel orderTabPannel = new JPanel();
		tabbedPane.addTab("주문", null, orderTabPannel, null);
		orderTabPannel.setLayout(null);

		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setBounds(0, 0, 359, 423);
		orderTabPannel.add(tabbedPane_3);

		JPanel orderCartPanel = new JPanel();
		tabbedPane_3.addTab("장바구니", null, orderCartPanel, null);
		orderCartPanel.setLayout(null);

		JScrollPane orderCartScrollPane = new JScrollPane();
		orderCartScrollPane.setBounds(12, 10, 330, 157);
		orderCartPanel.add(orderCartScrollPane);

		orderCartTable = new JTable();
		orderCartTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		orderCartTable.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, },
				new String[] { "\uBC88\uD638", "\uAC15\uC758\uBA85", "\uC778\uC6D0", "\uAC00\uACA9",
						"\uCD1D\uAE08\uC561" }));
		orderCartScrollPane.setViewportView(orderCartTable);

		orderCartPriceTF = new JTextField();
		orderCartPriceTF.setEditable(false);
		orderCartPriceTF.setBounds(201, 177, 116, 21);
		orderCartPanel.add(orderCartPriceTF);
		orderCartPriceTF.setColumns(10);

		JLabel lblNewLabel_16 = new JLabel("총 결제금액 :");
		lblNewLabel_16.setBounds(122, 180, 90, 15);
		orderCartPanel.add(lblNewLabel_16);

		JLabel lblNewLabel_17 = new JLabel("원");
		lblNewLabel_17.setBounds(320, 180, 22, 15);
		orderCartPanel.add(lblNewLabel_17);

		orderCartNameTF = new JTextField();
		orderCartNameTF.setEditable(false);
		orderCartNameTF.setBounds(102, 208, 215, 21);
		orderCartPanel.add(orderCartNameTF);
		orderCartNameTF.setColumns(10);

		orderCartDetailTF = new JTextField();
		orderCartDetailTF.setEditable(false);
		orderCartDetailTF.setBounds(102, 239, 215, 21);
		orderCartPanel.add(orderCartDetailTF);
		orderCartDetailTF.setColumns(10);

		orderCartDateTF = new JTextField();
		orderCartDateTF.setEditable(false);
		orderCartDateTF.setBounds(102, 270, 215, 21);
		orderCartPanel.add(orderCartDateTF);
		orderCartDateTF.setColumns(10);

		JLabel lblNewLabel_18 = new JLabel("강의명 :");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(33, 211, 57, 15);
		orderCartPanel.add(lblNewLabel_18);

		JLabel lblNewLabel_19 = new JLabel("강의상세 :");
		lblNewLabel_19.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19.setBounds(33, 242, 57, 15);
		orderCartPanel.add(lblNewLabel_19);

		JLabel lblNewLabel_20 = new JLabel("강의일자 :");
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(33, 273, 57, 15);
		orderCartPanel.add(lblNewLabel_20);

		JComboBox orderCartQtyComboBox = new JComboBox();
		orderCartQtyComboBox.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
		orderCartQtyComboBox.setBounds(153, 301, 113, 23);
		orderCartPanel.add(orderCartQtyComboBox);

		JLabel lblNewLabel_21 = new JLabel("수강인원 :");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(20, 305, 70, 15);
		orderCartPanel.add(lblNewLabel_21);

		JButton orderCartQtyMinusButton = new JButton("-");
		orderCartQtyMinusButton.setBounds(102, 301, 39, 23);
		orderCartPanel.add(orderCartQtyMinusButton);

		JButton orderCartQtyPlusButton = new JButton("+");
		orderCartQtyPlusButton.setBounds(278, 301, 39, 23);
		orderCartPanel.add(orderCartQtyPlusButton);

		JButton orderCartEditButton = new JButton("주문 수정");
		orderCartEditButton.setBounds(30, 330, 97, 23);
		orderCartPanel.add(orderCartEditButton);

		JButton orderCartDeleteButton = new JButton("주문 삭제");
		orderCartDeleteButton.setBounds(136, 330, 97, 23);
		orderCartPanel.add(orderCartDeleteButton);

		JButton orderCartPayButton = new JButton("결제하기");
		orderCartPayButton.setBounds(245, 330, 97, 23);
		orderCartPanel.add(orderCartPayButton);

		JPanel orderPayPanel = new JPanel();
		orderPayPanel.setLayout(null);
		tabbedPane_3.addTab("결제", null, orderPayPanel, null);

		JScrollPane orderPayScrollPane = new JScrollPane();
		orderPayScrollPane.setBounds(12, 10, 330, 142);
		orderPayPanel.add(orderPayScrollPane);

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, },
				new String[] { "\uBC88\uD638", "\uAC15\uC758\uBA85", "\uC778\uC6D0", "\uAC00\uACA9",
						"\uCD1D\uAE08\uC561" }));
		orderPayScrollPane.setViewportView(table);

		orderPayPriceTF = new JTextField();
		orderPayPriceTF.setEditable(false);
		orderPayPriceTF.setColumns(10);
		orderPayPriceTF.setBounds(202, 165, 116, 21);
		orderPayPanel.add(orderPayPriceTF);

		JLabel lblNewLabel_16_1 = new JLabel("총 결제금액 :");
		lblNewLabel_16_1.setBounds(123, 168, 90, 15);
		orderPayPanel.add(lblNewLabel_16_1);

		JLabel lblNewLabel_17_1 = new JLabel("원");
		lblNewLabel_17_1.setBounds(321, 168, 22, 15);
		orderPayPanel.add(lblNewLabel_17_1);

		JButton orderPayPayButton = new JButton("결제");
		orderPayPayButton.setBounds(123, 335, 97, 23);
		orderPayPanel.add(orderPayPayButton);

		JComboBox orderPayPaymentComboBox = new JComboBox();
		orderPayPaymentComboBox.setModel(new DefaultComboBoxModel(new String[] { "신용카드", "무통장입금", "현장결제" }));
		orderPayPaymentComboBox.setBounds(109, 290, 200, 23);
		orderPayPanel.add(orderPayPaymentComboBox);

		JLabel lblNewLabel_22 = new JLabel("결제수단 :");
		lblNewLabel_22.setBounds(26, 294, 57, 15);
		orderPayPanel.add(lblNewLabel_22);

		orderPayNameTF = new JTextField();
		orderPayNameTF.setBounds(109, 206, 198, 21);
		orderPayPanel.add(orderPayNameTF);
		orderPayNameTF.setColumns(10);

		orderPayPhoneTF = new JTextField();
		orderPayPhoneTF.setBounds(109, 247, 198, 21);
		orderPayPanel.add(orderPayPhoneTF);
		orderPayPhoneTF.setColumns(10);

		JLabel lblNewLabel_23 = new JLabel("수강자 :");
		lblNewLabel_23.setBounds(26, 209, 57, 15);
		orderPayPanel.add(lblNewLabel_23);

		JLabel lblNewLabel_24 = new JLabel("연락처 :");
		lblNewLabel_24.setBounds(26, 250, 57, 15);
		orderPayPanel.add(lblNewLabel_24);

		JPanel orderListPanel = new JPanel();
		tabbedPane_3.addTab("주문내역", null, orderListPanel, null);
		orderListPanel.setLayout(null);

		orderListIdTF = new JTextField();
		orderListIdTF.setEditable(false);
		orderListIdTF.setBounds(47, 10, 116, 21);
		orderListPanel.add(orderListIdTF);
		orderListIdTF.setColumns(10);

		JLabel lblNewLabel_15 = new JLabel("님의 주문내역 입니다.");
		lblNewLabel_15.setBounds(175, 13, 136, 15);
		orderListPanel.add(lblNewLabel_15);

		JScrollPane orderListScrollPane = new JScrollPane();
		orderListScrollPane.setBounds(12, 41, 330, 308);
		orderListPanel.add(orderListScrollPane);

		orderListTable = new JTable();
		orderListTable.setModel(new DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null }, },
				new String[] { "\uC8FC\uBB38\uC77C\uC790", "\uAC15\uC758\uBA85", "\uC218\uB7C9", "\uAE08\uC561" }));
		orderListScrollPane.setViewportView(orderListTable);
	}

	public void loginProcess(User loginUser) {
		this.loginUser = loginUser;
		setTitle(loginUser.getUserId() + " 님 로그인");
	}

	private void displayUserInfo(User user) {
		/**** 로그인한 회원상세데이타 보여주기 *****/
		userEditIDTF.setText(user.getUserId());
		userEditPwTF.setText(user.getUserPw());
		userEditPwTF.setText(user.getUserPwCheck());
		userEditEmailTF.setText(user.getUserEmail());
		userEditBDTF.setText(user.getUserJumin());
		userEditPhoneTF.setText(user.getUserPhone());
		userEditSexComboBox.setSelectedItem(user.getUserGender());

		/******* 2.Service 객체생성 ***********/
		try {
			userService = new UserService();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// 생성자
}
