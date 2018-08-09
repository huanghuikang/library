package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.entity.Manager;
import com.exception.ManagerException;
import com.service.IManagerService;
import com.service.impl.ManagerService;

public class ManagerServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
		
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		// ��ȡ��������
		String method=request.getParameter("method");
		if("login".equals(method)) {
			login(request, response);
		}
		else if("register".equals(method)) {
			register(request,response);
		} else if("list".equals(method)) {
			list(request,response);
		} else if("del".equals(method)) {
			del(request,response);
		} else if("search".equals(method)){
			search(request,response);
		} 
		
	}
	
	


	private void search(HttpServletRequest request, HttpServletResponse response) {

		try {
			String key=request.getParameter("key");
			if(key!=null) {
				List<Manager> list=managerService.search(Integer.parseInt(key));
				request.setAttribute("list", list);
				request.getRequestDispatcher("/detail/manager.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	ManagerService managerService=new ManagerService();
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int mid=Integer.parseInt(request.getParameter("mid"));
		String name=request.getParameter("name");
		String pwd=request.getParameter("pwd");
		String code=request.getParameter("code");
		Manager manager=new Manager();
		//manager.setMid(mid);
		manager.setName(name);
		manager.setPwd(pwd);
		try {
			Manager loginInfo=managerService.login(manager);
			if(loginInfo==null) {
				request.getRequestDispatcher("/login.jsp").forward(request, response);
			}
			else {
				//�ɹ�
				request.getSession().setAttribute("loginInfo", loginInfo);
				ServletContext sc=getServletContext();
				List<Manager> onlineList=(List<Manager>) sc.getAttribute("onlinList");
				if(onlineList!=null) {
					onlineList.add(loginInfo);
				}
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect(request.getContextPath()+"/error/error.jsp");
		}
	}

	/**
	 * ע�ᴦ����
	 * @throws IOException 
	 * @throws ServletException 
	 * */
	private void register(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		//1.��ȡ�������
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String age=request.getParameter("age");
		String birthday=request.getParameter("birthday");
		String cardnum=request.getParameter("cardnum");
		String workdate=request.getParameter("workdate");
		String tel=request.getParameter("tel");
		String pwd=request.getParameter("pwd");
		//String pwd2=request.getParameter("pwd2");
		String problem=request.getParameter("problem");
		String answer=request.getParameter("answer");
		//��װ
		Manager manager=new Manager();
		manager.setName(name);
		manager.setSex(sex);
		//��ȡint���Ͳ�����ת��
		manager.setAge(Integer.parseInt(age));
		manager.setBirthday(birthday);
		manager.setCardnum(cardnum);
		manager.setWorkdate(workdate);
		manager.setTel(tel);
		manager.setPwd(pwd);
		manager.setProblem(problem);
		manager.setAnswer(answer);
		//2.����Service����ע���ҵ���߼�
		try {
			managerService.register(manager);
			//ע��ɹ�����ת��login.jsp
			request.getRequestDispatcher("/manager?method=list").forward(request, response);
		} catch (ManagerException e) {
			//�û������ڣ�ע��ʧ�ܣ���ת��ע��ҳ�棩
			request.setAttribute("message", "�û����Ѿ�����");
			//ת��
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
		catch (Exception e) {
			e.printStackTrace();//����ʱ�ã���ӡ����
			//����������ת������ҳ��
			response.sendRedirect(request.getContextPath()+"/error/error.jsp");
		}
		
	}

	private void list(HttpServletRequest request, HttpServletResponse response) {
		try {
			List<Manager> list=managerService.getAll();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/detail/manager.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private void del(HttpServletRequest request, HttpServletResponse response) {
		try {
			int mid=Integer.parseInt(request.getParameter("mid"));
			managerService.delete(mid);
			response.sendRedirect(request.getContextPath()+"/manager?method=list");
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

}
