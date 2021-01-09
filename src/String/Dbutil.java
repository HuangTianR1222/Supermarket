package String;
//连接数据库
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbutil {
	private String dbUrl="jdbc:mysql://localhost:3306/new_schema?characterEncoding=utf8&useSSL=false&zeroDateTimeBehavior=convertToNull"; // 数据库连接地址
	private String dbUserName="root"; // 数据库连接用户名
	private String dbPassword="2542468689"; // 数据库连接密码
	private String jdbcName="com.mysql.jdbc.Driver";//定义了数据库驱动程序
	public Connection getCon() {//构造连接数据库函数
		try {
			Class.forName(jdbcName);//加载驱动程序
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Connection con =null; //声明了数据库连接对象
		try {
			con = DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public void closeCon(Connection con)throws Exception{//关闭数据库操作
		if(con!=null) {//避免NullPointerException
			con.close();//关闭数据库	
		}
	}
	public static void main(String[] args) {
		Dbutil dbUtil =new Dbutil();
		try {
			dbUtil.getCon();//连接数据库
			System.out.println("数据库连接成功！");
		}catch(Exception e) {
			e.printStackTrace();//出现异常后初始化e
			System.out.println("数据库连接失败！");
		}
	}
}
