<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>主界面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
  </head>
  <frameset rows="163,*" cols="*" frameborder="no" border="0" framespacing="0">
	  <frame src="${pageContext.request.contextPath }/public/top.jsp" name="topFrame" scrolling="no" noresize="noresize" id="topFrame" />
	  <frameset rows="*" cols="200px,*" framespacing="0" frameborder="no" border="0">
	    <frame src="${pageContext.request.contextPath }/public/left.jsp" name="mainFrame" scrolling="no" id="mainFrame" />
	    <frame src="${pageContext.request.contextPath }/public/main.jsp" noresize name="right" scrolling="auto"  id="rightFrame" />
	  </frameset>
  </frameset>
	<noframes>
	  <body>
	    This is my JSP page. <br>
	  </body>
  </noframes>
</html>
