<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>读者操作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  	<%-- <form action="${pageContext.request.contextPath }/reader" method="get"></form> --%>
    <div id=reader>
    <form  action="${pageContext.request.contextPath}/reader" method="get">
    	<input class="form" type="hidden" name="method" value="search"/>
    	<input class="form" type="text" name="key" title="请输入图书编号"/>
    	<input class="form" type="submit" value="搜索"/>
    </form>
    	<table border="1" width="80%>
    		
    		<tr align="center" width="100%">
    			<td align="center">编号</td>
    			<td align="center">姓名</td>
    			<td align="center">性别</td>
    			<td align="center">年龄</td>
    			<td align="center">班级</td>
    			<td align="center">学号</td>
    			<td align="center">卡号</td>
    			<td align="center">电话</td>
    			<td align="center">邮箱</td>
    			<td align="center">操作</td>
    		</tr>
    		<%
    			List<Reader> reader=(List)request.getAttribute("list");
    			if(reader!=null){
    				for(int i=0;i<reader.size();i++){
    		 %>
    		
    			<tr align="center" width="900px">
    				<td><%=reader.get(i).getRid() %></td>
    				<td><%=reader.get(i).getName() %></td>
    				<td><%=reader.get(i).getSex() %></td>
    				<td><%=reader.get(i).getAge() %></td>
    				<td><%=reader.get(i).getGrade() %></td>
    				<td><%=reader.get(i).getStudentid() %></td>
    				<td><%=reader.get(i).getCardnum() %></td>
    				<td><%=reader.get(i).getTel() %></td>
    				<td><%=reader.get(i).getEmail() %></td>
    				<td>
    					<a href="${pageContext.request.contextPath}/ReaderQueryServlet?rid=<%=reader.get(i).getRid() %>">更新</a>
    					<a href="${pageContext.request.contextPath }/ReaderDelServlet?rid=<%=reader.get(i).getRid() %>">删除</a>
    				</td>
    			</tr>
	   		<%
		   			}
		   		}
	    	%>
    	</table>
    </div>
  </body>
</html>
