<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>密码查找</title>
    
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
		
		#t1 {
			margin:0 auto;
			height:300px;
			width:400px;
			background-color:#E8FFFF;
		}
		#t2 {
			position:relative;
			margin-left:100px;
			margin_top:100px;
		}
		
	</style>

  </head>
  
  <body>
     <form action="${pageContext.request.contextPath}/manager" name="findpwd" method="post">
		<div id="t1">
			<div id="t2">
		    	<input type="hidden" name="method" value="searchName"/>
		    	<input type="hidden" name="mid"/>
		    	<input type="text" name="name" title="请输入用户名"/>
		    	<input type="submit" value="搜索"/>
  
		 	</div>
		</div>
	</form>
  </body>
</html>
