package lib;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import String.StringUtil;
import model.shangpin;

//��Ʒ��Ϣ�����ݿ�Ĳ���
 


//��Ʒ������
public class shangpinDao extends Base {
	public boolean addShang(shangpin cl) {
    	 String sql= "insert into shangpin values(null,?,?,?)";
    	 try{
    		 java.sql.PreparedStatement preparedStatement = con.prepareStatement(sql);//ʵ����prepareStatement
    		 preparedStatement.setString(1,cl.getName());
    		 preparedStatement.setString(2,cl.getPrice());
    	     preparedStatement.setInt(3,cl.getNum());
    		 if(preparedStatement.executeUpdate() > 0)//executeUpdate()�������ݿ�
    		 return true;
    	 }catch (SQLException e) {
    		 e.printStackTrace();
    	 }
		return false;
     }
//��Ʒ�Ĳ�ѯ
	public  List<shangpin> getshangList (shangpin Shangpin){
		List<shangpin> retList = new ArrayList<shangpin>();
		String sqlString = "select * from shangpin";
		if(!StringUtil.isEmpty(Shangpin.getName())) {
			sqlString = sqlString+" where name like '%"+Shangpin.getName()+"%'";
		}
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sqlString);
			ResultSet executeQuery = preparedStatement.executeQuery();
			while(executeQuery.next()) {
				shangpin s1 =new shangpin();
				s1.setId(executeQuery.getInt("id"));
				s1.setName(executeQuery.getString("name"));
				s1.setPrice(executeQuery.getString("price"));
				s1.setNum(executeQuery.getInt("num"));
				retList.add(s1);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return retList;
	}
//��Ʒ��ɾ��
	public boolean delete(int id) {
		String sql = "delete from shangpin where id =?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1,id);
			if(preparedStatement.executeUpdate() > 0) {
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
//��Ʒ���޸�
	public boolean delete1(shangpin id) {
		String sql =" update shangpin set name=?,price=?,num=? where id=?";
		try {
			PreparedStatement preparedStatement2 = con.prepareStatement(sql);
			preparedStatement2.setInt(4, id.getId());
			preparedStatement2.setString(1, id.getName());
			preparedStatement2.setString(2, id.getPrice());
			preparedStatement2.setInt(3, id.getNum());
			if(preparedStatement2.executeUpdate() > 0) {
				return true; 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
