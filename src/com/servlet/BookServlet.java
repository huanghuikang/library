package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;

import com.dao.IBookDao;
import com.dao.impl.BookDao;
import com.entity.Book;
import com.service.IBookService;
import com.service.impl.BookService;

public class BookServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
	private BookService bookService=new BookService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//设置编码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String method=request.getParameter("method");
			if ("add".equals(method)) {
				add(request,response);
			}
			else if("search".equals(method)) {
				search(request,response);
			}
		}
		/*else if("update".equals(method)) {
			update(request,response);
		}
		else if ("delete".equals(method)) {
			delete(request,response);
		}
		else if ("list".equals(method)) {
			list(request,response);
		}
		else if ("show".equals(method)) {
			show(request,response);
		}
		
		
		else if ("queryBook".equals(method)) {
			queryBook(request,response);
		}
	}

	//private String name=null;
	private void queryBook(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			//@param jsp中hidden中的name的值
			String status=request.getParameter("status");
			//@param hidden中value的值
			if(status.equals("queryBook")) {
				String name=request.getParameter("name");
				ArrayList<Book> books=bookService.queryBook(name);
				request.setAttribute("book", books);
				request.getRequestDispatcher("/book.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		List<Book> list=bookService.getAll();
		config.getServletContext().setAttribute("book", list);
		super.init();
	}

	//在book的更新中显示对应的数据
	private void show(HttpServletRequest request, HttpServletResponse response) {
		try {
			String bid=request.getParameter("bid");
			Book book=bookService.findByBid(Integer.parseInt(bid));
			request.setAttribute("type", book.getType());
			request.setAttribute("name", book.getName());
			request.getRequestDispatcher("/book/show.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			
		}
		
	}

	

	private void list(HttpServletRequest request, HttpServletResponse response) {

		try {
			IBookDao bookDao=new BookDao();
			List<Book> list=bookDao.getAll();
			List<Book> list=bookService.getAll();
			request.setAttribute("books", list);
			request.getRequestDispatcher("/bookhandle.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		} 
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int bid=Integer.parseInt(request.getParameter("bid"));
			//bookService.delete(Integer.parseInt(bid));
			bookService.delete(bid);
			
			String name=request.getParameter("name");
			ArrayList<Book> book=bookService.queryBook(name);
			request.setAttribute("book", book);
			//list(request, response);
			response.sendRedirect(request.getContextPath()+"/bookhandle.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			request.getRequestDispatcher("/error/others.jsp").forward(request, response);
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) {
		String name=request.getParameter("name");
		Book book=new Book();
		book.setName(name);
		try {
			bookService.update(book);
			response.sendRedirect(request.getContextPath()+"/book.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
		
	}*/
	
	//根据编号查询
	private void search(HttpServletRequest request, HttpServletResponse response) {

		try {
			
			String key=request.getParameter("key");
			if(key!=null) {
				List<Book> list=bookService.search(Integer.parseInt(key));
				request.setAttribute("list", list);
				request.getRequestDispatcher("/detail/book.jsp").forward(request, response);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
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
		try {
			bookService.add(book);
			request.getRequestDispatcher("/detail/informsafe.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/others.jsp");
		}
	}
}
