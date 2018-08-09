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
    
    <title>My JSP 'manager.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  
  <div id="manager">
  <form  action="${pageContext.request.contextPath}/manager" method="get">
    	<input class="form" type="hidden" name="method" value="search"/>
    	<input class="form" type="text" name="key" title="请输入图书编号"/>
    	<input class="form" type="submit" value="搜索"/>
    </form>
	<table width="80%">
		<tr align="center">
			<td>编号</td>
			<td>姓名</td>
			<td>性别</td>
			<td>年龄</td>
			<td>生日</td>
			<td>卡号</td>
			<td>工作日期</td>
			<td>电话</td>
			<td>邮箱</td>
			<td>密码</td>
			<td>问题</td>
			<td>答案</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${requestScope.list}" var="list" >
			<tr>
				<td>${list.mid }</td>
				<td>${list.name }</td>
				<td>${list.sex }</td>
				<td>${list.age }</td>
				<td>${list.birthday }</td>
				<td>${list.cardnum }</td>
				<td>${list.workdate }</td>
				<td>${list.tel }</td>
				<td>${list.email }</td>
				<td>${list.pwd }</td>
				<td>${list.problem }</td>
				<td>${list.answer }</td>
				<td>
					<a href="${pageContext.request.contextPath }/manager?method=del&mid=${list.mid}">删除</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="12" align="center"><a href="${pageContext.request.contextPath }/register.jsp">添加</a></td>
		</tr>
	</table>
	</div>
  </body>
  
</html>
