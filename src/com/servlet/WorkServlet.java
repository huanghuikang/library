package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.print.resources.serviceui;

import com.entity.Manager;
import com.entity.Work;
import com.service.IWorkService;
import com.service.impl.WorkService;

public class WorkServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String method=request.getParameter("method");
		if("add".equals(method)) {
			add(request,response);
		} else if("delete".equals(method)) {
			delete(request,response);
		} else if("list".equals(method)) {
			list(request,response);
		} else if("update".equals(method)) {
			update(request,response);
		} else if("query".equals(method)) {
			try {
				query(request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if("search".equals(method)){
			search(request,response);
		}
		
	}


	private void search(HttpServletRequest request, HttpServletResponse response) {

		try {
			String key=request.getParameter("key");
			if(key!=null) {
				List<Work> list=workService.search(Integer.parseInt(key));
				request.setAttribute("list", list);
				request.getRequestDispatcher("/detail/work.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	IWorkService workService=new WorkService();
	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int rid=Integer.parseInt(request.getParameter("rid"));
		int bid=Integer.parseInt(request.getParameter("bid"));
		String borrowdate=request.getParameter("borrowdate");
		String backdate=request.getParameter("backdate");
		int borrowtimes=Integer.parseInt(request.getParameter("borrowtimes"));
		int backtimes=Integer.parseInt(request.getParameter("backtimes"));
		String complete=request.getParameter("complete");
		Work work=new Work();
		work.setId(id);
		work.setRid(rid);
		work.setBid(bid);
		work.setBorrowdate(borrowdate);
		work.setBackdate(backdate);
		work.setBorrowtimes(borrowtimes);
		work.setBacktimes(backtimes);
		work.setComplete(complete);
		try {
			workService.add(work);
			request.getRequestDispatcher("/detail/dayjob.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/others.jsp");
		} 
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String id=request.getParameter("id");
		IWorkService workService=new WorkService();
		workService.delete(Integer.parseInt(id));
		response.sendRedirect(request.getContentType()+"/work?method=list");
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Work> list=workService.getAll();
		request.setAttribute("list", list);
		request.getRequestDispatcher("/detail/work.jsp").forward(request, response);
		
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		int rid=Integer.parseInt(request.getParameter("rid"));
		int bid=Integer.parseInt(request.getParameter("bid"));
		String borrowdate=request.getParameter("borrowdate");
		String backdate=request.getParameter("backdate");
		int borrowtimes=Integer.parseInt(request.getParameter("borrowtimes"));
		int backtimes=Integer.parseInt(request.getParameter("backtimes"));
		String complete=request.getParameter("complete");
		Work work=new Work();
		work.setId(id);
		work.setRid(rid);
		work.setBid(bid);
		work.setBorrowdate(borrowdate);
		work.setBackdate(backdate);
		work.setBorrowtimes(borrowtimes);
		work.setBacktimes(backtimes);
		work.setComplete(complete);
		workService.update(work);
		response.sendRedirect(request.getContextPath()+"/work?method=list");
	}

	private void query(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
		Work work=workService.findById(id);
		
		request.setAttribute("work", work);
		request.getRequestDispatcher("/detail/workupdate.jsp").forward(request, response);
		
	}

	

}
