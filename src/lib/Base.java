package lib;

import java.sql.Connection;
import java.sql.SQLException;

import String.Dbutil;

public class Base {
  public    Connection con =new Dbutil().getCon();//���ݿ������
  public  void close() {//����һ�����ݿ�رյĺ���
	  try {
		  con.close();
	  }catch (SQLException e) {
		  e.printStackTrace();
	  }
  }
}
