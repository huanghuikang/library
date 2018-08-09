<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<title>基本资料添加</title>
	<link href="CSS/twopage.css" rel="stylesheet" type="text/css" />
	</head>
	
	<body>
	<form name="informsafe">
	<div id="informsafe">
		<div id="insafe1"></div>
	    <div id="insafe2"><a href="${pageContext.request.contextPath }/detail/bookadd.jsp" target="right">图书信息添加</a></div>
	    <div id="insafe3"><a href="${pageContext.request.contextPath }/detail/readeradd.jsp" target="right">读者信息添加</a></div>
	    <div id="insafe4"></div>
	</div>
	</form>
	</body>
</html>
