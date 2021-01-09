package store.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.List;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import lib.shangpinDao;
import model.shangpin;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class guanli extends JFrame {

	private JPanel contentPane;
	private JTextField chazhaoField;
	private JTable shangpin_table;
	private JTextField nameField;
	private JTextField priceField;
	private JTextField numField;
	private JTextField addField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guanli frame = new guanli();
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
	public guanli() {
		setTitle("\u8D85\u5E02\u5546\u54C1\u7BA1\u7406");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 511);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("\u5546\u54C1\u540D\u79F0");
		lblNewLabel.setIcon(new ImageIcon(guanli.class.getResource("/images/\u5546\u54C1.png")));
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JButton chazhaoButton = new JButton("\u67E5\u8BE2");
		chazhaoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e9) {
				shangpin sc = new shangpin();
				sc.setName(chazhaoField.getText().toString());
				setTable(sc);
			}
		});
		chazhaoButton.setIcon(new ImageIcon(guanli.class.getResource("/images/\u67E5\u8BE2.png")));
		chazhaoButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		
		chazhaoField = new JTextField();
		chazhaoField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u540D\u79F0\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(guanli.class.getResource("/images/\u5546\u54C1.png")));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(guanli.class.getResource("/images/\u4EF7\u683C.png")));
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("\u5546\u54C1\u6570\u91CF\uFF1A");
		lblNewLabel_3.setIcon(new ImageIcon(guanli.class.getResource("/images/\u6570\u91CF\u7EDF\u8BA1.png")));
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		priceField = new JTextField();
		priceField.setColumns(10);
		
		numField = new JTextField();
		numField.setColumns(10);
		
		JButton deleteButton = new JButton("\u5220\u9664");
		deleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				delete(e1);
			}
		});
		deleteButton.setIcon(new ImageIcon(guanli.class.getResource("/images/\u5220 \u9664 (1).png")));
		deleteButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		JLabel lblNewLabel_4 = new JLabel("\u5546\u54C1\u8FDB\u8D27\u589E\u52A0\uFF1A");
		lblNewLabel_4.setIcon(new ImageIcon(guanli.class.getResource("/images/\u8FDB\u8D27.png")));
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		addField = new JTextField();
		/*addField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e3) {
				getContentPane().add(e3);
			}
		});*/
		addField.setColumns(10);
		
		JButton changeButton = new JButton("\u4FEE\u6539");
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e4) {
				add1(e4);
			}
		});
		changeButton.setIcon(new ImageIcon(guanli.class.getResource("/images/\u4FEE\u6539(1).png")));
		changeButton.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(143)
							.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 393, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel)
									.addGap(18)
									.addComponent(chazhaoField, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
									.addGap(47)
									.addComponent(chazhaoButton, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_1)
									.addGap(9)
									.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
									.addGap(39)
									.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(deleteButton, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
										.addComponent(addField))))))
					.addContainerGap(97, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(8)
							.addComponent(numField, 103, 103, 103))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(lblNewLabel_2)
							.addGap(10)
							.addComponent(priceField, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)))
					.addGap(55)
					.addComponent(changeButton, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chazhaoButton, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(chazhaoField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 221, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(22)
									.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addComponent(lblNewLabel_2)
									.addGap(13)
									.addComponent(lblNewLabel_3))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(19)
									.addComponent(priceField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
									.addGap(20)
									.addComponent(numField, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(27)
									.addComponent(addField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(25)
									.addComponent(lblNewLabel_4)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(changeButton)
								.addComponent(deleteButton))))
					.addContainerGap())
		);
		shangpin_table = new JTable();
		shangpin_table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e10) {
				selectedTableRow(10);
			}
		});
		shangpin_table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"\u5546\u54C1ID", "\u5546\u54C1\u540D\u79F0", "\u5546\u54C1\u4EF7\u683C", "\u5546\u54C1\u6570\u91CF"
			}
		));
		scrollPane.setViewportView(shangpin_table);
		contentPane.setLayout(gl_contentPane);
		setTable(new shangpin());
	}
	protected void add1(ActionEvent e4) {
		shangpinDao shangDao =new shangpinDao();//定义一个与数据库连接的对象
		int index = shangpin_table.getSelectedRow();//定义一个变量来检测是否选中数据
		if(index == -1) {//如果没选中
			JOptionPane.showMessageDialog(this, "请选中要修改的数据！");
			return;
		}
		DefaultTableModel ab1 =(DefaultTableModel) shangpin_table.getModel();//定义一个DefaultTableModel类，来实现TableModel接口
		int shangnum = Integer.parseInt(ab1.getValueAt(shangpin_table.getSelectedRow(),3).toString());//获取位置第4的内容
		String shangName = ab1.getValueAt(shangpin_table.getSelectedRow(),1).toString();//获取位置第2的内容
		String shangprice = ab1.getValueAt(shangpin_table.getSelectedRow(),2).toString();//获取位置第3的内容
		int  id = Integer.parseInt(ab1.getValueAt(shangpin_table.getSelectedRow(),0).toString());//获取位置第1的内容
		String name1 = nameField.getText().toString();
		String price1 = priceField.getText().toString();
		int  num1 = Integer.parseInt(numField.getText().toString()) ;
		int addnum = Integer.parseInt(addField.getText().toString());//将输入的数目存入一个addnum变量
		int znum=addnum+shangnum;//znum为增加后总数量
		shangpin sc =new shangpin();
		sc.setId(id);
		sc.setName(name1);
		sc.setPrice(price1);
		sc.setNum(znum);
		if(shangDao.delete1(sc)) {//与数据库里的数据进行对接
			JOptionPane.showMessageDialog(this, "添加成功！");
		}else {
			JOptionPane.showMessageDialog(this, "添加失败！");
		}
		setTable(new shangpin());//刷新表格内容
		shangDao.close();//关闭数据库
	}
	protected void delete(ActionEvent e1) {//getSelectedRow()返回所选择的行
		int index = shangpin_table.getSelectedRow();//定义一个变量来检测是否选中数据
		if(index == -1) {//如果没选中
			JOptionPane.showMessageDialog(this, "请选中要删除的数据！");
			return;
		}
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();
		int id = Integer.parseInt(ab.getValueAt(shangpin_table.getSelectedRow(),0).toString());//getValueAt( , )根据行和列取得指定位置的元素
		shangpinDao shangDao =new shangpinDao();
		if(shangDao.delete(id)) {//与数据库里的数据进行对接
			JOptionPane.showMessageDialog(this, "删除成功！");
		}else {
			JOptionPane.showMessageDialog(this, "删除失败！");
		}
		setTable(new shangpin());//刷新表格内容
		shangDao.close(); //关闭数据库
	}

	protected void selectedTableRow(int i) {
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();//定义一个DefaultTableModel类，来实现TableModel接口
		nameField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),1).toString());//在nameField中显示数据中的名称
		priceField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),2).toString());//在priceField中显示数据中的价格
		numField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),3).toString());//在numField中显示数据中的数量
	}

	private void setTable(shangpin Shangpin) {//刷新表格内容
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();//定义一个DefaultTableModel类，来实现TableModel接口
		ab.setRowCount(0);//数据库受到影响后进行归零
		shangpinDao shangDao =new shangpinDao();
		List<shangpin> shangList = shangDao.getshangList(Shangpin);
		for( shangpin s1c: shangList) {
			Vector v = new Vector();//向量的累加
			v.add(s1c.getId());
			v.add(s1c.getName());
			v.add(s1c.getPrice());
			v.add(s1c.getNum());
			ab.addRow(v);//设定受到影响的行数
			System.out.println(v);
		}
		shangDao.close();//关闭数据库
	}
}
