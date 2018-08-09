package com.servlet.bookservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Book;
import com.service.IBookService;
import com.service.impl.BookService;
/**
 * 修改前查询图书
 * */
public class QueryBookServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		//int bid=Integer.parseInt(request.getParameter("bid"));
		String bid=request.getParameter("bid");
		IBookService service=new BookService();
		Book book=service.findByBid(bid);
		request.setAttribute("book", book);
		
		/*String bidStr=request.getParameter("bid");
		if(bidStr!=null&&!bidStr.equals("")) {
			int bid=Integer.valueOf(bidStr);
			IBookService service=new BookService();
			Book book=service.findByBid(bid);
			request.setAttribute("book", book);
		}*/
		request.getRequestDispatcher("/detail/bookupdate.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
