<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>借书</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />

  </head>
  
  <body>
  <div id="workadd">
  	<form action="${pageContext.request.contextPath }/work?method=add" name="borrowadd" method="post">
  		<div id="null"></div>
  		<table width="100%" align="center" height="300" border="0" cellspacing="0" cellpadding="0">
	  		<tr>
	  			<td align="right">编号：</td>
	  			<td><input type="text" name="id"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">读者编号：</td>
	  			<td><input type="text" name="rid"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">图书编号：</td>
	  			<td><input type="text" name="bid"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">借书时间：</td>
	  			<td><input type="text" name="borrowdate"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">还书时间：</td>
	  			<td><input type="text" name="backdate"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">借书次数：</td>
	  			<td><input type="text" name="borrowtimes"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">还书次数：</td>
	  			<td><input type="text" name="backtimes"/></td>
	  		</tr>
	  		<tr>
	  			<td align="right">是否完整：</td>
	  			<td>
	  				<input type="radio" name="complete" value="是" checked="$work.complete()"/>&nbsp;&nbsp;是
	  				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	  				<input type="radio" name="complete" value="否"/>&nbsp;&nbsp;否
	  			</td>
	  		</tr>
  		</table>
  		<div id="button">
  		
	    <input type="submit" value="添加" />
	    <input type="reset" value="重置"/>
	    </div>
  	</form>
  	</div>
  </body>
</html>
