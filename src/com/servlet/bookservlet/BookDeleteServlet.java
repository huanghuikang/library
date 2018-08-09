package com.servlet.bookservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.IBookService;
import com.service.impl.BookService;

public class BookDeleteServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		
		String bid=request.getParameter("bid");
		IBookService service=new BookService();
		service.delete(Integer.parseInt(bid));
		response.sendRedirect(request.getContextPath()+"/ListBookServlet");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
