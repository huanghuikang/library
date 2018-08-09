package com.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dbcon.ConnectionManager;


public class SuperPublic {
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected String sql;
	protected int row;
	public SuperPublic() {
		ConnectionManager cm = new ConnectionManager();
		conn = cm.getConnection();
	}

}
