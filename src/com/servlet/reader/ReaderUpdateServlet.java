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

public class ReaderUpdateServlet extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		IReaderService service=new ReaderService();
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
		service.update(reader);
		response.sendRedirect(request.getContextPath()+"/ReaderListServlet");
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
