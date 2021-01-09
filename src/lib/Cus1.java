package lib;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Admin;
import model.cus;
import model.shangpin;

public class Cus1 extends Base {
	/**
     * 顾客登录
*/
	public  cus login(cus cust) {
		String sql ="select * from new_table1 where name =? and password =?";
		cus cusRst = null;
		try {
			PreparedStatement prst = con.prepareStatement(sql);//把sql语句传给数据库操作对象
			prst.setString(1, cust.getName());
			prst.setString(2, cust.getPassword());
			ResultSet executeQuery = prst.executeQuery();
			if(executeQuery.next()) {
				cusRst =new cus();
				cusRst.setId(executeQuery.getInt("id"));
				cusRst.setName(executeQuery.getString("name"));
				cusRst.setPassword(executeQuery.getString("password"));
				cusRst.setCreateDate(executeQuery.getString("createDate"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cusRst;
	}

	public cus login1(cus cusTmp) {
		// TODO Auto-generated method stub
		return null;
	}
		public  boolean addcus(cus cl) {
	    	 String sql= "insert into new_table1 values(null,?,?,?)";
	    	 try{
	    		 java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql);
	    		 preparedStatement.setString(1,cl.getName());
	    		 preparedStatement.setString(2,cl.getPassword());
	    	     preparedStatement.setString(3,cl.getCreateDate());
	    		 if(preparedStatement.executeUpdate() > 0)
	    		 return true;
	    	 }catch (SQLException e) {
	    		 e.printStackTrace();
	    	 }
			return false;
	     }
}

