package com.text;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import com.dao.IBookDao;
import com.dao.impl.BookDao;
import com.entity.Book;

public class TestDao {
	IBookDao bookDao=null;
	@Before
	public void init() {
		bookDao=new BookDao();
	}
	@Test
	public void testUpdate() {
		
		Book book=new Book();
		book.setBid(Integer.parseInt("1"));
		book.setType("科学");
		book.setName("机器人");
		book.setAuthor("张三");
		book.setPubname("人民出版社");
		book.setPubtime("2019-04-12");
		book.setTranslator("dd");
		book.setPrice(Double.parseDouble("2.00"));
		bookDao.update(book);
		
	}
}
