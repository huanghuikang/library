<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>改密</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<style type="text/css">
		body{
			margin:0px;
			padding:0px;
		}
		*{
			margin:0px;
			padding:0px;
		}
		table{
			margin-top:20%;
		}
		#t1 {
			margin:0 auto;
			height:300px;
			width:400px;
			background-color:#E8FFFF;
		}
		td{
			font-weight:bolder;
		}
		td #textfield {
			height: 25px;
			width: 200px;
		}
		a{
			text-decoration:none;
		}
		#a1 {
			font-weight: bolder;
			
		}
	</style>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>

  </head>
  
  <body>
     <form action="" name="findpwd" method="post">
		<div id="t1">
		<table width="400" height="250" align="center" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td align="right">用户姓名：</td>
		    <td align="center">
		    <input type="text" name="name" value="${requestScope.manager.name }"/></td>
		  </tr>
		  <tr>
		    <td align="right">密码：</td>
		    <td align="center"><input type="text" name="pwd" value="${requestScope.manager.pwd }"/></td>
		  </tr>
		  
		  <tr align="center">
		    <td height="46" colspan="4">
			<input name="submit" type="submit" value="找回" height="80" width="90" onclick="" id="a1"/>
		    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		    <input name="reset" type="reset" value="重置"  id="a1"/>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="login.html">返回到登录页面</a>
		</td>
		  </tr>
		</table>
		</div>
	</form>
  </body>
</html>
