<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<link href="../CSS/left.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="left1">
  <table width="200" height="200" border="0" cellspacing="0" cellpadding="0">
    <tr>
    <td align="center"><a href="${pageContext.request.contextPath }/detail/dayjob.jsp" target="right">日常工作</a></td>
  </tr>
  <tr>
    <td align="center"><a href="${pageContext.request.contextPath }/detail/informsafe.jsp" target="right">基本资料添加</a></td>
  </tr>
  <tr>
    <td align="center"><a href="${pageContext.request.contextPath }/detail/selectinform.jsp" target="right">相关资料查询</a></td>
  </tr>
  <tr>
    <td align="center"><a href="${pageContext.request.contextPath }/detail/projectsafe.jsp" target="right">系统管理</a></td>
  </tr>
</table>

</div>
</body>
</html>
