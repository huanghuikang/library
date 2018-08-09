package com.dbcon;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.xml.internal.fastinfoset.sax.Properties;
import com.utils.JdbcUtil;

public class ConnectionManager {
	/*private  Connection conn;
	private Statement st;
	private ResultSet rs;
	private  String url = "jdbc:mysql://localhost:3306/db_mylibrary";
	private  String driver = "com.mysql.jdbc.Driver" ;
	private  String user = "root";
	private  String pwd = "605296";


		 {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
				System.out.println("Çý¶¯³ÌÐò×¢²á³ö´í");
			}
		}
		
	public  Connection getConnection() throws SQLException {
		conn = null;
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void CloseAll(Connection conn,Statement st,ResultSet rs) throws Exception {
		if (rs!=null) {
			rs.close();
		}
		if(st!=null) {
			st.close();
		}
		if (conn!=null) {
			conn.close();
		}
	}*/
	
	
	private  Connection conn;
	private String url = "jdbc:mysql://localhost:3306/db_mylibrary";
	private String driver = "com.mysql.jdbc.Driver" ;
	private String user = "root";
	private String pwd = "605296";
	
	public ConnectionManager() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Çý¶¯³ÌÐò×¢²á³ö´í");
		}
	}
	public Connection getConnection() {
		try {
			conn = DriverManager.getConnection(url, user, pwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public void CloseAll(Connection conn,PreparedStatement ps,ResultSet rs) throws SQLException {
		if(rs!=null) {
			rs.close();
			rs = null;
		}
		if(ps!=null) {
			ps.close();
			ps=null;
		}
		if(conn!=null) {
			conn=null;
		}
	}
	public static void main(String[] args) throws Exception {
		ConnectionManager cm = new ConnectionManager();
		System.out.println(cm.getConnection());
	}
}
