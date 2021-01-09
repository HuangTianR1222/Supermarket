package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import String.StringUtil;
import lib.Base;
import model.shangpin;

class shangpinTest extends Base {

	@Test
	void testAddShang() {
		
		shangpin cl =new shangpin();
		 String sql= "insert into shangpin values(null,?,?,?)";
    		 java.sql.PreparedStatement preparedStatement;
			try {
				preparedStatement = con.prepareStatement(sql);
				 preparedStatement.setString(1,cl.getName());
	    		 preparedStatement.setString(2,cl.getPrice());
	    	     preparedStatement.setInt(3,cl.getNum());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//ÊµÀý»¯prepareStatement
}

	@Test
	void testGetshangList() {

		List<shangpin> retList = new ArrayList<shangpin>();
		String sqlString = "select * from shangpin";
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
		//return retList;
	}

	@Test
	void testDelete() {
		String sql = "delete from shangpin where id =?";
		try {
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setInt(1,555);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	void testDelete1() {
		shangpin id =new shangpin();
		String sql =" update shangpin set name=?,price=?,num=? where id=?";
		try {
			PreparedStatement preparedStatement2 = con.prepareStatement(sql);
			preparedStatement2.setInt(4, id.getId());
			preparedStatement2.setString(1, id.getName());
			preparedStatement2.setString(2, id.getPrice());
			preparedStatement2.setInt(3, id.getNum());
			if(preparedStatement2.executeUpdate() > 0) {
			
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
	}


