package store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.UserType;
import model.cus;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class MainFrm1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrm1 frame = new MainFrm1();
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
	public MainFrm1() {
		setTitle("\u5C0F\u9EC4\u8D85\u5E02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 480);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("\u5173\u4E8E\u6211\u4EEC");
		Menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent ea) {
				click(ea);
			}
		});
		Menu.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		Menu.setIcon(new ImageIcon(MainFrm1.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		menuBar.add(Menu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5C0F\u9EC4\u8D85\u5E02\u6B22\u8FCE\u60A8!");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 52));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(MainFrm1.class.getResource("/images/\u8D85\u5E02.png")));
		
		JButton Button = new JButton("\u5F00\u59CB\u8D2D\u7269");
		Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ee) {
				tiaozhuan(ee);
			}
		});
		Button.setIcon(new ImageIcon(MainFrm1.class.getResource("/images/\u5F00\u59CB.png")));
		Button.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		Button.setToolTipText("\u5F00\u59CB\u8D2D\u7269");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(419, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(63)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 391, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(217, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(494, Short.MAX_VALUE)
					.addComponent(Button, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblNewLabel)
					.addGap(65)
					.addComponent(Button, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(107, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void tiaozhuan(ActionEvent ee) {
		this.dispose();//关闭界面
		new gouwu().setVisible(true);//跳转到gouwu界面
	}

	protected void click(MouseEvent ea) {
		String info = "小黄出品超市管理系统！";
		JOptionPane.showMessageDialog(this, info);
	}
}
