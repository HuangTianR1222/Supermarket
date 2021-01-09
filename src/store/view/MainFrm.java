package store.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.UserType;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.Color;
import javax.swing.JLabel;

public class MainFrm extends JFrame {
	private UserType userType;
    private Object userObject;
	private Container desktopPane;
	/**
	 * Launch the application.
	 */
	//public static void main(String[] args) {
		//EventQueue.invokeLater(new Runnable() {
		//	public void run() {
		//		try {
			//		MainFrm frame = new MainFrm();
			//		frame.setVisible(true);
			//	} catch (Exception e) {
			//		e.printStackTrace();
			//	}
		//	}
	//	});
	//}

	/**
	 * Create the frame.
	 */
	public MainFrm(UserType userType,Object userObject) {
		setFont(new Font("微软雅黑", Font.PLAIN, 18));
		setTitle("\u8D85\u5E02\u7BA1\u7406\u7CFB\u7EDF");
		this.userType = userType;
		this.userObject = userObject;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 913, 588);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u7CFB\u7EDF\u8BBE\u7F6E");
		mnNewMenu.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7CFB\u7EDF\u8BBE\u7F6E.png")));
		mnNewMenu.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u9000\u51FA\u7CFB\u7EDF");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e4) {
				out(e4);
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u9000\u51FA.png")));
		mntmNewMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuBar menuBar_1 = new JMenuBar();
		mnNewMenu.add(menuBar_1);
		
		JMenu mnNewMenu_1 = new JMenu("\u8D85\u5E02\u7BA1\u7406");
		mnNewMenu_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8D85\u5E02(2).png")));
		mnNewMenu_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5173\u4E8E\u6211\u4EEC");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				about(e3);
			}
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\u589E\u52A0\u5546\u54C1");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e5) {
				tiaozhuan(e5);
			}
		});
		mntmNewMenuItem_2.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5546\u54C1.png")));
		mntmNewMenuItem_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\u7BA1\u7406\u5546\u54C1");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e8) {
				zhuanyi(e8);
			}
		});
		mntmNewMenuItem_3.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u7BA1\u7406.png")));
		mntmNewMenuItem_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_3);
		mntmNewMenuItem_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mntmNewMenuItem_1.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u5173\u4E8E\u6211\u4EEC.png")));
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.PINK);
		getContentPane().add(desktopPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("\u5C0F\u9EC4\u8D85\u5E02");
		lblNewLabel.setIcon(new ImageIcon(MainFrm.class.getResource("/images/\u8D85\u5E02.png")));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 50));
		lblNewLabel.setBounds(296, 156, 436, 168);
		desktopPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u6B22\u8FCE\u5149\u4E34\uFF01");
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(573, 282, 316, 117);
		desktopPane.add(lblNewLabel_1);
	}
	protected void zhuanyi(ActionEvent e8) {//跳转到管理商品界面
		guanli sca1 =new guanli();
		sca1.setVisible(true);//等价于 new guanli.setVisible(true);
	}
	protected void tiaozhuan(ActionEvent e5) {//跳转到增加商品界面
		addshang sca =new addshang();
		sca.setVisible(true);//等价于 new addshang.setVisible(true);
	}
	protected void out(ActionEvent e4) {//退出系统
		this.dispose();
	}
	protected void about(ActionEvent e3) {//关于我们
		String info = "小黄出品超市管理系统";
		JOptionPane.showMessageDialog(this, info);//弹出界面
	}
}
