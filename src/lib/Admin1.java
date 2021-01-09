package lib;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.cus;

public class Admin1 extends Base {
	/**
          * ����Ա��¼
     */
	public  Admin login(Admin admin) {
		String sql ="select * from new_table where name =? and password =?";//���ݿ���䣺 ����
		Admin adminRst = null;
		try {
			PreparedStatement prst = con.prepareStatement(sql);//��sql��䴫�����ݿ��������
			prst.setString(1, admin.getName());
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();//ִ�в�ѯ��䲢�ұ�����  
			if(executeQuery.next()) {
				adminRst =new Admin();//����
				adminRst.setId(executeQuery.getInt("id"));
				adminRst.setName(executeQuery.getString("name"));
				adminRst.setPassword(executeQuery.getString("password"));
				adminRst.setCreateDate(executeQuery.getString("createDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminRst;
	}
	/**
     * �˿͵�¼
*/
	public  cus login1(cus cus) {
		String sql ="select * from new_table1 where name =? and password =?";//���ݿ���䣺 ����
		cus cusRst = null;
		try {
			PreparedStatement prst = con.prepareStatement(sql);//��sql��䴫�����ݿ��������
			prst.setString(1, cus.getName());
			prst.setString(2, cus.getPassword());
			ResultSet executeQuery = prst.executeQuery();//ִ�в�ѯ��䲢�ұ�����  
			if(executeQuery.next()) {
				cusRst =new cus();//����
				cusRst.setId(executeQuery.getInt("id"));
				cusRst.setName(executeQuery.getString("name"));
				cusRst.setPassword(executeQuery.getString("password"));
				cusRst.setCreateDate(executeQuery.getString("createDate"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cusRst;
	}
}
