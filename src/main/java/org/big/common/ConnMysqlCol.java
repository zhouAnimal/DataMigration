package org.big.common;

import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnMysqlCol {
	public static void main(String[] args) {
		// 声明Connection对象
		java.sql.Connection con;
		// 驱动程序名
		String driver = "com.mysql.jdbc.Driver";
		// URL指向要访问的数据库名mydata
		String url = "jdbc:mysql://127.0.0.1:3000/colchina?serverTimezone=GMT%2B8";
		// MySQL配置时的用户名
		String user = "root";
		// MySQL配置时的密码
		String password = "CoL@Wts_2015";
		// 遍历查询结果集

		try {
			// 加载驱动程序
			Class.forName(driver);
			// 1.getConnection()方法，连接MySQL数据库！！
			con = DriverManager.getConnection(url, user, password);
			if (!con.isClosed())
				System.out.println("Succeeded connecting to the Database!");
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Sorry,can`t find the Driver!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}
	}

}
