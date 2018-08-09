package com.dao.impl;


import java.util.ArrayList;
import java.util.List;

import com.dao.IBookDao;
import com.entity.Book;
import com.utils.JdbcUtil;
import com.utils.SuperPublic;
/**
 * 2.读者模块dao实现
 * */
public class BookDao extends SuperPublic implements IBookDao {

	public void add(Book book) {
		String sql="INSERT INTO db_mylibrary.book (bid, type, name, author, pubname, pubtime, translator,price) VALUES (?,?,?,?,?,?,?,?)";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			//设置参数
			ps.setInt(1, book.getBid());
			ps.setString(2, book.getType());
			ps.setString(3, book.getName());
			ps.setString(4, book.getAuthor());
			ps.setString(5, book.getPubname());
			ps.setString(6, book.getPubtime());
			ps.setString(7, book.getTranslator());
			ps.setDouble(8, book.getPrice());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public void update(Book book) {
		String sql="update db_mylibrary.book set type=?,name=?,Author=?,pubname=?,pubtime=?,translator=?,price=? where bid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, book.getType());
			ps.setString(2, book.getName());
			ps.setString(3, book.getAuthor());
			ps.setString(4, book.getPubname());
			ps.setString(5, book.getPubtime());
			ps.setString(6, book.getTranslator());
			ps.setDouble(7, book.getPrice());
			ps.setInt(8, book.getBid());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
		
	}

	//public Book findByBid(int bid) {
	public Book findByBid(String bid) {
		String sql="select * from db_mylibrary.book where bid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setString(1, bid);
			rs=ps.executeQuery();
			Book book=null;
			if(rs.next()){
				book=new Book();
				book.setBid(rs.getInt("bid"));
				book.setType(rs.getString("type"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPubname(rs.getString("pubname"));
				book.setPubtime(rs.getString("pubtime"));
				book.setTranslator(rs.getString("translator"));
				book.setPrice(rs.getDouble("price"));
			}
			return book;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
	}

	public void delete(int bid) {
		String sql="delete from db_mylibrary.book where bid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bid);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} finally {
			JdbcUtil.closeAll(conn, ps, null);
		}
	}

	public List<Book> getAll() {
		String sql="select * from db_mylibrary.book";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			List<Book> list=new ArrayList<Book>();
			while (rs.next()) {

				Book book=new Book();
				book.setBid(rs.getInt("bid"));
				book.setType(rs.getString("type"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPubname(rs.getString("pubname"));
				book.setPubtime(rs.getString("pubtime"));
				book.setTranslator(rs.getString("translator"));
				book.setPrice(rs.getDouble("price"));
				list.add(book);
			}
			for(int i = 0;i<list.size();i++)
			{
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

	public List<Book> search(int bid) {
		List<Book> list=new ArrayList<Book>();
		String sql="select * from db_mylibrary.book where bid=?";
		try {
			conn=JdbcUtil.getConnection();
			ps=conn.prepareStatement(sql);
			ps.setInt(1, bid);
			rs=ps.executeQuery();
			
			while (rs.next()) {

				Book book=new Book();
				book.setBid(rs.getInt("bid"));
				book.setType(rs.getString("type"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPubname(rs.getString("pubname"));
				book.setPubtime(rs.getString("pubtime"));
				book.setTranslator(rs.getString("translator"));
				book.setPrice(rs.getDouble("price"));
				list.add(book);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.closeAll(conn, ps, rs);
		}
		return list;
	}
	public static void main(String[] args) {
		
	}
}
