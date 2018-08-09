<%@ page language="java" import="java.util.*,com.entity.*" pageEncoding="UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>读者信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/js/page_common.js"></script>
	<link href="${pageContext.request.contextPath }/CSS/detail.css" rel="stylesheet" type="text/css" />
	<link href="${pageContext.request.contextPath }/CSS/three.css" rel="stylesheet" type="text/css" />
	</head>

<body>
	<form action="${pageContext.request.contextPath }/reader?method=add" name="reader" method="post">
	<div id="reader">
	<table width="96%" align="center" height="300" border="0" cellspacing="0" cellpadding="0">
	  <tr>
	    <td align="right">读者编号：</td>
	    <td align="center"><input  type="text" name="rid" /></td>
	    <td align="right">读者姓名：</td>
	    <td align="center"><input type="text" name="name" /></td>
	  </tr>
	  <tr>
	    <td align="right">性别：</td>
	    <td align="center">
	    <input id="sex" type="radio" name="sex" value="男" checked="$manager.sex()"/>&nbsp;&nbsp;&nbsp;&nbsp;男
	    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	    <input id="sex" type="radio" name="sex" value="女" />&nbsp;&nbsp;&nbsp;&nbsp;女
	    </td>
	    <td align="right">年龄：</td>
	    <td align="center"><input type="text" name="age" /></td>
	  </tr>
	  <tr>
	    <td align="right">班级：</td>
	    <td align="center"><input type="text" name="grade" /></td>
	    <td align="right">学号：</td>
	    <td align="center"><input type="text" name="studentid" /></td>
	  </tr>
	  <tr>
	    <td align="right">证件：</td>
	    <td align="center">
	    <select name="style" size="1" width="250">
	      <option value="身份证" selected="selected">身份证</option>
	      <option value="学生证">学生证</option>
	    </select>
	    </td>
	    <td align="right">证件号码：</td>
	    <td align="center"><input type="text" name="cardnum" /></td>
	  </tr>
	  <tr>
	    <td align="right">电话：</td>
	    <td align="center"><input type="text" name="tel" /></td>
	    <td align="right">邮箱：</td>
	    <td align="center"><input type="text" name="email" /></td>
	  </tr>
	</table>
	<div id="button">
	    <input type="submit" value="添加" />
	    <!-- <input type="submit" value="修改" />
	    <input class="reader1" type="submit" value="删除"/> -->
	    <input class="reader1" type="reset" value="重置"/>
	    </div>
	</div>
	</form>
</body>
</html>
