<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>图书添加</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">

	<link href="${pageContext.request.contextPath }/CSS/detail.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
  </head>
  
  <body>
  
    <form action="${pageContext.request.contextPath }/book?method=add" name="bookadd" method="post">
<div id="bookadd">
<table width="96%" align="center" height="300" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td align="right">图书编号：</td>
    <td align="center"><input type="text" name="bid" /></td>
    <td align="right">图书类别：</td>
    <td align="center"><input type="text" name="type" /></td>
  </tr>
  <tr>
    <td align="right">图书名称：</td>
    <td align="center"><input type="text" name="name" /></td>
    <td align="right">作者：</td>
    <td align="center"><input type="text" name="author" /></td>
  </tr>
  <tr>
    <td align="right">出版社：</td>
    <td align="center"><input type="text" name="pubname" /></td>
    <td align="right">出版日期：</td>
    <td align="center"><input type="text" name="pubtime" /></td>
  </tr>
  <tr>
    <td align="right">译者：</td>
    <td align="center"><input type="text" name="translator" /></td>
    <td align="right">单价：</td>
    <td align="center"><input type="text" name="price" /></td>
  </tr>
</table>
<div id="button">
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="添加" />
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="reset" value="重置"/>
    </div>
</div>
</form>
  </body>
</html>
