package com.servlet.work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.IWorkService;
import com.service.impl.WorkService;

public class DeleteWorkServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		IWorkService workService=new WorkService();
		String id=request.getParameter("id");
		workService.delete(Integer.parseInt(id));
		response.sendRedirect(request.getContextPath()+"/ListWorkServlet");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
