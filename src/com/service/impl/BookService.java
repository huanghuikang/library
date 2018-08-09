package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.dao.IBookDao;
import com.dao.impl.BookDao;
import com.entity.Book;
import com.service.IBookService;
/**
 * ÒµÎñÂß¼­²ã
 * */
public class BookService implements IBookService {

	private IBookDao bookDao=new BookDao();
	public void add(Book book) {
			bookDao.add(book);
	}

	public void update(Book book) {
			bookDao.update(book);
	}

	public void delete(int bid) {
			bookDao.delete(bid);
	}

	public List<Book> getAll() {
			return bookDao.getAll();
	}

	public Book findByBid(String bid) {
			return bookDao.findByBid(bid);
	}

	public List<Book> search(int bid) {
		
		return bookDao.search(bid);
	
	}

	

}
