package com.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.IWorkDao;
import com.entity.Work;
import com.utils.JdbcUtil;
import com.utils.SuperPublic;

public class WorkDao extends SuperPublic implements IWorkDao {

	public void add(Work work) {
		String sql="INSERT INTO db_mylibrary.work (id, rid, bid, borrowdate, backdate, borrowtimes, backtimes, complete) VALUES (?,?,?,?,?,?,?,?)";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, work.getId());
			ps.setInt(2, work.getRid());
			ps.setInt(3, work.getBid());
			ps.setString(4, work.getBorrowdate());
			ps.setString(5, work.getBackdate());
			ps.setInt(6, work.getBorrowtimes());
			ps.setInt(7, work.getBacktimes());
			ps.setString(8, work.getComplete());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}

	}

	public void update(Work work) {
		String sql="update db_mylibrary.work set rid=?,bid=?,borrowdate=?,backdate=?,borrowtimes=?,backtimes=?,complete=? where id=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, work.getRid());
			ps.setInt(2, work.getBid());
			ps.setString(3, work.getBorrowdate());
			ps.setString(4, work.getBackdate());
			ps.setInt(5, work.getBorrowtimes());
			ps.setInt(6, work.getBacktimes());
			ps.setString(7, work.getComplete());
			ps.setInt(8, work.getId());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}


	}

	public void delete(int id) {
		String sql="delete from db_mylibrary.work where id=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}


	}

	public Work findById(String id) {
		String sql="select * from db_mylibrary.work where id=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			//Book book=new Book();
			Work work = null;
			if(rs.next()) {
				work=new Work();
				work.setId(rs.getInt("id"));
				work.setRid(rs.getInt("rid"));
				work.setBid(rs.getInt("bid"));
				work.setBorrowdate(rs.getString("borrowdate"));
				work.setBackdate(rs.getString("backdate"));
				work.setBorrowtimes(rs.getInt("borrowtimes"));
				work.setBacktimes(rs.getInt("backtimes"));
				work.setComplete(rs.getString("complete"));
			}
			return work;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	public List<Work> getAll() {
		String sql="select * from db_mylibrary.work";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			List<Work> list=new ArrayList<Work>();
			while(rs.next()) {
				Work work=new Work();
				work.setId(rs.getInt("id"));
				work.setRid(rs.getInt("rid"));
				work.setBid(rs.getInt("bid"));
				work.setBorrowdate(rs.getString("borrowdate"));
				work.setBackdate(rs.getString("backdate"));
				work.setBorrowtimes(rs.getInt("borrowtimes"));
				work.setBacktimes(rs.getInt("backtimes"));
				work.setComplete(rs.getString("complete"));
				list.add(work);
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	
	public List<Work> search(int id) {
		List<Work> list=new ArrayList<Work>();
		String sql="select * from db_mylibrary.work where id=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			while (rs.next()) {

				Work work=new Work();
				work.setId(rs.getInt("id"));
				work.setRid(rs.getInt("rid"));
				work.setBid(rs.getInt("bid"));
				work.setBorrowdate(rs.getString("borrowdate"));
				work.setBackdate(rs.getString("backdate"));
				work.setBorrowtimes(rs.getInt("borrowtimes"));
				work.setBacktimes(rs.getInt("backtimes"));
				work.setComplete(rs.getString("complete"));
				list.add(work);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return list;
	}

	

}
