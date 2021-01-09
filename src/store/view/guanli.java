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
		lblNewLabel.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JButton chazhaoButton = new JButton("\u67E5\u8BE2");
		chazhaoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e9) {
				shangpin sc = new shangpin();
				sc.setName(chazhaoField.getText().toString());
				setTable(sc);
			}
		});
		chazhaoButton.setIcon(new ImageIcon(guanli.class.getResource("/images/\u67E5\u8BE2.png")));
		chazhaoButton.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane();
		
		chazhaoField = new JTextField();
		chazhaoField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5546\u54C1\u540D\u79F0\uFF1A");
		lblNewLabel_1.setIcon(new ImageIcon(guanli.class.getResource("/images/\u5546\u54C1.png")));
		lblNewLabel_1.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5546\u54C1\u4EF7\u683C\uFF1A");
		lblNewLabel_2.setIcon(new ImageIcon(guanli.class.getResource("/images/\u4EF7\u683C.png")));
		lblNewLabel_2.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JLabel lblNewLabel_3 = new JLabel("\u5546\u54C1\u6570\u91CF\uFF1A");
		lblNewLabel_3.setIcon(new ImageIcon(guanli.class.getResource("/images/\u6570\u91CF\u7EDF\u8BA1.png")));
		lblNewLabel_3.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
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
		deleteButton.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
		JLabel lblNewLabel_4 = new JLabel("\u5546\u54C1\u8FDB\u8D27\u589E\u52A0\uFF1A");
		lblNewLabel_4.setIcon(new ImageIcon(guanli.class.getResource("/images/\u8FDB\u8D27.png")));
		lblNewLabel_4.setFont(new Font("΢���ź�", Font.PLAIN, 18));
		
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
		changeButton.setFont(new Font("΢���ź�", Font.PLAIN, 18));
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
		shangpinDao shangDao =new shangpinDao();//����һ�������ݿ����ӵĶ���
		int index = shangpin_table.getSelectedRow();//����һ������������Ƿ�ѡ������
		if(index == -1) {//���ûѡ��
			JOptionPane.showMessageDialog(this, "��ѡ��Ҫ�޸ĵ����ݣ�");
			return;
		}
		DefaultTableModel ab1 =(DefaultTableModel) shangpin_table.getModel();//����һ��DefaultTableModel�࣬��ʵ��TableModel�ӿ�
		int shangnum = Integer.parseInt(ab1.getValueAt(shangpin_table.getSelectedRow(),3).toString());//��ȡλ�õ�4������
		String shangName = ab1.getValueAt(shangpin_table.getSelectedRow(),1).toString();//��ȡλ�õ�2������
		String shangprice = ab1.getValueAt(shangpin_table.getSelectedRow(),2).toString();//��ȡλ�õ�3������
		int  id = Integer.parseInt(ab1.getValueAt(shangpin_table.getSelectedRow(),0).toString());//��ȡλ�õ�1������
		String name1 = nameField.getText().toString();
		String price1 = priceField.getText().toString();
		int  num1 = Integer.parseInt(numField.getText().toString()) ;
		int addnum = Integer.parseInt(addField.getText().toString());//���������Ŀ����һ��addnum����
		int znum=addnum+shangnum;//znumΪ���Ӻ�������
		shangpin sc =new shangpin();
		sc.setId(id);
		sc.setName(name1);
		sc.setPrice(price1);
		sc.setNum(znum);
		if(shangDao.delete1(sc)) {//�����ݿ�������ݽ��жԽ�
			JOptionPane.showMessageDialog(this, "��ӳɹ���");
		}else {
			JOptionPane.showMessageDialog(this, "���ʧ�ܣ�");
		}
		setTable(new shangpin());//ˢ�±������
		shangDao.close();//�ر����ݿ�
	}
	protected void delete(ActionEvent e1) {//getSelectedRow()������ѡ�����
		int index = shangpin_table.getSelectedRow();//����һ������������Ƿ�ѡ������
		if(index == -1) {//���ûѡ��
			JOptionPane.showMessageDialog(this, "��ѡ��Ҫɾ�������ݣ�");
			return;
		}
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();
		int id = Integer.parseInt(ab.getValueAt(shangpin_table.getSelectedRow(),0).toString());//getValueAt( , )�����к���ȡ��ָ��λ�õ�Ԫ��
		shangpinDao shangDao =new shangpinDao();
		if(shangDao.delete(id)) {//�����ݿ�������ݽ��жԽ�
			JOptionPane.showMessageDialog(this, "ɾ���ɹ���");
		}else {
			JOptionPane.showMessageDialog(this, "ɾ��ʧ�ܣ�");
		}
		setTable(new shangpin());//ˢ�±������
		shangDao.close(); //�ر����ݿ�
	}

	protected void selectedTableRow(int i) {
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();//����һ��DefaultTableModel�࣬��ʵ��TableModel�ӿ�
		nameField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),1).toString());//��nameField����ʾ�����е�����
		priceField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),2).toString());//��priceField����ʾ�����еļ۸�
		numField.setText(ab.getValueAt(shangpin_table.getSelectedRow(),3).toString());//��numField����ʾ�����е�����
	}

	private void setTable(shangpin Shangpin) {//ˢ�±������
		DefaultTableModel ab =(DefaultTableModel) shangpin_table.getModel();//����һ��DefaultTableModel�࣬��ʵ��TableModel�ӿ�
		ab.setRowCount(0);//���ݿ��ܵ�Ӱ�����й���
		shangpinDao shangDao =new shangpinDao();
		List<shangpin> shangList = shangDao.getshangList(Shangpin);
		for( shangpin s1c: shangList) {
			Vector v = new Vector();//�������ۼ�
			v.add(s1c.getId());
			v.add(s1c.getName());
			v.add(s1c.getPrice());
			v.add(s1c.getNum());
			ab.addRow(v);//�趨�ܵ�Ӱ�������
			System.out.println(v);
		}
		shangDao.close();//�ر����ݿ�
	}
}
