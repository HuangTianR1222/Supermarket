package lib;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.cus;

public class Admin1 extends Base {
	/**
          * 管理员登录
     */
	public  Admin login(Admin admin) {
		String sql ="select * from new_table where name =? and password =?";//数据库语句： 查找
		Admin adminRst = null;
		try {
			PreparedStatement prst = con.prepareStatement(sql);//把sql语句传给数据库操作对象
			prst.setString(1, admin.getName());
			prst.setString(2, admin.getPassword());
			ResultSet executeQuery = prst.executeQuery();//执行查询语句并且保存结果  
			if(executeQuery.next()) {
				adminRst =new Admin();//重置
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
     * 顾客登录
*/
	public  cus login1(cus cus) {
		String sql ="select * from new_table1 where name =? and password =?";//数据库语句： 查找
		cus cusRst = null;
		try {
			PreparedStatement prst = con.prepareStatement(sql);//把sql语句传给数据库操作对象
			prst.setString(1, cus.getName());
			prst.setString(2, cus.getPassword());
			ResultSet executeQuery = prst.executeQuery();//执行查询语句并且保存结果  
			if(executeQuery.next()) {
				cusRst =new cus();//重置
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
