package store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import String.StringUtil;
import lib.Cus1;
import lib.shangpinDao;
import model.cus;
import model.shangpin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class zhuce extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					zhuce frame = new zhuce();
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
	public zhuce() {
		setTitle("\u5C0F\u9EC4\u8D85\u5E02\u7528\u6237\u6CE8\u518C\u9875\u9762");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 392);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u540D\u8D26\u53F7\uFF1A");
		lblNewLabel.setIcon(new ImageIcon(zhuce.class.getResource("/images/\u8D26\u53F7.png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JLabel lblNewLabel_1 = new JLabel("\u7528\u6237\u540D\u5BC6\u7801\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(zhuce.class.getResource("/images/\u5BC6\u7801.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				adds(e2);
			}
		});
		btnNewButton.setIcon(new ImageIcon(zhuce.class.getResource("/images/\u6DFB\u52A0.png")));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JButton btnNewButton_1 = new JButton("\u9000\u51FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				exit(e1);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(zhuce.class.getResource("/images/\u9000\u51FA.png")));
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u521B\u5EFA\u65E5\u671F\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(zhuce.class.getResource("/images/\u65E5\u671F.png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(43))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addPreferredGap(ComponentPlacement.RELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField2)
								.addComponent(textField1)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(86)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
					.addGap(78))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(43)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1))
					.addGap(46))
		);
		contentPane.setLayout(gl_contentPane);
	}

	protected void adds(ActionEvent e2) {
		// TODO Auto-generated method stub
		String ssname =textField.getText().toString();//获取文本框输入的姓名
		String sspassword = textField1.getText().toString();//获取文本框输入的密码
		String sscreatedate=  textField2.getText().toString();//获取文本框输入的创建日期
		if(StringUtil.isEmpty(ssname)) {//如果输入的姓名为空
			JOptionPane.showMessageDialog(this, "顾客的用户名不能为空！");
			return;	
		}
		cus cl =new cus();
		cl.setName(ssname);
		cl.setPassword(sspassword);	
		cl.setCreateDate(sscreatedate);
		Cus1 cus = new Cus1();
		if(cus.addcus(cl)) {//与数据库的内容相连接
			JOptionPane.showMessageDialog(this, "顾客添加成功！");
	    }else {
			JOptionPane.showMessageDialog(this, "顾客添加失败！");
		}
		cus.close();	//关闭数据库
	}

	protected void exit(ActionEvent e1) {
		this.dispose();//关闭页面
	}
}
