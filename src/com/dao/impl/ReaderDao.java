package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IReaderDao;
import com.entity.Reader;
import com.utils.JdbcUtil;
import com.utils.SuperPublic;

public class ReaderDao extends SuperPublic implements IReaderDao {

	public void add(Reader reader) {
		String sql="insert into db_mylibrary.reader (rid,name,sex,age,grade,studentid,cardnum,tel,email) values(?,?,?,?,?,?,?,?,?)";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, reader.getRid());
			ps.setString(2, reader.getName());
			ps.setString(3, reader.getSex());
			ps.setInt(4, reader.getAge());
			ps.setString(5, reader.getGrade());
			ps.setString(6, reader.getStudentid());
			ps.setString(7, reader.getCardnum());
			ps.setString(8, reader.getTel());
			ps.setString(9, reader.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public void update(Reader reader) {
		String sql="update db_mylibrary.reader set name=?,sex=?,age=?,grade=?,studentid=?,cardnum=?,tel=?,email=? where rid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, reader.getName());
			ps.setString(2, reader.getSex());
			ps.setInt(3, reader.getAge());
			ps.setString(4, reader.getGrade());
			ps.setString(5, reader.getStudentid());
			ps.setString(6, reader.getCardnum());
			ps.setString(7, reader.getTel());
			ps.setString(8, reader.getEmail());
			ps.setInt(9, reader.getRid());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public Reader findByRid(String rid) {
		String sql="select * from db_mylibrary.reader where rid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, rid);
			rs=ps.executeQuery();
			Reader reader=null;
			if(rs.next()){
				reader=new Reader();
				reader.setRid(rs.getInt("rid"));
				reader.setName(rs.getString("name"));
				reader.setSex(rs.getString("sex"));
				reader.setAge(rs.getInt("age"));
				reader.setGrade(rs.getString("grade"));
				reader.setStudentid(rs.getString("studentid"));
				reader.setCardnum(rs.getString("cardnum"));
				reader.setTel(rs.getString("tel"));
				reader.setEmail(rs.getString("email"));
			}
			return reader;
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	public void delete(int rid) {
		String sql="delete from db_mylibrary.reader where rid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, rid);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
		
	}

	public List<Reader> getAll() {
		String sql="select * from db_mylibrary.reader";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			List<Reader> list=new ArrayList<Reader>();
			rs=ps.executeQuery();
			while(rs.next()) {
				Reader reader=new Reader();
				reader.setRid(rs.getInt("rid"));
				reader.setName(rs.getString("name"));
				reader.setSex(rs.getString("sex"));
				reader.setAge(rs.getInt("age"));
				reader.setGrade(rs.getString("grade"));
				reader.setStudentid(rs.getString("studentid"));
				reader.setCardnum(rs.getString("cardnum"));
				reader.setTel(rs.getString("tel"));
				reader.setEmail(rs.getString("email"));
				list.add(reader);
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
			return list;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	
	public List<Reader> search(int rid) {
		String sql="select * from db_mylibrary.reader where rid=?";
		List<Reader> list=new ArrayList<Reader>();
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, rid);
			rs=ps.executeQuery();
			while(rs.next()) {
				Reader reader=new Reader();
				reader.setRid(rs.getInt("rid"));
				reader.setName(rs.getString("name"));
				reader.setSex(rs.getString("sex"));
				reader.setAge(rs.getInt("age"));
				reader.setGrade(rs.getString("grade"));
				reader.setStudentid(rs.getString("studentid"));
				reader.setCardnum(rs.getString("cardnum"));
				reader.setTel(rs.getString("tel"));
				reader.setEmail(rs.getString("email"));
				list.add(reader);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return list;
	}

	
	
	
	/*public List<Reader> getAll(String name) {
		String sql="select * from db_mylibrary.reader where name=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return null;
	}*/

}
