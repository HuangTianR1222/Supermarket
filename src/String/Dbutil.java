package String;
//�������ݿ�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private String dbUrl="jdbc:mysql://localhost:3306/new_schema?characterEncoding=utf8&useSSL=false&zeroDateTimeBehavior=convertToNull"; // ���ݿ����ӵ�ַ
	private String dbUserName="root"; // ���ݿ������û���
	private String dbPassword="2542468689"; // ���ݿ���������
	private String jdbcName="com.mysql.jdbc.Driver";//���������ݿ���������
	public Connection getCon() {//�����������ݿ⺯��
		try {
			Class.forName(jdbcName);//������������
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con =null; //���������ݿ����Ӷ���
		try {
			con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void closeCon(Connection con)throws Exception{//�ر����ݿ����
		if(con!=null) {//����NullPointerException
			con.close();//�ر����ݿ�	
		}
	}
	public static void main(String[] args) {
		Dbutil dbUtil =new Dbutil();
		try {
			dbUtil.getCon();//�������ݿ�
			System.out.println("���ݿ����ӳɹ���");
		}catch(Exception e) {
			e.printStackTrace();//�����쳣���ʼ��e
			System.out.println("���ݿ�����ʧ�ܣ�");
		}
	}
}
