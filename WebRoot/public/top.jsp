<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>top</title>
<link href="${pageContext.request.contextPath }/CSS/top.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/all.js"></script>
</head>

<body>
<div id="t1">
<%-- <a target:"right" href="javascript:void(0)">
	<img width="78" height="20" alt="退出系统" src="${pageContext.request.contextPath }/images/logout.gif" />
</a> --%>
<div id="time">
<span onmousemove="showTime()" onmouseout="hideTime()" ><font color="white">查看当前系统时间：</font></span><span id="timeSpan"></span>
</div>
</div>
<div id="t2"></div>
</body>
</html>
