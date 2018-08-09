package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.Reader;
import com.service.IReaderService;
import com.service.impl.ReaderService;

public class ReaderServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doGet(request, response);
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String method=request.getParameter("method");
		if("add".equals(method)) {
			add(request,response);
		}
		else if("delete".equals(method)) {
			delete(request,response);
		}
		else if("list".equals(method)) {
			list(request,response);
		}
		else if("update".equals(method)) {
			update(request,response);
		}
		else if("query".equals(method)) {
			query(request,response);
		}
		else if("search".equals(method)) {
			search(request,response);
		}
	}

	

	private void search(HttpServletRequest request, HttpServletResponse response) {

		try {
			String key=request.getParameter("key");
			if(key!=null) {
				List<Reader> list=readerService.search(Integer.parseInt(key));
				request.setAttribute("list", list);
				request.getRequestDispatcher("/detail/reader.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	IReaderService readerService = new ReaderService();
	private void add(HttpServletRequest request, HttpServletResponse response) throws IOException {

		int rid=Integer.parseInt(request.getParameter("rid"));
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		int age=Integer.parseInt(request.getParameter("age"));
		String grade=request.getParameter("grade");
		String studentid=request.getParameter("studentid");
		String cardnum=request.getParameter("cardnum");
		String tel=request.getParameter("tel");
		String email=request.getParameter("email");
		Reader reader=new Reader();
		reader.setRid(rid);
		reader.setName(name);
		reader.setSex(sex);
		reader.setAge(age);
		reader.setGrade(grade);
		reader.setStudentid(studentid);
		reader.setCardnum(cardnum);
		reader.setTel(tel);
		reader.setEmail(email);
		try {
			readerService.add(reader);
			request.getRequestDispatcher("/detail/informsafe.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/others.jsp");
		}
		
	}

	private void delete(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String rid=request.getParameter("rid");
		readerService.delete(Integer.parseInt(rid));
		response.sendRedirect(request.getContextPath()+"/book?method=list");
	}

	private void list(HttpServletRequest request, HttpServletResponse response) throws IOException {
		List<Reader> list=readerService.getAll();
		request.setAttribute("list", list);
		
		try {
			request.getRequestDispatcher("/detail/reader.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/others.jsp");
		}
	}

	private void update(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int rid=Integer.parseInt(request.getParameter("rid"));
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		int age=Integer.parseInt(request.getParameter("age"));
		String grade=request.getParameter("grade");
		String studentid=request.getParameter("studentid");
		String cardnum=request.getParameter("cardnum");
		String tel=request.getParameter("tel");
		String email=request.getParameter("email");
		Reader reader=new Reader();
		reader.setRid(rid);
		reader.setName(name);
		reader.setSex(sex);
		reader.setAge(age);
		reader.setGrade(grade);
		reader.setStudentid(studentid);
		reader.setCardnum(cardnum);
		reader.setTel(tel);
		reader.setEmail(email);
		readerService.update(reader);
		response.sendRedirect(request.getContextPath()+"/reader?method=list");
	}

	private void query(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String rid=request.getParameter("rid");
		Reader reader=readerService.findByRid(rid);
		request.setAttribute("reader", reader);
		try {
			request.getRequestDispatcher("/detail/readerupdate.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/others.jsp");
		}
	}
}
