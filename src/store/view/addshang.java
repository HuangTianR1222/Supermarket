package store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import String.StringUtil;
import lib.shangpinDao;
import model.shangpin;

import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class addshang extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;//��Ʒ����
	private JTextField textField2;//��Ʒ�۸�
	private JTextField textField3;//��Ʒ����

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addshang frame = new addshang();
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
	public addshang() {
		setTitle("\u589E\u52A0\u5546\u54C1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("\u589E\u52A0\u5546\u54C1\u540D\u79F0\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(addshang.class.getResource("/images/\u540D\u79F0.png")));
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("\u589E\u52A0\u5546\u54C1\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(addshang.class.getResource("/images/\u4EF7\u683C.png")));
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0\u5546\u54C1");
		btnNewButton.setIcon(new ImageIcon(addshang.class.getResource("/images/\u6DFB\u52A0.png")));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e7) {
				adds(e7);
			}
		});
		btnNewButton.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JButton btnNewButton_1 = new JButton("\u91CD\u7F6E\u4FE1\u606F");
		btnNewButton_1.setIcon(new ImageIcon(addshang.class.getResource("/images/\u91CD\u7F6E.png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e6) {
				resetValue(e6);
			}
		});
		btnNewButton_1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u589E\u52A0\u5546\u54C1\u6570\u91CF\uFF1A");
		lblNewLabel.setIcon(new ImageIcon(addshang.class.getResource("/images/\u6570\u91CF\u7EDF\u8BA1.png")));
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(117)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
					.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addGap(82))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(40)
							.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 136, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 132, Short.MAX_VALUE)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 132, Short.MAX_VALUE))))
					.addGap(75)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textField1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField3))
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE))
					.addGap(160))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(54)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(48)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(56)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
					.addGap(66))
		);
		contentPane.setLayout(gl_contentPane);
	}
	//  ��Ʒ����1  ��Ʒ�۸�2  ��Ʒ����3
	protected void adds(ActionEvent e7) {
		// TODO Auto-generated method stub
		String ssname =textField1.getText().toString();//��ȡ��Ʒ����
		String ssprice = textField2.getText().toString();//��ȡ��Ʒ�۸�
		int ssnum =  Integer.valueOf(textField3.getText());//��ȡ��Ʒ����
		if(StringUtil.isEmpty(ssname)) {//����������Ʒ����Ϊ��
			JOptionPane.showMessageDialog(this, "��Ʒ���Ʋ���Ϊ�գ�");
			return;
		}
		shangpin cl =new shangpin();//�� ����������õ������Ը�cl
		cl.setName(ssname);
		cl.setPrice(ssprice);	
		cl.setNum(ssnum);
		shangpinDao shangDao = new shangpinDao();
		if(shangDao.addShang(cl)) {
			JOptionPane.showMessageDialog(this, "��Ʒ��ӳɹ���");
	    }else {
			JOptionPane.showMessageDialog(this, "��Ʒ���ʧ�ܣ�");
		}
		shangDao.close();//�ر����ݿ�
		resetValue(e7);//��������ı���
}
		

	protected void resetValue(ActionEvent e6) {//��������ı��� �����ã�
		// TODO Auto-generated method stub
		textField1.setText("");
		textField2.setText("");
		textField3.setText("");
	}
}
