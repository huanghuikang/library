package com.service;

import java.util.List;

import com.entity.Book;

public interface IBookService {

	//添加
	public void add(Book book);
	//更新
	public void update(Book book);
	//根据主键查询得到name,更新中用
	public Book findByBid(String bid);
	//删除
	public void delete(int bid);
	//查询
	public List<Book> getAll();
	//根据姓名查询所有
	public List<Book> search(int bid);
}
