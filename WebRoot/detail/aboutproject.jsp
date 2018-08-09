<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>项目信息</title>
    
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
    <div id="hao" width="100%" height="400">
    	<div id="ab">
	    	<h4><font color="red">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;学习是人每天要做的事情，由于城市与村镇的经济水平相<br>差大，所以村镇的学生没有良好的学习范围。
	    	图书馆是学生<br>获取课外知识的重要途径，但村镇学校的图书馆又增加了管理<br>员的工作量，
	    	因此我开发了图书馆管理系统，虽没有条形码和<br>磁条方便，但比人工操作简单，我希望这系统能对村镇学校有所帮助。</font></h4>
	    	<br/>
	    	<br/>
	    	<h1><font color="red">祝所有人身体健康，万事如意！</font></h1>
    	</div>
    </div>
  </body>
</html>
