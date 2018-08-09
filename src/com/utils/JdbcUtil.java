package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 获取数据库连接工具类
 * */
public class JdbcUtil {
	private static String url="com.mysql.jdbc.Driver";
	private static String driver="jdbc:mysql://localhost:3306/db_mylibrary";
	private static String user="root";
	private static String pwd="605296";
	
	/*public JdbcUtils() {
		try {
			Class.forName(url);
			Connection conn=DriverManager.getConnection(driver, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/
	public static Connection getConnection() {
	try {
		Class.forName(url);
		return DriverManager.getConnection(driver, user, pwd);
		}  catch (Exception e) {
			throw new RuntimeException();
		}
	}
	public static void closeAll(Connection conn,PreparedStatement ps,ResultSet rs) {
		try {
			
			if (rs != null) {
				rs.close();  // 快速异常捕获 Alt + shift + z 
				rs = null;   // 建议垃圾回收期回收资源
				}
			if (ps != null) {
				ps.close();
				ps = null;
				}
			if (conn != null && !conn.isClosed()) {
				conn.close();
				conn = null;
				}
			} 
		catch (SQLException e) {
				throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		JdbcUtil jdbc=new JdbcUtil();
		System.out.println(jdbc.getConnection());
	}
}
