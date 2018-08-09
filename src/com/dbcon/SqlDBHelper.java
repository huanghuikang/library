package com.dbcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SqlDBHelper extends ConnectionManager {
	Connection conn = super.getConnection();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List selSql(String sql,Object[] obj) {
		List list = new ArrayList();
		try {
			ps = conn.prepareStatement(sql);
			if(obj!=null) {
				for(int i=0; i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);
				}
			}
			rs=ps.executeQuery();
			ResultSetMetaData rsmd=rs.getMetaData();
			int colum=rsmd.getColumnCount();
			while (rs.next()) {
				List row=new ArrayList();
				for(int i=0;i<colum;i++) {
					row.add(i, rs.getObject(i+1));
				}
				list.add(row);
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				super.CloseAll(conn, ps, rs);
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		return list;
	}
	public int updSql(String sql,Object[] obj) {
		int n=0;
		try {
			ps=conn.prepareStatement(sql);
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);
				}
			}
			n=ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				super.CloseAll(conn, ps, rs);
			}
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return n;
	}
	public int addSql(String sql,Object[] obj) {
		int n=0;
		try {
			ps=conn.prepareStatement(sql);
			if(obj!=null) {
				for(int i=0; i<obj.length;i++) {
					ps.setObject(i+1, obj[i]);
				}
			}
			n=ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				super.CloseAll(conn, ps, rs);
			} catch (Exception e3) {
				e3.printStackTrace();
			}
		}
		return n;
	}
	public int delSql(String sql,Object[] obj) {
		int n=0;
		try {
			ps=conn.prepareStatement(sql);
			if(obj!=null) {
				for(int i=0;i<obj.length;i++) {
					ps.setObject(i+1, obj[1]);
				}
			}
			n=ps.executeUpdate();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				super.CloseAll(conn, ps, rs);
			} catch (Exception e4) {
				e4.printStackTrace();
			}
		}
		return n;
	}
}
