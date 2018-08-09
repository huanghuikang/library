<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>日常工作</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">

 <title>日常工作</title>
<link href="CSS/twopage.css" rel="stylesheet" type="text/css" />
</head>

<body>
<form action="" name="dayjob">
<div id="dayjob">
<div id="job1"><a href="detail/workadd.jsp" target="right">读者借书</a></div>
<div id="job2"><a href="${pageContext.request.contextPath }/work?method=list" target="right">读者还书</a></div>
</div>
</form>
</body>
</html>
