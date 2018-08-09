<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>信息查询</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<title>资料查询</title>
<link href="CSS/twopage.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="selectinform">
<div id="selection1"><a href="${pageContext.request.contextPath }/ListBookServlet" target="right">图书查询</a></div>
<div id="selection2"><a href="${pageContext.request.contextPath }/ReaderListServlet" target="right">读者信息查询</a></div>

</div>
</body>
</html>
