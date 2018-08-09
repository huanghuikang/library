<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>密码找回</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	
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
	
  </head>
  
  <body>
    <form action="" name="findpwd" method="post">
		<div id="t1">
		<table width="400" height="250" align="center" border="0" cellspacing="0" cellpadding="0">
		  <tr>
		    <td align="right">用户姓名：</td>
		    <td align="center"><input type="text" name="name" id="textfield"/></td>
		  </tr>
		  <tr>
		    <td align="right">身份证号码：</td>
		    <td align="center"><input type="text" name="idcard" id="textfield"/></td>
		  </tr>
		  <tr>
		    <td align="right">找密码的问题：</td>
		    <td align="center"><input type="text" name="problem" id="textfield"/></td>
		  </tr>
		  <tr>
		    <td align="right">问题的答案：</td>
		    <td align="center"><input type="text" name="answers" id="textfield"/></td>
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
