package com.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.IManagerDao;
import com.entity.Manager;
import com.utils.JdbcUtil;
import com.utils.SuperPublic;

public class ManagerDao extends SuperPublic implements IManagerDao {
	
	public Manager findNameAndPwd(Manager manager) {
		String sql="select * from db_mylibrary.manager where name=? and pwd=?";
		Manager maner=null;
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, manager.getName());
			ps.setString(2, manager.getPwd());
			rs=ps.executeQuery();
			if(rs.next()) {
				maner=new Manager();
				maner.setMid(rs.getInt("mid"));
				maner.setName(rs.getString("name"));
				maner.setPwd(rs.getString("pwd"));
			}
			return maner;
		} catch (Exception e) {
			throw new RuntimeException();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	public void save(Manager manager) {
		String sql="insert into db_mylibrary.manager(name,sex,age,birthday,cardnum,workdate,tel,pwd,problem,answer) values(?,?,?,?,?,?,?,?,?,?)";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			//ÉèÖÃ²ÎÊý
			ps.setString(1, manager.getName());
			ps.setString(2, manager.getSex());
			ps.setInt(3, manager.getAge());
			ps.setString(4, manager.getBirthday());
			ps.setString(5, manager.getCardnum());
			ps.setString(6, manager.getWorkdate());
			ps.setString(7, manager.getTel());
			//ps.setString(7, manager.getEmail());
			ps.setString(8, manager.getPwd());
			ps.setString(9, manager.getProblem());
			ps.setString(10, manager.getAnswer());
			ps.executeUpdate();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public boolean userNameExists(String name) {
		String sql="select mid from db_mylibrary.manager where name=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, name);
			rs=ps.executeQuery();
			if(rs.next()) {
				int mid=rs.getInt("mid");
				if(mid > 0) {
					return true;
				}
			}
			return false;
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	
	public void update(Manager manager) {
		String sql="update db_mylibrary.manager set name=?,sex=?,age=?,birthday=?,cardnum=?,workdate=?,tel=?,email=?,pwd=?,problem=?,answer=? where mid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, manager.getName());
			ps.setString(2, manager.getSex());
			ps.setInt(3, manager.getAge());
			ps.setString(4, manager.getBirthday());
			ps.setString(5, manager.getCardnum());
			ps.setString(6, manager.getWorkdate());
			ps.setString(7, manager.getTel());
			ps.setString(8, manager.getEmail());
			ps.setString(9, manager.getPwd());
			ps.setString(10, manager.getProblem());
			ps.setString(11, manager.getAnswer());
			ps.setInt(12, manager.getMid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public Manager findByMid(String mid) {
		String sql="select * from db_mylibrary.manager where mid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, mid);
			rs=ps.executeQuery();
			Manager manager=null;
			if(rs.next()) {
				manager=new Manager();
				manager.setMid(rs.getInt("mid"));
				manager.setName(rs.getString("name"));
				manager.setSex(rs.getString("sex"));
				manager.setAge(rs.getInt("age"));
				manager.setBirthday(rs.getString("birthday"));
				manager.setCardnum(rs.getString("cardnum"));
				manager.setWorkdate(rs.getString("workdate"));
				manager.setTel(rs.getString("tel"));
				manager.setEmail(rs.getString("email"));
				manager.setPwd(rs.getString("pwd"));
				manager.setProblem(rs.getString("problem"));
				manager.setAnswer(rs.getString("answer"));
			}
			return manager;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	public void delete(int mid) {
		String sql="delete from db_mylibrary.manager where mid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, mid);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public List<Manager> getAll() {
		String sql="select * from db_mylibrary.manager";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			List<Manager> list=new ArrayList<Manager>();
			while(rs.next()) {
				Manager manager=new Manager();
				manager.setMid(rs.getInt("mid"));
				manager.setName(rs.getString("name"));
				manager.setSex(rs.getString("sex"));
				manager.setAge(rs.getInt("age"));
				manager.setBirthday(rs.getString("birthday"));
				manager.setCardnum(rs.getString("cardnum"));
				manager.setWorkdate(rs.getString("workdate"));
				manager.setTel(rs.getString("tel"));
				manager.setEmail(rs.getString("email"));
				manager.setPwd(rs.getString("pwd"));
				manager.setProblem(rs.getString("problem"));
				manager.setAnswer(rs.getString("answer"));
				list.add(manager);
			}
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i).toString());
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public List<Manager> search(int mid) {
		List<Manager> list=new ArrayList<Manager>();
		String sql="select * from db_mylibrary.manager where mid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, mid);
			rs=ps.executeQuery();
			while(rs.next()) {
				Manager manager=new Manager();
				manager.setMid(rs.getInt("mid"));
				manager.setName(rs.getString("name"));
				manager.setSex(rs.getString("sex"));
				manager.setAge(rs.getInt("age"));
				manager.setBirthday(rs.getString("birthday"));
				manager.setCardnum(rs.getString("cardnum"));
				manager.setWorkdate(rs.getString("workdate"));
				manager.setTel(rs.getString("tel"));
				manager.setEmail(rs.getString("email"));
				manager.setPwd(rs.getString("pwd"));
				manager.setProblem(rs.getString("problem"));
				manager.setAnswer(rs.getString("answer"));
				list.add(manager);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return list;
	}

	
	public List<Manager> search(int mid,String name,String pwd) {
		List<Manager> list=new ArrayList<Manager>();
		
		String sql="select * from db_mylibrary.manager where mid=? ";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, mid);
			rs=ps.executeQuery();
			while (rs.next()) {
				Manager manager=new Manager();
				manager.setMid(Integer.parseInt(rs.getString(mid)));
				manager.setName(rs.getString(name));
				manager.setPwd(rs.getString(pwd));
				list.add(manager);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return list;
	}

	public Manager findByName(int mid,String name,String pwd) {
		String sql="select * from db_mylibrary.manager where mid=? ";
		
		Manager manager=null;
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, mid);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				manager=new Manager();
				manager.setMid(Integer.parseInt(rs.getString(mid)));
				manager.setName(rs.getString(name));
				manager.setPwd(rs.getString(pwd));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return manager;
	}

	public void update(String pwd,String name,int mid) {
		String sql="update db_mylibrary.manager set pwd=?,name=? where mid=? ";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, pwd);
			ps.setString(2, name);
			ps.setInt(3, mid);
			ps.executeQuery();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}
}
