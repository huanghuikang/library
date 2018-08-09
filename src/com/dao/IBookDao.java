package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Book;

public interface IBookDao {
	//添加
	public void add(Book book);
	//修改
	public void update(Book book);
	//删除
	public void delete(int bid);
	//查询全部
	public List<Book> getAll();
	//根据主键查询.更新这里要用
	public Book findByBid(String bid);
	//根据id号查询
	public List<Book> search(int bid);
	
}
