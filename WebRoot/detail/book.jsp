<%@ page language="java" import="java.util.*,com.entity.*,com.dao.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书操作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  <div id="all">
    <!-- <form action="/mylibrary/book" method="get"> -->
    <form  action="${pageContext.request.contextPath}/book" method="get">
    	<input class="form" type="hidden" name="method" value="search"/>
    	<input class="form" type="text" name="key" title="请输入图书编号"/>
    	<input class="form" type="submit" value="搜索"/>
    </form>
    <table border="1" width="80%">
    	<tr align="center" width="100%">
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
    	<%
				List<Book> book = (List)request.getAttribute("list");
				if(book!=null){
				for (int i = 0; i < book.size(); i++) {
			%>
    	<tr align="center" eidth="1100px">
    		<td><%=book.get(i).getBid() %></td>
    		<td><%=book.get(i).getType() %></td>
    		<td><%=book.get(i).getName() %></td>
    		<td><%=book.get(i).getAuthor() %></td>
    		<td><%=book.get(i).getPubname() %></td>
    		<td><%=book.get(i).getPubtime() %></td>
    		<td><%=book.get(i).getTranslator() %></td>
    		<td><%=book.get(i).getPrice() %></td>
    		<td>
    		<!-- <a href="/mylibrary/detail/bookupdate.jsp">更新</a> -->
    		<a href="${pageContext.request.contextPath}/QueryBookServlet?bid=<%=book.get(i).getBid()%>">更新</a>
    		<a href="/mylibrary/BookDeleteServlet?bid=<%=book.get(i).getBid()%>&status=delete ">删除</a>
    		</td>
    	
    	
    	</tr>
    	<%
    			}
    		}
    	 %>
    	 </tr >
    	<td colspan="9" height="10px"></td>
    	<tr>
    </table>
    </div>
  </body>
</html>
