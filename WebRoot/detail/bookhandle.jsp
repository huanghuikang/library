<%@page import="com.dao.impl.BookDao"%>
<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<html>
  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>图书的操作</title>
    
	
  </head>
  
  <body>

    <%-- <div id="BookTitle">
    	<form action="${pageContext.request.contextPath }/BookServlet" name="status" method="get">
    		<input type="hidden" name="name" value="method"/>
    		<input type="text" name="name" title="请输入姓名"/>
    		<input type="submit" value="搜索"/> 
    	</form>
    </div> 
      <%!
	List<Book> list = new BookDao().getAll();
	System.err.println("======================");
	System.err.println(list.size());
	%>
    --%>
    <div id="main">
    	<table align="center" cellspacing="0" cellpadding="0" width="1100px" border="1">
    		<tr>
    			<%-- <form action="${pageContext.request.contextPath }/book?method=search" name="status" method="get">
		    		<input type="hidden" name="name" value="method"/>
		    		<input type="text" name="name" title="请输入姓名"/>
		    		<input type="submit" value="搜索"/> 
    			</form> --%>
    		</tr>
    		
    			<tr align="center">
    				<td>序号</td>
    				<td>编号</td>
		    		<td>类型</td>
		    		<td>书名</td>
		    		<td>作者</td>
		    		<td>出版社</td>
		    		<td>出版时间</td>
		    		<td>译者</td>
		    		<td>价格</td>
		    		<td>操作</td>
    			</tr>
    		
    		<!-- 显示 -->
    		<%-- <c:if test="${not empty requestScope.lists}"> --%>
    		<%
    			List<Book> book = (List) request.getAttribute("list");
    		 %>
	   			<c:forEach items="${list }" var="book">
	   				<tr align="center">
	   					
	   					<td>${book.bid }</td>
	   					<td>${book.getType }</td>
	   					<td>${book.getName }</td>
	   					<td>${book.getAuthor }</td>
	   					<td>${book.getPubname }</td>
	   					<td>${book.getPubtime }</td>
	   					<td>${book.getTranslator }</td>
	   					<td>${book.getPrice }</td>
	   					<td>
	   						<a href="${pageContext.request.contextPath }/bookservlet/QueryBookServlet?bid=${book.bid }">更新</a>
	   						<a href="${pageContext.request.contextPath }/bookservlet/BookDelete?bid=${book.bid }">删除</a>
	   					</td>
	   				</tr>
	   				
	   			</c:forEach>
	   		<tr >
				<td align="center" colspan="11">
				<a href="${pageContext.request.contextPath }/detail/bookadd.jsp">添加</a>
				</td>
	   		</tr>
	   	</table>
    </div>
  </body>
</html>
