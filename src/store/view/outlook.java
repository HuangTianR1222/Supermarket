package store.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import String.StringUtil;
import lib.Admin1;
import lib.Cus1;
import model.Admin;
import model.UserType;
import model.cus;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class outlook extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTextField;
	private JTextField passwordTextField;
	private JComboBox usertypeBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					outlook frame = new outlook();
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
	public outlook() {
		setTitle("\u8D85\u5E02\u7BA1\u7406\u7CFB\u7EDF");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 378);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu Menu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		Menu.setIcon(new ImageIcon(outlook.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E.png")));
		Menu.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(Menu);

		JMenuItem mntmNewMenuItem = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		mntmNewMenuItem.setIcon(new ImageIcon(outlook.class.getResource("/images/\u9000\u51FA.png")));
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				logout(e2);
			}
		});
		mntmNewMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		Menu.add(mntmNewMenuItem);

		JMenu Menu1 = new JMenu("\u8D85\u5E02\u7BA1\u7406");
		Menu1.setIcon(new ImageIcon(outlook.class.getResource("/images/\u8D85\u5E02(2).png")));

		Menu1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(Menu1);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		mntmNewMenuItem_1.setIcon(new ImageIcon(outlook.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				aboutuu(e1);
			}
		});
		mntmNewMenuItem_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		Menu1.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("\u8D85\u5E02\u7BA1\u7406\u7CFB\u7EDF\u754C\u9762");
		lblNewLabel.setIcon(new ImageIcon(outlook.class.getResource("/images/\u8D85\u5E02.png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 24));

		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(outlook.class.getResource("/images/\u7528\u6237.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		JLabel lblNewLabel_2 = new JLabel("\u5BC6    \u7801\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(outlook.class.getResource("/images/\u5BC6\u7801(1).png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		userNameTextField = new JTextField();
		userNameTextField.setColumns(10);

		passwordTextField = new JTextField();
		passwordTextField.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("\u7528\u6237\u7C7B\u578B\uFF1A");
		lblNewLabel_3.setIcon(new ImageIcon(outlook.class.getResource("/images/\u4EBA(2).png")));
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));

		usertypeBox = new JComboBox();
		usertypeBox.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		usertypeBox.setModel(new DefaultComboBoxModel(new UserType[] { UserType.ADMIN, UserType.CUS }));

		JButton FirstButton = new JButton("\u767B\u5F55");
		FirstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				loginAct(ae);
			}
		});
		FirstButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		FirstButton.setIcon(new ImageIcon(outlook.class.getResource("/images/\u767B\u5F55.png")));

		JButton SecondButton = new JButton("\u91CD\u7F6E");
		SecondButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restValue(e);
			}
		});
		SecondButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		SecondButton.setIcon(new ImageIcon(outlook.class.getResource("/images/\u91CD\u7F6E.png")));
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e11) {
				addhao(e11);
			}
		});
		btnNewButton.setIcon(new ImageIcon(outlook.class.getResource("/images/\u6CE8\u518C.png")));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(115)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 243, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(121)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_3)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton)
									.addGap(15)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(usertypeBox, 0, 175, Short.MAX_VALUE)
										.addComponent(passwordTextField, GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
										.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(30)
									.addComponent(FirstButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(SecondButton, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addGap(34)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(userNameTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_3)
						.addComponent(usertypeBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(SecondButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(FirstButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
   //new _____().setVisible(true);//跳转界面
   //JOptionPane.showMessageDialog(this,_____);//弹出含有内容的窗口
	
	protected void addhao(ActionEvent e11) {
		new MainFrm1().setVisible(true);//跳转到MainFrm1界面操作
	}
	
	protected void logout(ActionEvent e2) {
		this.dispose();//菜单栏中的退出系统 关闭界面
	}

	protected void aboutuu(ActionEvent e1) {
		String info = "小黄出品超市管理系统";
		JOptionPane.showMessageDialog(this, info); //点击关于我们就会弹出窗口 
	}

	protected void loginAct(ActionEvent ae) {
		//管理员和顾客登录
		String username = userNameTextField.getText().toString();//从文本框中获取得到的String 用户名
		String password = passwordTextField.getText().toString();//从文本框中获取得到的String 密码
		UserType selectedItem = (UserType) usertypeBox.getSelectedItem();//定义一个selectedIem来记录usertypeBox得到的数字
		if (StringUtil.isEmpty(username)) {//调用StringUtil中的函数判断 文本框里获得的用户名是不是空值
			JOptionPane.showMessageDialog(this, "用户名不能为空！");
			return;
		}
		if (StringUtil.isEmpty(password)) {//调用StringUtil中的函数判断 文本框里获得的密码是不是空值
			JOptionPane.showMessageDialog(this, "密码不能为空！");
			return;
		}
		if ("系统管理员".equals(selectedItem.getName())) {//如果菜单里的名字是"系统管理员"，则进行管理员运行操作
			Admin1 adminDao = new Admin1();//创建一个对象来构建和数据库的联系
			Admin adminTmp = new Admin();//创建一个系统管理员的对象
			adminTmp.setName(username);
			adminTmp.setPassword(password);
			Admin admin = adminDao.login(adminTmp);
			adminDao.close();//关闭数据库连接
			if (admin == null) {
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
			return;}
			JOptionPane.showMessageDialog(this, "欢迎"+admin.getName()+"管理员！");
			this.dispose();//关闭主界面
			new MainFrm(selectedItem, admin).setVisible(true);//跳转到MainFrm界面
		} else if ("顾客".equals(selectedItem.getName())) {//如果菜单里的名字是"顾客"，则进行管理员运行操作
			// 顾客登录
			Cus1 cusDao = new Cus1();//创建一个对象来构建和数据库的联系
			cus cusTmp = new cus();//创建一个顾客的对象
			cusTmp.setName(username);
			cusTmp.setPassword(password);
			cus cus2 = cusDao.login1(cusTmp);
			cusDao.close();//关闭数据库连接
			if (cus2 == null) {//若账号密码不相等 输出错误
				JOptionPane.showMessageDialog(this, "用户名或密码错误！");
			return;}
			JOptionPane.showMessageDialog(this, "欢迎！"+cus2.getName());//反之账号密码正确  进行下一步
			this.dispose();//关闭主界面
			new MainFrm1().setVisible(true);//跳转到MainFrm界面
		}
	}

	protected void restValue(ActionEvent e) {
		userNameTextField.setText("");//用setText函数清空输入用户名文本框
		passwordTextField.setText("");//用setText函数清空输入密码文本框
		usertypeBox.setSelectedIndex(0);//让用户类型改为系统管理员=0
	}
}
