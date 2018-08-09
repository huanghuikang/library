package com.servlet.work;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;

import com.entity.Work;
import com.service.IWorkService;
import com.service.impl.WorkService;

public class ListWorkServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		IWorkService workService=new WorkService();
		List<Work> list=workService.getAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/detail/work.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
