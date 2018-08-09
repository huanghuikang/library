package com.servlet.reader;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.IReaderService;
import com.service.impl.ReaderService;

public class ReaderDelServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IReaderService service=new ReaderService();
		String rid=request.getParameter("rid");
		service.delete(Integer.parseInt(rid));
		response.sendRedirect(request.getContextPath()+"/ReaderListServlet");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
