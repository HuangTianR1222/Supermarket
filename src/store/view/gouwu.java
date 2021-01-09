package store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lib.shangpinDao;
import model.shangpin;

import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class gouwu extends JFrame {

	private JPanel contentPane;
	private JTextField chazhaoField;
	private JTable table;
	private JTextField nameField;
	private JTextField priceField;
	private JTextField numField;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gouwu frame = new gouwu();
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
	public gouwu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 640);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u795D\uFF1A\u5148\u751F/\u5973\u58EB\u8EAB\u4F53\u5065\u5EB7 \u4E07\u4E8B\u5982\u610F \u5E74\u5E74\u6709\u4ECA\u65E5 \u5C81\u5C81\u6709\u4ECA\u671D");
		mntmNewMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		mntmNewMenuItem.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u5587\u53ED \u516C\u544A \u6D88\u606F.png")));
		menuBar.add(mntmNewMenuItem);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5546\u54C1\u540D\u79F0\uFF1A");
		lblNewLabel.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u5546\u54C1.png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		chazhaoField = new JTextField();
		chazhaoField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e9) {
				shangpin sc = new shangpin();
				sc.setName(chazhaoField.getText().toString());
			    setTable(sc);
			}
});
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		btnNewButton.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u67E5\u8BE2.png")));
		
		JScrollPane scrollPane = new JScrollPane();
		
		JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u540D\u79F0\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u5546\u54C1.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u4EF7\u683C.png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("\u5546\u54C1\u6570\u91CF\uFF1A");
		lblNewLabel_3.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u6570\u91CF\u7EDF\u8BA1.png")));
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		priceField = new JTextField();
		priceField.setColumns(10);
		
		numField = new JTextField();
		numField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u8D2D\u4E70\u6570\u91CF\uFF1A");
		lblNewLabel_4.setIcon(new ImageIcon(gouwu.class.getResource("/images/\u8D2D\u4E70.png")));
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("\u786E\u5B9A");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e2) {
				add2(e2);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JButton btnNewButton_2 = new JButton("\u9000\u51FA");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e1) {
				dianji(e1);
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(109)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(lblNewLabel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(15)
											.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(14)
											.addComponent(priceField, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
										.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(numField, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)))
									.addGap(46)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_4)
											.addGap(10)
											.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 148, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(scrollPane, Alignment.LEADING)
									.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(chazhaoField, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
										.addGap(52)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE))))
							.addGap(56))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
							.addGap(493))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(chazhaoField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(52)
									.addComponent(lblNewLabel_1)
									.addGap(27)
									.addComponent(lblNewLabel_2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(54)
									.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(34)
									.addComponent(priceField, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)))
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_3)
								.addComponent(numField, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(37, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(425, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
					.addGap(83))
		);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selectedTableRow(10);
			}
		});
		table.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5546\u54C1ID", "\u5546\u54C1\u540D\u79F0", "\u5546\u54C1\u4EF7\u683C", "\u5546\u54C1\u6570\u91CF"
			}
		));
		scrollPane.setViewportView(table);
		contentPane.setLayout(gl_contentPane);
		setTable(new shangpin());
		//shangDao.close(); 
	}

	protected void add2(ActionEvent e2) {
		shangpinDao shangDao =new shangpinDao();//定义一个与数据库连接的对象
		int index = table.getSelectedRow();//定义一个变量来检测是否选中数据
		if(index == -1) {//如果没选中
			JOptionPane.showMessageDialog(this, "请选中要购买的商品！");
			return;
		}
		DefaultTableModel ab1 =(DefaultTableModel) table.getModel();
		int shangnum = Integer.parseInt(ab1.getValueAt(table.getSelectedRow(),3).toString());//获取位置第4的内容
		String shangName = ab1.getValueAt(table.getSelectedRow(),1).toString();//获取位置第2的内容
		String shangprice = ab1.getValueAt(table.getSelectedRow(),2).toString();//获取位置第3的内容
		int  id = Integer.parseInt(ab1.getValueAt(table.getSelectedRow(),0).toString());//获取位置第1的内容
		String name1 = nameField.getText().toString();
		String price1 = priceField.getText().toString();
		int  num1 = Integer.parseInt(numField.getText().toString()) ;
		int addnum = Integer.parseInt(textField_4.getText().toString());//将输入的数目存入一个addnum变量
		int znum=shangnum-addnum;//znum为购买后总数量
		shangpin sc =new shangpin();
		sc.setId(id);
		sc.setName(name1);
		sc.setPrice(price1);
		sc.setNum(znum);
		if(shangDao.delete1(sc)) {//与数据库里的数据进行对接
			JOptionPane.showMessageDialog(this, "购买成功！");
		}else {
			JOptionPane.showMessageDialog(this, "购买失败！");
		}
		setTable(new shangpin());//刷新表格内容
		shangDao.close();//关闭数据库
	}

	protected void selectedTableRow(int i) {
		DefaultTableModel ab3 =(DefaultTableModel) table.getModel();//定义一个DefaultTableModel类，来实现TableModel接口
		nameField.setText(ab3.getValueAt(table.getSelectedRow(),1).toString());//在nameField中显示数据中的名称
		priceField.setText(ab3.getValueAt(table.getSelectedRow(),2).toString());//在priceField中显示数据中的价格
		numField.setText(ab3.getValueAt(table.getSelectedRow(),3).toString());//在numField中显示数据中的数量
	}

	protected void dianji(MouseEvent e1) {
		JOptionPane.showMessageDialog(this, "欢迎下次光临小黄超市！");
		this.dispose();//关闭界面
	}
	private void setTable(shangpin Shangpin) {//刷新表格内容
		DefaultTableModel ab3 =(DefaultTableModel) table.getModel();//定义一个DefaultTableModel类，来实现TableModel接口
		ab3.setRowCount(0);//数据库受到影响后进行归零
		shangpinDao shangDao =new shangpinDao();
		List<shangpin> shangList = shangDao.getshangList(Shangpin);
		for( shangpin s1: shangList) {
			Vector v = new Vector();//向量的累加
			v.add(s1.getId());
			v.add(s1.getName());
			v.add(s1.getPrice());
			v.add(s1.getNum());
			ab3.addRow(v);//设定受到影响的行数
		}
		shangDao.close();//关闭数据库
	}
}
