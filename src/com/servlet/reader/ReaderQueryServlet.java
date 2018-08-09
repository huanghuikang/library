package com.servlet.reader;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Reader;
import com.service.IReaderService;
import com.service.impl.ReaderService;

public class ReaderQueryServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IReaderService service=new ReaderService();
		String rid=request.getParameter("rid");
		Reader reader=service.findByRid(rid);
		request.setAttribute("reader", reader);
		request.getRequestDispatcher("/detail/readerupdate.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
