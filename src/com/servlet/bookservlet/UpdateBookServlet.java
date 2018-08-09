package com.servlet.bookservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Book;
import com.service.IBookService;
import com.service.impl.BookService;

public class UpdateBookServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		int bid=Integer.parseInt(request.getParameter("bid"));
		String type=request.getParameter("type");
		String name=request.getParameter("name");
		String author=request.getParameter("author");
		String pubname=request.getParameter("pubname");
		String pubtime=request.getParameter("pubtime");
		String translator=request.getParameter("translator");
		Double price=Double.parseDouble(request.getParameter("price"));
		Book book=new Book();
		book.setBid(bid);
		book.setType(type);
		book.setName(name);
		book.setAuthor(author);
		book.setPubname(pubname);
		book.setPubtime(pubtime);
		book.setTranslator(translator);
		book.setPrice(price);
		IBookService bookService=new BookService();
		bookService.update(book);
		response.sendRedirect(request.getContextPath()+"/ListBookServlet");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
