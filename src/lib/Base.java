package lib;

import java.sql.Connection;
import java.sql.SQLException;

import String.Dbutil;

public class Base {
  public    Connection con =new Dbutil().getCon();//数据库的连接
  public  void close() {//定义一个数据库关闭的函数
	  try {
		  con.close();
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
  }
}
