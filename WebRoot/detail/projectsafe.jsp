<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>系统维护</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<title>系统管理</title>
<link href="CSS/twopage.css" rel="stylesheet" type="text/css" />
</head>

<body>

<form name="projectsafe">
<div id="pjsafe">
<div id="pjsafe1"></div>
<div id="pjsafe2"><a href="${pageContext.request.contextPath }/manager?method=list" target="right">用户管理</a></div>
<div id="pjsafe3"><a href="${pageContext.request.contextPath }/detail/aboutproject.jsp" target="right">系统详细资料</a></div>
</div>
</form>
</body>
</html>
